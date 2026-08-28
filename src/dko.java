import com.mojang.serialization.MapCodec;

public abstract class dko extends dke {
   protected dko(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dko> a();

   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      return $$0.a(awp.ah) || $$0.a(dkg.cK);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      ji $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dxq $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return $$1 == eul.c && !this.E ? true : super.a($$0, $$1);
   }
}
