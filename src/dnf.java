import com.mojang.serialization.MapCodec;

public abstract class dnf extends diy {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final eyx h = dgv.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eyx i = dgv.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final eyx j = dgv.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dnf(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dnf> a();

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
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
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
