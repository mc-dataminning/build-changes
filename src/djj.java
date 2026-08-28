import com.mojang.serialization.MapCodec;

public class djj extends dhm {
   public static final MapCodec<djj> a = b(djj::new);

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   public djj(dur.d $$0) {
      super($$0);
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$3.a(5) == 0) {
         jk $$4 = jk.b($$3);
         if ($$4 != jk.b) {
            jf $$5 = $$2.a($$4);
            dus $$6 = $$1.a_($$5);
            if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(lo.aE, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
