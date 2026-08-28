import com.mojang.serialization.MapCodec;

public class dpq extends dkd implements dkg {
   public static final MapCodec<dpq> a = b(dpq::new);

   @Override
   public MapCodec<dpq> a() {
      return a;
   }

   protected dpq(dxn.d $$0) {
      super($$0);
   }

   private static boolean b(dxo $$0, dhc $$1, jh $$2) {
      jh $$3 = $$2.d();
      dxo $$4 = $$1.a_($$3);
      int $$5 = eth.a($$0, $$4, jm.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dkf.ei.m());
      }
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      dxo $$4 = $$0.a_($$2);
      jh $$5 = $$2.d();
      dzk $$6 = $$0.m().g();
      kd<egb<?, ?>> $$7 = $$0.K_().e(mb.aL);
      if ($$4.a(dkf.oY)) {
         this.a($$7, sd.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dkf.oP)) {
         this.a($$7, sd.j, $$0, $$6, $$1, $$5);
         this.a($$7, sd.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, sd.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(kd<egb<?, ?>> $$0, alo<egb<?, ?>> $$1, arx $$2, dzk $$3, bac $$4, jh $$5) {
      $$0.a($$1).ifPresent($$4x -> ((egb)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dkg.a ar_() {
      return dkg.a.a;
   }
}
