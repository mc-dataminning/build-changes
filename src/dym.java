public enum dym implements azv {
   a(jn.a),
   b(jn.b);

   private final jn c;

   private dym(final jn $$0) {
      this.c = $$0;
   }

   public jn a() {
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

   public dym b() {
      return this == a ? b : a;
   }
}
