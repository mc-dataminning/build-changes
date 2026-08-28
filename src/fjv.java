public record fjv(gdu a, gdu b, gdu c) {
   public static fjv a(ale $$0) {
      return new fjv(gdu.u($$0), gdu.y($$0), gdu.w($$0));
   }

   public static fjv b(ale $$0) {
      return new fjv(gdu.t($$0), gdu.x($$0), gdu.v($$0));
   }

   public gdu a(fgn.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
