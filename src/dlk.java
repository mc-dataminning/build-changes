import com.mojang.serialization.MapCodec;

public abstract class dlk extends dhe {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final ewm h = dfb.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ewm i = dfb.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final ewm j = dfb.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dlk(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlk> a();

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
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
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
