public enum bpw {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bpw a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bpu b() {
      return switch (this) {
         case a -> bpu.a;
         case b -> bpu.b;
         case c -> bpu.c;
         case d, e -> bpu.d;
         case f -> bpu.e;
      };
   }
}
