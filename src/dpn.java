import com.mojang.serialization.MapCodec;

public class dpn extends djk {
   public static final MapCodec<dpn> a = b(dpn::new);

   @Override
   public MapCodec<dpn> a() {
      return a;
   }

   protected dpn(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      if (!$$0.a(cwr.sS)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bsi.a;
      } else {
         jn $$7 = $$6.c();
         jn $$8 = $$7.o() == jn.a.b ? $$4.cO().g() : $$7;
         $$2.a(null, $$3, avz.vw, awa.e, 1.0F, 1.0F);
         $$2.a($$3, djm.er.m().b(dkf.b, $$8), 11);
         cla $$9 = new cla(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cwn(cwr.sV, 4)
         );
         $$9.n(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bvf.d($$5));
         $$2.a($$4, ebr.M, $$3);
         $$4.b(awj.c.b(cwr.sS));
         return bsi.a;
      }
   }
}
