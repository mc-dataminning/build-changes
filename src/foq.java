public record foq(gjh a, gjh b, gjh c) {
   public static foq a(all $$0) {
      return new foq(gjh.u($$0), gjh.y($$0), gjh.w($$0));
   }

   public static foq b(all $$0) {
      return new foq(gjh.t($$0), gjh.x($$0), gjh.v($$0));
   }

   public gjh a(flh.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
