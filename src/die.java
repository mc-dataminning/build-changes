public enum die implements aug {
   a(hx.a),
   b(hx.b);

   private final hx c;

   private die(hx $$0) {
      this.c = $$0;
   }

   public hx a() {
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

   public die b() {
      return this == a ? b : a;
   }
}
