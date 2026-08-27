public class czd extends cuu {
   protected static final float e = 6.0F;
   protected static final float f = 10.0F;
   protected static final eig g = csv.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eig h = csv.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final eig i = csv.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected czd(dfi.d $$0) {
      super($$0);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
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
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
