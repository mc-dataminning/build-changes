import com.mojang.serialization.MapCodec;

public class dld extends dff {
   public static final MapCodec<dld> a = b(dld::new);

   @Override
   public MapCodec<dld> a() {
      return a;
   }

   protected dld(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      if (!$$0.a(cud.rV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.B) {
         return bqf.a($$2.B);
      } else {
         jf $$7 = $$6.b();
         jf $$8 = $$7.o() == jf.a.b ? $$4.cH().g() : $$7;
         $$2.a(null, $$3, avf.uW, avg.e, 1.0F, 1.0F);
         $$2.a($$3, dfh.ee.o().a(dfz.b, $$8), 11);
         cir $$9 = new cir(
            $$2, (double)$$3.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$3.v() + 0.1, (double)$$3.w() + 0.5 + (double)$$8.l() * 0.65, new cua(cud.rY, 4)
         );
         $$9.o(0.05 * (double)$$8.j() + $$2.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$2.z.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, bsy.d($$5));
         $$2.a($$4, dxa.M, $$3);
         $$4.b(avp.c.b(cud.rV));
         return bqf.a($$2.B);
      }
   }
}
