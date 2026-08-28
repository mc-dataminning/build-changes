public enum bqi {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bqi a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bqg b() {
      return switch (this) {
         case a -> bqg.a;
         case b -> bqg.c;
         case c -> bqg.d;
         case d, e -> bqg.e;
         case f -> bqg.f;
      };
   }
}
