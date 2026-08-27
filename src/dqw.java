public class dqw {
   public static euf a(euf $$0, it $$1, double $$2) {
      double $$3 = $$2 * (double)$$1.f().a();
      double $$4 = Math.min($$3, 0.0);
      double $$5 = Math.max($$3, 0.0);
      switch ($$1) {
         case e:
            return new euf($$0.a + $$4, $$0.b, $$0.c, $$0.a + $$5, $$0.e, $$0.f);
         case f:
            return new euf($$0.d + $$4, $$0.b, $$0.c, $$0.d + $$5, $$0.e, $$0.f);
         case a:
            return new euf($$0.a, $$0.b + $$4, $$0.c, $$0.d, $$0.b + $$5, $$0.f);
         case b:
         default:
            return new euf($$0.a, $$0.e + $$4, $$0.c, $$0.d, $$0.e + $$5, $$0.f);
         case c:
            return new euf($$0.a, $$0.b, $$0.c + $$4, $$0.d, $$0.e, $$0.c + $$5);
         case d:
            return new euf($$0.a, $$0.b, $$0.f + $$4, $$0.d, $$0.e, $$0.f + $$5);
      }
   }
}
