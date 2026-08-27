public enum drd implements ayt {
   a(is.a),
   b(is.b);

   private final is c;

   private drd(is $$0) {
      this.c = $$0;
   }

   public is a() {
      return this.c;
   }

   @Override
   public String toString() {
      return this.c();
   }

   @Override
   public String c() {
      return this == a ? "upper" : "lower";
   }

   public drd b() {
      return this == a ? b : a;
   }
}
