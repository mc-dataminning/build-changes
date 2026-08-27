public enum bmn {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bmn a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bml b() {
      return switch (this) {
         case a -> bml.a;
         case b -> bml.b;
         case c -> bml.c;
         case d, e -> bml.d;
         case f -> bml.e;
      };
   }
}
