public enum eav implements bak {
   a(ja.a),
   b(ja.b);

   private final ja c;

   private eav(final ja $$0) {
      this.c = $$0;
   }

   public ja a() {
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

   public eav b() {
      return this == a ? b : a;
   }
}
