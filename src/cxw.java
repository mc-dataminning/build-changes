import com.mojang.serialization.MapCodec;

public class cxw extends cvz {
   public static final MapCodec<cxw> a = b(cxw::new);

   @Override
   public MapCodec<cxw> a() {
      return a;
   }

   public cxw(dio.d $$0) {
      super($$0);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if ($$3.a(5) == 0) {
         ia $$4 = ia.b($$3);
         if ($$4 != ia.b) {
            hv $$5 = $$2.a($$4);
            dip $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(jv.aB, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
