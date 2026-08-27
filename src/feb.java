public record feb(fya a, fya b, fya c) {
   public static feb a(ajh $$0) {
      return new feb(fya.u($$0), fya.y($$0), fya.w($$0));
   }

   public static feb b(ajh $$0) {
      return new feb(fya.t($$0), fya.x($$0), fya.v($$0));
   }

   public fya a(fat.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
