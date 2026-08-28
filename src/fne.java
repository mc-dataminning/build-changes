public record fne(ghq a, ghq b, ghq c) {
   public static fne a(alc $$0) {
      return new fne(ghq.u($$0), ghq.y($$0), ghq.w($$0));
   }

   public static fne b(alc $$0) {
      return new fne(ghq.t($$0), ghq.x($$0), ghq.v($$0));
   }

   public ghq a(fjv.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
