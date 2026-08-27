import com.mojang.serialization.MapCodec;

public class dfx extends dea {
   public static final MapCodec<dfx> a = b(dfx::new);

   @Override
   public MapCodec<dfx> a() {
      return a;
   }

   public dfx(drc.d $$0) {
      super($$0);
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      if ($$3.a(5) == 0) {
         it $$4 = it.b($$3);
         if ($$4 != it.b) {
            io $$5 = $$2.a($$4);
            drd $$6 = $$1.a_($$5);
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
