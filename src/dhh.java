import com.mojang.serialization.MapCodec;

public class dhh extends die implements dih {
   public static final MapCodec<dhh> a = b(dhh::new);
   protected static final float b = 4.0F;
   protected static final fah c = die.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   public dhh(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      ezn $$4 = $$0.a($$2);
      return c.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return $$1.a_($$2.e()).a(axa.av);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if (!$$0.a($$3, $$4)) {
         return dig.a.m();
      } else {
         if ($$1 == jm.b && $$2.a(dig.mZ)) {
            $$3.a($$4, dig.mZ.m(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return new cwb(cwf.dR);
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dvj $$0, com $$1, deg $$2, jh $$3) {
      return $$1.fb().h() instanceof cxp ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dfb $$0, jh $$1) {
      $$0.a($$1.d(), dig.mZ.m().b(dhi.i, dvv.b), 3);
   }
}
