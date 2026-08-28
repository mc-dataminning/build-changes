public enum dta implements azu {
   a(je.a),
   b(je.b);

   private final je c;

   private dta(final je $$0) {
      this.c = $$0;
   }

   public je a() {
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

   public dta b() {
      return this == a ? b : a;
   }
}
