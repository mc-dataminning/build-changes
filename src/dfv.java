import com.mojang.serialization.MapCodec;

public class dfv extends ddy {
   public static final MapCodec<dfv> a = b(dfv::new);

   @Override
   public MapCodec<dfv> a() {
      return a;
   }

   public dfv(dra.d $$0) {
      super($$0);
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      if ($$3.a(5) == 0) {
         it $$4 = it.b($$3);
         if ($$4 != it.b) {
            io $$5 = $$2.a($$4);
            drb $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(ky.aE, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
