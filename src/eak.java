public enum eak implements bai {
   a(ja.a),
   b(ja.b);

   private final ja c;

   private eak(final ja $$0) {
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

   public eak b() {
      return this == a ? b : a;
   }
}
