public record evg(fom a, fom b, fom c) {
   public static evg a(aex $$0) {
      return new evg(fom.t($$0), fom.x($$0), fom.v($$0));
   }

   public static evg b(aex $$0) {
      return new evg(fom.s($$0), fom.w($$0), fom.u($$0));
   }

   public fom a(esd.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
