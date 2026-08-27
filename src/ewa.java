public record ewa(fpj a, fpj b, fpj c) {
   public static ewa a(afw $$0) {
      return new ewa(fpj.t($$0), fpj.x($$0), fpj.v($$0));
   }

   public static ewa b(afw $$0) {
      return new ewa(fpj.s($$0), fpj.w($$0), fpj.u($$0));
   }

   public fpj a(esw.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
