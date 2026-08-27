public record flg(gfo a, gfo b, gfo c) {
   public static flg a(akt $$0) {
      return new flg(gfo.u($$0), gfo.y($$0), gfo.w($$0));
   }

   public static flg b(akt $$0) {
      return new flg(gfo.t($$0), gfo.x($$0), gfo.v($$0));
   }

   public gfo a(fhy.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
