import com.mojang.serialization.MapCodec;

public abstract class dip extends dek {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final etc h = dch.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final etc i = dch.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final etc j = dch.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dip(dph.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dip> a();

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
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
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
