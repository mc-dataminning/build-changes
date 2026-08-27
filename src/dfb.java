import com.mojang.serialization.MapCodec;

public class dfb extends dde {
   public static final MapCodec<dfb> a = b(dfb::new);

   @Override
   public MapCodec<dfb> a() {
      return a;
   }

   public dfb(dqg.d $$0) {
      super($$0);
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if ($$3.a(5) == 0) {
         is $$4 = is.b($$3);
         if ($$4 != is.b) {
            in $$5 = $$2.a($$4);
            dqh $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(kx.aB, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
