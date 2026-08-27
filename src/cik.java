import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cik extends cjd implements cji {
   private static final int b = 20;
   private static final int c = 40;
   private final cal<cik> d = new cal<>(this, 1.0, 20, 15.0F);
   private final bzv e = new bzv(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cik.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cik.this.v(true);
      }
   };

   protected cik(bsb<? extends cik> $$0, dca $$1) {
      super($$0, $$1);
      this.x();
   }

   @Override
   protected void y() {
      this.cb.a(2, new cao(this));
      this.cb.a(3, new bze(this, 1.0));
      this.cb.a(3, new bys<>(this, cfh.class, 6.0F, 1.0, 1.2));
      this.cb.a(5, new cay(this, 1.0));
      this.cb.a(6, new bzt(this, cly.class, 8.0F));
      this.cb.a(6, new cag(this));
      this.cc.a(1, new cbd(this));
      this.cc.a(2, new cbe<>(this, cly.class, true));
      this.cc.a(3, new cbe<>(this, ceq.class, true));
      this.cc.a(3, new cbe<>(this, cff.class, 10, true, false, cff.ch));
   }

   public static btu.a r() {
      return cjd.gG().a(btv.r, 0.25);
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   abstract avn t();

   @Override
   public void m_() {
      boolean $$0 = this.gs();
      if ($$0) {
         cuh $$1 = this.d(bsc.f);
         if (!$$1.d()) {
            if ($$1.k()) {
               $$1.b($$1.m() + this.al.a(2));
               if ($$1.m() >= $$1.n()) {
                  this.e(bsc.f);
                  this.a(bsc.f, cuh.i);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.g(8);
         }
      }

      super.m_();
   }

   @Override
   public void v() {
      super.v();
      if (this.di() instanceof bsw $$0) {
         this.bj = $$0.bj;
      }
   }

   @Override
   protected void a(ayt $$0, bpy $$1) {
      super.a($$0, $$1);
      this.a(bsc.a, new cuh(cuk.pK));
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayt $$4 = $$0.F_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.x();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.d(bsc.f).d()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bsc.f, new cuh($$4.i() < 0.1F ? dfe.eX : dfe.eU));
            this.ce[bsc.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void x() {
      if (this.dU() != null && !this.dU().C) {
         this.cb.a(this.e);
         this.cb.a(this.d);
         cuh $$0 = this.b(cmu.a(this, cuk.pK));
         if ($$0.a(cuk.pK)) {
            int $$1 = this.gy();
            if (this.dU().al() != bpx.d) {
               $$1 = this.gz();
            }

            this.d.c($$1);
            this.cb.a(4, this.d);
         } else {
            this.cb.a(4, this.e);
         }
      }
   }

   protected int gy() {
      return 20;
   }

   protected int gz() {
      return 40;
   }

   @Override
   public void a(bso $$0, float $$1) {
      cuh $$2 = this.g(this.b(cmu.a(this, cuk.pK)));
      cme $$3 = this.b($$2, $$1);
      double $$4 = $$0.dz() - this.dz();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dB();
      double $$6 = $$0.dF() - this.dF();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dU().al().a() * 4));
      this.a(avo.xI, 1.0F, 1.0F / (this.et().i() * 0.4F + 0.8F));
      this.dU().b($$3);
   }

   protected cme b(cuh $$0, float $$1) {
      return cmu.a(this, $$0, $$1);
   }

   @Override
   public boolean a(cvi $$0) {
      return $$0 == cuk.pK;
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.x();
   }

   @Override
   public void a(bsc $$0, cuh $$1) {
      super.a($$0, $$1);
      if (!this.dU().C) {
         this.x();
      }
   }

   public boolean gA() {
      return this.ct();
   }
}
