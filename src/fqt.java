public record fqt(glo a, glo b, glo c) {
   public static fqt a(alz $$0) {
      return new fqt(glo.u($$0), glo.y($$0), glo.w($$0));
   }

   public static fqt b(alz $$0) {
      return new fqt(glo.t($$0), glo.x($$0), glo.v($$0));
   }

   public glo a(fnj.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
