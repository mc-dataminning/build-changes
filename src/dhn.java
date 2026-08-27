import com.mojang.serialization.MapCodec;

public class dhn extends dac {
   public static final MapCodec<dhn> a = b(dhn::new);
   protected static final eqm b = dac.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dhn> a() {
      return a;
   }

   public dhn(dna.d $$0) {
      super($$0);
   }

   @Override
   protected eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b;
   }

   @Override
   protected eqm b_(dnb $$0, cwh $$1, ib $$2) {
      return eqj.b();
   }

   @Override
   protected eqm c(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return eqj.b();
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      dai.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && $$2.a(dae.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   @Override
   protected float d(dnb $$0, cwh $$1, ib $$2) {
      return 0.2F;
   }
}
