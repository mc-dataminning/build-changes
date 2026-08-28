public enum bqx {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bqx a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bqv b() {
      return switch (this) {
         case a -> bqv.a;
         case b -> bqv.c;
         case c -> bqv.d;
         case d, e -> bqv.e;
         case f -> bqv.f;
      };
   }
}
