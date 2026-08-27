import javax.annotation.Nullable;

public class bxq extends bxj {
   @Nullable
   private ehn b;

   public bxq(bxh $$0) {
      super($$0);
   }

   @Override
   public void b() {
      ehn $$0 = this.a.D(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.e.dq();
      double $$2 = this.a.e.e(0.5);
      double $$3 = this.a.e.dw();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         asc $$5 = this.a.ef();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         ehn $$9 = this.a.do();
         this.a.dL().a(ix.i, $$6, $$7, $$8, -$$0.c * 0.08F + $$9.c, -$$0.d * 0.3F + $$9.d, -$$0.e * 0.08F + $$9.e);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = ehn.c(this.a.dL().a(dks.a.f, dnv.a(this.a.s())));
      }

      if (this.b.c(this.a.dq(), this.a.ds(), this.a.dw()) < 1.0) {
         this.a.ga().b(bxx.f).j();
         this.a.ga().a(bxx.g);
      }
   }

   @Override
   public float f() {
      return 1.5F;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.do().h() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Nullable
   @Override
   public ehn g() {
      return this.b;
   }

   @Override
   public bxx<bxq> i() {
      return bxx.d;
   }
}
