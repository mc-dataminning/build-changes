import com.mojang.serialization.MapCodec;

public class djh extends dke implements dkh {
   public static final MapCodec<djh> a = b(djh::new);
   protected static final float b = 4.0F;
   protected static final fcm c = dke.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   public djh(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      fbs $$4 = $$0.a($$2);
      return c.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return $$1.a_($$2.e()).a(axu.ax);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if (!$$0.a($$1, $$3)) {
         return dkg.a.m();
      } else {
         return $$4 == jm.b && $$6.a(dkg.nu) ? dkg.nu.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return new cxk(cxo.eb);
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
      this.a($$0, $$2);
   }

   @Override
   protected float a(dxn $$0, cps $$1, dgf $$2, jh $$3) {
      return $$1.eX().h() instanceof cyy ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dha $$0, jh $$1) {
      $$0.a($$1.d(), dkg.nu.m().b(dji.i, dxz.b), 3);
   }
}
