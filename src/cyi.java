import com.mojang.serialization.MapCodec;

public class cyi extends czf implements czi {
   public static final MapCodec<cyi> a = b(cyi::new);
   protected static final float b = 4.0F;
   protected static final epo c = czf.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<cyi> a() {
      return a;
   }

   public cyi(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      eov $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return $$1.a_($$2.d()).a(aue.at);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         return czh.a.o();
      } else {
         if ($$1 == ih.b && $$2.a(czh.mZ)) {
            $$3.a($$4, czh.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return new cpq(cpt.dQ);
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dme $$0, cia $$1, cvk $$2, ib $$3) {
      return $$1.eR().d() instanceof crb ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cwe $$0, ib $$1) {
      $$0.a($$1.c(), czh.mZ.o().a(cyj.i, dmq.b), 3);
   }
}
