public enum bke {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bke a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bkc b() {
      return switch (this) {
         case a -> bkc.a;
         case b -> bkc.b;
         case c -> bkc.c;
         case d, e -> bkc.d;
         case f -> bkc.e;
      };
   }
}
