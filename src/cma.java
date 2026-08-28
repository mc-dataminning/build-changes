import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cma extends cms implements cmw {
   private static final int a = 20;
   private static final int b = 40;
   private final cdz<cma> c = new cdz<>(this, 1.0, 20, 15.0F);
   private final cdj d = new cdj(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         cma.this.w(false);
      }

      @Override
      public void d() {
         super.d();
         cma.this.w(true);
      }
   };

   protected cma(bvm<? extends cma> $$0, dha $$1) {
      super($$0, $$1);
      this.t();
   }

   @Override
   protected void B() {
      this.bT.a(2, new cec(this));
      this.bT.a(3, new ccs(this, 1.0));
      this.bT.a(3, new ccg<>(this, civ.class, 6.0F, 1.0, 1.2));
      this.bT.a(5, new cem(this, 1.0));
      this.bT.a(6, new cdh(this, cps.class, 8.0F));
      this.bT.a(6, new cdu(this));
      this.bU.a(1, new cer(this));
      this.bU.a(2, new ces<>(this, cps.class, true));
      this.bU.a(3, new ces<>(this, cie.class, true));
      this.bU.a(3, new ces<>(this, cit.class, 10, true, false, cit.bZ));
   }

   public static bxi.a m() {
      return cms.gr().a(bxj.v, 0.25);
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(this.p(), 0.15F, 1.0F);
   }

   abstract axe p();

   @Override
   public void d_() {
      boolean $$0 = this.ge();
      if ($$0) {
         cxk $$1 = this.a(bvn.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cxg $$2 = $$1.h();
               $$1.b($$1.o() + this.ae.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, bvn.f);
                  this.a(bvn.f, cxk.k);
               }
            }

            $$0 = false;
         }

         if ($$0) {
            this.d(8.0F);
         }
      }

      super.d_();
   }

   @Override
   public void r() {
      super.r();
      if (this.dl() instanceof bwj $$0) {
         this.aX = $$0.aX;
      }
   }

   @Override
   protected void a(bam $$0, btc $$1) {
      super.a($$0, $$1);
      this.a(bvn.a, new cxk(cxo.oR));
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bam $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.t();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bvn.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bvn.f, new cxk($$4.i() < 0.1F ? dkg.es : dkg.er));
            this.bW[bvn.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void t() {
      if (this.dV() != null && !this.dV().C) {
         this.bT.a(this.d);
         this.bT.a(this.c);
         cxk $$0 = this.b(cqn.a(this, cxo.oR));
         if ($$0.a(cxo.oR)) {
            int $$1 = this.x();
            if (this.dV().al() != btb.d) {
               $$1 = this.gm();
            }

            this.c.c($$1);
            this.bT.a(4, this.c);
         } else {
            this.bT.a(4, this.d);
         }
      }
   }

   protected int x() {
      return 20;
   }

   protected int gm() {
      return 40;
   }

   @Override
   public void a(bwb $$0, float $$1) {
      cxk $$2 = this.b(cqn.a(this, cxo.oR));
      cxk $$3 = this.d($$2);
      cpz $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof ash $$9) {
         cql.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.al().a() * 4));
      }

      this.a(axf.xG, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   protected cpz a(cxk $$0, float $$1, @Nullable cxk $$2) {
      return cqn.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cyg $$0) {
      return $$0 == cxo.oR;
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.t();
   }

   @Override
   public void a(bvn $$0, cxk $$1) {
      super.a($$0, $$1);
      if (!this.dV().C) {
         this.t();
      }
   }

   public boolean gn() {
      return this.cw();
   }
}
