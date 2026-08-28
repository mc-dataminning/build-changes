import com.mojang.serialization.MapCodec;

public class djg extends dhj {
   public static final MapCodec<djg> a = b(djg::new);

   @Override
   public MapCodec<djg> a() {
      return a;
   }

   public djg(dun.d $$0) {
      super($$0);
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$3.a(5) == 0) {
         jj $$4 = jj.b($$3);
         if ($$4 != jj.b) {
            je $$5 = $$2.a($$4);
            duo $$6 = $$1.a_($$5);
            if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(ln.aE, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
