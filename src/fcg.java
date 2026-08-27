public record fcg(fwb a, fwb b, fwb c) {
   public static fcg a(aiy $$0) {
      return new fcg(fwb.u($$0), fwb.y($$0), fwb.w($$0));
   }

   public static fcg b(aiy $$0) {
      return new fcg(fwb.t($$0), fwb.x($$0), fwb.v($$0));
   }

   public fwb a(eyz.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
