import com.mojang.serialization.MapCodec;

public class dpd extends dne {
   public static final MapCodec<dpd> a = b(dpd::new);

   @Override
   public MapCodec<dpd> a() {
      return a;
   }

   public dpd(ebf.d $$0) {
      super($$0);
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$3.a(5) == 0) {
         jc $$4 = jc.b($$3);
         if ($$4 != jc.b) {
            iw $$5 = $$2.a($$4);
            ebg $$6 = $$1.a_($$5);
            if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(lz.aH, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
