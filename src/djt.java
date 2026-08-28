import com.mojang.serialization.MapCodec;

public abstract class djt extends dkd {
   protected static final int a = 2;
   protected static final fcl b = dkd.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected djt(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djt> a();

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4 == jm.a && !this.a($$0, $$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return a($$1, $$2.e(), jm.b);
   }
}
