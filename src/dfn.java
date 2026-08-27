import com.mojang.serialization.MapCodec;

public abstract class dfn extends dbi {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final epo h = czf.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final epo i = czf.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final epo j = czf.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dfn(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfn> a();

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      switch ($$0.c(a).o()) {
         case a:
         default:
            return j;
         case c:
            return i;
         case b:
            return h;
      }
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
