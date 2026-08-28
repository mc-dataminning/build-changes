import com.mojang.serialization.MapCodec;

public class djo extends dkl implements dko {
   public static final MapCodec<djo> a = b(djo::new);
   protected static final float b = 4.0F;
   protected static final fcr c = dkl.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<djo> a() {
      return a;
   }

   public djo(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      fbx $$4 = $$0.a($$2);
      return c.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return $$1.a_($$2.e()).a(axu.ax);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if (!$$0.a($$1, $$3)) {
         return dkn.a.m();
      } else {
         return $$4 == jm.b && $$6.a(dkn.nu) ? dkn.nu.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return new cxo(cxs.eb);
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
      this.a($$0, $$2);
   }

   @Override
   protected float a(dxu $$0, cpw $$1, dgm $$2, jh $$3) {
      return $$1.eX().h() instanceof czc ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dhh $$0, jh $$1) {
      $$0.a($$1.d(), dkn.nu.m().b(djp.i, dyg.b), 3);
   }
}
