import com.mojang.serialization.MapCodec;

public class cux extends ctc {
   public static final MapCodec<cux> a = b(cux::new);

   @Override
   public MapCodec<cux> a() {
      return a;
   }

   public cux(dfc.d $$0) {
      super($$0);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      if ($$3.a(5) == 0) {
         ha $$4 = ha.b($$3);
         if ($$4 != ha.b) {
            gw $$5 = $$2.a($$4);
            dfd $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(iv.ay, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
