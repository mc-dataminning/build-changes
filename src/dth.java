public enum dth implements azc {
   a(jf.a),
   b(jf.b);

   private final jf c;

   private dth(final jf $$0) {
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

   public dth b() {
      return this == a ? b : a;
   }
}
