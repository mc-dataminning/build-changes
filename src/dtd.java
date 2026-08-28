public enum dtd implements ayz {
   a(jf.a),
   b(jf.b);

   private final jf c;

   private dtd(final jf $$0) {
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

   public dtd b() {
      return this == a ? b : a;
   }
}
