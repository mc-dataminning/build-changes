public record fit(gcs a, gcs b, gcs c) {
   public static fit a(akn $$0) {
      return new fit(gcs.u($$0), gcs.y($$0), gcs.w($$0));
   }

   public static fit b(akn $$0) {
      return new fit(gcs.t($$0), gcs.x($$0), gcs.v($$0));
   }

   public gcs a(ffl.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
