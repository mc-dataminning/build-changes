import com.mojang.serialization.MapCodec;

public class dkx extends dez {
   public static final MapCodec<dkx> a = b(dkx::new);

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   protected dkx(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      if (!$$0.a(cus.rV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bqw.a($$2.B);
      } else {
         je $$7 = $$6.b();
         je $$8 = $$7.o() == je.a.b ? $$4.cH().g() : $$7;
         $$2.a(null, $$3, awa.uT, awb.e, 1.0F, 1.0F);
         $$2.a($$3, dfb.ee.o().a(dft.b, $$8), 11);
         cjh $$9 = new cjh(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cup(cus.rY, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, btp.d($$5));
         $$2.a($$4, dwv.M, $$3);
         $$4.b(awk.c.b(cus.rV));
         return bqw.a($$2.B);
      }
   }
}
