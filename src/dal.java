import com.mojang.serialization.MapCodec;

public class dal extends cyo {
   public static final MapCodec<dal> a = b(dal::new);

   @Override
   public MapCodec<dal> a() {
      return a;
   }

   public dal(dle.d $$0) {
      super($$0);
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      if ($$3.a(5) == 0) {
         ie $$4 = ie.b($$3);
         if ($$4 != ie.b) {
            hz $$5 = $$2.a($$4);
            dlf $$6 = $$1.a_($$5);
            if (!$$0.p() || !$$6.d($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + (double)$$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + (double)$$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + (double)$$4.l() * 0.6;
               $$1.a(jz.aB, (double)$$2.u() + $$7, (double)$$2.v() + $$8, (double)$$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
