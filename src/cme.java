import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public abstract class cme extends cmw implements cna {
   private static final int a = 20;
   private static final int b = 40;
   private final ced<cme> c = new ced<>(this, 1.0, 20, 15.0F);
   private final cdn d = new cdn(this, 1.2, false) {
      @Override
      public void e() {
         super.e();
         cme.this.w(false);
      }

      @Override
      public void d() {
         super.d();
         cme.this.w(true);
      }
   };

   protected cme(bvq<? extends cme> $$0, dhh $$1) {
      super($$0, $$1);
      this.t();
   }

   @Override
   protected void B() {
      this.bT.a(2, new ceg(this));
      this.bT.a(3, new ccw(this, 1.0));
      this.bT.a(3, new cck<>(this, ciz.class, 6.0F, 1.0, 1.2));
      this.bT.a(5, new ceq(this, 1.0));
      this.bT.a(6, new cdl(this, cpw.class, 8.0F));
      this.bT.a(6, new cdy(this));
      this.bU.a(1, new cev(this));
      this.bU.a(2, new cew<>(this, cpw.class, true));
      this.bU.a(3, new cew<>(this, cii.class, true));
      this.bU.a(3, new cew<>(this, cix.class, 10, true, false, cix.bZ));
   }

   public static bxm.a m() {
      return cmw.gr().a(bxn.v, 0.25);
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(this.p(), 0.15F, 1.0F);
   }

   abstract axe p();

   @Override
   public void d_() {
      boolean $$0 = this.ge();
      if ($$0) {
         cxo $$1 = this.a(bvr.f);
         if (!$$1.f()) {
            if ($$1.m()) {
               cxk $$2 = $$1.h();
               $$1.b($$1.o() + this.ae.a(2));
               if ($$1.o() >= $$1.p()) {
                  this.a($$2, bvr.f);
                  this.a(bvr.f, cxo.k);
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
      if (this.dl() instanceof bwn $$0) {
         this.aX = $$0.aX;
      }
   }

   @Override
   protected void a(bam $$0, btg $$1) {
      super.a($$0, $$1);
      this.a(bvr.a, new cxo(cxs.oR));
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bam $$4 = $$0.H_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      this.t();
      this.a_($$4.i() < 0.55F * $$1.d());
      if (this.a(bvr.f).f()) {
         LocalDate $$5 = LocalDate.now();
         int $$6 = $$5.get(ChronoField.DAY_OF_MONTH);
         int $$7 = $$5.get(ChronoField.MONTH_OF_YEAR);
         if ($$7 == 10 && $$6 == 31 && $$4.i() < 0.25F) {
            this.a(bvr.f, new cxo($$4.i() < 0.1F ? dkn.es : dkn.er));
            this.bW[bvr.f.b()] = 0.0F;
         }
      }

      return $$3;
   }

   public void t() {
      if (this.dV() != null && !this.dV().C) {
         this.bT.a(this.d);
         this.bT.a(this.c);
         cxo $$0 = this.b(cqr.a(this, cxs.oR));
         if ($$0.a(cxs.oR)) {
            int $$1 = this.x();
            if (this.dV().al() != btf.d) {
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
   public void a(bwf $$0, float $$1) {
      cxo $$2 = this.b(cqr.a(this, cxs.oR));
      cxo $$3 = this.d($$2);
      cqd $$4 = this.a($$3, $$1, $$2);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof ash $$9) {
         cqp.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - $$9.al().a() * 4));
      }

      this.a(axf.xH, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   protected cqd a(cxo $$0, float $$1, @Nullable cxo $$2) {
      return cqr.a(this, $$0, $$1, $$2);
   }

   @Override
   public boolean a(cyk $$0) {
      return $$0 == cxs.oR;
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.t();
   }

   @Override
   public void a(bvr $$0, cxo $$1) {
      super.a($$0, $$1);
      if (!this.dV().C) {
         this.t();
      }
   }

   public boolean gn() {
      return this.cw();
   }
}
