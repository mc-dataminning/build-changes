import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cnh extends cnz implements cod {
   private static final int a = 20;
   private static final int b = 40;
   private final cey<cnh> c = new cey<>(this, 1.0, 20, 15.0F);
   private final cei d = new cei(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         cnh.this.v(false);
      }

      @Override
      public void d() {
         super.d();
         cnh.this.v(true);
      }
   };

   protected cnh(bwm<? extends cnh> $$0, div $$1) {
      super($$0, $$1);
      this.n();
   }

   @Override
   protected void D() {
      this.bC.a(2, new cfb(this));
      this.bC.a(3, new cdr(this, 1.0));
      this.bC.a(3, new cdf<>(this, cka.class, 6.0F, 1.0, 1.2));
      this.bC.a(5, new cfl(this, 1.0));
      this.bC.a(6, new ceg(this, cqy.class, 8.0F));
      this.bC.a(6, new cet(this));
      this.bD.a(1, new cfq(this));
      this.bD.a(2, new cfr<>(this, cqy.class, true));
      this.bD.a(3, new cfr<>(this, cjg.class, true));
      this.bD.a(3, new cfr<>(this, cjy.class, 10, true, false, cjy.bF));
   }

   public static byh.a j() {
      return cnz.gt().a(byi.v, 0.25);
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(this.m(), 0.15F, 1.0F);
   }

   abstract awm m();

   @Override
   public void k_() {
      boolean $$0 = this.gk();
      if ($$0) {
         cyy $$1 = this.a(bwn.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cyu $$2 = $$1.h();
               $$1.b($$1.o() + this.ae.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, bwn.f);
                  this.a(bwn.f, cyy.k);
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
      if (this.dl() instanceof bxk $$0) {
         this.aV = $$0.aV;
      }
   }

   @Override
   protected void a(azv $$0, btz $$1) {
      super.a($$0, $$1);
      this.a(bwn.a, new cyy(czc.pg));
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azv $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.n();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bwn.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bwn.f, new cyy($$4.i() < 0.1F ? dmc.et : dmc.es));
            this.a(bwn.f, 0.0F);
         }
      }

      return $$3;
   }

   public void n() {
      if (this.dV() != null && !this.dV().C) {
         this.bC.a(this.d);
         this.bC.a(this.c);
         cyy $$0 = this.b(cru.a(this, czc.pg));
         if ($$0.a(czc.pg)) {
            int $$1 = this.q();
            if (this.dV().an() != bty.d) {
               $$1 = this.t();
            }

            this.c.c($$1);
            this.bC.a(4, this.c);
         } else {
            this.bC.a(4, this.d);
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
   public void a(bxc $$0, float $$1) {
      cyy $$2 = this.b(cru.a(this, czc.pg));
      cyy $$3 = this.e($$2);
      crf $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof arq $$9) {
         crs.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awn.ya, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   protected crf a(cyy $$0, float $$1, @Nullable cyy $$2) {
      return cru.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(czt $$0) {
      return $$0 == czc.pg;
   }

   @Override
   public axr<cyu> Y() {
      return axk.bS;
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.n();
   }

   @Override
   public void a(bwn $$0, cyy $$1) {
      super.a($$0, $$1);
      if (!this.dV().C) {
         this.n();
      }
   }

   public boolean x() {
      return this.cw();
   }
}
