import com.mojang.serialization.MapCodec;

public abstract class dkn extends dkd {
   protected dkn(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkn> a();

   protected boolean b(dxo $$0, dge $$1, jh $$2) {
      return $$0.a(axk.ah) || $$0.a(dkf.cK);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      jh $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dxo $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return $$1 == euf.c && !this.aH ? true : super.a($$0, $$1);
   }
}
