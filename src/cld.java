import javax.annotation.Nullable;

public class cld extends ckw {
   @Nullable
   private fby b;

   public cld(cku $$0) {
      super($$0);
   }

   @Override
   public void b() {
      fby $$0 = this.a.J(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.c.dB();
      double $$2 = this.a.c.e(0.5);
      double $$3 = this.a.c.dH();

      for (int $$4 = 0; $$4 < 8; $$4++) {
         bam $$5 = this.a.dZ();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         fby $$9 = this.a.dz();
         this.a.dW().a(ls.h, $$6, $$7, $$8, -$$0.d * 0.08F + $$9.d, -$$0.e * 0.3F + $$9.e, -$$0.f * 0.08F + $$9.f);
         $$0.b((float) (Math.PI / 16));
      }
   }

   @Override
   public void a(ash $$0) {
      if (this.b == null) {
         this.b = fby.c($$0.a(edq.a.f, egv.a(this.a.m())));
      }

      if (this.b.c(this.a.dB(), this.a.dD(), this.a.dH()) < 1.0) {
         this.a.gk().b(clk.f).i();
         this.a.gk().a(clk.g);
      }
   }

   @Override
   public float e() {
      return 1.5F;
   }

   @Override
   public float g() {
      float $$0 = (float)this.a.dz().i() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void c() {
      this.b = null;
   }

   @Nullable
   @Override
   public fby f() {
      return this.b;
   }

   @Override
   public clk<cld> h() {
      return clk.d;
   }
}
