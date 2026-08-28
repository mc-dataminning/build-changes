import javax.annotation.Nullable;

public class cjg extends ciz {
   @Nullable
   private eys b;

   public cjg(cix $$0) {
      super($$0);
   }

   @Override
   public void b() {
      eys $$0 = this.a.J(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.d.dx();
      double $$2 = this.a.d.e(0.5);
      double $$3 = this.a.d.dD();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         azl $$5 = this.a.dV();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         eys $$9 = this.a.dv();
         this.a.dS().a(ln.h, $$6, $$7, $$8, -$$0.d * 0.08F + $$9.d, -$$0.e * 0.3F + $$9.e, -$$0.f * 0.08F + $$9.f);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = eys.c(this.a.dS().a(eak.a.f, edp.a(this.a.q())));
      }

      if (this.b.c(this.a.dx(), this.a.dz(), this.a.dD()) < 1.0) {
         this.a.gm().b(cjn.f).j();
         this.a.gm().a(cjn.g);
      }
   }

   @Override
   public float f() {
      return 1.5F;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.dv().i() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Nullable
   @Override
   public eys g() {
      return this.b;
   }

   @Override
   public cjn<cjg> i() {
      return cjn.d;
   }
}
