import javax.annotation.Nullable;

public class cfy extends cfr {
   @Nullable
   private etf b;

   public cfy(cfp $$0) {
      super($$0);
   }

   @Override
   public void b() {
      etf $$0 = this.a.F(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.e.ds();
      double $$2 = this.a.e.e(0.5);
      double $$3 = this.a.e.dy();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         ayd $$5 = this.a.ej();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         etf $$9 = this.a.dq();
         this.a.dN().a(kw.h, $$6, $$7, $$8, -$$0.c * 0.08F + $$9.c, -$$0.d * 0.3F + $$9.d, -$$0.e * 0.08F + $$9.e);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = etf.c(this.a.dN().a(dvq.a.f, dyt.a(this.a.r())));
      }

      if (this.b.c(this.a.ds(), this.a.du(), this.a.dy()) < 1.0) {
         this.a.gm().b(cgf.f).j();
         this.a.gm().a(cgf.g);
      }
   }

   @Override
   public float f() {
      return 1.5F;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.dq().h() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Nullable
   @Override
   public etf g() {
      return this.b;
   }

   @Override
   public cgf<cfy> i() {
      return cgf.d;
   }
}
