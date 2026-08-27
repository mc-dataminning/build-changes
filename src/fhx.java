public record fhx(gbw a, gbw b, gbw c) {
   public static fhx a(akh $$0) {
      return new fhx(gbw.u($$0), gbw.y($$0), gbw.w($$0));
   }

   public static fhx b(akh $$0) {
      return new fhx(gbw.t($$0), gbw.x($$0), gbw.v($$0));
   }

   public gbw a(fep.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
