public enum dij implements auk {
   a(ib.a),
   b(ib.b);

   private final ib c;

   private dij(ib $$0) {
      this.c = $$0;
   }

   public ib a() {
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

   public dij b() {
      return this == a ? b : a;
   }
}
