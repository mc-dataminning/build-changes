public enum dsx implements azt {
   a(je.a),
   b(je.b);

   private final je c;

   private dsx(final je $$0) {
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

   public dsx b() {
      return this == a ? b : a;
   }
}
