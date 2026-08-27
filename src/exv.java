public record exv(frh a, frh b, frh c) {
   public static exv a(agm $$0) {
      return new exv(frh.t($$0), frh.x($$0), frh.v($$0));
   }

   public static exv b(agm $$0) {
      return new exv(frh.s($$0), frh.w($$0), frh.u($$0));
   }

   public frh a(eur.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
