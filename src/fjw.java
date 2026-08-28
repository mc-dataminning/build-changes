public record fjw(gdv a, gdv b, gdv c) {
   public static fjw a(ale $$0) {
      return new fjw(gdv.u($$0), gdv.y($$0), gdv.w($$0));
   }

   public static fjw b(ale $$0) {
      return new fjw(gdv.t($$0), gdv.x($$0), gdv.v($$0));
   }

   public gdv a(fgo.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
