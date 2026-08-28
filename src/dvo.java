public enum dvo implements bab {
   a(jk.a),
   b(jk.b);

   private final jk c;

   private dvo(final jk $$0) {
      this.c = $$0;
   }

   public jk a() {
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

   public dvo b() {
      return this == a ? b : a;
   }
}
