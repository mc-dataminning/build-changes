import com.mojang.serialization.MapCodec;

public class dbc extends czf {
   public static final MapCodec<dbc> a = b(dbc::new);

   @Override
   public MapCodec<dbc> a() {
      return a;
   }

   public dbc(dmd.d $$0) {
      super($$0);
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      if ($$3.a(5) == 0) {
         ih $$4 = ih.b($$3);
         if ($$4 != ih.b) {
            ib $$5 = $$2.a($$4);
            dme $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(kb.aB, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
