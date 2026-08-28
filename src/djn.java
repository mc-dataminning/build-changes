import com.mojang.serialization.MapCodec;

public abstract class djn extends dku {
   protected static final int a = 4;
   private static final fdo c = dku.b(12.0, 4.0, 16.0);
   private static final fdo d = af.a(() -> {
      int $$0 = 4;
      int $$1 = 3;
      int $$2 = 2;
      return fdl.a(fdl.b(), fdl.a(dku.a(16.0, 8.0, 0.0, 3.0), dku.a(8.0, 16.0, 0.0, 3.0), dku.b(12.0, 0.0, 3.0), c), fcy.e);
   });
   protected final kp.a b;

   @Override
   protected abstract MapCodec<? extends djn> a();

   public djn(dyl.d $$0, kp.a $$1) {
      super($$0);
      this.b = $$1;
   }

   protected double b(dym $$0) {
      return 0.0;
   }

   protected boolean a(dym $$0, jj $$1, bvs $$2) {
      return $$2.dC() < (double)$$1.v() + this.b($$0) && $$2.cR().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      kp $$7 = this.b.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return d;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2) {
      return c;
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   public abstract boolean d(dym var1);

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      jj $$4 = dqq.a((dhp)$$1, $$2);
      if ($$4 != null) {
         eus $$5 = dqq.a($$1, $$4);
         if ($$5 != euu.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eus $$0) {
      return false;
   }

   protected void a(dym $$0, dhp $$1, jj $$2, eus $$3) {
   }
}
