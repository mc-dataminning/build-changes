import com.mojang.serialization.MapCodec;

public class dax extends cva {
   public static final MapCodec<dax> a = b(dax::new);

   @Override
   public MapCodec<dax> a() {
      return a;
   }

   protected dax(dhh.d $$0) {
      super($$0);
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      clj $$6 = $$3.b($$4);
      if ($$6.a(clm.rS)) {
         if (!$$1.B) {
            hx $$7 = $$5.b();
            hx $$8 = $$7.o() == hx.a.b ? $$3.cE().g() : $$7;
            $$1.a(null, $$2, aqr.tE, aqs.e, 1.0F, 1.0F);
            $$1.a($$2, cvc.ee.o().a(cvu.b, $$8), 11);
            can $$9 = new can(
               $$1, (double)$$2.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$2.v() + 0.1, (double)$$2.w() + 0.5 + (double)$$8.l() * 0.65, new clj(clm.rV, 4)
            );
            $$9.o(0.05 * (double)$$8.j() + $$1.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$1.z.j() * 0.02);
            $$1.b($$9);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$1.a($$3, dls.M, $$2);
            $$3.b(arb.c.b(clm.rS));
         }

         return bix.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
