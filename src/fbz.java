public record fbz(fvt a, fvt b, fvt c) {
   public static fbz a(aiy $$0) {
      return new fbz(fvt.u($$0), fvt.y($$0), fvt.w($$0));
   }

   public static fbz b(aiy $$0) {
      return new fbz(fvt.t($$0), fvt.x($$0), fvt.v($$0));
   }

   public fvt a(eys.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
