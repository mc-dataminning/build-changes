public record fqt(glq a, glq b, glq c) {
   public static fqt a(alp $$0) {
      return new fqt(glq.v($$0), glq.z($$0), glq.x($$0));
   }

   public static fqt b(alp $$0) {
      return new fqt(glq.u($$0), glq.y($$0), glq.w($$0));
   }

   public glq a(fnj.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
