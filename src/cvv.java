public class cvv extends crm {
   protected static final float e = 6.0F;
   protected static final float f = 10.0F;
   protected static final efb g = cpn.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final efb h = cpn.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final efb i = cpn.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected cvv(dca.d $$0) {
      super($$0);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
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
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }
}
