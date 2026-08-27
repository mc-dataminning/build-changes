public record fdz(fxy a, fxy b, fxy c) {
   public static fdz a(ajh $$0) {
      return new fdz(fxy.u($$0), fxy.y($$0), fxy.w($$0));
   }

   public static fdz b(ajh $$0) {
      return new fdz(fxy.t($$0), fxy.x($$0), fxy.v($$0));
   }

   public fxy a(far.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
