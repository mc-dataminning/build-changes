public enum djl implements aut {
   a(ia.a),
   b(ia.b);

   private final ia c;

   private djl(ia $$0) {
      this.c = $$0;
   }

   public ia a() {
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

   public djl b() {
      return this == a ? b : a;
   }
}
