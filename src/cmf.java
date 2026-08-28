import javax.annotation.Nullable;

public class cmf extends cly {
   @Nullable
   private fei b;

   public cmf(clw $$0) {
      super($$0);
   }

   @Override
   public void b() {
      fei $$0 = this.a.J(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.c.dA();
      double $$2 = this.a.c.e(0.5);
      double $$3 = this.a.c.dG();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         azv $$5 = this.a.dY();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         fei $$9 = this.a.dy();
         this.a.dV().a(lx.h, $$6, $$7, $$8, -$$0.d * 0.08F + $$9.d, -$$0.e * 0.3F + $$9.e, -$$0.f * 0.08F + $$9.f);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void a(arq $$0) {
      if (this.b == null) {
         this.b = fei.c($$0.a(efy.a.f, ejd.a(this.a.j())));
      }

      if (this.b.c(this.a.dA(), this.a.dC(), this.a.dG()) < 1.0) {
         this.a.t().b(cmm.f).i();
         this.a.t().a(cmm.g);
      }
   }

   @Override
   public float e() {
      return 1.5F;
   }

   @Override
   public float g() {
      float $$0 = (float)this.a.dy().i() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void c() {
      this.b = null;
   }

   @Nullable
   @Override
   public fei f() {
      return this.b;
   }

   @Override
   public cmm<cmf> h() {
      return cmm.d;
   }
}
