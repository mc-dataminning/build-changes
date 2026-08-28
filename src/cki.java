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
      this.a(ept.v, 0.0F);
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
      boolean $$0 = !(this.cR() instanceof btp) || this.cR().am().a(awi.c);
      boolean $$1 = !(this.dd() instanceof cov);
      this.bU.a(cam.a.a, $$0);
      this.bU.a(cam.a.c, $$0 && $$1);
      this.bU.a(cam.a.b, $$0);
      this.bU.a(cam.a.d, $$0);
   }

   public static buv.a s() {
      return ckd.gr().a(buw.s, 100.0).a(buw.v, 0.3).a(buw.p, 0.75).a(buw.c, 12.0).a(buw.d, 1.5).a(buw.m, 32.0).a(buw.B, 1.0);
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
         if (this.fd()) {
            this.f(buw.v).a(0.0);
         } else {
            double $$0 = this.p() != null ? 0.35 : 0.3;
            double $$1 = this.f(buw.v).b();
            this.f(buw.v).a(ayo.d(0.1, $$1, $$0));
         }

         if (this.Q && this.dP().ab().b(dcs.c)) {
            boolean $$2 = false;
            ewv $$3 = this.cL().g(0.2);

            for (jd $$4 : jd.b(ayo.a($$3.a), ayo.a($$3.b), ayo.a($$3.c), ayo.a($$3.d), ayo.a($$3.e), ayo.a($$3.f))) {
               dtc $$5 = this.dP().a_($$4);
               dfy $$6 = $$5.b();
               if ($$6 instanceof dki) {
                  $$2 = this.dP().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aF()) {
               this.fg();
            }
         }

         if (this.cj > 0) {
            this.cj--;
            if (this.cj == 10) {
               this.gx();
            }
         }

         if (this.ch > 0) {
            this.ch--;
         }

         if (this.ci > 0) {
            this.ci--;
            this.gw();
            if (this.ci == 0) {
               this.a(avp.vk, 1.0F, 1.0F);
               this.cj = 20;
            }
         }
      }
   }

   private void gw() {
      if (this.ah.a(6) == 0) {
         double $$0 = this.du() - (double)this.dk() * Math.sin((double)(this.aY * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         double $$1 = this.dw() + (double)this.dl() - 0.3;
         double $$2 = this.dA() + (double)this.dk() * Math.cos((double)(this.aY * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         this.dP().a(lf.a(lm.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fd() {
      return super.fd() || this.ch > 0 || this.ci > 0 || this.cj > 0;
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
            this.dP().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.c($$0);
         }

         $$0.U = true;
      }
   }

   private void gx() {
      if (this.bE()) {
         for (btn $$1 : this.dP().a(btn.class, this.cL().g(4.0), e)) {
            if (!($$1 instanceof cjk)) {
               $$1.a(this.dQ().b((btn)this), 6.0F);
            }

            this.c($$1);
         }

         exa $$2 = this.cL().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ah.k() * 0.2;
            double $$5 = this.ah.k() * 0.2;
            double $$6 = this.ah.k() * 0.2;
            this.dP().a(lm.ab, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dxz.u);
      }
   }

   private void c(bsr $$0) {
      double $$1 = $$0.du() - this.du();
      double $$2 = $$0.dA() - this.dA();
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

   public int gl() {
      return this.ci;
   }

   public int gv() {
      return this.cj;
   }

   @Override
   public boolean D(bsr $$0) {
      this.ch = 10;
      this.dP().a(this, (byte)4);
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
      return !$$0.d(this.cL());
   }

   @Override
   public void a(aqu $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gm() {
      return false;
   }

   @Override
   protected ewv gd() {
      ewv $$0 = super.gd();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
