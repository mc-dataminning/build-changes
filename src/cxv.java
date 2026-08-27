import com.mojang.serialization.MapCodec;

public class cxv extends cys implements cyv {
   public static final MapCodec<cxv> a = b(cxv::new);
   protected static final float b = 4.0F;
   protected static final eos c = cys.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<cxv> a() {
      return a;
   }

   public cxv(dli.d $$0) {
      super($$0);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      enz $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return $$1.a_($$2.d()).a(aua.at);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if (!$$0.a($$3, $$4)) {
         return cyu.a.o();
      } else {
         if ($$1 == ie.b && $$2.a(cyu.mZ)) {
            $$3.a($$4, cyu.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return new cpd(cpg.dQ);
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dlj $$0, chl $$1, cux $$2, hz $$3) {
      return $$1.eT().d() instanceof cqo ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(cvr $$0, hz $$1) {
      $$0.a($$1.c(), cyu.mZ.o().a(cxw.i, dlv.b), 3);
   }
}
