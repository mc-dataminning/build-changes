public record fbz(fvu a, fvu b, fvu c) {
   public static fbz a(aiy $$0) {
      return new fbz(fvu.u($$0), fvu.y($$0), fvu.w($$0));
   }

   public static fbz b(aiy $$0) {
      return new fbz(fvu.t($$0), fvu.x($$0), fvu.v($$0));
   }

   public fvu a(eys.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
