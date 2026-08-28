import com.mojang.serialization.MapCodec;

public class doc extends die {
   public static final MapCodec<doc> a = b(doc::new);

   @Override
   public MapCodec<doc> a() {
      return a;
   }

   protected doc(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      if (!$$0.a(cwf.rW)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bsd.a;
      } else {
         jm $$7 = $$6.c();
         jm $$8 = $$7.o() == jm.a.b ? $$4.cP().g() : $$7;
         $$2.a(null, $$3, awl.uV, awm.e, 1.0F, 1.0F);
         $$2.a($$3, dig.ee.m().b(diy.b, $$8), 11);
         ckv $$9 = new ckv(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cwb(cwf.rZ, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bva.d($$5));
         $$2.a($$4, eag.M, $$3);
         $$4.b(awv.c.b(cwf.rW));
         return bsd.a;
      }
   }
}
