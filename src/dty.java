public enum dty implements azg {
   a(iw.a),
   b(iw.b);

   private final iw c;

   private dty(iw $$0) {
      this.c = $$0;
   }

   public iw a() {
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
