import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cmr extends cnj implements cnn {
   private static final int a = 20;
   private static final int b = 40;
   private final cen<cmr> c = new cen<>(this, 1.0, 20, 15.0F);
   private final cdx d = new cdx(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         cmr.this.v(false);
      }

      @Override
      public void d() {
         super.d();
         cmr.this.v(true);
      }
   };

   protected cmr(bwb<? extends cmr> $$0, dhp $$1) {
      super($$0, $$1);
      this.n();
   }

   @Override
   protected void D() {
      this.bB.a(2, new ceq(this));
      this.bB.a(3, new cdg(this, 1.0));
      this.bB.a(3, new ccu<>(this, cjm.class, 6.0F, 1.0, 1.2));
      this.bB.a(5, new cfa(this, 1.0));
      this.bB.a(6, new cdv(this, cqi.class, 8.0F));
      this.bB.a(6, new cei(this));
      this.bC.a(1, new cff(this));
      this.bC.a(2, new cfg<>(this, cqi.class, true));
      this.bC.a(3, new cfg<>(this, cis.class, true));
      this.bC.a(3, new cfg<>(this, cjk.class, 10, true, false, cjk.bE));
   }

   public static bxw.a j() {
      return cnj.gt().a(bxx.v, 0.25);
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(this.m(), 0.15F, 1.0F);
   }

   abstract awj m();

   @Override
   public void k_() {
      boolean $$0 = this.gk();
      if ($$0) {
         cxy $$1 = this.a(bwc.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cxu $$2 = $$1.h();
               $$1.b($$1.o() + this.ae.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, bwc.f);
                  this.a(bwc.f, cxy.k);
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
      if (this.dl() instanceof bwz $$0) {
         this.aU = $$0.aU;
      }
   }

   @Override
   protected void a(azs $$0, bto $$1) {
      super.a($$0, $$1);
      this.a(bwc.a, new cxy(cyc.pe));
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azs $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.n();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bwc.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bwc.f, new cxy($$4.i() < 0.1F ? dkw.es : dkw.er));
            this.a(bwc.f, 0.0F);
         }
      }

      return $$3;
   }

   public void n() {
      if (this.dV() != null && !this.dV().C) {
         this.bB.a(this.d);
         this.bB.a(this.c);
         cxy $$0 = this.b(crd.a(this, cyc.pe));
         if ($$0.a(cyc.pe)) {
            int $$1 = this.q();
            if (this.dV().an() != btn.d) {
               $$1 = this.t();
            }

            this.c.c($$1);
            this.bB.a(4, this.c);
         } else {
            this.bB.a(4, this.d);
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
   public void a(bwr $$0, float $$1) {
      cxy $$2 = this.b(crd.a(this, cyc.pe));
      cxy $$3 = this.e($$2);
      cqp $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof arn $$9) {
         crb.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.an().a() * 4));
      }

      this.a(awk.xX, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   protected cqp a(cxy $$0, float $$1, @Nullable cxy $$2) {
      return crd.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cyt $$0) {
      return $$0 == cyc.pe;
   }

   @Override
   public axp<cxu> Y() {
      return axi.bS;
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.n();
   }

   @Override
   public void a(bwc $$0, cxy $$1) {
      super.a($$0, $$1);
      if (!this.dV().C) {
         this.n();
      }
   }

   public boolean x() {
      return this.cw();
   }
}
