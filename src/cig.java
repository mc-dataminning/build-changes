import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cig extends bsy {
   public static final int b = 5;
   private static final boolean bQ = true;
   private static final kb bR = new kb(0.0F, 0.0F, 0.0F);
   private static final kb bS = new kb(0.0F, 0.0F, 0.0F);
   private static final kb bT = new kb(-10.0F, 0.0F, -10.0F);
   private static final kb bU = new kb(-15.0F, 0.0F, 10.0F);
   private static final kb bV = new kb(-1.0F, 0.0F, -1.0F);
   private static final kb bW = new kb(1.0F, 0.0F, 1.0F);
   private static final bsg bX = bsg.c(0.0F, 0.0F);
   private static final bsg bY = bsj.d.n().a(0.5F).b(0.9875F);
   private static final double bZ = 0.1;
   private static final double ca = 0.9;
   private static final double cb = 0.4;
   private static final double cc = 1.6;
   public static final int c = 8;
   public static final int d = 16;
   public static final int e = 1;
   public static final int f = 4;
   public static final int g = 8;
   public static final int bH = 16;
   public static final ajp<Byte> bI = ajt.a(cig.class, ajr.a);
   public static final ajp<kb> bJ = ajt.a(cig.class, ajr.n);
   public static final ajp<kb> bK = ajt.a(cig.class, ajr.n);
   public static final ajp<kb> bL = ajt.a(cig.class, ajr.n);
   public static final ajp<kb> bM = ajt.a(cig.class, ajr.n);
   public static final ajp<kb> bN = ajt.a(cig.class, ajr.n);
   public static final ajp<kb> bO = ajt.a(cig.class, ajr.n);
   private static final Predicate<bsd> cd = $$0 -> $$0 instanceof coc && ((coc)$$0).v() == coc.a.a;
   private final js<cua> ce = js.a(2, cua.l);
   private final js<cua> cf = js.a(4, cua.l);
   private boolean cg;
   public long bP;
   private int ch;
   private kb ci = bR;
   private kb cj = bS;
   private kb ck = bT;
   private kb cl = bU;
   private kb cm = bV;
   private kb cn = bW;

   public cig(bsj<? extends cig> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cig(dcd $$0, double $$1, double $$2, double $$3) {
      this(bsj.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static buf.a s() {
      return dV().a(bug.B, 0.0);
   }

   @Override
   public void j_() {
      double $$0 = this.du();
      double $$1 = this.dw();
      double $$2 = this.dA();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   private boolean H() {
      return !this.z() && !this.aX();
   }

   @Override
   public boolean db() {
      return super.db() && this.H();
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(bI, (byte)0);
      $$0.a(bJ, bR);
      $$0.a(bK, bS);
      $$0.a(bL, bT);
      $$0.a(bM, bU);
      $$0.a(bN, bV);
      $$0.a(bO, bW);
   }

   @Override
   public Iterable<cua> eW() {
      return this.ce;
   }

   @Override
   public Iterable<cua> eV() {
      return this.cf;
   }

   @Override
   public cua a(bsk $$0) {
      switch ($$0.a()) {
         case a:
            return this.ce.get($$0.b());
         case b:
            return this.cf.get($$0.b());
         default:
            return cua.l;
      }
   }

   @Override
   public boolean d(bsk $$0) {
      return $$0 != bsk.g;
   }

   @Override
   public void a(bsk $$0, cua $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.ce.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cf.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   public boolean f(cua $$0) {
      bsk $$1 = bta.h($$0);
      return this.a($$1).e() && !this.f($$1);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      ud $$1 = new ud();

      for (cua $$2 : this.cf) {
         $$1.add($$2.b(this.dR()));
      }

      $$0.a("ArmorItems", $$1);
      ud $$3 = new ud();

      for (cua $$4 : this.ce) {
         $$3.add($$4.b(this.dR()));
      }

      $$0.a("HandItems", $$3);
      $$0.a("Invisible", this.ch());
      $$0.a("Small", this.u());
      $$0.a("ShowArms", this.v());
      $$0.a("DisabledSlots", this.ch);
      $$0.a("NoBasePlate", this.y());
      if (this.z()) {
         $$0.a("Marker", this.z());
      }

      $$0.a("Pose", this.I());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         ud $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cf.size(); $$2++) {
            tx $$3 = $$1.a($$2);
            this.cf.set($$2, cua.a(this.dR(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         ud $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.ce.size(); $$5++) {
            tx $$6 = $$4.a($$5);
            this.ce.set($$5, cua.a(this.dR(), $$6));
         }
      }

      this.k($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.ch = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.ag = !this.H();
      tx $$7 = $$0.p("Pose");
      this.c($$7);
   }

   private void c(tx $$0) {
      ud $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bR : new kb($$1));
      ud $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bS : new kb($$2));
      ud $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bT : new kb($$3));
      ud $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bU : new kb($$4));
      ud $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bV : new kb($$5));
      ud $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bW : new kb($$6));
   }

   private tx I() {
      tx $$0 = new tx();
      if (!bR.equals(this.ci)) {
         $$0.a("Head", this.ci.a());
      }

      if (!bS.equals(this.cj)) {
         $$0.a("Body", this.cj.a());
      }

      if (!bT.equals(this.ck)) {
         $$0.a("LeftArm", this.ck.a());
      }

      if (!bU.equals(this.cl)) {
         $$0.a("RightArm", this.cl.a());
      }

      if (!bV.equals(this.cm)) {
         $$0.a("LeftLeg", this.cm.a());
      }

      if (!bW.equals(this.cn)) {
         $$0.a("RightLeg", this.cn.a());
      }

      return $$0;
   }

   @Override
   public boolean bA() {
      return false;
   }

   @Override
   protected void E(bsd $$0) {
   }

   @Override
   protected void q() {
      for (bsd $$1 : this.dP().a(this, this.cK(), cd)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bqd a(cmh $$0, evz $$1, bqc $$2) {
      cua $$3 = $$0.b($$2);
      if (this.z() || $$3.a(cud.uL)) {
         return bqd.e;
      } else if ($$0.N_()) {
         return bqd.a;
      } else if ($$0.dP().B) {
         return bqd.c;
      } else {
         bsk $$4 = bta.h($$3);
         if ($$3.e()) {
            bsk $$5 = this.k($$1);
            bsk $$6 = this.f($$5) ? $$4 : $$5;
            if (this.c($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bqd.a;
            }
         } else {
            if (this.f($$4)) {
               return bqd.f;
            }

            if ($$4.a() == bsk.a.a && !this.v()) {
               return bqd.f;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bqd.a;
            }
         }

         return bqd.e;
      }
   }

   private bsk k(evz $$0) {
      bsk $$1 = bsk.a;
      boolean $$2 = this.u();
      double $$3 = $$0.d / (double)(this.eb() * this.ea());
      bsk $$4 = bsk.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.c($$4)) {
         $$1 = bsk.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.c(bsk.e)) {
         $$1 = bsk.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.c(bsk.d)) {
         $$1 = bsk.d;
      } else if ($$3 >= 1.6 && this.c(bsk.f)) {
         $$1 = bsk.f;
      } else if (!this.c(bsk.a) && this.c(bsk.b)) {
         $$1 = bsk.b;
      }

      return $$1;
   }

   private boolean f(bsk $$0) {
      return (this.ch & 1 << $$0.d()) != 0 || $$0.a() == bsk.a.a && !this.v();
   }

   private boolean a(cmh $$0, bsk $$1, cua $$2, bqc $$3) {
      cua $$4 = this.a($$1);
      if (!$$4.e() && (this.ch & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.e() && (this.ch & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fL() && $$4.e() && !$$2.e()) {
         this.a($$1, $$2.c(1));
         return true;
      } else if ($$2.e() || $$2.H() <= 1) {
         this.a($$1, $$2);
         $$0.a($$3, $$4);
         return true;
      } else if (!$$4.e()) {
         return false;
      } else {
         this.a($$1, $$2.a(1));
         return true;
      }
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.dP().B || this.dK()) {
         return false;
      } else if ($$0.a(avw.e)) {
         this.an();
         return false;
      } else if (this.b($$0) || this.cg || this.z()) {
         return false;
      } else if ($$0.a(avw.m)) {
         this.i($$0);
         this.an();
         return false;
      } else if ($$0.a(avw.v)) {
         if (this.bQ()) {
            this.g($$0, 0.15F);
         } else {
            this.d(5.0F);
         }

         return false;
      } else if ($$0.a(avw.w) && this.ew() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(avw.C);
         boolean $$3 = $$0.a(avw.B);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof cmh $$4 && !$$4.fZ().e) {
               return false;
            }

            if ($$0.g()) {
               this.M();
               this.K();
               this.an();
               return true;
            } else {
               long $$5 = this.dP().Z();
               if ($$5 - this.bP > 5L && !$$3) {
                  this.dP().a(this, (byte)32);
                  this.a(dxa.o, $$0.d());
                  this.bP = $$5;
               } else {
                  this.h($$0);
                  this.K();
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
         if (this.dP().B) {
            this.dP().a(this.du(), this.dw(), this.dA(), avf.aC, this.de(), 0.3F, 1.0F, false);
            this.bP = this.dP().Z();
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cK().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void K() {
      if (this.dP() instanceof aqk) {
         ((aqk)this.dP())
            .a(
               new lb(lj.b, dfh.n.o()),
               this.du(),
               this.e(0.6666666666666666),
               this.dA(),
               10,
               (double)(this.dj() / 4.0F),
               (double)(this.dk() / 4.0F),
               (double)(this.dj() / 4.0F),
               0.05
            );
      }
   }

   private void g(bqw $$0, float $$1) {
      float $$2 = this.ew();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.an();
      } else {
         this.u($$2);
         this.a(dxa.o, $$0.d());
      }
   }

   private void h(bqw $$0) {
      cua $$1 = new cua(cud.uF);
      $$1.b(kn.g, this.ah());
      dff.a(this.dP(), this.dp(), $$1);
      this.i($$0);
   }

   private void i(bqw $$0) {
      this.M();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.ce.size(); $$1++) {
         cua $$2 = this.ce.get($$1);
         if (!$$2.e()) {
            dff.a(this.dP(), this.dp().c(), $$2);
            this.ce.set($$1, cua.l);
         }
      }

      for (int $$3 = 0; $$3 < this.cf.size(); $$3++) {
         cua $$4 = this.cf.get($$3);
         if (!$$4.e()) {
            dff.a(this.dP(), this.dp().c(), $$4);
            this.cf.set($$3, cua.l);
         }
      }
   }

   private void M() {
      this.dP().a(null, this.du(), this.dw(), this.dA(), avf.aA, this.de(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aZ = this.O;
      this.aY = this.dF();
      return 0.0F;
   }

   @Override
   public void a(evz $$0) {
      if (this.H()) {
         super.a($$0);
      }
   }

   @Override
   public void p(float $$0) {
      this.aZ = this.O = $$0;
      this.bb = this.ba = $$0;
   }

   @Override
   public void o(float $$0) {
      this.aZ = this.O = $$0;
      this.bb = this.ba = $$0;
   }

   @Override
   public void l() {
      super.l();
      kb $$0 = this.ao.a(bJ);
      if (!this.ci.equals($$0)) {
         this.a($$0);
      }

      kb $$1 = this.ao.a(bK);
      if (!this.cj.equals($$1)) {
         this.b($$1);
      }

      kb $$2 = this.ao.a(bL);
      if (!this.ck.equals($$2)) {
         this.c($$2);
      }

      kb $$3 = this.ao.a(bM);
      if (!this.cl.equals($$3)) {
         this.d($$3);
      }

      kb $$4 = this.ao.a(bN);
      if (!this.cm.equals($$4)) {
         this.e($$4);
      }

      kb $$5 = this.ao.a(bO);
      if (!this.cn.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void J() {
      this.k(this.cg);
   }

   @Override
   public void k(boolean $$0) {
      this.cg = $$0;
      super.k($$0);
   }

   @Override
   public boolean p_() {
      return this.u();
   }

   @Override
   public void an() {
      this.a(bsd.c.a);
      this.a(dxa.p);
   }

   @Override
   public boolean a(dbv $$0) {
      return this.ch();
   }

   @Override
   public eog k_() {
      return this.z() ? eog.d : super.k_();
   }

   @Override
   public boolean r_() {
      return this.z();
   }

   private void t(boolean $$0) {
      this.ao.a(bI, this.a(this.ao.a(bI), 1, $$0));
   }

   public boolean u() {
      return (this.ao.a(bI) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.ao.a(bI, this.a(this.ao.a(bI), 4, $$0));
   }

   public boolean v() {
      return (this.ao.a(bI) & 4) != 0;
   }

   public void b(boolean $$0) {
      this.ao.a(bI, this.a(this.ao.a(bI), 8, $$0));
   }

   public boolean y() {
      return (this.ao.a(bI) & 8) != 0;
   }

   private void u(boolean $$0) {
      this.ao.a(bI, this.a(this.ao.a(bI), 16, $$0));
   }

   public boolean z() {
      return (this.ao.a(bI) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(kb $$0) {
      this.ci = $$0;
      this.ao.a(bJ, $$0);
   }

   public void b(kb $$0) {
      this.cj = $$0;
      this.ao.a(bK, $$0);
   }

   public void c(kb $$0) {
      this.ck = $$0;
      this.ao.a(bL, $$0);
   }

   public void d(kb $$0) {
      this.cl = $$0;
      this.ao.a(bM, $$0);
   }

   public void e(kb $$0) {
      this.cm = $$0;
      this.ao.a(bN, $$0);
   }

   public void f(kb $$0) {
      this.cn = $$0;
      this.ao.a(bO, $$0);
   }

   public kb A() {
      return this.ci;
   }

   public kb B() {
      return this.cj;
   }

   public kb C() {
      return this.ck;
   }

   public kb D() {
      return this.cl;
   }

   public kb E() {
      return this.cm;
   }

   public kb G() {
      return this.cn;
   }

   @Override
   public boolean bz() {
      return super.bz() && !this.z();
   }

   @Override
   public boolean u(bsd $$0) {
      return $$0 instanceof cmh && !this.dP().a((cmh)$$0, this.dp());
   }

   @Override
   public bss fq() {
      return bss.b;
   }

   @Override
   public bsy.a eH() {
      return new bsy.a(avf.aB, avf.aB);
   }

   @Nullable
   @Override
   protected ave d(bqw $$0) {
      return avf.aC;
   }

   @Nullable
   @Override
   protected ave o_() {
      return avf.aA;
   }

   @Override
   public void a(aqk $$0, bsx $$1) {
   }

   @Override
   public boolean fC() {
      return false;
   }

   @Override
   public void a(ajp<?> $$0) {
      if (bI.equals($$0)) {
         this.j_();
         this.J = !this.z();
      }

      super.a($$0);
   }

   @Override
   public boolean fD() {
      return false;
   }

   @Override
   public bsg e(btk $$0) {
      return this.v(this.z());
   }

   private bsg v(boolean $$0) {
      if ($$0) {
         return bX;
      } else {
         return this.p_() ? bY : this.ak().n();
      }
   }

   @Override
   public evz l(float $$0) {
      if (this.z()) {
         evu $$1 = this.v(false).a(this.dn());
         ja $$2 = this.dp();
         int $$3 = Integer.MIN_VALUE;

         for (ja $$4 : ja.c(ja.a($$1.a, $$1.b, $$1.c), ja.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dP().a(dcm.b, $$4), this.dP().a(dcm.a, $$4));
            if ($$5 == 15) {
               return evz.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return evz.b($$2);
      } else {
         return super.l($$0);
      }
   }

   @Override
   public cua dC() {
      return new cua(cud.uF);
   }

   @Override
   public boolean eq() {
      return !this.ch() && !this.z();
   }
}
