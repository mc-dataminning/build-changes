import javax.annotation.Nullable;

public class bxl extends bxe {
   @Nullable
   private ehi b;

   public bxl(bxc $$0) {
      super($$0);
   }

   @Override
   public void b() {
      ehi $$0 = this.a.D(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.e.dp();
      double $$2 = this.a.e.e(0.5);
      double $$3 = this.a.e.dv();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         arx $$5 = this.a.ee();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         ehi $$9 = this.a.dn();
         this.a.dK().a(ix.i, $$6, $$7, $$8, -$$0.c * 0.08F + $$9.c, -$$0.d * 0.3F + $$9.d, -$$0.e * 0.08F + $$9.e);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = ehi.c(this.a.dK().a(dkn.a.f, dnq.a(this.a.p())));
      }

      if (this.b.c(this.a.dp(), this.a.dr(), this.a.dv()) < 1.0) {
         this.a.fX().b(bxs.f).j();
         this.a.fX().a(bxs.g);
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
   public ehi g() {
      return this.b;
   }

   @Override
   public bxs<bxl> i() {
      return bxs.d;
   }
}
