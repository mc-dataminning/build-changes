import com.mojang.serialization.MapCodec;

public class djc extends dde {
   public static final MapCodec<djc> a = b(djc::new);

   @Override
   public MapCodec<djc> a() {
      return a;
   }

   protected djc(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      if (!$$0.a(ctc.rV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bpo.a($$2.B);
      } else {
         is $$7 = $$6.b();
         is $$8 = $$7.o() == is.a.b ? $$4.cF().g() : $$7;
         $$2.a(null, $$3, avc.uI, avd.e, 1.0F, 1.0F);
         $$2.a($$3, ddg.ee.n().a(ddy.b, $$8), 11);
         chr $$9 = new chr(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new csz(ctc.rY, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bsa.d($$5));
         $$2.a($$4, dva.M, $$3);
         $$4.b(avm.c.b(ctc.rV));
         return bpo.a($$2.B);
      }
   }
}
