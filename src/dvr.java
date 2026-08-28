import com.mojang.serialization.MapCodec;

public abstract class dvr extends dmf {
   protected dvr(eag.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dvr> a();

   protected boolean b(eah $$0, dig $$1, iu $$2) {
      return $$0.a(axc.ah) || $$0.a(dmh.cN);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      iu $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(eah $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return $$1 == exd.c && !this.F ? true : super.a($$0, $$1);
   }
}
