import com.mojang.serialization.MapCodec;

public class dep extends cys {
   public static final MapCodec<dep> a = b(dep::new);

   @Override
   public MapCodec<dep> a() {
      return a;
   }

   protected dep(dli.d $$0) {
      super($$0);
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      if (!$$0.a(cpg.rU)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bly.a($$2.B);
      } else {
         ie $$7 = $$6.b();
         ie $$8 = $$7.o() == ie.a.b ? $$4.cE().g() : $$7;
         $$2.a(null, $$3, atl.up, atm.e, 1.0F, 1.0F);
         $$2.a($$3, cyu.ee.o().a(czm.b, $$8), 11);
         cdw $$9 = new cdw(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cpd(cpg.rX, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, boi.d($$5));
         $$2.a($$4, dpw.M, $$3);
         $$4.b(atv.c.b(cpg.rU));
         return bly.a($$2.B);
      }
   }
}
