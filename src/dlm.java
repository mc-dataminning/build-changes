import com.mojang.serialization.MapCodec;

public class dlm extends dku {
   public static final MapCodec<dlm> a = b(dlm::new);
   private static final fdo b = dku.b(16.0, 0.0, 1.0);

   @Override
   public MapCodec<? extends dlm> a() {
      return a;
   }

   public dlm(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return !$$1.u($$2.e());
   }
}
