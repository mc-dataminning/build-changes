public class cyu extends cul {
   protected static final float e = 6.0F;
   protected static final float f = 10.0F;
   protected static final ehx g = csm.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ehx h = csm.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final ehx i = csm.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected cyu(dez.d $$0) {
      super($$0);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
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
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
