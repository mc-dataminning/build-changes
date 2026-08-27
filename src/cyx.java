import com.mojang.serialization.MapCodec;

public class cyx extends cvv {
   public static final MapCodec<cyx> a = b(cyx::new);
   protected static final emf b = cwj.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<cyx> a() {
      return a;
   }

   protected cyx(diz.d $$0) {
      super($$0);
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new die($$0, $$1);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b;
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      if ($$1 instanceof amz && $$3.ct() && emc.c(emc.a($$3.cH().d((double)(-$$2.u()), (double)(-$$2.v()), (double)(-$$2.w()))), $$0.j($$1, $$2), elq.i)) {
         ahc<cti> $$4 = $$1.ae() == cti.j ? cti.h : cti.j;
         amz $$5 = ((amz)$$1).o().a($$4);
         if ($$5 == null) {
            return;
         }

         $$3.b($$5);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(jx.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return cmr.f;
   }

   @Override
   public boolean a(dja $$0, eej $$1) {
      return false;
   }
}
