public record fqy(glt a, glt b, glt c) {
   public static fqy a(alz $$0) {
      return new fqy(glt.u($$0), glt.y($$0), glt.w($$0));
   }

   public static fqy b(alz $$0) {
      return new fqy(glt.t($$0), glt.x($$0), glt.v($$0));
   }

   public glt a(fno.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
