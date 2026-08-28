import com.mojang.serialization.MapCodec;

public class dqh extends dwq implements dnh {
   private static final double b = 0.7;
   private static final double c = 10.0;
   private static final double d = 5.0;
   private static final int e = 13;
   private static final int f = 30;
   public static final MapCodec<dqh> a = b(dqh::new);

   public dqh(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dqh> a() {
      return a;
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$3.a(30) == 0 && $$1.X() && $$1.b(ehf.a.f, $$2) <= $$2.v()) {
         $$1.a($$2, awr.jo, aws.i, 1.0F, 1.0F, false);
      }

      if ($$1.B($$2) <= 13 && $$3.j() <= 0.7) {
         double $$4 = (double)$$2.u() + $$3.j() * 10.0 - 5.0;
         double $$5 = (double)$$2.v() + $$3.j() * 5.0;
         double $$6 = (double)$$2.w() + $$3.j() * 10.0 - 5.0;
         $$1.a(lz.bj, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return dnh.a_($$0, $$1, $$2);
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      dnh.a((djz)$$0, $$2, $$3).ifPresent($$1x -> $$0.b($$1x, this.m()));
   }
}
