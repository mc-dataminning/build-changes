import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cog extends coz implements cpd {
   private static final int a = 20;
   private static final int b = 40;
   private final cfq<cog> c = new cfq<>(this, 1.0, 20, 15.0F);
   private final cfa d = new cfa(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         cog.this.v(false);
      }

      @Override
      public void d() {
         super.d();
         cog.this.v(true);
      }
   };

   protected cog(bxc<? extends cog> $$0, djx $$1) {
      super($$0, $$1);
      this.n();
   }

   @Override
   protected void D() {
      this.bF.a(2, new cft(this));
      this.bF.a(3, new cej(this, 1.0));
      this.bF.a(3, new cdx<>(this, cmm.class, 6.0F, 1.0, 1.2));
      this.bF.a(5, new cgd(this, 1.0));
      this.bF.a(6, new cey(this, crx.class, 8.0F));
      this.bF.a(6, new cfl(this));
      this.bG.a(1, new cgi(this));
      this.bG.a(2, new cgj<>(this, crx.class, true));
      this.bG.a(3, new cgj<>(this, cka.class, true));
      this.bG.a(3, new cgj<>(this, ckr.class, 10, true, false, ckr.bI));
   }

   public static byz.a j() {
      return coz.gx().a(bza.v, 0.25);
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(this.m(), 0.15F, 1.0F);
   }

   abstract awo m();

   @Override
   public void k_() {
      boolean $$0 = this.go();
      if ($$0) {
         czy $$1 = this.a(bxd.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               czu $$2 = $$1.h();
               $$1.b($$1.o() + this.ae.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, bxd.f);
                  this.a(bxd.f, czy.k);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.e(8.0F);
         }
      }

      super.k_();
   }

   @Override
   public void r() {
      super.r();
      if (this.dl() instanceof byc $$0) {
         this.aV = $$0.aV;
      }
   }

   @Override
   protected void a(azx $$0, bup $$1) {
      super.a($$0, $$1);
      this.a(bxd.a, new czy(dac.pj));
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azx $$4 = $$0.G_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.n();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bxd.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bxd.f, new czy($$4.i() < 0.1F ? dne.ew : dne.ev));
            this.a(bxd.f, 0.0F);
         }
      }

      return $$3;
   }

   public void n() {
      if (this.dV() != null && !this.dV().C) {
         this.bF.a(this.d);
         this.bF.a(this.c);
         czy $$0 = this.b(csu.a(this, dac.pj));
         if ($$0.a(dac.pj)) {
            int $$1 = this.q();
            if (this.dV().an() != buo.d) {
               $$1 = this.t();
            }

            this.c.c($$1);
            this.bF.a(4, this.c);
         } else {
            this.bF.a(4, this.d);
         }
      }
   }

   protected int q() {
      return 20;
   }

   protected int t() {
      return 40;
   }

   @Override
   public void a(bxu $$0, float $$1) {
      czy $$2 = this.b(csu.a(this, dac.pj));
      czy $$3 = this.d($$2);
      csf $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof ars $$9) {
         css.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awp.yd, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   protected csf a(czy $$0, float $$1, @Nullable czy $$2) {
      return csu.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(dat $$0) {
      return $$0 == dac.pj;
   }

   @Override
   public axt<czu> Y() {
      return axm.bT;
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.n();
   }

   @Override
   public void a(bxd $$0, czy $$1, czy $$2) {
      super.a($$0, $$1, $$2);
      if (!this.dV().C) {
         this.n();
      }
   }

   public boolean x() {
      return this.cw();
   }
}
