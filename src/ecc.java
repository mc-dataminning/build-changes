public enum ecc implements bao {
   a(jc.a),
   b(jc.b);

   private final jc c;

   private ecc(final jc $$0) {
      this.c = $$0;
   }

   public jc a() {
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

   public ecc b() {
      return this == a ? b : a;
   }
}
