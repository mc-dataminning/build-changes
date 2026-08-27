public record eus(fno a, fno b, fno c) {
   public static eus a(aep $$0) {
      return new eus(fno.s($$0), fno.w($$0), fno.u($$0));
   }

   public static eus b(aep $$0) {
      return new eus(fno.r($$0), fno.v($$0), fno.t($$0));
   }

   public fno a(erv.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
