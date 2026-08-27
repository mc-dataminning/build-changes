import com.mojang.serialization.MapCodec;

public abstract class dew extends dar {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final eol h = cyo.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eol i = cyo.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final eol j = cyo.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dew(dle.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dew> a();

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
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
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
