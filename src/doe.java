import com.mojang.serialization.MapCodec;

public class doe extends dmf {
   public static final MapCodec<doe> a = b(doe::new);

   @Override
   public MapCodec<doe> a() {
      return a;
   }

   public doe(eag.d $$0) {
      super($$0);
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      if ($$3.a(5) == 0) {
         ja $$4 = ja.b($$3);
         if ($$4 != ja.b) {
            iu $$5 = $$2.a($$4);
            eah $$6 = $$1.a_($$5);
            if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(lx.aH, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
