public record fai(fub a, fub b, fub c) {
   public static fai a(ahh $$0) {
      return new fai(fub.u($$0), fub.y($$0), fub.w($$0));
   }

   public static fai b(ahh $$0) {
      return new fai(fub.t($$0), fub.x($$0), fub.v($$0));
   }

   public fub a(exc.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
