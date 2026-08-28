import javax.annotation.Nullable;

public class cij extends cic {
   @Nullable
   private exa b;

   public cij(cia $$0) {
      super($$0);
   }

   @Override
   public void b() {
      exa $$0 = this.a.H(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.e.du();
      double $$2 = this.a.e.e(0.5);
      double $$3 = this.a.e.dA();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         ayw $$5 = this.a.dS();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         exa $$9 = this.a.ds();
         this.a.dP().a(lm.h, $$6, $$7, $$8, -$$0.c * 0.08F + $$9.c, -$$0.d * 0.3F + $$9.d, -$$0.e * 0.08F + $$9.e);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = exa.c(this.a.dP().a(dyy.a.f, ecc.a(this.a.s())));
      }

      if (this.b.c(this.a.du(), this.a.dw(), this.a.dA()) < 1.0) {
         this.a.gi().b(ciq.f).j();
         this.a.gi().a(ciq.g);
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
   public exa g() {
      return this.b;
   }

   @Override
   public ciq<cij> i() {
      return ciq.d;
   }
}
