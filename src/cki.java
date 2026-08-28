import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cki extends coj {
   private static final Predicate<bsr> e = $$0 -> $$0.bE() && !($$0 instanceof cki);
   private static final double ca = 0.3;
   private static final double cb = 0.35;
   private static final int cc = 8356754;
   private static final float cd = 0.57254905F;
   private static final float ce = 0.5137255F;
   private static final float cf = 0.49803922F;
   private static final int cg = 10;
   public static final int b = 40;
   private int ch;
   private int ci;
   private int cj;

   public cki(bsx<? extends cki> $$0, dcw $$1) {
      super($$0, $$1);
      this.bP = 20;
      this.a(epv.v, 0.0F);
   }

   @Override
   protected void B() {
      super.B();
      this.bU.a(0, new cag(this));
      this.bU.a(4, new caw(this, 1.0, true));
      this.bU.a(5, new cbz(this, 0.4));
      this.bU.a(6, new cau(this, cmx.class, 6.0F));
      this.bU.a(10, new cau(this, btp.class, 8.0F));
      this.bV.a(2, new cce(this, coj.class).a());
      this.bV.a(3, new ccf<>(this, cmx.class, true));
      this.bV.a(4, new ccf<>(this, cmf.class, true, $$0 -> !$$0.o_()));
      this.bV.a(4, new ccf<>(this, cfq.class, true));
   }

   @Override
   protected void U() {
      boolean $$0 = !(this.cQ() instanceof btp) || this.cQ().am().a(awi.c);
      boolean $$1 = !(this.dc() instanceof cov);
      this.bU.a(cam.a.a, $$0);
      this.bU.a(cam.a.c, $$0 && $$1);
      this.bU.a(cam.a.b, $$0);
      this.bU.a(cam.a.d, $$0);
   }

   public static buv.a s() {
      return ckd.gq().a(buw.s, 100.0).a(buw.v, 0.3).a(buw.p, 0.75).a(buw.c, 12.0).a(buw.d, 1.5).a(buw.m, 32.0).a(buw.B, 1.0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ch);
      $$0.a("StunTick", this.ci);
      $$0.a("RoarTick", this.cj);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.ch = $$0.h("AttackTick");
      this.ci = $$0.h("StunTick");
      this.cj = $$0.h("RoarTick");
   }

   @Override
   public avo ai_() {
      return avp.vf;
   }

   @Override
   public int ae() {
      return 45;
   }

   @Override
   public void m_() {
      super.m_();
      if (this.bE()) {
         if (this.fc()) {
            this.f(buw.v).a(0.0);
         } else {
            double $$0 = this.p() != null ? 0.35 : 0.3;
            double $$1 = this.f(buw.v).b();
            this.f(buw.v).a(ayo.d(0.1, $$1, $$0));
         }

         if (this.Q && this.dO().ab().b(dcs.c)) {
            boolean $$2 = false;
            ewx $$3 = this.cK().g(0.2);

            for (jd $$4 : jd.b(ayo.a($$3.a), ayo.a($$3.b), ayo.a($$3.c), ayo.a($$3.d), ayo.a($$3.e), ayo.a($$3.f))) {
               dtc $$5 = this.dO().a_($$4);
               dfy $$6 = $$5.b();
               if ($$6 instanceof dki) {
                  $$2 = this.dO().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aF()) {
               this.ff();
            }
         }

         if (this.cj > 0) {
            this.cj--;
            if (this.cj == 10) {
               this.gw();
            }
         }

         if (this.ch > 0) {
            this.ch--;
         }

         if (this.ci > 0) {
            this.ci--;
            this.gv();
            if (this.ci == 0) {
               this.a(avp.vk, 1.0F, 1.0F);
               this.cj = 20;
            }
         }
      }
   }

   private void gv() {
      if (this.ah.a(6) == 0) {
         double $$0 = this.dt() - (double)this.dj() * Math.sin((double)(this.aY * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         double $$1 = this.dv() + (double)this.dk() - 0.3;
         double $$2 = this.dz() + (double)this.dj() * Math.cos((double)(this.aY * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         this.dO().a(lf.a(lm.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fc() {
      return super.fc() || this.ch > 0 || this.ci > 0 || this.cj > 0;
   }

   @Override
   public boolean F(bsr $$0) {
      return this.ci <= 0 && this.cj <= 0 ? super.F($$0) : false;
   }

   @Override
   protected void e(btn $$0) {
      if (this.cj == 0) {
         if (this.ah.j() < 0.5) {
            this.ci = 40;
            this.a(avp.vj, 1.0F, 1.0F);
            this.dO().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.c($$0);
         }

         $$0.U = true;
      }
   }

   private void gw() {
      if (this.bE()) {
         for (btn $$1 : this.dO().a(btn.class, this.cK().g(4.0), e)) {
            if (!($$1 instanceof cjk)) {
               $$1.a(this.dP().b((btn)this), 6.0F);
            }

            this.c($$1);
         }

         exc $$2 = this.cK().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ah.k() * 0.2;
            double $$5 = this.ah.k() * 0.2;
            double $$6 = this.ah.k() * 0.2;
            this.dO().a(lm.ab, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dxz.u);
      }
   }

   private void c(bsr $$0) {
      double $$1 = $$0.dt() - this.dt();
      double $$2 = $$0.dz() - this.dz();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ch = 10;
         this.a(avp.ve, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.ci = 40;
      }

      super.b($$0);
   }

   public int t() {
      return this.ch;
   }

   public int gk() {
      return this.ci;
   }

   public int gu() {
      return this.cj;
   }

   @Override
   public boolean D(bsr $$0) {
      this.ch = 10;
      this.dO().a(this, (byte)4);
      this.a(avp.ve, 1.0F, 1.0F);
      return super.D($$0);
   }

   @Nullable
   @Override
   protected avo v() {
      return avp.vd;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.vh;
   }

   @Override
   protected avo n_() {
      return avp.vg;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.vi, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dcz $$0) {
      return !$$0.d(this.cK());
   }

   @Override
   public void a(aqu $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gl() {
      return false;
   }

   @Override
   protected ewx gc() {
      ewx $$0 = super.gc();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
