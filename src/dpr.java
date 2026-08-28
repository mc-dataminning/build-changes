import com.mojang.serialization.MapCodec;

public class dpr extends dku {
   public static final MapCodec<dpr> a = b(dpr::new);
   private static final int b = 20;

   @Override
   public MapCodec<dpr> a() {
      return a;
   }

   public dpr(dyl.d $$0) {
      super($$0);
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, bvs $$3) {
      if (!$$3.ce() && $$3 instanceof bwr) {
         $$3.a($$0.al().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
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
}
