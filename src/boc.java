public enum boc {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static boc a(boolean $$0) {
      return $$0 ? a : b;
   }

   public boa b() {
      return switch (this) {
         case a -> boa.a;
         case b -> boa.b;
         case c -> boa.c;
         case d, e -> boa.d;
         case f -> boa.e;
      };
   }
}
