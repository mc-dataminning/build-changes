public enum dkc implements avj {
   a(ic.a),
   b(ic.b);

   private final ic c;

   private dkc(ic $$0) {
      this.c = $$0;
   }

   public ic a() {
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

   public dkc b() {
      return this == a ? b : a;
   }
}
