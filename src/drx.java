public enum drx implements ayx {
   a(it.a),
   b(it.b);

   private final it c;

   private drx(it $$0) {
      this.c = $$0;
   }

   public it a() {
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

   public drx b() {
      return this == a ? b : a;
   }
}
