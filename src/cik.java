import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cik extends btc {
   public static final int b = 5;
   private static final boolean bQ = true;
   private static final kb bR = new kb(0.0F, 0.0F, 0.0F);
   private static final kb bS = new kb(0.0F, 0.0F, 0.0F);
   private static final kb bT = new kb(-10.0F, 0.0F, -10.0F);
   private static final kb bU = new kb(-15.0F, 0.0F, 10.0F);
   private static final kb bV = new kb(-1.0F, 0.0F, -1.0F);
   private static final kb bW = new kb(1.0F, 0.0F, 1.0F);
   private static final bsk bX = bsk.c(0.0F, 0.0F);
   private static final bsk bY = bsn.d.n().a(0.5F).b(0.9875F);
   private static final double bZ = 0.1;
   private static final double ca = 0.9;
   private static final double cb = 0.4;
   private static final double cc = 1.6;
   public static final int c = 8;
   public static final int d = 16;
   public static final int e = 1;
   public static final int f = 4;
   public static final int g = 8;
   public static final int h = 16;
   public static final ajp<Byte> bI = ajt.a(cik.class, ajr.a);
   public static final ajp<kb> bJ = ajt.a(cik.class, ajr.n);
   public static final ajp<kb> bK = ajt.a(cik.class, ajr.n);
   public static final ajp<kb> bL = ajt.a(cik.class, ajr.n);
   public static final ajp<kb> bM = ajt.a(cik.class, ajr.n);
   public static final ajp<kb> bN = ajt.a(cik.class, ajr.n);
   public static final ajp<kb> bO = ajt.a(cik.class, ajr.n);
   private static final Predicate<bsh> cd = $$0 -> $$0 instanceof cog && ((cog)$$0).v() == cog.a.a;
   private final js<cud> ce = js.a(2, cud.l);
   private final js<cud> cf = js.a(4, cud.l);
   private boolean cg;
   public long bP;
   private int ch;
   private kb ci = bR;
   private kb cj = bS;
   private kb ck = bT;
   private kb cl = bU;
   private kb cm = bV;
   private kb cn = bW;

   public cik(bsn<? extends cik> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cik(dcg $$0, double $$1, double $$2, double $$3) {
      this(bsn.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static buj.a s() {
      return dX().a(buk.B, 0.0);
   }

   @Override
   public void i_() {
      double $$0 = this.dw();
      double $$1 = this.dy();
      double $$2 = this.dC();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   private boolean H() {
      return !this.z() && !this.aZ();
   }

   @Override
   public boolean dd() {
      return super.dd() && this.H();
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
   public Iterable<cud> eY() {
      return this.ce;
   }

   @Override
   public Iterable<cud> eX() {
      return this.cf;
   }

   @Override
   public cud a(bso $$0) {
      switch ($$0.a()) {
         case a:
            return this.ce.get($$0.b());
         case b:
            return this.cf.get($$0.b());
         default:
            return cud.l;
      }
   }

   @Override
   public boolean d(bso $$0) {
      return $$0 != bso.g;
   }

   @Override
   public void a(bso $$0, cud $$1) {
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
   public boolean f(cud $$0) {
      bso $$1 = this.h($$0);
      return this.a($$1).e() && !this.e($$1);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      ud $$1 = new ud();

      for (cud $$2 : this.cf) {
         $$1.add($$2.b(this.dT()));
      }

      $$0.a("ArmorItems", $$1);
      ud $$3 = new ud();

      for (cud $$4 : this.ce) {
         $$3.add($$4.b(this.dT()));
      }

      $$0.a("HandItems", $$3);
      $$0.a("Invisible", this.cj());
      $$0.a("Small", this.t());
      $$0.a("ShowArms", this.v());
      $$0.a("DisabledSlots", this.ch);
      $$0.a("NoBasePlate", this.x());
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
            this.cf.set($$2, cud.a(this.dT(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         ud $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.ce.size(); $$5++) {
            tx $$6 = $$4.a($$5);
            this.ce.set($$5, cud.a(this.dT(), $$6));
         }
      }

      this.l($$0.q("Invisible"));
      this.c($$0.q("Small"));
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
   public boolean bC() {
      return false;
   }

   @Override
   protected void E(bsh $$0) {
   }

   @Override
   protected void r() {
      for (bsh $$1 : this.dR().a(this, this.cM(), cd)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bqh a(cml $$0, ewh $$1, bqg $$2) {
      cud $$3 = $$0.b($$2);
      if (this.z() || $$3.a(cug.uL)) {
         return bqh.e;
      } else if ($$0.N_()) {
         return bqh.a;
      } else if ($$0.dR().B) {
         return bqh.c;
      } else {
         bso $$4 = this.h($$3);
         if ($$3.e()) {
            bso $$5 = this.b($$1);
            bso $$6 = this.e($$5) ? $$4 : $$5;
            if (this.c($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bqh.a;
            }
         } else {
            if (this.e($$4)) {
               return bqh.f;
            }

            if ($$4.a() == bso.a.a && !this.v()) {
               return bqh.f;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bqh.a;
            }
         }

         return bqh.e;
      }
   }

   private bso b(ewh $$0) {
      bso $$1 = bso.a;
      boolean $$2 = this.t();
      double $$3 = $$0.d / (double)(this.ed() * this.ec());
      bso $$4 = bso.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.c($$4)) {
         $$1 = bso.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.c(bso.e)) {
         $$1 = bso.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.c(bso.d)) {
         $$1 = bso.d;
      } else if ($$3 >= 1.6 && this.c(bso.f)) {
         $$1 = bso.f;
      } else if (!this.c(bso.a) && this.c(bso.b)) {
         $$1 = bso.b;
      }

      return $$1;
   }

   private boolean e(bso $$0) {
      return (this.ch & 1 << $$0.d()) != 0 || $$0.a() == bso.a.a && !this.v();
   }

   private boolean a(cml $$0, bso $$1, cud $$2, bqg $$3) {
      cud $$4 = this.a($$1);
      if (!$$4.e() && (this.ch & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.e() && (this.ch & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fN() && $$4.e() && !$$2.e()) {
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
   public boolean a(bra $$0, float $$1) {
      if (this.dM()) {
         return false;
      } else if (this.dR() instanceof aqm $$2) {
         if ($$0.a(avy.e)) {
            this.ap();
            return false;
         } else if (this.b($$0) || this.cg || this.z()) {
            return false;
         } else if ($$0.a(avy.m)) {
            this.c($$2, $$0);
            this.ap();
            return false;
         } else if ($$0.a(avy.v)) {
            if (this.bS()) {
               this.a($$2, $$0, 0.15F);
            } else {
               this.d(5.0F);
            }

            return false;
         } else if ($$0.a(avy.w) && this.ey() > 0.5F) {
            this.a($$2, $$0, 4.0F);
            return false;
         } else {
            boolean $$4 = $$0.a(avy.C);
            boolean $$5 = $$0.a(avy.B);
            if (!$$4 && !$$5) {
               return false;
            } else {
               if ($$0.d() instanceof cml $$6 && !$$6.gb().e) {
                  return false;
               }

               if ($$0.g()) {
                  this.L();
                  this.J();
                  this.ap();
                  return true;
               } else {
                  long $$7 = $$2.Z();
                  if ($$7 - this.bP > 5L && !$$5) {
                     $$2.a(this, (byte)32);
                     this.a(dxh.o, $$0.d());
                     this.bP = $$7;
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
         if (this.dR().B) {
            this.dR().a(this.dw(), this.dy(), this.dC(), avh.aC, this.dg(), 0.3F, 1.0F, false);
            this.bP = this.dR().Z();
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cM().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void J() {
      if (this.dR() instanceof aqm) {
         ((aqm)this.dR())
            .a(
               new lb(lj.b, dfk.n.o()),
               this.dw(),
               this.e(0.6666666666666666),
               this.dC(),
               10,
               (double)(this.dl() / 4.0F),
               (double)(this.dm() / 4.0F),
               (double)(this.dl() / 4.0F),
               0.05
            );
      }
   }

   private void a(aqm $$0, bra $$1, float $$2) {
      float $$3 = this.ey();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.c($$0, $$1);
         this.ap();
      } else {
         this.u($$3);
         this.a(dxh.o, $$1.d());
      }
   }

   private void b(aqm $$0, bra $$1) {
      cud $$2 = new cud(cug.uF);
      $$2.b(kn.g, this.aj());
      dfi.a(this.dR(), this.dr(), $$2);
      this.c($$0, $$1);
   }

   private void c(aqm $$0, bra $$1) {
      this.L();
      this.a($$0, $$1);

      for (int $$2 = 0; $$2 < this.ce.size(); $$2++) {
         cud $$3 = this.ce.get($$2);
         if (!$$3.e()) {
            dfi.a(this.dR(), this.dr().c(), $$3);
            this.ce.set($$2, cud.l);
         }
      }

      for (int $$4 = 0; $$4 < this.cf.size(); $$4++) {
         cud $$5 = this.cf.get($$4);
         if (!$$5.e()) {
            dfi.a(this.dR(), this.dr().c(), $$5);
            this.cf.set($$4, cud.l);
         }
      }
   }

   private void L() {
      this.dR().a(null, this.dw(), this.dy(), this.dC(), avh.aA, this.dg(), 1.0F, 1.0F);
   }

   @Override
   protected float f(float $$0, float $$1) {
      this.ba = this.O;
      this.aZ = this.dH();
      return 0.0F;
   }

   @Override
   public void a(ewh $$0) {
      if (this.H()) {
         super.a($$0);
      }
   }

   @Override
   public void p(float $$0) {
      this.ba = this.O = $$0;
      this.bc = this.bb = $$0;
   }

   @Override
   public void o(float $$0) {
      this.ba = this.O = $$0;
      this.bc = this.bb = $$0;
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
   protected void K() {
      this.l(this.cg);
   }

   @Override
   public void l(boolean $$0) {
      this.cg = $$0;
      super.l($$0);
   }

   @Override
   public boolean o_() {
      return this.t();
   }

   @Override
   public void ap() {
      this.a(bsh.d.a);
      this.a(dxh.p);
   }

   @Override
   public boolean a(dby $$0) {
      return this.cj();
   }

   @Override
   public eoo j_() {
      return this.z() ? eoo.d : super.j_();
   }

   @Override
   public boolean r_() {
      return this.z();
   }

   private void c(boolean $$0) {
      this.ao.a(bI, this.a(this.ao.a(bI), 1, $$0));
   }

   public boolean t() {
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

   public boolean x() {
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

   public kb F() {
      return this.cn;
   }

   @Override
   public boolean bB() {
      return super.bB() && !this.z();
   }

   @Override
   public boolean u(bsh $$0) {
      return $$0 instanceof cml && !this.dR().a((cml)$$0, this.dr());
   }

   @Override
   public bsw fs() {
      return bsw.b;
   }

   @Override
   public btc.a eJ() {
      return new btc.a(avh.aB, avh.aB);
   }

   @Nullable
   @Override
   protected avg d(bra $$0) {
      return avh.aC;
   }

   @Nullable
   @Override
   protected avg n_() {
      return avh.aA;
   }

   @Override
   public void a(aqm $$0, btb $$1) {
   }

   @Override
   public boolean fE() {
      return false;
   }

   @Override
   public void a(ajp<?> $$0) {
      if (bI.equals($$0)) {
         this.i_();
         this.J = !this.z();
      }

      super.a($$0);
   }

   @Override
   public boolean fF() {
      return false;
   }

   @Override
   public bsk e(bto $$0) {
      return this.v(this.z());
   }

   private bsk v(boolean $$0) {
      if ($$0) {
         return bX;
      } else {
         return this.o_() ? bY : this.am().n();
      }
   }

   @Override
   public ewh l(float $$0) {
      if (this.z()) {
         ewc $$1 = this.v(false).a(this.dp());
         ja $$2 = this.dr();
         int $$3 = Integer.MIN_VALUE;

         for (ja $$4 : ja.c(ja.a($$1.a, $$1.b, $$1.c), ja.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dR().a(dcp.b, $$4), this.dR().a(dcp.a, $$4));
            if ($$5 == 15) {
               return ewh.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return ewh.b($$2);
      } else {
         return super.l($$0);
      }
   }

   @Override
   public cud dE() {
      return new cud(cug.uF);
   }

   @Override
   public boolean es() {
      return !this.cj() && !this.z();
   }
}
