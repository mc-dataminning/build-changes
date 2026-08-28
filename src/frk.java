public record frk(gmf a, gmf b, gmf c) {
   public static frk a(aku $$0) {
      return new frk(gmf.v($$0), gmf.z($$0), gmf.x($$0));
   }

   public static frk b(aku $$0) {
      return new frk(gmf.u($$0), gmf.y($$0), gmf.w($$0));
   }

   public gmf a(fnz.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
