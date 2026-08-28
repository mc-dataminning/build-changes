import com.mojang.serialization.MapCodec;

public abstract class djx extends djn {
   protected djx(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djx> a();

   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      return $$0.a(awp.ah) || $$0.a(djp.cK);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      ji $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dwy $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return $$1 == etp.c && !this.aH ? true : super.a($$0, $$1);
   }
}
