import com.mojang.serialization.MapCodec;

public abstract class dnw extends djp {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final ezq h = dhm.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ezq i = dhm.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final ezq j = dhm.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dnw(dur.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dnw> a();

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
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
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
