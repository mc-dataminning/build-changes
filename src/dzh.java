public enum dzh implements bag {
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
