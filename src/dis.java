import com.mojang.serialization.MapCodec;

public abstract class dis extends dij {
   protected dis(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dis> a();

   protected boolean b(dvo $$0, dek $$1, jh $$2) {
      return $$0.a(axd.ag) || $$0.a(dil.cC);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return !$$0.a($$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      jh $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dvo $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return $$1 == esd.c && !this.aH ? true : super.a($$0, $$1);
   }
}
