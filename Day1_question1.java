class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
      int   closesttoX=Math.max(x1,Math.min(x2,xCenter));
       int  closesttoY=Math.max(y1,Math.min(y2,yCenter));

       int smallestdist1=xCenter-closesttoX;
       int smallestdist2=yCenter-closesttoY;

       if(smallestdist1*smallestdist1+smallestdist2*smallestdist2<=radius*radius){
            return true;
       }
       return false;


        
    }
}