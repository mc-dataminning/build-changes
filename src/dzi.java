public enum dzi implements bag {
   a(jo.a),
   b(jo.b);

   private final jo c;

   private dzi(final jo $$0) {
      this.c = $$0;
   }

   public jo a() {
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

   public dzi b() {
      return this == a ? b : a;
   }
}
