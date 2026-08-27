public record eyy(fsq a, fsq b, fsq c) {
   public static eyy a(agt $$0) {
      return new eyy(fsq.u($$0), fsq.y($$0), fsq.w($$0));
   }

   public static eyy b(agt $$0) {
      return new eyy(fsq.t($$0), fsq.x($$0), fsq.v($$0));
   }

   public fsq a(evu.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
