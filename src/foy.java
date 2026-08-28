public record foy(gjq a, gjq b, gjq c) {
   public static foy a(alj $$0) {
      return new foy(gjq.u($$0), gjq.y($$0), gjq.w($$0));
   }

   public static foy b(alj $$0) {
      return new foy(gjq.t($$0), gjq.x($$0), gjq.v($$0));
   }

   public gjq a(flo.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
