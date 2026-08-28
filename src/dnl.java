import com.mojang.serialization.MapCodec;

public class dnl extends dhm {
   public static final MapCodec<dnl> a = b(dnl::new);

   @Override
   public MapCodec<dnl> a() {
      return a;
   }

   protected dnl(dur.d $$0) {
      super($$0);
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      if (!$$0.a(cvw.rW)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return brs.a;
      } else {
         jk $$7 = $$6.c();
         jk $$8 = $$7.o() == jk.a.b ? $$4.cL().g() : $$7;
         $$2.a(null, $$3, awg.uX, awh.e, 1.0F, 1.0F);
         $$2.a($$3, dho.ee.n().b(dig.b, $$8), 11);
         ckh $$9 = new ckh(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cvs(cvw.rZ, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bun.d($$5));
         $$2.a($$4, dzp.M, $$3);
         $$4.b(awq.c.b(cvw.rW));
         return brs.a;
      }
   }
}
