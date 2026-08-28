import com.mojang.serialization.MapCodec;

public class dpn extends dno {
   public static final MapCodec<dpn> a = b(dpn::new);

   @Override
   public MapCodec<dpn> a() {
      return a;
   }

   public dpn(ebp.d $$0) {
      super($$0);
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$3.a(5) == 0) {
         jc $$4 = jc.b($$3);
         if ($$4 != jc.b) {
            iw $$5 = $$2.a($$4);
            ebq $$6 = $$1.a_($$5);
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
