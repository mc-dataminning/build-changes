import javax.annotation.Nullable;

public class cke extends cjx {
   @Nullable
   private ezy b;

   public cke(cjv $$0) {
      super($$0);
   }

   @Override
   public void b() {
      ezy $$0 = this.a.J(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.c.dA();
      double $$2 = this.a.c.e(0.5);
      double $$3 = this.a.c.dG();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         azu $$5 = this.a.dY();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         ezy $$9 = this.a.dy();
         this.a.dV().a(ls.h, $$6, $$7, $$8, -$$0.d * 0.08F + $$9.d, -$$0.e * 0.3F + $$9.e, -$$0.f * 0.08F + $$9.f);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void a(arp $$0) {
      if (this.b == null) {
         this.b = ezy.c($$0.a(ebq.a.f, eev.a(this.a.n())));
      }

      if (this.b.c(this.a.dA(), this.a.dC(), this.a.dG()) < 1.0) {
         this.a.gj().b(ckl.f).i();
         this.a.gj().a(ckl.g);
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
   public ezy f() {
      return this.b;
   }

   @Override
   public ckl<cke> h() {
      return ckl.d;
   }
}
