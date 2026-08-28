import com.mojang.serialization.MapCodec;

public abstract class dnr extends dku implements dnq {
   public dnr(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dnr> a();

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.G_()) {
         cmm $$4 = cmm.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cmm $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(dym $$0) {
      return $$0.l() || $$0.a(awz.aN) || $$0.n() || $$0.v();
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if ($$3.a(16) == 0) {
         jj $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azo.a($$1, $$2, $$3, new ln(lv.C, $$0));
         }
      }
   }

   public int b(dym $$0, dgv $$1, jj $$2) {
      return -16777216;
   }
}
