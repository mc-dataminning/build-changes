import com.mojang.serialization.MapCodec;

public class dbt extends cyr {
   public static final MapCodec<dbt> a = b(dbt::new);
   protected static final epo b = czf.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dbt> a() {
      return a;
   }

   protected dbt(dmd.d $$0) {
      super($$0);
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dlb($$0, $$1);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      if ($$1 instanceof apa && $$3.cq() && epl.c(epl.a($$3.cE().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), eoz.i)) {
         ajb<cwe> $$4 = $$1.ad() == cwe.j ? cwe.h : cwe.j;
         apa $$5 = ((apa)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(kb.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return cpq.h;
   }

   @Override
   protected boolean a(dme $$0, ehq $$1) {
      return false;
   }
}
