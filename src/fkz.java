public record fkz(gfb a, gfb b, gfb c) {
   public static fkz a(akq $$0) {
      return new fkz(gfb.u($$0), gfb.y($$0), gfb.w($$0));
   }

   public static fkz b(akq $$0) {
      return new fkz(gfb.t($$0), gfb.x($$0), gfb.v($$0));
   }

   public gfb a(fhr.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
