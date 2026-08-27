import com.mojang.serialization.MapCodec;

public class cvv extends cua {
   public static final MapCodec<cvv> a = b(cvv::new);

   @Override
   public MapCodec<cvv> a() {
      return a;
   }

   public cvv(dga.d $$0) {
      super($$0);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      if ($$3.a(5) == 0) {
         hx $$4 = hx.b($$3);
         if ($$4 != hx.b) {
            ht $$5 = $$2.a($$4);
            dgb $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(js.ay, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
