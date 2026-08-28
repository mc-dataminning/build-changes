import com.mojang.serialization.MapCodec;

public class dlf extends dfh {
   public static final MapCodec<dlf> a = b(dlf::new);

   @Override
   public MapCodec<dlf> a() {
      return a;
   }

   protected dlf(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      if (!$$0.a(cuf.rV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bqi.a($$2.B);
      } else {
         jf $$7 = $$6.b();
         jf $$8 = $$7.o() == jf.a.b ? $$4.cI().g() : $$7;
         $$2.a(null, $$3, avh.uW, avi.e, 1.0F, 1.0F);
         $$2.a($$3, dfj.ee.o().a(dgb.b, $$8), 11);
         ciu $$9 = new ciu(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cuc(cuf.rY, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, btb.d($$5));
         $$2.a($$4, dxg.M, $$3);
         $$4.b(avr.c.b(cuf.rV));
         return bqi.a($$2.B);
      }
   }
}
