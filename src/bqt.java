public enum bqt {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bqt a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bqr b() {
      return switch (this) {
         case a -> bqr.a;
         case b -> bqr.c;
         case c -> bqr.d;
         case d, e -> bqr.e;
         case f -> bqr.f;
      };
   }
}
