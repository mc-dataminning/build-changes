import javax.annotation.Nullable;

public class chx extends chq {
   @Nullable
   private ewh b;

   public chx(cho $$0) {
      super($$0);
   }

   @Override
   public void b() {
      ewh $$0 = this.a.G(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.e.dw();
      double $$2 = this.a.e.e(0.5);
      double $$3 = this.a.e.dC();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         ayo $$5 = this.a.dU();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         ewh $$9 = this.a.du();
         this.a.dR().a(lj.h, $$6, $$7, $$8, -$$0.c * 0.08F + $$9.c, -$$0.d * 0.3F + $$9.d, -$$0.e * 0.08F + $$9.e);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = ewh.c(this.a.dR().a(dyg.a.f, ebk.a(this.a.s())));
      }

      if (this.b.c(this.a.dw(), this.a.dy(), this.a.dC()) < 1.0) {
         this.a.gk().b(cie.f).j();
         this.a.gk().a(cie.g);
      }
   }

   @Override
   public float f() {
      return 1.5F;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.du().h() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Nullable
   @Override
   public ewh g() {
      return this.b;
   }

   @Override
   public cie<chx> i() {
      return cie.d;
   }
}
