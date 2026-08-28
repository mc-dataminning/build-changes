public enum bqw {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bqw a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bqu b() {
      return switch (this) {
         case a -> bqu.a;
         case b -> bqu.c;
         case c -> bqu.d;
         case d, e -> bqu.e;
         case f -> bqu.f;
      };
   }
}
