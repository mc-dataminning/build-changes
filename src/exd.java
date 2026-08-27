public record exd(fqp a, fqp b, fqp c) {
   public static exd a(agg $$0) {
      return new exd(fqp.t($$0), fqp.x($$0), fqp.v($$0));
   }

   public static exd b(agg $$0) {
      return new exd(fqp.s($$0), fqp.w($$0), fqp.u($$0));
   }

   public fqp a(etz.a $$0) {
      return switch ($$0) {
         case a -> this.a;
         case b -> this.b;
         case c -> this.c;
      };
   }
}
