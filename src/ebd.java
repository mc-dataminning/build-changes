public enum ebd implements bak {
   a(ja.a),
   b(ja.b);

   private final ja c;

   private ebd(final ja $$0) {
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

   public ebd b() {
      return this == a ? b : a;
   }
}
