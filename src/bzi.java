import javax.annotation.Nullable;

public class bzi extends bzb {
   @Nullable
   private eji b;

   public bzi(byz $$0) {
      super($$0);
   }

   @Override
   public void b() {
      eji $$0 = this.a.D(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.e.dq();
      double $$2 = this.a.e.e(0.5);
      double $$3 = this.a.e.dw();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         ato $$5 = this.a.ef();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         eji $$9 = this.a.do();
         this.a.dL().a(js.i, $$6, $$7, $$8, -$$0.c * 0.08F + $$9.c, -$$0.d * 0.3F + $$9.d, -$$0.e * 0.08F + $$9.e);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = eji.c(this.a.dL().a(dmf.a.f, dpi.a(this.a.s())));
      }

      if (this.b.c(this.a.dq(), this.a.ds(), this.a.dw()) < 1.0) {
         this.a.gb().b(bzp.f).j();
         this.a.gb().a(bzp.g);
      }
   }

   @Override
   public float f() {
      return 1.5F;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.do().h() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Nullable
   @Override
   public eji g() {
      return this.b;
   }

   @Override
   public bzp<bzi> i() {
      return bzp.d;
   }
}
