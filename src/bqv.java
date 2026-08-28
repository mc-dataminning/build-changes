public enum bqv {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bqv a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bqt b() {
      return switch (this) {
         case a -> bqt.a;
         case b -> bqt.c;
         case c -> bqt.d;
         case d, e -> bqt.e;
         case f -> bqt.f;
      };
   }
}
