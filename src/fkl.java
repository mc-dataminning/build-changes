public record fkl(gel a, gel b, gel c) {
   public static fkl a(akk $$0) {
      return new fkl(gel.u($$0), gel.y($$0), gel.w($$0));
   }

   public static fkl b(akk $$0) {
      return new fkl(gel.t($$0), gel.x($$0), gel.v($$0));
   }

   public gel a(fhd.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
