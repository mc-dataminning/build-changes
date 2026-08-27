import com.mojang.serialization.MapCodec;

public class cyg extends cwj {
   public static final MapCodec<cyg> a = b(cyg::new);

   @Override
   public MapCodec<cyg> a() {
      return a;
   }

   public cyg(diz.d $$0) {
      super($$0);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      if ($$3.a(5) == 0) {
         ic $$4 = ic.b($$3);
         if ($$4 != ic.b) {
            hx $$5 = $$2.a($$4);
            dja $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(jx.aB, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
