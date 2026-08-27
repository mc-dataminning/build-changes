import com.mojang.serialization.MapCodec;

public abstract class czj extends cvd {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final eia h = ctc.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eia i = ctc.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final eia j = ctc.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected czj(dfc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends czj> a();

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
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
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
