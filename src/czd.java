import com.mojang.serialization.MapCodec;

public class czd extends daa implements dad {
   public static final MapCodec<czd> a = b(czd::new);
   protected static final float b = 4.0F;
   protected static final eqk c = daa.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<czd> a() {
      return a;
   }

   public czd(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      epr $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return $$1.a_($$2.d()).a(aun.au);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         return dac.a.o();
      } else {
         if ($$1 == ih.b && $$2.a(dac.mZ)) {
            $$3.a($$4, dac.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return new cqk(cqn.dQ);
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dmz $$0, cis $$1, cwf $$2, ib $$3) {
      return $$1.eU().d() instanceof crv ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cwz $$0, ib $$1) {
      $$0.a($$1.c(), dac.mZ.o().a(cze.i, dnl.b), 3);
   }
}
