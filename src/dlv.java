import com.mojang.serialization.MapCodec;

public class dlv extends dfw {
   public static final MapCodec<dlv> a = b(dlv::new);

   @Override
   public MapCodec<dlv> a() {
      return a;
   }

   protected dlv(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      if (!$$0.a(cur.rV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bqs.a($$2.B);
      } else {
         ji $$7 = $$6.b();
         ji $$8 = $$7.o() == ji.a.b ? $$4.cI().g() : $$7;
         $$2.a(null, $$3, avo.uW, avp.e, 1.0F, 1.0F);
         $$2.a($$3, dfy.ee.o().a(dgq.b, $$8), 11);
         cjf $$9 = new cjf(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cuo(cur.rY, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, btl.d($$5));
         $$2.a($$4, dxw.M, $$3);
         $$4.b(avy.c.b(cur.rV));
         return bqs.a($$2.B);
      }
   }
}
