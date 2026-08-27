import com.mojang.serialization.MapCodec;

public class dch extends dde implements ddh {
   public static final MapCodec<dch> a = b(dch::new);
   protected static final float b = 4.0F;
   protected static final eui c = dde.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dch> a() {
      return a;
   }

   public dch(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      etp $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return $$1.a_($$2.d()).a(avr.au);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if (!$$0.a($$3, $$4)) {
         return ddg.a.n();
      } else {
         if ($$1 == is.b && $$2.a(ddg.mZ)) {
            $$3.a($$4, ddg.mZ.n(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return new csz(ctc.dR);
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dqh $$0, clh $$1, czj $$2, in $$3) {
      return $$1.eV().f() instanceof cuk ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dad $$0, in $$1) {
      $$0.a($$1.c(), ddg.mZ.n().a(dci.i, dqt.b), 3);
   }
}
