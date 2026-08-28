import com.mojang.serialization.MapCodec;

public abstract class dmc extends dmm {
   private static final ffr a = dmm.b(4.0, 0.0, 10.0);

   protected dmc(ean.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmc> a();

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return a;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return $$4 == jb.a && !this.a($$0, $$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return a($$1, $$2.e(), jb.b);
   }
}
