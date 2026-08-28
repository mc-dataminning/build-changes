import com.mojang.serialization.MapCodec;

public class dmc extends dke {
   public static final MapCodec<dmc> a = b(dmc::new);

   @Override
   public MapCodec<dmc> a() {
      return a;
   }

   public dmc(dxp.d $$0) {
      super($$0);
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if ($$3.a(5) == 0) {
         jn $$4 = jn.b($$3);
         if ($$4 != jn.b) {
            ji $$5 = $$2.a($$4);
            dxq $$6 = $$1.a_($$5);
            if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(lt.aH, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
