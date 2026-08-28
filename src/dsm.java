import com.mojang.serialization.MapCodec;

public class dsm extends dku {
   public static final MapCodec<dsm> a = b(dsm::new);
   private static final fdo b = dku.b(16.0, 0.0, 14.0);
   private static final int c = 20;

   @Override
   public MapCodec<dsm> a() {
      return a;
   }

   public dsm(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b;
   }

   @Override
   protected fdo b_(dym $$0, dgv $$1, jj $$2) {
      return fdl.b();
   }

   @Override
   protected fdo c(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return fdl.b();
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      dlb.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$4 == jo.b && $$6.a(dkw.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   @Override
   protected float c(dym $$0, dgv $$1, jj $$2) {
      return 0.2F;
   }
}
