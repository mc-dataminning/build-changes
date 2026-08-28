import com.mojang.serialization.MapCodec;

public class dpy extends dkm implements dkp {
   public static final MapCodec<dpy> a = b(dpy::new);

   @Override
   public MapCodec<dpy> a() {
      return a;
   }

   protected dpy(dxu.d $$0) {
      super($$0);
   }

   private static boolean b(dxv $$0, dhl $$1, jh $$2) {
      jh $$3 = $$2.d();
      dxv $$4 = $$1.a_($$3);
      int $$5 = eto.a($$0, $$4, jm.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dko.ei.m());
      }
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      dxv $$4 = $$0.a_($$2);
      jh $$5 = $$2.d();
      dzr $$6 = $$0.m().g();
      kd<egi<?, ?>> $$7 = $$0.K_().e(mb.aL);
      if ($$4.a(dko.oR)) {
         this.a($$7, so.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dko.oI)) {
         this.a($$7, so.j, $$0, $$6, $$1, $$5);
         this.a($$7, so.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, so.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(kd<egi<?, ?>> $$0, aly<egi<?, ?>> $$1, ash $$2, dzr $$3, bam $$4, jh $$5) {
      $$0.a($$1).ifPresent($$4x -> ((egi)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dkp.a ar_() {
      return dkp.a.a;
   }
}
