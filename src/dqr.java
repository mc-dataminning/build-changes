import com.mojang.serialization.MapCodec;

public abstract class dqr extends dmh {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final fcl h = dkd.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fcl i = dkd.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final fcl j = dkd.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dqr(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqr> a();

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
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
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
