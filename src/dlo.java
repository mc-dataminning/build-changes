import com.mojang.serialization.MapCodec;

public abstract class dlo extends dhi {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final ews h = dff.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ews i = dff.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final ews j = dff.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dlo(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlo> a();

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
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
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
