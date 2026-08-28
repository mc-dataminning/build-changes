public record fjy(gdx a, gdx b, gdx c) {
   public static fjy a(alf $$0) {
      return new fjy(gdx.u($$0), gdx.y($$0), gdx.w($$0));
   }

   public static fjy b(alf $$0) {
      return new fjy(gdx.t($$0), gdx.x($$0), gdx.v($$0));
   }

   public gdx a(fgq.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
