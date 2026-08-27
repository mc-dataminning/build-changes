import com.mojang.serialization.MapCodec;

public class dfz extends dac {
   public static final MapCodec<dfz> a = b(dfz::new);

   @Override
   public MapCodec<dfz> a() {
      return a;
   }

   protected dfz(dna.d $$0) {
      super($$0);
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      if (!$$0.a(cqp.rU)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bnf.a($$2.B);
      } else {
         ih $$7 = $$6.b();
         ih $$8 = $$7.o() == ih.a.b ? $$4.cE().g() : $$7;
         $$2.a(null, $$3, aty.ux, atz.e, 1.0F, 1.0F);
         $$2.a($$3, dae.ee.o().a(daw.b, $$8), 11);
         cfe $$9 = new cfe(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cqm(cqp.rX, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bpp.d($$5));
         $$2.a($$4, drp.M, $$3);
         $$4.b(aui.c.b(cqp.rU));
         return bnf.a($$2.B);
      }
   }
}
