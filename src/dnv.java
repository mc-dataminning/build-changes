public enum dnv implements axq {
   a(ih.a),
   b(ih.b);

   private final ih c;

   private dnv(ih $$0) {
      this.c = $$0;
   }

   public ih a() {
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

   public dnv b() {
      return this == a ? b : a;
   }
}
