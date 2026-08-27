import javax.annotation.Nullable;

public class ccv extends cco {
   @Nullable
   private ens b;

   public ccv(ccm $$0) {
      super($$0);
   }

   @Override
   public void b() {
      ens $$0 = this.a.D(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.e.dr();
      double $$2 = this.a.e.e(0.5);
      double $$3 = this.a.e.dx();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         awo $$5 = this.a.eh();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         ens $$9 = this.a.dp();
         this.a.dM().a(jz.i, $$6, $$7, $$8, -$$0.c * 0.08F + $$9.c, -$$0.d * 0.3F + $$9.d, -$$0.e * 0.08F + $$9.e);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = ens.c(this.a.dM().a(dqo.a.f, dtr.a(this.a.u())));
      }

      if (this.b.c(this.a.dr(), this.a.dt(), this.a.dx()) < 1.0) {
         this.a.gd().b(cdc.f).j();
         this.a.gd().a(cdc.g);
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
   public ens g() {
      return this.b;
   }

   @Override
   public cdc<ccv> i() {
      return cdc.d;
   }
}
