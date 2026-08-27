public enum blw {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static blw a(boolean $$0) {
      return $$0 ? a : b;
   }

   public blu b() {
      return switch (this) {
         case a -> blu.a;
         case b -> blu.b;
         case c -> blu.c;
         case d, e -> blu.d;
         case f -> blu.e;
      };
   }
}
