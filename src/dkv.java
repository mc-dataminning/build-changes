import com.mojang.serialization.MapCodec;

public abstract class dkv extends dkl {
   protected dkv(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkv> a();

   protected boolean b(dxu $$0, dgm $$1, jh $$2) {
      return $$0.a(axu.ah) || $$0.a(dkn.cK);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return !$$0.a($$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      jh $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dxu $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return $$1 == eul.c && !this.aH ? true : super.a($$0, $$1);
   }
}
