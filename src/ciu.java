import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ciu extends btl {
   public static final int b = 5;
   private static final boolean bP = true;
   private static final ke bQ = new ke(0.0F, 0.0F, 0.0F);
   private static final ke bR = new ke(0.0F, 0.0F, 0.0F);
   private static final ke bS = new ke(-10.0F, 0.0F, -10.0F);
   private static final ke bT = new ke(-15.0F, 0.0F, 10.0F);
   private static final ke bU = new ke(-1.0F, 0.0F, -1.0F);
   private static final ke bV = new ke(1.0F, 0.0F, 1.0F);
   private static final bst bW = bst.c(0.0F, 0.0F);
   private static final bst bX = bsw.d.n().a(0.5F).b(0.9875F);
   private static final double bY = 0.1;
   private static final double bZ = 0.9;
   private static final double ca = 0.4;
   private static final double cb = 1.6;
   public static final int c = 8;
   public static final int d = 16;
   public static final int e = 1;
   public static final int f = 4;
   public static final int g = 8;
   public static final int h = 16;
   public static final ajv<Byte> bH = ajz.a(ciu.class, ajx.a);
   public static final ajv<ke> bI = ajz.a(ciu.class, ajx.n);
   public static final ajv<ke> bJ = ajz.a(ciu.class, ajx.n);
   public static final ajv<ke> bK = ajz.a(ciu.class, ajx.n);
   public static final ajv<ke> bL = ajz.a(ciu.class, ajx.n);
   public static final ajv<ke> bM = ajz.a(ciu.class, ajx.n);
   public static final ajv<ke> bN = ajz.a(ciu.class, ajx.n);
   private static final Predicate<bsq> cc = $$0 -> $$0 instanceof cor && ((cor)$$0).v() == cor.a.a;
   private final jv<cuo> cd = jv.a(2, cuo.l);
   private final jv<cuo> ce = jv.a(4, cuo.l);
   private boolean cf;
   public long bO;
   private int cg;
   private ke ch = bQ;
   private ke ci = bR;
   private ke cj = bS;
   private ke ck = bT;
   private ke cl = bU;
   private ke cm = bV;

   public ciu(bsw<? extends ciu> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public ciu(dcu $$0, double $$1, double $$2, double $$3) {
      this(bsw.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static but.a s() {
      return dW().a(buu.B, 0.0);
   }

   @Override
   public void i_() {
      double $$0 = this.dv();
      double $$1 = this.dx();
      double $$2 = this.dB();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   private boolean H() {
      return !this.z() && !this.aY();
   }

   @Override
   public boolean dc() {
      return super.dc() && this.H();
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(bH, (byte)0);
      $$0.a(bI, bQ);
      $$0.a(bJ, bR);
      $$0.a(bK, bS);
      $$0.a(bL, bT);
      $$0.a(bM, bU);
      $$0.a(bN, bV);
   }

   @Override
   public Iterable<cuo> eX() {
      return this.cd;
   }

   @Override
   public Iterable<cuo> eW() {
      return this.ce;
   }

   @Override
   public cuo a(bsx $$0) {
      switch ($$0.a()) {
         case a:
            return this.cd.get($$0.b());
         case b:
            return this.ce.get($$0.b());
         default:
            return cuo.l;
      }
   }

   @Override
   public boolean d(bsx $$0) {
      return $$0 != bsx.g;
   }

   @Override
   public void a(bsx $$0, cuo $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cd.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.ce.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   public boolean f(cuo $$0) {
      bsx $$1 = this.h($$0);
      return this.a($$1).e() && !this.e($$1);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      ug $$1 = new ug();

      for (cuo $$2 : this.ce) {
         $$1.add($$2.b(this.dS()));
      }

      $$0.a("ArmorItems", $$1);
      ug $$3 = new ug();

      for (cuo $$4 : this.cd) {
         $$3.add($$4.b(this.dS()));
      }

      $$0.a("HandItems", $$3);
      $$0.a("Invisible", this.ci());
      $$0.a("Small", this.t());
      $$0.a("ShowArms", this.v());
      $$0.a("DisabledSlots", this.cg);
      $$0.a("NoBasePlate", this.x());
      if (this.z()) {
         $$0.a("Marker", this.z());
      }

      $$0.a("Pose", this.I());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         ug $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.ce.size(); $$2++) {
            ua $$3 = $$1.a($$2);
            this.ce.set($$2, cuo.a(this.dS(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         ug $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.cd.size(); $$5++) {
            ua $$6 = $$4.a($$5);
            this.cd.set($$5, cuo.a(this.dS(), $$6));
         }
      }

      this.l($$0.q("Invisible"));
      this.c($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cg = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.ag = !this.H();
      ua $$7 = $$0.p("Pose");
      this.c($$7);
   }

   private void c(ua $$0) {
      ug $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bQ : new ke($$1));
      ug $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bR : new ke($$2));
      ug $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bS : new ke($$3));
      ug $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bT : new ke($$4));
      ug $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bU : new ke($$5));
      ug $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bV : new ke($$6));
   }

   private ua I() {
      ua $$0 = new ua();
      if (!bQ.equals(this.ch)) {
         $$0.a("Head", this.ch.a());
      }

      if (!bR.equals(this.ci)) {
         $$0.a("Body", this.ci.a());
      }

      if (!bS.equals(this.cj)) {
         $$0.a("LeftArm", this.cj.a());
      }

      if (!bT.equals(this.ck)) {
         $$0.a("RightArm", this.ck.a());
      }

      if (!bU.equals(this.cl)) {
         $$0.a("LeftLeg", this.cl.a());
      }

      if (!bV.equals(this.cm)) {
         $$0.a("RightLeg", this.cm.a());
      }

      return $$0;
   }

   @Override
   public boolean bB() {
      return false;
   }

   @Override
   protected void E(bsq $$0) {
   }

   @Override
   protected void r() {
      for (bsq $$1 : this.dQ().a(this, this.cL(), cc)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bqq a(cmv $$0, eww $$1, bqp $$2) {
      cuo $$3 = $$0.b($$2);
      if (this.z() || $$3.a(cur.uL)) {
         return bqq.e;
      } else if ($$0.N_()) {
         return bqq.a;
      } else if ($$0.dQ().B) {
         return bqq.c;
      } else {
         bsx $$4 = this.h($$3);
         if ($$3.e()) {
            bsx $$5 = this.b($$1);
            bsx $$6 = this.e($$5) ? $$4 : $$5;
            if (this.c($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bqq.a;
            }
         } else {
            if (this.e($$4)) {
               return bqq.f;
            }

            if ($$4.a() == bsx.a.a && !this.v()) {
               return bqq.f;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bqq.a;
            }
         }

         return bqq.e;
      }
   }

   private bsx b(eww $$0) {
      bsx $$1 = bsx.a;
      boolean $$2 = this.t();
      double $$3 = $$0.d / (double)(this.ec() * this.eb());
      bsx $$4 = bsx.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.c($$4)) {
         $$1 = bsx.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.c(bsx.e)) {
         $$1 = bsx.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.c(bsx.d)) {
         $$1 = bsx.d;
      } else if ($$3 >= 1.6 && this.c(bsx.f)) {
         $$1 = bsx.f;
      } else if (!this.c(bsx.a) && this.c(bsx.b)) {
         $$1 = bsx.b;
      }

      return $$1;
   }

   private boolean e(bsx $$0) {
      return (this.cg & 1 << $$0.d()) != 0 || $$0.a() == bsx.a.a && !this.v();
   }

   private boolean a(cmv $$0, bsx $$1, cuo $$2, bqp $$3) {
      cuo $$4 = this.a($$1);
      if (!$$4.e() && (this.cg & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.e() && (this.cg & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fM() && $$4.e() && !$$2.e()) {
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
   public boolean a(brj $$0, float $$1) {
      if (this.dL()) {
         return false;
      } else if (this.dQ() instanceof aqt $$2) {
         if ($$0.a(awf.d)) {
            this.ap();
            return false;
         } else if (this.b($$0) || this.cf || this.z()) {
            return false;
         } else if ($$0.a(awf.l)) {
            this.c($$2, $$0);
            this.ap();
            return false;
         } else if ($$0.a(awf.u)) {
            if (this.bR()) {
               this.a($$2, $$0, 0.15F);
            } else {
               this.d(5.0F);
            }

            return false;
         } else if ($$0.a(awf.v) && this.ex() > 0.5F) {
            this.a($$2, $$0, 4.0F);
            return false;
         } else {
            boolean $$4 = $$0.a(awf.B);
            boolean $$5 = $$0.a(awf.A);
            if (!$$4 && !$$5) {
               return false;
            } else {
               if ($$0.d() instanceof cmv $$6 && !$$6.ga().e) {
                  return false;
               }

               if ($$0.g()) {
                  this.L();
                  this.J();
                  this.ap();
                  return true;
               } else {
                  long $$7 = $$2.Z();
                  if ($$7 - this.bO > 5L && !$$5) {
                     $$2.a(this, (byte)32);
                     this.a(dxw.o, $$0.d());
                     this.bO = $$7;
                  } else {
                     this.b($$2, $$0);
                     this.J();
                     this.ap();
                  }

                  return true;
               }
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 32) {
         if (this.dQ().B) {
            this.dQ().a(this.dv(), this.dx(), this.dB(), avo.aC, this.df(), 0.3F, 1.0F, false);
            this.bO = this.dQ().Z();
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cL().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void J() {
      if (this.dQ() instanceof aqt) {
         ((aqt)this.dQ())
            .a(
               new le(lm.b, dfy.n.o()),
               this.dv(),
               this.e(0.6666666666666666),
               this.dB(),
               10,
               (double)(this.dk() / 4.0F),
               (double)(this.dl() / 4.0F),
               (double)(this.dk() / 4.0F),
               0.05
            );
      }
   }

   private void a(aqt $$0, brj $$1, float $$2) {
      float $$3 = this.ex();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.c($$0, $$1);
         this.ap();
      } else {
         this.u($$3);
         this.a(dxw.o, $$1.d());
      }
   }

   private void b(aqt $$0, brj $$1) {
      cuo $$2 = new cuo(cur.uF);
      $$2.b(kq.g, this.aj());
      dfw.a(this.dQ(), this.dq(), $$2);
      this.c($$0, $$1);
   }

   private void c(aqt $$0, brj $$1) {
      this.L();
      this.a($$0, $$1);

      for (int $$2 = 0; $$2 < this.cd.size(); $$2++) {
         cuo $$3 = this.cd.get($$2);
         if (!$$3.e()) {
            dfw.a(this.dQ(), this.dq().c(), $$3);
            this.cd.set($$2, cuo.l);
         }
      }

      for (int $$4 = 0; $$4 < this.ce.size(); $$4++) {
         cuo $$5 = this.ce.get($$4);
         if (!$$5.e()) {
            dfw.a(this.dQ(), this.dq().c(), $$5);
            this.ce.set($$4, cuo.l);
         }
      }
   }

   private void L() {
      this.dQ().a(null, this.dv(), this.dx(), this.dB(), avo.aA, this.df(), 1.0F, 1.0F);
   }

   @Override
   protected float f(float $$0, float $$1) {
      this.aZ = this.O;
      this.aY = this.dG();
      return 0.0F;
   }

   @Override
   public void a(eww $$0) {
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
      ke $$0 = this.ao.a(bI);
      if (!this.ch.equals($$0)) {
         this.a($$0);
      }

      ke $$1 = this.ao.a(bJ);
      if (!this.ci.equals($$1)) {
         this.b($$1);
      }

      ke $$2 = this.ao.a(bK);
      if (!this.cj.equals($$2)) {
         this.c($$2);
      }

      ke $$3 = this.ao.a(bL);
      if (!this.ck.equals($$3)) {
         this.d($$3);
      }

      ke $$4 = this.ao.a(bM);
      if (!this.cl.equals($$4)) {
         this.e($$4);
      }

      ke $$5 = this.ao.a(bN);
      if (!this.cm.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void K() {
      this.l(this.cf);
   }

   @Override
   public void l(boolean $$0) {
      this.cf = $$0;
      super.l($$0);
   }

   @Override
   public boolean o_() {
      return this.t();
   }

   @Override
   public void ap() {
      this.a(bsq.c.a);
      this.a(dxw.p);
   }

   @Override
   public boolean a(dcm $$0) {
      return this.ci();
   }

   @Override
   public epd j_() {
      return this.z() ? epd.d : super.j_();
   }

   @Override
   public boolean r_() {
      return this.z();
   }

   private void c(boolean $$0) {
      this.ao.a(bH, this.a(this.ao.a(bH), 1, $$0));
   }

   public boolean t() {
      return (this.ao.a(bH) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.ao.a(bH, this.a(this.ao.a(bH), 4, $$0));
   }

   public boolean v() {
      return (this.ao.a(bH) & 4) != 0;
   }

   public void b(boolean $$0) {
      this.ao.a(bH, this.a(this.ao.a(bH), 8, $$0));
   }

   public boolean x() {
      return (this.ao.a(bH) & 8) != 0;
   }

   private void u(boolean $$0) {
      this.ao.a(bH, this.a(this.ao.a(bH), 16, $$0));
   }

   public boolean z() {
      return (this.ao.a(bH) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(ke $$0) {
      this.ch = $$0;
      this.ao.a(bI, $$0);
   }

   public void b(ke $$0) {
      this.ci = $$0;
      this.ao.a(bJ, $$0);
   }

   public void c(ke $$0) {
      this.cj = $$0;
      this.ao.a(bK, $$0);
   }

   public void d(ke $$0) {
      this.ck = $$0;
      this.ao.a(bL, $$0);
   }

   public void e(ke $$0) {
      this.cl = $$0;
      this.ao.a(bM, $$0);
   }

   public void f(ke $$0) {
      this.cm = $$0;
      this.ao.a(bN, $$0);
   }

   public ke A() {
      return this.ch;
   }

   public ke B() {
      return this.ci;
   }

   public ke C() {
      return this.cj;
   }

   public ke D() {
      return this.ck;
   }

   public ke E() {
      return this.cl;
   }

   public ke F() {
      return this.cm;
   }

   @Override
   public boolean bA() {
      return super.bA() && !this.z();
   }

   @Override
   public boolean u(bsq $$0) {
      return $$0 instanceof cmv && !this.dQ().a((cmv)$$0, this.dq());
   }

   @Override
   public btf fr() {
      return btf.b;
   }

   @Override
   public btl.a eI() {
      return new btl.a(avo.aB, avo.aB);
   }

   @Nullable
   @Override
   protected avn d(brj $$0) {
      return avo.aC;
   }

   @Nullable
   @Override
   protected avn n_() {
      return avo.aA;
   }

   @Override
   public void a(aqt $$0, btk $$1) {
   }

   @Override
   public boolean fD() {
      return false;
   }

   @Override
   public void a(ajv<?> $$0) {
      if (bH.equals($$0)) {
         this.i_();
         this.J = !this.z();
      }

      super.a($$0);
   }

   @Override
   public boolean fE() {
      return false;
   }

   @Override
   public bst e(bty $$0) {
      return this.v(this.z());
   }

   private bst v(boolean $$0) {
      if ($$0) {
         return bW;
      } else {
         return this.o_() ? bX : this.am().n();
      }
   }

   @Override
   public eww l(float $$0) {
      if (this.z()) {
         ewr $$1 = this.v(false).a(this.do());
         jd $$2 = this.dq();
         int $$3 = Integer.MIN_VALUE;

         for (jd $$4 : jd.c(jd.a($$1.a, $$1.b, $$1.c), jd.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dQ().a(ddd.b, $$4), this.dQ().a(ddd.a, $$4));
            if ($$5 == 15) {
               return eww.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return eww.b($$2);
      } else {
         return super.l($$0);
      }
   }

   @Override
   public cuo dD() {
      return new cuo(cur.uF);
   }

   @Override
   public boolean er() {
      return !this.ci() && !this.z();
   }
}
