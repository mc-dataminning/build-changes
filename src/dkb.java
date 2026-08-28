import com.mojang.serialization.MapCodec;

public class dkb extends die {
   public static final MapCodec<dkb> a = b(dkb::new);

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   public dkb(dvi.d $$0) {
      super($$0);
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      if ($$3.a(5) == 0) {
         jm $$4 = jm.b($$3);
         if ($$4 != jm.b) {
            jh $$5 = $$2.a($$4);
            dvj $$6 = $$1.a_($$5);
            if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(lr.aE, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
