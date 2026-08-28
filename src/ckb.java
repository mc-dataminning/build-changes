import javax.annotation.Nullable;

public class ckb extends cju {
   @Nullable
   private ezr b;

   public ckb(cjs $$0) {
      super($$0);
   }

   @Override
   public void b() {
      ezr $$0 = this.a.J(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.d.dD();
      double $$2 = this.a.d.e(0.5);
      double $$3 = this.a.d.dJ();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         azv $$5 = this.a.eb();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         ezr $$9 = this.a.dB();
         this.a.dY().a(ls.h, $$6, $$7, $$8, -$$0.d * 0.08F + $$9.d, -$$0.e * 0.3F + $$9.e, -$$0.f * 0.08F + $$9.f);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = ezr.c(this.a.dY().a(ebj.a.f, eeo.a(this.a.q())));
      }

      if (this.b.c(this.a.dD(), this.a.dF(), this.a.dJ()) < 1.0) {
         this.a.gs().b(cki.f).j();
         this.a.gs().a(cki.g);
      }
   }

   @Override
   public float f() {
      return 1.5F;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.dB().i() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Nullable
   @Override
   public ezr g() {
      return this.b;
   }

   @Override
   public cki<ckb> i() {
      return cki.d;
   }
}
