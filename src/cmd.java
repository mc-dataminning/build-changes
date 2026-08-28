import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmd extends cqi {
   private static final Predicate<bul> bY = $$0 -> !($$0 instanceof cmd) && $$0.bL();
   private static final Predicate<bul> bZ = $$0 -> bY.test($$0) && !$$0.aq().equals(bus.f);
   private static final Predicate<bvh> ca = $$0 -> !($$0 instanceof cmd) && $$0.bL() && $$0.di();
   private static final double cb = 0.3;
   private static final double cc = 0.35;
   private static final int cd = 8356754;
   private static final float ce = 0.57254905F;
   private static final float cf = 0.5137255F;
   private static final float cg = 0.49803922F;
   public static final int a = 10;
   public static final int b = 40;
   private int ch;
   private int ci;
   private int cj;

   public cmd(bus<? extends cmd> $$0, dfm $$1) {
      super($$0, $$1);
      this.bN = 20;
      this.a(esm.v, 0.0F);
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(0, new cbz(this));
      this.bS.a(4, new ccp(this, 1.0, true));
      this.bS.a(5, new cds(this, 0.4));
      this.bS.a(6, new ccn(this, cou.class, 6.0F));
      this.bS.a(10, new ccn(this, bvj.class, 8.0F));
      this.bT.a(2, new cdx(this, cqi.class).a());
      this.bT.a(3, new cdy<>(this, cou.class, true));
      this.bT.a(4, new cdy<>(this, coa.class, true, ($$0, $$1) -> !$$0.e_()));
      this.bT.a(4, new cdy<>(this, chk.class, true));
   }

   @Override
   protected void T() {
      boolean $$0 = !(this.cX() instanceof bvj) || this.cX().aq().a(axg.c);
      boolean $$1 = !(this.dk() instanceof cqr);
      this.bS.a(ccf.a.a, $$0);
      this.bS.a(ccf.a.c, $$0 && $$1);
      this.bS.a(ccf.a.b, $$0);
      this.bS.a(ccf.a.d, $$0);
   }

   public static bwo.a n() {
      return cly.gs().a(bwp.s, 100.0).a(bwp.v, 0.3).a(bwp.p, 0.75).a(bwp.c, 12.0).a(bwp.d, 1.5).a(bwp.m, 32.0).a(bwp.B, 1.0);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("AttackTick", this.ch);
      $$0.a("StunTick", this.ci);
      $$0.a("RoarTick", this.cj);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.ch = $$0.h("AttackTick");
      this.ci = $$0.h("StunTick");
      this.cj = $$0.h("RoarTick");
   }

   @Override
   public awm aj_() {
      return awn.ve;
   }

   @Override
   public int aa() {
      return 45;
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bL()) {
         if (this.fg()) {
            this.g(bwp.v).a(0.0);
         } else {
            double $$0 = this.aa_() != null ? 0.35 : 0.3;
            double $$1 = this.g(bwp.v).b();
            this.g(bwp.v).a(azm.d(0.1, $$1, $$0));
         }

         if (this.dV() instanceof arp $$2 && this.P && $$2.N().b(dfi.c)) {
            boolean $$3 = false;
            ezt $$4 = this.cR().g(0.2);

            for (jh $$5 : jh.b(azm.a($$4.a), azm.a($$4.b), azm.a($$4.c), azm.a($$4.d), azm.a($$4.e), azm.a($$4.f))) {
               dvv $$6 = $$2.a_($$5);
               diq $$7 = $$6.b();
               if ($$7 instanceof dmz) {
                  $$3 = $$2.a($$5, true, this) || $$3;
               }
            }

            if (!$$3 && this.aJ()) {
               this.s();
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
               this.a(awn.vj, 1.0F, 1.0F);
               this.cj = 20;
            }
         }
      }
   }

   private void gx() {
      if (this.ae.a(6) == 0) {
         double $$0 = this.dA() - (double)this.dq() * Math.sin((double)(this.aW * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         double $$1 = this.dC() + (double)this.dr() - 0.3;
         double $$2 = this.dG() + (double)this.dq() * Math.cos((double)(this.aW * (float) (Math.PI / 180.0))) + (this.ae.j() * 0.6 - 0.3);
         this.dV().a(ll.a(ls.u, 0.49803922F, 0.5137255F, 0.57254905F), $$0, $$1, $$2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean fg() {
      return super.fg() || this.ch > 0 || this.ci > 0 || this.cj > 0;
   }

   @Override
   public boolean E(bul $$0) {
      return this.ci <= 0 && this.cj <= 0 ? super.E($$0) : false;
   }

   @Override
   protected void e(bvh $$0) {
      if (this.cj == 0) {
         if (this.ae.j() < 0.5) {
            this.ci = 40;
            this.a(awn.vi, 1.0F, 1.0F);
            this.dV().a(this, (byte)39);
            $$0.h(this);
         } else {
            this.b($$0);
         }

         $$0.T = true;
      }
   }

   private void gy() {
      if (this.bL()) {
         if (this.dV() instanceof arp $$0) {
            Predicate<bul> $$1 = $$0.N().b(dfi.c) ? bY : bZ;

            for (bvh $$3 : this.dV().a(bvh.class, this.cR().g(4.0), $$1)) {
               if (!($$3 instanceof clf)) {
                  $$3.a($$0, this.dW().b((bvh)this), 6.0F);
               }

               if (!($$3 instanceof cou)) {
                  this.b($$3);
               }
            }

            this.a(ear.u);
         } else {
            for (bvh $$5 : this.dV().a(bvh.class, this.cR().g(4.0), ca)) {
               this.b($$5);
            }

            ezy $$6 = this.cR().f();

            for (int $$7 = 0; $$7 < 40; $$7++) {
               double $$8 = this.ae.k() * 0.2;
               double $$9 = this.ae.k() * 0.2;
               double $$10 = this.ae.k() * 0.2;
               this.dV().a(ls.ab, $$6.d, $$6.e, $$6.f, $$8, $$9, $$10);
            }
         }
      }
   }

   private void b(bul $$0) {
      double $$1 = $$0.dA() - this.dA();
      double $$2 = $$0.dG() - this.dG();
      double $$3 = Math.max($$1 * $$1 + $$2 * $$2, 0.001);
      $$0.j($$1 / $$3 * 4.0, 0.2, $$2 / $$3 * 4.0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ch = 10;
         this.a(awn.vd, 1.0F, 1.0F);
      } else if ($$0 == 39) {
         this.ci = 40;
      }

      super.b($$0);
   }

   public int q() {
      return this.ch;
   }

   public int gm() {
      return this.ci;
   }

   public int gw() {
      return this.cj;
   }

   @Override
   public boolean c(arp $$0, bul $$1) {
      this.ch = 10;
      $$0.a(this, (byte)4);
      this.a(awn.vd, 1.0F, 1.0F);
      return super.c($$0, $$1);
   }

   @Nullable
   @Override
   protected awm t() {
      return awn.vc;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.vg;
   }

   @Override
   protected awm n_() {
      return awn.vf;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.vh, 0.15F, 1.0F);
   }

   @Override
   public boolean a(dfp $$0) {
      return !$$0.d(this.cR());
   }

   @Override
   public void a(arp $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gn() {
      return false;
   }

   @Override
   protected ezt gc() {
      ezt $$0 = super.gc();
      return $$0.f(0.05, 0.0, 0.05);
   }
}
