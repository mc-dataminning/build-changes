import com.mojang.serialization.MapCodec;

public class dee extends dch {
   public static final MapCodec<dee> a = b(dee::new);

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   public dee(dph.d $$0) {
      super($$0);
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if ($$3.a(5) == 0) {
         ij $$4 = ij.b($$3);
         if ($$4 != ij.b) {
            id $$5 = $$2.a($$4);
            dpi $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(kn.aC, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
