public class czf extends cuw {
   protected static final float e = 6.0F;
   protected static final float f = 10.0F;
   protected static final eii g = csx.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eii h = csx.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final eii i = csx.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected czf(dfk.d $$0) {
      super($$0);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
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
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
