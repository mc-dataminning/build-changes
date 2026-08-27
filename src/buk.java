import javax.annotation.Nullable;

public class buk extends bud {
   @Nullable
   private eei b;

   public buk(bub $$0) {
      super($$0);
   }

   @Override
   public void b() {
      eei $$0 = this.a.C(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.e.dn();
      double $$2 = this.a.e.e(0.5);
      double $$3 = this.a.e.dt();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         apf $$5 = this.a.ec();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         eei $$9 = this.a.dl();
         this.a.dI().a(iv.i, $$6, $$7, $$8, -$$0.c * 0.08F + $$9.c, -$$0.d * 0.3F + $$9.d, -$$0.e * 0.08F + $$9.e);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = eei.c(this.a.dI().a(dhk.a.f, dkn.a(this.a.q())));
      }

      if (this.b.c(this.a.dn(), this.a.dp(), this.a.dt()) < 1.0) {
         this.a.fW().b(bur.f).j();
         this.a.fW().a(bur.g);
      }
   }

   @Override
   public float f() {
      return 1.5F;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.dl().h() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Nullable
   @Override
   public eei g() {
      return this.b;
   }

   @Override
   public bur<buk> i() {
      return bur.d;
   }
}
