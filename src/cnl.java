import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cnl extends cod implements coh {
   private static final int a = 20;
   private static final int b = 40;
   private final cfa<cnl> c = new cfa<>(this, 1.0, 20, 15.0F);
   private final cek d = new cek(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         cnl.this.v(false);
      }

      @Override
      public void d() {
         super.d();
         cnl.this.v(true);
      }
   };

   protected cnl(bwo<? extends cnl> $$0, dja $$1) {
      super($$0, $$1);
      this.n();
   }

   @Override
   protected void D() {
      this.bD.a(2, new cfd(this));
      this.bD.a(3, new cdt(this, 1.0));
      this.bD.a(3, new cdh<>(this, cke.class, 6.0F, 1.0, 1.2));
      this.bD.a(5, new cfn(this, 1.0));
      this.bD.a(6, new cei(this, crc.class, 8.0F));
      this.bD.a(6, new cev(this));
      this.bE.a(1, new cfs(this));
      this.bE.a(2, new cft<>(this, crc.class, true));
      this.bE.a(3, new cft<>(this, cjk.class, true));
      this.bE.a(3, new cft<>(this, ckc.class, 10, true, false, ckc.bG));
   }

   public static byj.a j() {
      return cod.gu().a(byk.v, 0.25);
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(this.m(), 0.15F, 1.0F);
   }

   abstract awm m();

   @Override
   public void k_() {
      boolean $$0 = this.gl();
      if ($$0) {
         czd $$1 = this.a(bwp.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cyz $$2 = $$1.h();
               $$1.b($$1.o() + this.ae.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, bwp.f);
                  this.a(bwp.f, czd.k);
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
      if (this.dl() instanceof bxm $$0) {
         this.aV = $$0.aV;
      }
   }

   @Override
   protected void a(azv $$0, bub $$1) {
      super.a($$0, $$1);
      this.a(bwp.a, new czd(czh.pj));
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azv $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.n();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bwp.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bwp.f, new czd($$4.i() < 0.1F ? dmh.ew : dmh.ev));
            this.a(bwp.f, 0.0F);
         }
      }

      return $$3;
   }

   public void n() {
      if (this.dV() != null && !this.dV().C) {
         this.bD.a(this.d);
         this.bD.a(this.c);
         czd $$0 = this.b(crz.a(this, czh.pj));
         if ($$0.a(czh.pj)) {
            int $$1 = this.q();
            if (this.dV().an() != bua.d) {
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
   public void a(bxe $$0, float $$1) {
      czd $$2 = this.b(crz.a(this, czh.pj));
      czd $$3 = this.d($$2);
      crk $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof arq $$9) {
         crx.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awn.yd, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   protected crk a(czd $$0, float $$1, @Nullable czd $$2) {
      return crz.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(czy $$0) {
      return $$0 == czh.pj;
   }

   @Override
   public axr<cyz> Y() {
      return axk.bT;
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.n();
   }

   @Override
   public void a(bwp $$0, czd $$1, czd $$2) {
      super.a($$0, $$1, $$2);
      if (!this.dV().C) {
         this.n();
      }
   }

   public boolean x() {
      return this.cw();
   }
}
