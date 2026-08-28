import com.mojang.serialization.MapCodec;

public class dhb extends dhy implements dib {
   public static final MapCodec<dhb> a = b(dhb::new);
   protected static final float b = 4.0F;
   protected static final fab c = dhy.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dhb> a() {
      return a;
   }

   public dhb(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      ezh $$4 = $$0.a($$2);
      return c.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return $$1.a_($$2.e()).a(awz.av);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if (!$$0.a($$3, $$4)) {
         return dia.a.m();
      } else {
         if ($$1 == jl.b && $$2.a(dia.mZ)) {
            $$3.a($$4, dia.mZ.m(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return new cvx(cwb.dR);
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dvd $$0, coh $$1, dea $$2, jg $$3) {
      return $$1.fb().h() instanceof cxl ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dev $$0, jg $$1) {
      $$0.a($$1.d(), dia.mZ.m().b(dhc.i, dvp.b), 3);
   }
}
