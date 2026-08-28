public enum bqj {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bqj a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bqh b() {
      return switch (this) {
         case a -> bqh.a;
         case b -> bqh.c;
         case c -> bqh.d;
         case d, e -> bqh.e;
         case f -> bqh.f;
      };
   }
}
