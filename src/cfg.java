import javax.annotation.Nullable;

public class cfg extends cez {
   @Nullable
   private esa b;

   public cfg(cex $$0) {
      super($$0);
   }

   @Override
   public void b() {
      esa $$0 = this.a.F(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.e.dr();
      double $$2 = this.a.e.e(0.5);
      double $$3 = this.a.e.dx();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         axr $$5 = this.a.ei();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         esa $$9 = this.a.dp();
         this.a.dM().a(kl.i, $$6, $$7, $$8, -$$0.c * 0.08F + $$9.c, -$$0.d * 0.3F + $$9.d, -$$0.e * 0.08F + $$9.e);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = esa.c(this.a.dM().a(dur.a.f, dxu.a(this.a.r())));
      }

      if (this.b.c(this.a.dr(), this.a.dt(), this.a.dx()) < 1.0) {
         this.a.gk().b(cfn.f).j();
         this.a.gk().a(cfn.g);
      }
   }

   @Override
   public float f() {
      return 1.5F;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.dp().h() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Nullable
   @Override
   public esa g() {
      return this.b;
   }

   @Override
   public cfn<cfg> i() {
      return cfn.d;
   }
}
