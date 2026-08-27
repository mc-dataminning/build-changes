public class cyt extends cuk {
   protected static final float e = 6.0F;
   protected static final float f = 10.0F;
   protected static final ehw g = csl.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ehw h = csl.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final ehw i = csl.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected cyt(dey.d $$0) {
      super($$0);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
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
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
