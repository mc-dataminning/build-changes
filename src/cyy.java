import com.mojang.serialization.MapCodec;

public class cyy extends ctc {
   public static final MapCodec<cyy> a = b(cyy::new);

   @Override
   public MapCodec<cyy> a() {
      return a;
   }

   protected cyy(dfc.d $$0) {
      super($$0);
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      cjl $$6 = $$3.b($$4);
      if ($$6.a(cjo.rg)) {
         if (!$$1.B) {
            ha $$7 = $$5.b();
            ha $$8 = $$7.o() == ha.a.b ? $$3.cD().g() : $$7;
            $$1.a(null, $$2, apg.tj, aph.e, 1.0F, 1.0F);
            $$1.a($$2, cte.ee.o().a(ctw.b, $$8), 11);
            byt $$9 = new byt(
               $$1, (double)$$2.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$2.v() + 0.1, (double)$$2.w() + 0.5 + (double)$$8.l() * 0.65, new cjl(cjo.rj, 4)
            );
            $$9.o(0.05 * (double)$$8.j() + $$1.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$1.z.j() * 0.02);
            $$1.b($$9);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$1.a($$3, djn.M, $$2);
            $$3.b(apq.c.b(cjo.rg));
         }

         return bhe.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
