import javax.annotation.Nullable;

public class cjs extends cjl {
   @Nullable
   private ezh b;

   public cjs(cjj $$0) {
      super($$0);
   }

   @Override
   public void b() {
      ezh $$0 = this.a.J(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.d.dC();
      double $$2 = this.a.d.e(0.5);
      double $$3 = this.a.d.dI();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         azr $$5 = this.a.ea();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         ezh $$9 = this.a.dA();
         this.a.dX().a(lq.h, $$6, $$7, $$8, -$$0.d * 0.08F + $$9.d, -$$0.e * 0.3F + $$9.e, -$$0.f * 0.08F + $$9.f);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = ezh.c(this.a.dX().a(eaz.a.f, eee.a(this.a.q())));
      }

      if (this.b.c(this.a.dC(), this.a.dE(), this.a.dI()) < 1.0) {
         this.a.gs().b(cjz.f).j();
         this.a.gs().a(cjz.g);
      }
   }

   @Override
   public float f() {
      return 1.5F;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.dA().i() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Nullable
   @Override
   public ezh g() {
      return this.b;
   }

   @Override
   public cjz<cjs> i() {
      return cjz.d;
   }
}
