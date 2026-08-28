import com.mojang.serialization.MapCodec;

public class dni extends dhj {
   public static final MapCodec<dni> a = b(dni::new);

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   protected dni(dun.d $$0) {
      super($$0);
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      if (!$$0.a(cvt.rW)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return brp.a;
      } else {
         jj $$7 = $$6.c();
         jj $$8 = $$7.o() == jj.a.b ? $$4.cL().g() : $$7;
         $$2.a(null, $$3, awe.uX, awf.e, 1.0F, 1.0F);
         $$2.a($$3, dhl.ee.o().b(did.b, $$8), 11);
         cke $$9 = new cke(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cvp(cvt.rZ, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, buk.d($$5));
         $$2.a($$4, dzl.M, $$3);
         $$4.b(awo.c.b(cvt.rW));
         return brp.a;
      }
   }
}
