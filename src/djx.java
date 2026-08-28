import com.mojang.serialization.MapCodec;

public class djx extends dku implements dkx {
   public static final MapCodec<djx> a = b(djx::new);
   private static final fdo b = dku.b(8.0, 0.0, 12.0);

   @Override
   public MapCodec<djx> a() {
      return a;
   }

   public djx(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b.a($$0.a($$2));
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return $$1.a_($$2.e()).a(awz.ax);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if (!$$0.a($$1, $$3)) {
         return dkw.a.m();
      } else {
         return $$4 == jo.b && $$6.a(dkw.nB) ? dkw.nB.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return new cxy(cyc.ef);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      this.a($$0, $$2);
   }

   protected void a(dhp $$0, jj $$1) {
      $$0.a($$1.d(), dkw.nB.m().b(djy.c, dyy.b), 3);
   }
}
