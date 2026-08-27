public enum bnf {
   a,
   b,
   c,
   d,
   e,
   f;

   public boolean a() {
      return this.b().a();
   }

   public static bnf a(boolean $$0) {
      return $$0 ? a : b;
   }

   public bnd b() {
      return switch (this) {
         case a -> bnd.a;
         case b -> bnd.b;
         case c -> bnd.c;
         case d, e -> bnd.d;
         case f -> bnd.e;
      };
   }
}
