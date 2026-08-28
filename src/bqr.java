public enum bqr {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bqr a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bqp b() {
      return switch (this) {
         case a -> bqp.a;
         case b -> bqp.c;
         case c -> bqp.d;
         case d, e -> bqp.e;
         case f -> bqp.f;
      };
   }
}
