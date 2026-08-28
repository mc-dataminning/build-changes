public record fjx(gdw a, gdw b, gdw c) {
   public static fjx a(alf $$0) {
      return new fjx(gdw.u($$0), gdw.y($$0), gdw.w($$0));
   }

   public static fjx b(alf $$0) {
      return new fjx(gdw.t($$0), gdw.x($$0), gdw.v($$0));
   }

   public gdw a(fgp.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
