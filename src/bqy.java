public enum bqy {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bqy a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bqw b() {
      return switch (this) {
         case a -> bqw.a;
         case b -> bqw.c;
         case c -> bqw.d;
         case d, e -> bqw.e;
         case f -> bqw.f;
      };
   }
}
