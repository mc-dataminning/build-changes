import com.mojang.serialization.MapCodec;

public abstract class dkw extends dkm {
   protected dkw(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkw> a();

   protected boolean b(dxv $$0, dgn $$1, jh $$2) {
      return $$0.a(axu.ah) || $$0.a(dko.cK);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return !$$0.a($$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      jh $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dxv $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return $$1 == eum.c && !this.aH ? true : super.a($$0, $$1);
   }
}
