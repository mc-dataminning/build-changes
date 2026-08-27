import javax.annotation.Nullable;

public class car extends cak {
   @Nullable
   private elm b;

   public car(cai $$0) {
      super($$0);
   }

   @Override
   public void b() {
      elm $$0 = this.a.D(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.e.dr();
      double $$2 = this.a.e.e(0.5);
      double $$3 = this.a.e.dx();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         aup $$5 = this.a.eg();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         elm $$9 = this.a.dp();
         this.a.dM().a(jx.i, $$6, $$7, $$8, -$$0.c * 0.08F + $$9.c, -$$0.d * 0.3F + $$9.d, -$$0.e * 0.08F + $$9.e);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = elm.c(this.a.dM().a(doj.a.f, drm.a(this.a.u())));
      }

      if (this.b.c(this.a.dr(), this.a.dt(), this.a.dx()) < 1.0) {
         this.a.gb().b(cay.f).j();
         this.a.gb().a(cay.g);
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
   public elm g() {
      return this.b;
   }

   @Override
   public cay<car> i() {
      return cay.d;
   }
}
