import com.mojang.serialization.MapCodec;

public class dem extends dbk {
   public static final MapCodec<dem> a = b(dem::new);
   protected static final est b = dby.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dem> a() {
      return a;
   }

   protected dem(doy.d $$0) {
      super($$0);
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dnw($$0, $$1);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return b;
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      if ($$1 instanceof aps && $$3.ct() && esq.c(esq.a($$3.cH().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), ese.i)) {
         ajs<cyx> $$4 = $$1.ae() == cyx.j ? cyx.h : cyx.j;
         aps $$5 = ((aps)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(kl.ac, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return crj.i;
   }

   @Override
   protected boolean a(doz $$0, ekr $$1) {
      return false;
   }
}
