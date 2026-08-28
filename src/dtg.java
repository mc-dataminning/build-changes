public enum dtg implements azc {
   a(jf.a),
   b(jf.b);

   private final jf c;

   private dtg(final jf $$0) {
      this.c = $$0;
   }

   public jf a() {
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

   public dtg b() {
      return this == a ? b : a;
   }
}
