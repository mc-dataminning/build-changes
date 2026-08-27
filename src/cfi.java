import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cfi extends cga implements cge {
   private static final int b = 20;
   private static final int c = 40;
   private final bxm<cfi> d = new bxm<>(this, 1.0, 20, 15.0F);
   private final bww e = new bww(this, 1.2, false) {
      @Override
      public void d() {
         super.d();
         cfi.this.v(false);
      }

      @Override
      public void c() {
         super.c();
         cfi.this.v(true);
      }
   };

   protected cfi(bpd<? extends cfi> $$0, cxb $$1) {
      super($$0, $$1);
      this.y();
   }

   @Override
   protected void z() {
      this.bR.a(2, new bxp(this));
      this.bR.a(3, new bwf(this, 1.0));
      this.bR.a(3, new bvt<>(this, cch.class, 6.0F, 1.0, 1.2));
      this.bR.a(5, new bxz(this, 1.0));
      this.bR.a(6, new bwu(this, ciu.class, 8.0F));
      this.bR.a(6, new bxh(this));
      this.bS.a(1, new bye(this));
      this.bS.a(2, new byf<>(this, ciu.class, true));
      this.bS.a(3, new byf<>(this, cbq.class, true));
      this.bS.a(3, new byf<>(this, ccf.class, 10, true, false, ccf.bY));
   }

   public static bqv.a r() {
      return cga.gt().a(bqw.r, 0.25);
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(this.s(), 0.15F, 1.0F);
   }

   abstract atx s();

   @Override
   public void m_() {
      boolean $$0 = this.gh();
      if ($$0) {
         cqm $$1 = this.d(bpe.f);
         if (!$$1.b()) {
            if ($$1.i()) {
               $$1.b($$1.l() + this.ag.a(2));
               if ($$1.l() >= $$1.m()) {
                  this.e(bpe.f);
                  this.a(bpe.f, cqm.h);
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
   public void t() {
      super.t();
      if (this.da() instanceof bpx $$0) {
         this.aX = $$0.aX;
      }
   }

   @Override
   protected void a(axd $$0, bnb $$1) {
      super.a($$0, $$1);
      this.a(bpe.a, new cqm(cqp.ot));
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      axd $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      this.y();
      this.s($$4.i() < 0.55F * $$1.d());
      if (this.d(bpe.f).b()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bpe.f, new cqm($$4.i() < 0.1F ? dae.ef : dae.ee));
            this.bU[bpe.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void y() {
      if (this.dM() != null && !this.dM().B) {
         this.bR.a(this.e);
         this.bR.a(this.d);
         cqm $$0 = this.b(cjo.a(this, cqp.ot));
         if ($$0.a(cqp.ot)) {
            int $$1 = this.gn();
            if (this.dM().aj() != bna.d) {
               $$1 = this.go();
            }

            this.d.c($$1);
            this.bR.a(4, this.d);
         } else {
            this.bR.a(4, this.e);
         }
      }
   }

   protected int gn() {
      return 20;
   }

   protected int go() {
      return 40;
   }

   @Override
   public void a(bpp $$0, float $$1) {
      cqm $$2 = this.g(this.b(cjo.a(this, cqp.ot)));
      cja $$3 = this.b($$2, $$1);
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$0.e(0.3333333333333333) - $$3.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6);
      $$3.c($$4, $$5 + $$7 * 0.2F, $$6, 1.6F, (float)(14 - this.dM().aj().a() * 4));
      this.a(aty.wO, 1.0F, 1.0F / (this.ei().i() * 0.4F + 0.8F));
      this.dM().b($$3);
   }

   protected cja b(cqm $$0, float $$1) {
      return cjo.a(this, $$0, $$1);
   }

   @Override
   public boolean a(crc $$0) {
      return $$0 == cqp.ot;
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.y();
   }

   @Override
   public void a(bpe $$0, cqm $$1) {
      super.a($$0, $$1);
      if (!this.dM().B) {
         this.y();
      }
   }

   public boolean gp() {
      return this.cl();
   }
}
