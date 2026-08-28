import com.mojang.serialization.MapCodec;

public class dqr extends dxa implements dnr {
   private static final double b = 0.7;
   private static final double c = 10.0;
   private static final double d = 5.0;
   private static final int e = 13;
   private static final int f = 30;
   public static final MapCodec<dqr> a = b(dqr::new);

   public dqr(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dqr> a() {
      return a;
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$3.a(30) == 0 && $$1.X() && $$1.b(ehp.a.f, $$2) <= $$2.v()) {
         $$1.a($$2, awy.jo, awz.i, 1.0F, 1.0F, false);
      }

      if ($$1.B($$2) <= 13 && $$3.j() <= 0.7) {
         double $$4 = (double)$$2.u() + $$3.j() * 10.0 - 5.0;
         double $$5 = (double)$$2.v() + $$3.j() * 5.0;
         double $$6 = (double)$$2.w() + $$3.j() * 10.0 - 5.0;
         $$1.a(lz.bj, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return dnr.a_($$0, $$1, $$2);
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      dnr.a((dkj)$$0, $$2, $$3).ifPresent($$1x -> $$0.b($$1x, this.m()));
   }
}
