public enum ecm implements bax {
   a(jc.a),
   b(jc.b);

   private final jc c;

   private ecm(final jc $$0) {
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

   public ecm b() {
      return this == a ? b : a;
   }
}
