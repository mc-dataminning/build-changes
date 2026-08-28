public record fra(glv a, glv b, glv c) {
   public static fra a(alz $$0) {
      return new fra(glv.v($$0), glv.z($$0), glv.x($$0));
   }

   public static fra b(alz $$0) {
      return new fra(glv.u($$0), glv.y($$0), glv.w($$0));
   }

   public glv a(fnq.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
