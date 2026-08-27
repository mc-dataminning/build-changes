public enum dtx implements azg {
   a,
   b;

   @Override
   public String toString() {
      return this.c();
   }

   @Override
   public String c() {
      return this == a ? "left" : "right";
   }
}
