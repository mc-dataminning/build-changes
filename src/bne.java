public enum bne {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bne a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bnc b() {
      return switch (this) {
         case a -> bnc.a;
         case b -> bnc.b;
         case c -> bnc.c;
         case d, e -> bnc.d;
         case f -> bnc.e;
      };
   }
}
