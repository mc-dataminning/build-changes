public enum boh {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static boh a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bof b() {
      return switch (this) {
         case a -> bof.a;
         case b -> bof.b;
         case c -> bof.c;
         case d, e -> bof.d;
         case f -> bof.e;
      };
   }
}
