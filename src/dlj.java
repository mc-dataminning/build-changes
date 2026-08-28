import com.mojang.serialization.MapCodec;

public abstract class dlj extends dhd {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final ewl h = dfa.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ewl i = dfa.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final ewl j = dfa.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dlj(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlj> a();

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
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
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
