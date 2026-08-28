public record fro(gmj a, gmj b, gmj c) {
   public static fro a(akv $$0) {
      return new fro(gmj.v($$0), gmj.z($$0), gmj.x($$0));
   }

   public static fro b(akv $$0) {
      return new fro(gmj.u($$0), gmj.y($$0), gmj.w($$0));
   }

   public gmj a(fod.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
