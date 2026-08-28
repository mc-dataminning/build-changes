import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckg extends coh {
   private static final Predicate<bsq> e = $$0 -> $$0.bE() && !($$0 instanceof ckg);
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

   public ckg(bsw<? extends ckg> $$0, dcu $$1) {
      super($$0, $$1);
      this.bP = 20;
      this.a(epp.v, 0.0F);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new cae(this));
      this.bU.a(4, new cau(this, 1.0, true));
      this.bU.a(5, new cbx(this, 0.4));
      this.bU.a(6, new cas(this, cmv.class, 6.0F));
      this.bU.a(10, new cas(this, btn.class, 8.0F));
      this.bV.a(2, new ccc(this, coh.class).a());
      this.bV.a(3, new ccd<>(this, cmv.class, true));
      this.bV.a(4, new ccd<>(this, cmd.class, true, $$0 -> !$$0.o_()));
      this.bV.a(4, new ccd<>(this, cfo.class, true));
   }

   @Override
   protected void S() {
      boolean $$0 = !(this.cR() instanceof btn) || this.cR().am().a(awh.c);
      boolean $$1 = !(this.dd() instanceof cot);
      this.bU.a(cak.a.a, $$0);
      this.bU.a(cak.a.c, $$0 && $$1);
      this.bU.a(cak.a.b, $$0);
      this.bU.a(cak.a.d, $$0);
   }

   public static but.a s() {
      return ckb.gs().a(buu.s, 100.0).a(buu.v, 0.3).a(buu.p, 0.75).a(buu.c, 12.0).a(buu.d, 1.5).a(buu.m, 32.0).a(buu.B, 1.0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ch);
      $$0.a("StunTick", this.ci);
      $$0.a("RoarTick", this.cj);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.ch = $$0.h("AttackTick");
      this.ci = $$0.h("StunTick");
      this.cj = $$0.h("RoarTick");
   }

   @Override
   public avn ae_() {
      return avo.vf;
   }

   @Override
   public int ab() {
      return 45;
   }

   @Override
   public void m_() {
      super.m_();
      if (this.bE()) {
         if (this.fd()) {
            this.f(buu.v).a(0.0);
         } else {
            double $$0 = this.p() != null ? 0.35 : 0.3;
            double $$1 = this.f(buu.v).b();
            this.f(buu.v).a(ayn.d(0.1, $$1, $$0));
         }

         if (this.Q && this.dQ().ab().b(dcq.c)) {
            boolean $$2 = false;
            ewr $$3 = this.cL().g(0.2);

            for (jd $$4 : jd.b(ayn.a($$3.a), ayn.a($$3.b), ayn.a($$3.c), ayn.a($$3.d), ayn.a($$3.e), ayn.a($$3.f))) {
               dta $$5 = this.dQ().a_($$4);
               dfw $$6 = $$5.b();
               if ($$6 instanceof dkg) {
                  $$2 = this.dQ().a($$4, true, this) || $$2;
               }
            }

            if (!$$2 && this.aF()) {
               this.fg();
            }
         }

         if (this.cj > 0) {
            this.cj--;
            if (this.cj == 10) {
               this.gy();
            }
         }

         if (this.ch > 0) {
            this.ch--;
         }

         if (this.ci > 0) {
            this.ci--;
            this.gx();
            if (this.ci == 0) {
               this.a(avo.vk, 1.0F, 1.0F);
               this.cj = 20;
            }
         }
      }
   }

   private void gx() {
      if (this.ah.a(6) == 0) {
         double $$0 = this.dv() - (double)this.dk() * Math.sin((double)(this.aY * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         double $$1 = this.dx() + (double)this.dl() - 0.3;
         double $$2 = this.dB() + (double)this.dk() * Math.cos((double)(this.aY * (float) (Math.PI / 180.0))) + (this.ah.j() * 0.6 - 0.3);
         this.dQ().a(lf.a(lm.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fd() {
      return super.fd() || this.ch > 0 || this.ci > 0 || this.cj > 0;
   }

   @Override
   public boolean F(bsq $$0) {
      return this.ci <= 0 && this.cj <= 0 ? super.F($$0) : false;
   }

   @Override
   protected void e(btl $$0) {
      if (this.cj == 0) {
         if (this.ah.j() < 0.5) {
            this.ci = 40;
            this.a(avo.vj, 1.0F, 1.0F);
            this.dQ().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.U = true;
      }
   }

   private void gy() {
      if (this.bE()) {
         for (btl $$1 : this.dQ().a(btl.class, this.cL().g(4.0), e)) {
            if (!($$1 instanceof cji)) {
               $$1.a(this.dR().b((btl)this), 6.0F);
            }

            this.b($$1);
         }

         eww $$2 = this.cL().f();

         for (int $$3 = 0; $$3 < 40; $$3++) {
            double $$4 = this.ah.k() * 0.2;
            double $$5 = this.ah.k() * 0.2;
            double $$6 = this.ah.k() * 0.2;
            this.dQ().a(lm.ab, $$2.c, $$2.d, $$2.e, $$4, $$5, $$6);
         }

         this.a(dxw.u);
      }
   }

   private void b(bsq $$0) {
      double $$1 = $$0.dv() - this.dv();
      double $$2 = $$0.dB() - this.dB();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ch = 10;
         this.a(avo.ve, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.ci = 40;
      }

      super.b($$0);
   }

   public int t() {
      return this.ch;
   }

   public int gm() {
      return this.ci;
   }

   public int gw() {
      return this.cj;
   }

   @Override
   public boolean D(bsq $$0) {
      this.ch = 10;
      this.dQ().a(this, (byte)4);
      this.a(avo.ve, 1.0F, 1.0F);
      return super.D($$0);
   }

   @Nullable
   @Override
   protected avn v() {
      return avo.vd;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.vh;
   }

   @Override
   protected avn n_() {
      return avo.vg;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.vi, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dcx $$0) {
      return !$$0.d(this.cL());
   }

   @Override
   public void a(aqt $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gn() {
      return false;
   }

   @Override
   protected ewr ge() {
      ewr $$0 = super.ge();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
