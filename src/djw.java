import com.mojang.serialization.MapCodec;

public class djw extends ddy {
   public static final MapCodec<djw> a = b(djw::new);

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   protected djw(dra.d $$0) {
      super($$0);
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      if (!$$0.a(ctr.rV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bpw.a($$2.B);
      } else {
         it $$7 = $$6.b();
         it $$8 = $$7.o() == it.a.b ? $$4.cH().g() : $$7;
         $$2.a(null, $$3, avh.uT, avi.e, 1.0F, 1.0F);
         $$2.a($$3, dea.ee.n().a(des.b, $$8), 11);
         cig $$9 = new cig(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cto(ctr.rY, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bso.d($$5));
         $$2.a($$4, dvu.M, $$3);
         $$4.b(avr.c.b(ctr.rV));
         return bpw.a($$2.B);
      }
   }
}
