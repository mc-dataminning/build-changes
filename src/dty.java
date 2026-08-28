public enum dty implements azk {
   a(ji.a),
   b(ji.b);

   private final ji c;

   private dty(final ji $$0) {
      this.c = $$0;
   }

   public ji a() {
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

   public dty b() {
      return this == a ? b : a;
   }
}
