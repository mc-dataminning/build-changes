import javax.annotation.Nullable;

public class ckd extends cjw {
   @Nullable
   private fba b;

   public ckd(cju $$0) {
      super($$0);
   }

   @Override
   public void b() {
      fba $$0 = this.a.J(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.c.dB();
      double $$2 = this.a.c.e(0.5);
      double $$3 = this.a.c.dH();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         azh $$5 = this.a.dZ();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         fba $$9 = this.a.dz();
         this.a.dW().a(lt.h, $$6, $$7, $$8, -$$0.d * 0.08F + $$9.d, -$$0.e * 0.3F + $$9.e, -$$0.f * 0.08F + $$9.f);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void a(arc $$0) {
      if (this.b == null) {
         this.b = fba.c($$0.a(ecs.a.f, efx.a(this.a.m())));
      }

      if (this.b.c(this.a.dB(), this.a.dD(), this.a.dH()) < 1.0) {
         this.a.gl().b(ckk.f).i();
         this.a.gl().a(ckk.g);
      }
   }

   @Override
   public float e() {
      return 1.5F;
   }

   @Override
   public float g() {
      float $$0 = (float)this.a.dz().i() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void c() {
      this.b = null;
   }

   @Nullable
   @Override
   public fba f() {
      return this.b;
   }

   @Override
   public ckk<ckd> h() {
      return ckk.d;
   }
}
