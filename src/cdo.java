import javax.annotation.Nullable;

public class cdo extends cdh {
   @Nullable
   private eov b;

   public cdo(cdf $$0) {
      super($$0);
   }

   @Override
   public void b() {
      eov $$0 = this.a.D(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.e.do();
      double $$2 = this.a.e.e(0.5);
      double $$3 = this.a.e.du();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         awt $$5 = this.a.ef();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         eov $$9 = this.a.dm();
         this.a.dJ().a(kb.i, $$6, $$7, $$8, -$$0.c * 0.08F + $$9.c, -$$0.d * 0.3F + $$9.d, -$$0.e * 0.08F + $$9.e);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = eov.c(this.a.dJ().a(drq.a.f, dut.a(this.a.u())));
      }

      if (this.b.c(this.a.do(), this.a.dq(), this.a.du()) < 1.0) {
         this.a.gi().b(cdv.f).j();
         this.a.gi().a(cdv.g);
      }
   }

   @Override
   public float f() {
      return 1.5F;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.dm().h() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Nullable
   @Override
   public eov g() {
      return this.b;
   }

   @Override
   public cdv<cdo> i() {
      return cdv.d;
   }
}
