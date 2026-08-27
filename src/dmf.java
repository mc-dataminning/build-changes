public enum dmf implements axc {
   a(ie.a),
   b(ie.b);

   private final ie c;

   private dmf(ie $$0) {
      this.c = $$0;
   }

   public ie a() {
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

   public dmf b() {
      return this == a ? b : a;
   }
}
