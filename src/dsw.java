public enum dsw implements azs {
   a(je.a),
   b(je.b);

   private final je c;

   private dsw(final je $$0) {
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

   public dsw b() {
      return this == a ? b : a;
   }
}
