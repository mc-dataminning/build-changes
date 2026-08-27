public record fhn(gbm a, gbm b, gbm c) {
   public static fhn a(akf $$0) {
      return new fhn(gbm.u($$0), gbm.y($$0), gbm.w($$0));
   }

   public static fhn b(akf $$0) {
      return new fhn(gbm.t($$0), gbm.x($$0), gbm.v($$0));
   }

   public gbm a(fef.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
