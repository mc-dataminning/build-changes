public enum bqu {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bqu a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bqs b() {
      return switch (this) {
         case a -> bqs.a;
         case b -> bqs.c;
         case c -> bqs.d;
         case d, e -> bqs.e;
         case f -> bqs.f;
      };
   }
}
