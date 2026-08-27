public record fis(gcs a, gcs b, gcs c) {
   public static fis a(akm $$0) {
      return new fis(gcs.u($$0), gcs.y($$0), gcs.w($$0));
   }

   public static fis b(akm $$0) {
      return new fis(gcs.t($$0), gcs.x($$0), gcs.v($$0));
   }

   public gcs a(ffk.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
