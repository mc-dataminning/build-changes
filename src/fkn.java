public record fkn(gen a, gen b, gen c) {
   public static fkn a(akk $$0) {
      return new fkn(gen.u($$0), gen.y($$0), gen.w($$0));
   }

   public static fkn b(akk $$0) {
      return new fkn(gen.t($$0), gen.x($$0), gen.v($$0));
   }

   public gen a(fhf.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
