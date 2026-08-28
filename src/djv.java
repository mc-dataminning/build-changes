import com.mojang.serialization.MapCodec;

public class djv extends dhy {
   public static final MapCodec<djv> a = b(djv::new);

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   public djv(dvc.d $$0) {
      super($$0);
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$3.a(5) == 0) {
         jl $$4 = jl.b($$3);
         if ($$4 != jl.b) {
            jg $$5 = $$2.a($$4);
            dvd $$6 = $$1.a_($$5);
            if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(lq.aE, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
