import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chw extends bso {
   public static final int b = 5;
   private static final boolean bX = true;
   private static final js bY = new js(0.0F, 0.0F, 0.0F);
   private static final js bZ = new js(0.0F, 0.0F, 0.0F);
   private static final js ca = new js(-10.0F, 0.0F, -10.0F);
   private static final js cb = new js(-15.0F, 0.0F, 10.0F);
   private static final js cc = new js(-1.0F, 0.0F, -1.0F);
   private static final js cd = new js(1.0F, 0.0F, 1.0F);
   private static final bry ce = bry.c(0.0F, 0.0F);
   private static final bry cf = bsb.d.n().a(0.5F).b(0.9875F);
   private static final double cg = 0.1;
   private static final double ch = 0.9;
   private static final double ci = 0.4;
   private static final double cj = 1.6;
   public static final int c = 8;
   public static final int d = 16;
   public static final int e = 1;
   public static final int f = 4;
   public static final int g = 8;
   public static final int h = 16;
   public static final ajy<Byte> i = akc.a(chw.class, aka.a);
   public static final ajy<js> bQ = akc.a(chw.class, aka.n);
   public static final ajy<js> bR = akc.a(chw.class, aka.n);
   public static final ajy<js> bS = akc.a(chw.class, aka.n);
   public static final ajy<js> bT = akc.a(chw.class, aka.n);
   public static final ajy<js> bU = akc.a(chw.class, aka.n);
   public static final ajy<js> bV = akc.a(chw.class, aka.n);
   private static final Predicate<brv> ck = $$0 -> $$0 instanceof cnw && ((cnw)$$0).u() == cnw.a.a;
   private final jj<cuh> cl = jj.a(2, cuh.i);
   private final jj<cuh> cm = jj.a(4, cuh.i);
   private boolean cn;
   public long bW;
   private int co;
   private js cp = bY;
   private js cq = bZ;
   private js cr = ca;
   private js cs = cb;
   private js ct = cc;
   private js cu = cd;

   public chw(bsb<? extends chw> $$0, dca $$1) {
      super($$0, $$1);
   }

   public chw(dca $$0, double $$1, double $$2, double $$3) {
      this(bsb.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static btu.a r() {
      return eb().a(btv.v, 0.0);
   }

   @Override
   public void i_() {
      double $$0 = this.dz();
      double $$1 = this.dB();
      double $$2 = this.dF();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   private boolean G() {
      return !this.y() && !this.bb();
   }

   @Override
   public boolean dg() {
      return super.dg() && this.G();
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(i, (byte)0);
      $$0.a(bQ, bY);
      $$0.a(bR, bZ);
      $$0.a(bS, ca);
      $$0.a(bT, cb);
      $$0.a(bU, cc);
      $$0.a(bV, cd);
   }

   @Override
   public Iterable<cuh> fj() {
      return this.cl;
   }

   @Override
   public Iterable<cuh> fi() {
      return this.cm;
   }

   @Override
   public cuh d(bsc $$0) {
      switch ($$0.a()) {
         case a:
            return this.cl.get($$0.b());
         case b:
            return this.cm.get($$0.b());
         default:
            return cuh.i;
      }
   }

   @Override
   public boolean c(bsc $$0) {
      return $$0 != bsc.g;
   }

   @Override
   public void a(bsc $$0, cuh $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cl.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cm.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   public boolean f(cuh $$0) {
      bsc $$1 = bsq.h($$0);
      return this.d($$1).d() && !this.f($$1);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      uq $$1 = new uq();

      for (cuh $$2 : this.cm) {
         $$1.add($$2.b(this.dY()));
      }

      $$0.a("ArmorItems", $$1);
      uq $$3 = new uq();

      for (cuh $$4 : this.cl) {
         $$3.add($$4.b(this.dY()));
      }

      $$0.a("HandItems", $$3);
      $$0.a("Invisible", this.cm());
      $$0.a("Small", this.t());
      $$0.a("ShowArms", this.u());
      $$0.a("DisabledSlots", this.co);
      $$0.a("NoBasePlate", this.x());
      if (this.y()) {
         $$0.a("Marker", this.y());
      }

      $$0.a("Pose", this.I());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         uq $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cm.size(); $$2++) {
            uk $$3 = $$1.a($$2);
            this.cm.set($$2, cuh.a(this.dY(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         uq $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.cl.size(); $$5++) {
            uk $$6 = $$4.a($$5);
            this.cl.set($$5, cuh.a(this.dY(), $$6));
         }
      }

      this.k($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.co = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.ah = !this.G();
      uk $$7 = $$0.p("Pose");
      this.c($$7);
   }

   private void c(uk $$0) {
      uq $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bY : new js($$1));
      uq $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bZ : new js($$2));
      uq $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? ca : new js($$3));
      uq $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? cb : new js($$4));
      uq $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? cc : new js($$5));
      uq $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? cd : new js($$6));
   }

   private uk I() {
      uk $$0 = new uk();
      if (!bY.equals(this.cp)) {
         $$0.a("Head", this.cp.a());
      }

      if (!bZ.equals(this.cq)) {
         $$0.a("Body", this.cq.a());
      }

      if (!ca.equals(this.cr)) {
         $$0.a("LeftArm", this.cr.a());
      }

      if (!cb.equals(this.cs)) {
         $$0.a("RightArm", this.cs.a());
      }

      if (!cc.equals(this.ct)) {
         $$0.a("LeftLeg", this.ct.a());
      }

      if (!cd.equals(this.cu)) {
         $$0.a("RightLeg", this.cu.a());
      }

      return $$0;
   }

   @Override
   public boolean bF() {
      return false;
   }

   @Override
   protected void D(brv $$0) {
   }

   @Override
   protected void s() {
      for (brv $$1 : this.dU().a(this, this.cP(), ck)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bqa a(cly $$0, ewu $$1, bpz $$2) {
      cuh $$3 = $$0.b($$2);
      if (this.y() || $$3.a(cuk.ww)) {
         return bqa.d;
      } else if ($$0.O_()) {
         return bqa.a;
      } else if ($$3.a(cuk.AA)) {
         return bqa.d;
      } else if ($$0.dU().C) {
         return bqa.b;
      } else {
         bsc $$4 = bsq.h($$3);
         if ($$3.d()) {
            bsc $$5 = this.j($$1);
            bsc $$6 = this.f($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bqa.a;
            }
         } else {
            if (this.f($$4)) {
               return bqa.e;
            }

            if ($$4.a() == bsc.a.a && !this.u()) {
               return bqa.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bqa.a;
            }
         }

         return bqa.d;
      }
   }

   private bsc j(ewu $$0) {
      bsc $$1 = bsc.a;
      boolean $$2 = this.t();
      double $$3 = $$0.d / (double)(this.em() * this.el());
      bsc $$4 = bsc.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = bsc.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(bsc.e)) {
         $$1 = bsc.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(bsc.d)) {
         $$1 = bsc.d;
      } else if ($$3 >= 1.6 && this.b(bsc.f)) {
         $$1 = bsc.f;
      } else if (!this.b(bsc.a) && this.b(bsc.b)) {
         $$1 = bsc.b;
      }

      return $$1;
   }

   private boolean f(bsc $$0) {
      return (this.co & 1 << $$0.d()) != 0 || $$0.a() == bsc.a.a && !this.u();
   }

   private boolean a(cly $$0, bsc $$1, cuh $$2, bpz $$3) {
      cuh $$4 = this.d($$1);
      if (!$$4.d() && (this.co & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.d() && (this.co & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fY() && $$4.d() && !$$2.d()) {
         this.a($$1, $$2.c(1));
         return true;
      } else if ($$2.d() || $$2.G() <= 1) {
         this.a($$1, $$2);
         $$0.a($$3, $$4);
         return true;
      } else if (!$$4.d()) {
         return false;
      } else {
         this.a($$1, $$2.a(1));
         return true;
      }
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.dU().C || this.dP()) {
         return false;
      } else if ($$0.a(awg.e)) {
         this.an();
         return false;
      } else if (this.b($$0) || this.cn || this.y()) {
         return false;
      } else if ($$0.a(awg.m)) {
         this.j($$0);
         this.an();
         return false;
      } else if ($$0.a(awg.v)) {
         if (this.bV()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(awg.w) && this.eI() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(awg.C);
         boolean $$3 = $$0.a(awg.B);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof cly $$4 && !$$4.gm().e) {
               return false;
            }

            if ($$0.g()) {
               this.K();
               this.J();
               this.an();
               return true;
            } else {
               long $$5 = this.dU().Z();
               if ($$5 - this.bW > 5L && !$$3) {
                  this.dU().a(this, (byte)32);
                  this.a(dxv.o, $$0.d());
                  this.bW = $$5;
               } else {
                  this.i($$0);
                  this.J();
                  this.an();
               }

               return true;
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 32) {
         if (this.dU().C) {
            this.dU().a(this.dz(), this.dB(), this.dF(), avo.aH, this.dj(), 0.3F, 1.0F, false);
            this.bW = this.dU().Z();
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cP().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void J() {
      if (this.dU() instanceof aqt) {
         ((aqt)this.dU())
            .a(
               new ks(lb.b, dfe.S.n()),
               this.dz(),
               this.e(0.6666666666666666),
               this.dF(),
               10,
               (double)(this.do() / 4.0F),
               (double)(this.dp() / 4.0F),
               (double)(this.do() / 4.0F),
               0.05
            );
      }
   }

   private void g(bqt $$0, float $$1) {
      float $$2 = this.eI();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.j($$0);
         this.an();
      } else {
         this.t($$2);
         this.a(dxv.o, $$0.d());
      }
   }

   private void i(bqt $$0) {
      cuh $$1 = new cuh(cuk.wq);
      $$1.b(ke.f, this.ah());
      dfc.a(this.dU(), this.du(), $$1);
      this.j($$0);
   }

   private void j(bqt $$0) {
      this.K();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.cl.size(); $$1++) {
         cuh $$2 = this.cl.get($$1);
         if (!$$2.d()) {
            dfc.a(this.dU(), this.du().c(), $$2);
            this.cl.set($$1, cuh.i);
         }
      }

      for (int $$3 = 0; $$3 < this.cm.size(); $$3++) {
         cuh $$4 = this.cm.get($$3);
         if (!$$4.d()) {
            dfc.a(this.dU(), this.du().c(), $$4);
            this.cm.set($$3, cuh.i);
         }
      }
   }

   private void K() {
      this.dU().a(null, this.dz(), this.dB(), this.dF(), avo.aF, this.dj(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bk = this.P;
      this.bj = this.dK();
      return 0.0F;
   }

   @Override
   public void a(ewu $$0) {
      if (this.G()) {
         super.a($$0);
      }
   }

   @Override
   public void o(float $$0) {
      this.bk = this.P = $$0;
      this.bm = this.bl = $$0;
   }

   @Override
   public void n(float $$0) {
      this.bk = this.P = $$0;
      this.bm = this.bl = $$0;
   }

   @Override
   public void l() {
      super.l();
      js $$0 = this.as.a(bQ);
      if (!this.cp.equals($$0)) {
         this.a($$0);
      }

      js $$1 = this.as.a(bR);
      if (!this.cq.equals($$1)) {
         this.b($$1);
      }

      js $$2 = this.as.a(bS);
      if (!this.cr.equals($$2)) {
         this.c($$2);
      }

      js $$3 = this.as.a(bT);
      if (!this.cs.equals($$3)) {
         this.d($$3);
      }

      js $$4 = this.as.a(bU);
      if (!this.ct.equals($$4)) {
         this.e($$4);
      }

      js $$5 = this.as.a(bV);
      if (!this.cu.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void L() {
      this.k(this.cn);
   }

   @Override
   public void k(boolean $$0) {
      this.cn = $$0;
      super.k($$0);
   }

   @Override
   public boolean o_() {
      return this.t();
   }

   @Override
   public void an() {
      this.a(brv.d.a);
      this.a(dxv.p);
   }

   @Override
   public boolean a(dbs $$0) {
      return this.cm();
   }

   @Override
   public epj j_() {
      return this.y() ? epj.d : super.j_();
   }

   @Override
   public boolean r_() {
      return this.y();
   }

   private void t(boolean $$0) {
      this.as.a(i, this.a(this.as.a(i), 1, $$0));
   }

   public boolean t() {
      return (this.as.a(i) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.as.a(i, this.a(this.as.a(i), 4, $$0));
   }

   @Override
   public boolean u() {
      return (this.as.a(i) & 4) != 0;
   }

   public void b(boolean $$0) {
      this.as.a(i, this.a(this.as.a(i), 8, $$0));
   }

   public boolean x() {
      return (this.as.a(i) & 8) != 0;
   }

   private void u(boolean $$0) {
      this.as.a(i, this.a(this.as.a(i), 16, $$0));
   }

   public boolean y() {
      return (this.as.a(i) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(js $$0) {
      this.cp = $$0;
      this.as.a(bQ, $$0);
   }

   public void b(js $$0) {
      this.cq = $$0;
      this.as.a(bR, $$0);
   }

   public void c(js $$0) {
      this.cr = $$0;
      this.as.a(bS, $$0);
   }

   public void d(js $$0) {
      this.cs = $$0;
      this.as.a(bT, $$0);
   }

   public void e(js $$0) {
      this.ct = $$0;
      this.as.a(bU, $$0);
   }

   public void f(js $$0) {
      this.cu = $$0;
      this.as.a(bV, $$0);
   }

   public js A() {
      return this.cp;
   }

   public js B() {
      return this.cq;
   }

   public js C() {
      return this.cr;
   }

   public js D() {
      return this.cs;
   }

   public js E() {
      return this.ct;
   }

   public js F() {
      return this.cu;
   }

   @Override
   public boolean bE() {
      return super.bE() && !this.y();
   }

   @Override
   public boolean u(brv $$0) {
      return $$0 instanceof cly && !this.dU().a((cly)$$0, this.du());
   }

   @Override
   public bsi fD() {
      return bsi.b;
   }

   @Override
   public bso.a eT() {
      return new bso.a(avo.aG, avo.aG);
   }

   @Nullable
   @Override
   protected avn d(bqt $$0) {
      return avo.aH;
   }

   @Nullable
   @Override
   protected avn n_() {
      return avo.aF;
   }

   @Override
   public void a(aqt $$0, bsn $$1) {
   }

   @Override
   public boolean fP() {
      return false;
   }

   @Override
   public void a(ajy<?> $$0) {
      if (i.equals($$0)) {
         this.i_();
         this.K = !this.y();
      }

      super.a($$0);
   }

   @Override
   public boolean fQ() {
      return false;
   }

   @Override
   public bry e(bsz $$0) {
      return this.v(this.y());
   }

   private bry v(boolean $$0) {
      if ($$0) {
         return ce;
      } else {
         return this.o_() ? cf : this.ak().n();
      }
   }

   @Override
   public ewu k(float $$0) {
      if (this.y()) {
         ewp $$1 = this.v(false).a(this.ds());
         ir $$2 = this.du();
         int $$3 = Integer.MIN_VALUE;

         for (ir $$4 : ir.c(ir.a($$1.a, $$1.b, $$1.c), ir.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dU().a(dcj.b, $$4), this.dU().a(dcj.a, $$4));
            if ($$5 == 15) {
               return ewu.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return ewu.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public cuh dH() {
      return new cuh(cuk.wq);
   }

   @Override
   public boolean eC() {
      return !this.cm() && !this.y();
   }
}
