import com.mojang.serialization.MapCodec;

public class cxc extends cvf {
   public static final MapCodec<cxc> a = b(cxc::new);

   @Override
   public MapCodec<cxc> a() {
      return a;
   }

   public cxc(dhm.d $$0) {
      super($$0);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$3.a(5) == 0) {
         ib $$4 = ib.b($$3);
         if ($$4 != ib.b) {
            hx $$5 = $$2.a($$4);
            dhn $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(jw.az, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
