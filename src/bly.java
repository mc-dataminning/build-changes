public enum bly {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bly a(boolean $$0) {
      return $$0 ? a : b;
   }

   public blw b() {
      return switch (this) {
         case a -> blw.a;
         case b -> blw.b;
         case c -> blw.c;
         case d, e -> blw.d;
         case f -> blw.e;
      };
   }
}
