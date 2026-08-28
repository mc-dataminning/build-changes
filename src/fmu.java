public record fmu(ghe a, ghe b, ghe c) {
   public static fmu a(alb $$0) {
      return new fmu(ghe.v($$0), ghe.z($$0), ghe.x($$0));
   }

   public static fmu b(alb $$0) {
      return new fmu(ghe.u($$0), ghe.y($$0), ghe.w($$0));
   }

   public ghe a(fjl.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
