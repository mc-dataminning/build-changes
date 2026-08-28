public record fni(ghv a, ghv b, ghv c) {
   public static fni a(ale $$0) {
      return new fni(ghv.u($$0), ghv.y($$0), ghv.w($$0));
   }

   public static fni b(ale $$0) {
      return new fni(ghv.t($$0), ghv.x($$0), ghv.v($$0));
   }

   public ghv a(fjz.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
