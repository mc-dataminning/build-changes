public class cys extends cuj {
   protected static final float e = 6.0F;
   protected static final float f = 10.0F;
   protected static final ehy g = csk.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ehy h = csk.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final ehy i = csk.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected cys(dex.d $$0) {
      super($$0);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
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
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
