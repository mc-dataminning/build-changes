import com.mojang.serialization.MapCodec;

public class dha extends dfc {
   public static final MapCodec<dha> a = b(dha::new);

   @Override
   public MapCodec<dha> a() {
      return a;
   }

   public dha(dtb.d $$0) {
      super($$0);
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      if ($$3.a(5) == 0) {
         iw $$4 = iw.b($$3);
         if ($$4 != iw.b) {
            ir $$5 = $$2.a($$4);
            dtc $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(lb.aD, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
