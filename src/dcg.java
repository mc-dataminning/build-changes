import com.mojang.serialization.MapCodec;

public class dcg extends cwj {
   public static final MapCodec<dcg> a = b(dcg::new);

   @Override
   public MapCodec<dcg> a() {
      return a;
   }

   protected dcg(diz.d $$0) {
      super($$0);
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      cmr $$6 = $$3.b($$4);
      if ($$6.a(cmu.rS)) {
         if (!$$1.B) {
            ic $$7 = $$5.b();
            ic $$8 = $$7.o() == ic.a.b ? $$3.cE().g() : $$7;
            $$1.a(null, $$2, arm.tZ, arn.e, 1.0F, 1.0F);
            $$1.a($$2, cwl.ee.o().a(cxd.b, $$8), 11);
            cbo $$9 = new cbo(
               $$1, (double)$$2.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$2.v() + 0.1, (double)$$2.w() + 0.5 + (double)$$8.l() * 0.65, new cmr(cmu.rV, 4)
            );
            $$9.o(0.05 * (double)$$8.j() + $$1.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$1.z.j() * 0.02);
            $$1.b($$9);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$1.a($$3, dnk.M, $$2);
            $$3.b(arw.c.b(cmu.rS));
         }

         return bjv.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
