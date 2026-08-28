import com.mojang.serialization.MapCodec;

public abstract class dle extends dku {
   protected dle(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dle> a();

   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      return $$0.a(awz.ah) || $$0.a(dkw.cK);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jj $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dym $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return $$1 == evi.c && !this.E ? true : super.a($$0, $$1);
   }
}
