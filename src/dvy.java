import com.mojang.serialization.MapCodec;

public abstract class dvy extends dmm {
   protected dvy(ean.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dvy> a();

   protected boolean b(eao $$0, din $$1, iv $$2) {
      return $$0.a(axc.ah) || $$0.a(dmo.cN);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return !$$0.a($$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      iv $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(eao $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return $$1 == exk.c && !this.F ? true : super.a($$0, $$1);
   }
}
