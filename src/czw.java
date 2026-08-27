import com.mojang.serialization.MapCodec;

public class czw extends cua {
   public static final MapCodec<czw> a = b(czw::new);

   @Override
   public MapCodec<czw> a() {
      return a;
   }

   protected czw(dga.d $$0) {
      super($$0);
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      ckj $$6 = $$3.b($$4);
      if ($$6.a(ckm.rg)) {
         if (!$$1.B) {
            hx $$7 = $$5.b();
            hx $$8 = $$7.o() == hx.a.b ? $$3.cD().g() : $$7;
            $$1.a(null, $$2, aqd.tl, aqe.e, 1.0F, 1.0F);
            $$1.a($$2, cuc.ee.o().a(cuu.b, $$8), 11);
            bzq $$9 = new bzq(
               $$1, (double)$$2.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$2.v() + 0.1, (double)$$2.w() + 0.5 + (double)$$8.l() * 0.65, new ckj(ckm.rj, 4)
            );
            $$9.o(0.05 * (double)$$8.j() + $$1.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$1.z.j() * 0.02);
            $$1.b($$9);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$1.a($$3, dkl.M, $$2);
            $$3.b(aqn.c.b(ckm.rg));
         }

         return bib.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
