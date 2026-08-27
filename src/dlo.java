import com.mojang.serialization.MapCodec;

public class dlo extends dfc {
   public static final MapCodec<dlo> a = b(dlo::new);

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   protected dlo(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      if (!$$0.a(cuk.ts)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bqc.a($$2.C);
      } else {
         iw $$7 = $$6.b();
         iw $$8 = $$7.o() == iw.a.b ? $$4.cM().g() : $$7;
         $$2.a(null, $$3, avo.vr, avq.e, 1.0F, 1.0F);
         $$2.a($$3, dfe.eU.n().a(dfw.b, $$8), 11);
         cig $$9 = new cig(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cuh(cuk.tv, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bso.d($$5));
         $$2.a($$4, dxv.M, $$3);
         $$4.b(avz.c.b(cuk.ts));
         return bqc.a($$2.C);
      }
   }
}
