import com.mojang.serialization.MapCodec;

public class cvm extends cwj implements cwm {
   public static final MapCodec<cvm> a = b(cvm::new);
   protected static final float b = 4.0F;
   protected static final emf c = cwj.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<cvm> a() {
      return a;
   }

   public cvm(diz.d $$0) {
      super($$0);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      elm $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return $$1.a_($$2.d()).a(asb.at);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         return cwl.a.o();
      } else {
         if ($$1 == ic.b && $$2.a(cwl.mZ)) {
            $$3.a($$4, cwl.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return new cmr(cmu.dQ);
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(dja $$0, cfb $$1, cso $$2, hx $$3) {
      return $$1.eT().d() instanceof coc ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cti $$0, hx $$1) {
      $$0.a($$1.c(), cwl.mZ.o().a(cvn.i, djm.b), 3);
   }
}
