import javax.annotation.Nullable;

public class bxh extends bxa {
   @Nullable
   private ehf b;

   public bxh(bwy $$0) {
      super($$0);
   }

   @Override
   public void b() {
      ehf $$0 = this.a.D(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.e.dp();
      double $$2 = this.a.e.e(0.5);
      double $$3 = this.a.e.dv();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         art $$5 = this.a.ee();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         ehf $$9 = this.a.dn();
         this.a.dK().a(iw.i, $$6, $$7, $$8, -$$0.c * 0.08F + $$9.c, -$$0.d * 0.3F + $$9.d, -$$0.e * 0.08F + $$9.e);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = ehf.c(this.a.dK().a(dkh.a.f, dnk.a(this.a.p())));
      }

      if (this.b.c(this.a.dp(), this.a.dr(), this.a.dv()) < 1.0) {
         this.a.fW().b(bxo.f).j();
         this.a.fW().a(bxo.g);
      }
   }

   @Override
   public float f() {
      return 1.5F;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.dn().h() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Nullable
   @Override
   public ehf g() {
      return this.b;
   }

   @Override
   public bxo<bxh> i() {
      return bxo.d;
   }
}
