public enum drz implements ayz {
   a(it.a),
   b(it.b);

   private final it c;

   private drz(it $$0) {
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

   public drz b() {
      return this == a ? b : a;
   }
}
