import javax.annotation.Nullable;

public class cil extends cie {
   @Nullable
   private evs b;

   public cil(cic $$0) {
      super($$0);
   }

   @Override
   public void b() {
      evs $$0 = this.a.F(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.e.du();
      double $$2 = this.a.e.e(0.5);
      double $$3 = this.a.e.dA();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         azh $$5 = this.a.el();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         evs $$9 = this.a.ds();
         this.a.dP().a(li.h, $$6, $$7, $$8, -$$0.c * 0.08F + $$9.c, -$$0.d * 0.3F + $$9.d, -$$0.e * 0.08F + $$9.e);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = evs.c(this.a.dP().a(dxv.a.f, eay.a(this.a.s())));
      }

      if (this.b.c(this.a.du(), this.a.dw(), this.a.dA()) < 1.0) {
         this.a.gn().b(cis.f).j();
         this.a.gn().a(cis.g);
      }
   }

   @Override
   public float f() {
      return 1.5F;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.ds().h() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Nullable
   @Override
   public evs g() {
      return this.b;
   }

   @Override
   public cis<cil> i() {
      return cis.d;
   }
}
