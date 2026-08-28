import com.mojang.serialization.MapCodec;

public abstract class dkk extends dku {
   private static final fdo a = dku.b(4.0, 0.0, 10.0);

   protected dkk(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkk> a();

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return a;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4 == jo.a && !this.a($$0, $$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return a($$1, $$2.e(), jo.b);
   }
}
