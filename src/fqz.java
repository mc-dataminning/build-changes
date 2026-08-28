public record fqz(glu a, glu b, glu c) {
   public static fqz a(alz $$0) {
      return new fqz(glu.v($$0), glu.z($$0), glu.x($$0));
   }

   public static fqz b(alz $$0) {
      return new fqz(glu.u($$0), glu.y($$0), glu.w($$0));
   }

   public glu a(fnp.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
