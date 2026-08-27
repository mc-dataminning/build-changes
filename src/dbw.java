import com.mojang.serialization.MapCodec;

public class dbw extends cvz {
   public static final MapCodec<dbw> a = b(dbw::new);

   @Override
   public MapCodec<dbw> a() {
      return a;
   }

   protected dbw(dio.d $$0) {
      super($$0);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      cmh $$6 = $$3.b($$4);
      if ($$6.a(cmk.rS)) {
         if (!$$1.B) {
            ia $$7 = $$5.b();
            ia $$8 = $$7.o() == ia.a.b ? $$3.cE().g() : $$7;
            $$1.a(null, $$2, arc.tZ, ard.e, 1.0F, 1.0F);
            $$1.a($$2, cwb.ee.o().a(cwt.b, $$8), 11);
            cbe $$9 = new cbe(
               $$1, (double)$$2.u() + 0.5 + (double)$$8.j() * 0.65, (double)$$2.v() + 0.1, (double)$$2.w() + 0.5 + (double)$$8.l() * 0.65, new cmh(cmk.rV, 4)
            );
            $$9.o(0.05 * (double)$$8.j() + $$1.z.j() * 0.02, 0.05, 0.05 * (double)$$8.l() + $$1.z.j() * 0.02);
            $$1.b($$9);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$1.a($$3, dmz.M, $$2);
            $$3.b(arm.c.b(cmk.rS));
         }

         return bjl.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
