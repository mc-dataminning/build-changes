import com.mojang.serialization.MapCodec;

public class dhm extends dij implements dim {
   public static final MapCodec<dhm> a = b(dhm::new);
   protected static final float b = 4.0F;
   protected static final fal c = dij.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dhm> a() {
      return a;
   }

   public dhm(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      ezr $$4 = $$0.a($$2);
      return c.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return $$1.a_($$2.e()).a(axd.aw);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         return dil.a.m();
      } else {
         return $$4 == jm.b && $$6.a(dil.mZ) ? dil.mZ.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return new cwf(cwj.dR);
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dvo $$0, cor $$1, dek $$2, jh $$3) {
      return $$1.fc().h() instanceof cxt ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dff $$0, jh $$1) {
      $$0.a($$1.d(), dil.mZ.m().b(dhn.i, dwa.b), 3);
   }
}
