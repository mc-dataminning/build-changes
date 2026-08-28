import com.mojang.serialization.MapCodec;

public class dpq extends dke implements dkh {
   public static final MapCodec<dpq> a = b(dpq::new);

   @Override
   public MapCodec<dpq> a() {
      return a;
   }

   protected dpq(dxm.d $$0) {
      super($$0);
   }

   private static boolean b(dxn $$0, dhd $$1, jh $$2) {
      jh $$3 = $$2.d();
      dxn $$4 = $$1.a_($$3);
      int $$5 = etg.a($$0, $$4, jm.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dkg.ei.m());
      }
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      dxn $$4 = $$0.a_($$2);
      jh $$5 = $$2.d();
      dzj $$6 = $$0.m().g();
      kd<ega<?, ?>> $$7 = $$0.K_().e(mb.aK);
      if ($$4.a(dkg.oR)) {
         this.a($$7, so.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dkg.oI)) {
         this.a($$7, so.j, $$0, $$6, $$1, $$5);
         this.a($$7, so.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, so.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(kd<ega<?, ?>> $$0, aly<ega<?, ?>> $$1, ash $$2, dzj $$3, bam $$4, jh $$5) {
      $$0.a($$1).ifPresent($$4x -> ((ega)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dkh.a ar_() {
      return dkh.a.a;
   }
}
