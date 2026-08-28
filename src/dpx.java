import com.mojang.serialization.MapCodec;

public class dpx extends dkl implements dko {
   public static final MapCodec<dpx> a = b(dpx::new);

   @Override
   public MapCodec<dpx> a() {
      return a;
   }

   protected dpx(dxt.d $$0) {
      super($$0);
   }

   private static boolean b(dxu $$0, dhk $$1, jh $$2) {
      jh $$3 = $$2.d();
      dxu $$4 = $$1.a_($$3);
      int $$5 = etn.a($$0, $$4, jm.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dkn.ei.m());
      }
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      dxu $$4 = $$0.a_($$2);
      jh $$5 = $$2.d();
      dzq $$6 = $$0.m().g();
      kd<egh<?, ?>> $$7 = $$0.K_().e(mb.aL);
      if ($$4.a(dkn.oR)) {
         this.a($$7, so.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dkn.oI)) {
         this.a($$7, so.j, $$0, $$6, $$1, $$5);
         this.a($$7, so.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, so.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(kd<egh<?, ?>> $$0, aly<egh<?, ?>> $$1, ash $$2, dzq $$3, bam $$4, jh $$5) {
      $$0.a($$1).ifPresent($$4x -> ((egh)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dko.a ar_() {
      return dko.a.a;
   }
}
