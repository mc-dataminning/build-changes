import com.mojang.serialization.MapCodec;

public class dqj extends dku implements dkx {
   public static final MapCodec<dqj> a = b(dqj::new);

   @Override
   public MapCodec<dqj> a() {
      return a;
   }

   protected dqj(dyl.d $$0) {
      super($$0);
   }

   private static boolean b(dym $$0, dhs $$1, jj $$2) {
      jj $$3 = $$2.d();
      dym $$4 = $$1.a_($$3);
      int $$5 = euk.a($$0, $$4, jo.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dkw.ei.m());
      }
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
      dym $$4 = $$0.a_($$2);
      jj $$5 = $$2.d();
      eak $$6 = $$0.m().g();
      kf<ehd<?, ?>> $$7 = $$0.F_().f(me.aP);
      if ($$4.a(dkw.oY)) {
         this.a($$7, rj.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dkw.oP)) {
         this.a($$7, rj.j, $$0, $$6, $$1, $$5);
         this.a($$7, rj.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rj.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(kf<ehd<?, ?>> $$0, alc<ehd<?, ?>> $$1, arn $$2, eak $$3, azs $$4, jj $$5) {
      $$0.a($$1).ifPresent($$4x -> ((ehd)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dkx.a am_() {
      return dkx.a.a;
   }
}
