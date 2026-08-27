import com.mojang.serialization.MapCodec;

public class czf extends dac implements daf {
   public static final MapCodec<czf> a = b(czf::new);
   protected static final float b = 4.0F;
   protected static final eqm c = dac.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<czf> a() {
      return a;
   }

   public czf(dna.d $$0) {
      super($$0);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      ept $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return $$1.a_($$2.d()).a(aun.au);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         return dae.a.o();
      } else {
         if ($$1 == ih.b && $$2.a(dae.mZ)) {
            $$3.a($$4, dae.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return new cqm(cqp.dQ);
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dnb $$0, ciu $$1, cwh $$2, ib $$3) {
      return $$1.eU().d() instanceof crx ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cxb $$0, ib $$1) {
      $$0.a($$1.c(), dae.mZ.o().a(czg.i, dnn.b), 3);
   }
}
