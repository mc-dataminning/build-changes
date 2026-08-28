import com.mojang.serialization.MapCodec;

public abstract class dko extends dke {
   protected dko(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dko> a();

   protected boolean b(dxn $$0, dgf $$1, jh $$2) {
      return $$0.a(axu.ah) || $$0.a(dkg.cK);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      jh $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dxn $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return $$1 == eue.c && !this.aH ? true : super.a($$0, $$1);
   }
}
