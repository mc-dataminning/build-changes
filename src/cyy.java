public class cyy extends cup {
   protected static final float e = 6.0F;
   protected static final float f = 10.0F;
   protected static final eib g = csq.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eib h = csq.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final eib i = csq.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected cyy(dfd.d $$0) {
      super($$0);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      switch ($$0.c(a).o()) {
         case a:
         default:
            return i;
         case c:
            return h;
         case b:
            return g;
      }
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
