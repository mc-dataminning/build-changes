public record fjs(gdr a, gdr b, gdr c) {
   public static fjs a(alb $$0) {
      return new fjs(gdr.u($$0), gdr.y($$0), gdr.w($$0));
   }

   public static fjs b(alb $$0) {
      return new fjs(gdr.t($$0), gdr.x($$0), gdr.v($$0));
   }

   public gdr a(fgk.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
