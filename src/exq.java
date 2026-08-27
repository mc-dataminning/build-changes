public record exq(frc a, frc b, frc c) {
   public static exq a(agi $$0) {
      return new exq(frc.t($$0), frc.x($$0), frc.v($$0));
   }

   public static exq b(agi $$0) {
      return new exq(frc.s($$0), frc.w($$0), frc.u($$0));
   }

   public frc a(eum.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
