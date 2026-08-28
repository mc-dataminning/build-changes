import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cnv extends coo implements cos {
   private static final int a = 20;
   private static final int b = 40;
   private final cff<cnv> c = new cff<>(this, 1.0, 20, 15.0F);
   private final cep d = new cep(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         cnv.this.v(false);
      }

      @Override
      public void d() {
         super.d();
         cnv.this.v(true);
      }
   };

   protected cnv(bwr<? extends cnv> $$0, djm $$1) {
      super($$0, $$1);
      this.n();
   }

   @Override
   protected void D() {
      this.bD.a(2, new cfi(this));
      this.bD.a(3, new cdy(this, 1.0));
      this.bD.a(3, new cdm<>(this, cmb.class, 6.0F, 1.0, 1.2));
      this.bD.a(5, new cfs(this, 1.0));
      this.bD.a(6, new cen(this, crm.class, 8.0F));
      this.bD.a(6, new cfa(this));
      this.bE.a(1, new cfx(this));
      this.bE.a(2, new cfy<>(this, crm.class, true));
      this.bE.a(3, new cfy<>(this, cjp.class, true));
      this.bE.a(3, new cfy<>(this, ckg.class, 10, true, false, ckg.bG));
   }

   public static byo.a j() {
      return coo.gw().a(byp.v, 0.25);
   }

   @Override
   protected void b(iv $$0, eat $$1) {
      this.a(this.m(), 0.15F, 1.0F);
   }

   abstract awm m();

   @Override
   public void k_() {
      boolean $$0 = this.gn();
      if ($$0) {
         czn $$1 = this.a(bws.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               czj $$2 = $$1.h();
               $$1.b($$1.o() + this.ae.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, bws.f);
                  this.a(bws.f, czn.k);
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
      if (this.dk() instanceof bxr $$0) {
         this.aV = $$0.aV;
      }
   }

   @Override
   protected void a(azv $$0, bue $$1) {
      super.a($$0, $$1);
      this.a(bws.a, new czn(czr.pj));
   }

   @Nullable
   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azv $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.n();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bws.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bws.f, new czn($$4.i() < 0.1F ? dmt.ew : dmt.ev));
            this.a(bws.f, 0.0F);
         }
      }

      return $$3;
   }

   public void n() {
      if (this.dU() != null && !this.dU().C) {
         this.bD.a(this.d);
         this.bD.a(this.c);
         czn $$0 = this.b(csj.a(this, czr.pj));
         if ($$0.a(czr.pj)) {
            int $$1 = this.q();
            if (this.dU().an() != bud.d) {
               $$1 = this.t();
            }

            this.c.c($$1);
            this.bD.a(4, this.c);
         } else {
            this.bD.a(4, this.d);
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
   public void a(bxj $$0, float $$1) {
      czn $$2 = this.b(csj.a(this, czr.pj));
      czn $$3 = this.d($$2);
      cru $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dz() - this.dz();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dB();
      double $$7 = $$0.dF() - this.dF();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dU() instanceof arq $$9) {
         csh.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awn.yd, 1.0F, 1.0F / (this.dX().i() * 0.4F + 0.8F));
   }

   protected cru a(czn $$0, float $$1, @Nullable czn $$2) {
      return csj.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(dai $$0) {
      return $$0 == czr.pj;
   }

   @Override
   public axr<czj> Y() {
      return axk.bT;
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.n();
   }

   @Override
   public void a(bws $$0, czn $$1, czn $$2) {
      super.a($$0, $$1, $$2);
      if (!this.dU().C) {
         this.n();
      }
   }

   public boolean x() {
      return this.cv();
   }
}
