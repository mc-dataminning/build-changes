import com.mojang.serialization.MapCodec;

public class dbc extends cvf {
   public static final MapCodec<dbc> a = b(dbc::new);

   @Override
   public MapCodec<dbc> a() {
      return a;
   }

   protected dbc(dhm.d $$0) {
      super($$0);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      clo $$6 = $$3.b($$4);
      if ($$6.a(clr.rS)) {
         if (!$$1.B) {
            ib $$7 = $$5.b();
            ib $$8 = $$7.o() == ib.a.b ? $$3.cE().g() : $$7;
            $$1.a(null, $$2, aqv.tE, aqw.e, 1.0F, 1.0F);
            $$1.a($$2, cvh.ee.o().a(cvz.b, $$8), 11);
            cas $$9 = new cas(
               $$1, (double)$$2.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$2.v() + 0.1, (double)$$2.w() + 0.5 + (double)$$8.l() * 0.65, new clo(clr.rV, 4)
            );
            $$9.o(0.05 * (double)$$8.j() + $$1.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$1.z.j() * 0.02);
            $$1.b($$9);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$1.a($$3, dlx.M, $$2);
            $$3.b(arf.c.b(clr.rS));
         }

         return bjb.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
