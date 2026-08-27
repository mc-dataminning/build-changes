import com.mojang.serialization.MapCodec;

public abstract class dfa extends dav {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final eos h = cys.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eos i = cys.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final eos j = cys.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dfa(dli.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfa> a();

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
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
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
