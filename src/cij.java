import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cij extends btb {
   public static final int b = 5;
   private static final boolean bQ = true;
   private static final kb bR = new kb(0.0F, 0.0F, 0.0F);
   private static final kb bS = new kb(0.0F, 0.0F, 0.0F);
   private static final kb bT = new kb(-10.0F, 0.0F, -10.0F);
   private static final kb bU = new kb(-15.0F, 0.0F, 10.0F);
   private static final kb bV = new kb(-1.0F, 0.0F, -1.0F);
   private static final kb bW = new kb(1.0F, 0.0F, 1.0F);
   private static final bsj bX = bsj.c(0.0F, 0.0F);
   private static final bsj bY = bsm.d.n().a(0.5F).b(0.9875F);
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
   public static final ajp<Byte> bI = ajt.a(cij.class, ajr.a);
   public static final ajp<kb> bJ = ajt.a(cij.class, ajr.n);
   public static final ajp<kb> bK = ajt.a(cij.class, ajr.n);
   public static final ajp<kb> bL = ajt.a(cij.class, ajr.n);
   public static final ajp<kb> bM = ajt.a(cij.class, ajr.n);
   public static final ajp<kb> bN = ajt.a(cij.class, ajr.n);
   public static final ajp<kb> bO = ajt.a(cij.class, ajr.n);
   private static final Predicate<bsg> cd = $$0 -> $$0 instanceof cof && ((cof)$$0).v() == cof.a.a;
   private final js<cuc> ce = js.a(2, cuc.l);
   private final js<cuc> cf = js.a(4, cuc.l);
   private boolean cg;
   public long bP;
   private int ch;
   private kb ci = bR;
   private kb cj = bS;
   private kb ck = bT;
   private kb cl = bU;
   private kb cm = bV;
   private kb cn = bW;

   public cij(bsm<? extends cij> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cij(dcf $$0, double $$1, double $$2, double $$3) {
      this(bsm.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bui.a s() {
      return dW().a(buj.B, 0.0);
   }

   @Override
   public void j_() {
      double $$0 = this.dv();
      double $$1 = this.dx();
      double $$2 = this.dB();
      super.j_();
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
   public Iterable<cuc> eX() {
      return this.ce;
   }

   @Override
   public Iterable<cuc> eW() {
      return this.cf;
   }

   @Override
   public cuc a(bsn $$0) {
      switch ($$0.a()) {
         case a:
            return this.ce.get($$0.b());
         case b:
            return this.cf.get($$0.b());
         default:
            return cuc.l;
      }
   }

   @Override
   public boolean d(bsn $$0) {
      return $$0 != bsn.g;
   }

   @Override
   public void a(bsn $$0, cuc $$1) {
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
   public boolean f(cuc $$0) {
      bsn $$1 = btd.h($$0);
      return this.a($$1).e() && !this.f($$1);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      ud $$1 = new ud();

      for (cuc $$2 : this.cf) {
         $$1.add($$2.b(this.dS()));
      }

      $$0.a("ArmorItems", $$1);
      ud $$3 = new ud();

      for (cuc $$4 : this.ce) {
         $$3.add($$4.b(this.dS()));
      }

      $$0.a("HandItems", $$3);
      $$0.a("Invisible", this.ci());
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
            this.cf.set($$2, cuc.a(this.dS(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         ud $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.ce.size(); $$5++) {
            tx $$6 = $$4.a($$5);
            this.ce.set($$5, cuc.a(this.dS(), $$6));
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
   public boolean bB() {
      return false;
   }

   @Override
   protected void E(bsg $$0) {
   }

   @Override
   protected void q() {
      for (bsg $$1 : this.dQ().a(this, this.cL(), cd)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bqg a(cmk $$0, ewf $$1, bqf $$2) {
      cuc $$3 = $$0.b($$2);
      if (this.z() || $$3.a(cuf.uL)) {
         return bqg.e;
      } else if ($$0.N_()) {
         return bqg.a;
      } else if ($$0.dQ().B) {
         return bqg.c;
      } else {
         bsn $$4 = btd.h($$3);
         if ($$3.e()) {
            bsn $$5 = this.l($$1);
            bsn $$6 = this.f($$5) ? $$4 : $$5;
            if (this.c($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bqg.a;
            }
         } else {
            if (this.f($$4)) {
               return bqg.f;
            }

            if ($$4.a() == bsn.a.a && !this.v()) {
               return bqg.f;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bqg.a;
            }
         }

         return bqg.e;
      }
   }

   private bsn l(ewf $$0) {
      bsn $$1 = bsn.a;
      boolean $$2 = this.u();
      double $$3 = $$0.d / (double)(this.ec() * this.eb());
      bsn $$4 = bsn.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.c($$4)) {
         $$1 = bsn.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.c(bsn.e)) {
         $$1 = bsn.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.c(bsn.d)) {
         $$1 = bsn.d;
      } else if ($$3 >= 1.6 && this.c(bsn.f)) {
         $$1 = bsn.f;
      } else if (!this.c(bsn.a) && this.c(bsn.b)) {
         $$1 = bsn.b;
      }

      return $$1;
   }

   private boolean f(bsn $$0) {
      return (this.ch & 1 << $$0.d()) != 0 || $$0.a() == bsn.a.a && !this.v();
   }

   private boolean a(cmk $$0, bsn $$1, cuc $$2, bqf $$3) {
      cuc $$4 = this.a($$1);
      if (!$$4.e() && (this.ch & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.e() && (this.ch & 1 << $$1.d() + 16) != 0) {
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
   public boolean a(bqz $$0, float $$1) {
      if (this.dQ().B || this.dL()) {
         return false;
      } else if ($$0.a(avy.e)) {
         this.ao();
         return false;
      } else if (this.b($$0) || this.cg || this.z()) {
         return false;
      } else if ($$0.a(avy.m)) {
         this.i($$0);
         this.ao();
         return false;
      } else if ($$0.a(avy.v)) {
         if (this.bR()) {
            this.g($$0, 0.15F);
         } else {
            this.d(5.0F);
         }

         return false;
      } else if ($$0.a(avy.w) && this.ex() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(avy.C);
         boolean $$3 = $$0.a(avy.B);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof cmk $$4 && !$$4.ga().e) {
               return false;
            }

            if ($$0.g()) {
               this.M();
               this.K();
               this.ao();
               return true;
            } else {
               long $$5 = this.dQ().Z();
               if ($$5 - this.bP > 5L && !$$3) {
                  this.dQ().a(this, (byte)32);
                  this.a(dxg.o, $$0.d());
                  this.bP = $$5;
               } else {
                  this.h($$0);
                  this.K();
                  this.ao();
               }

               return true;
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 32) {
         if (this.dQ().B) {
            this.dQ().a(this.dv(), this.dx(), this.dB(), avh.aC, this.df(), 0.3F, 1.0F, false);
            this.bP = this.dQ().Z();
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

   private void K() {
      if (this.dQ() instanceof aqm) {
         ((aqm)this.dQ())
            .a(
               new lb(lj.b, dfj.n.o()),
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

   private void g(bqz $$0, float $$1) {
      float $$2 = this.ex();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.ao();
      } else {
         this.u($$2);
         this.a(dxg.o, $$0.d());
      }
   }

   private void h(bqz $$0) {
      cuc $$1 = new cuc(cuf.uF);
      $$1.b(kn.g, this.ai());
      dfh.a(this.dQ(), this.dq(), $$1);
      this.i($$0);
   }

   private void i(bqz $$0) {
      this.M();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.ce.size(); $$1++) {
         cuc $$2 = this.ce.get($$1);
         if (!$$2.e()) {
            dfh.a(this.dQ(), this.dq().c(), $$2);
            this.ce.set($$1, cuc.l);
         }
      }

      for (int $$3 = 0; $$3 < this.cf.size(); $$3++) {
         cuc $$4 = this.cf.get($$3);
         if (!$$4.e()) {
            dfh.a(this.dQ(), this.dq().c(), $$4);
            this.cf.set($$3, cuc.l);
         }
      }
   }

   private void M() {
      this.dQ().a(null, this.dv(), this.dx(), this.dB(), avh.aA, this.df(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aZ = this.O;
      this.aY = this.dG();
      return 0.0F;
   }

   @Override
   public void a(ewf $$0) {
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
   public void ao() {
      this.a(bsg.c.a);
      this.a(dxg.p);
   }

   @Override
   public boolean a(dbx $$0) {
      return this.ci();
   }

   @Override
   public eom k_() {
      return this.z() ? eom.d : super.k_();
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
   public boolean bA() {
      return super.bA() && !this.z();
   }

   @Override
   public boolean u(bsg $$0) {
      return $$0 instanceof cmk && !this.dQ().a((cmk)$$0, this.dq());
   }

   @Override
   public bsv fr() {
      return bsv.b;
   }

   @Override
   public btb.a eI() {
      return new btb.a(avh.aB, avh.aB);
   }

   @Nullable
   @Override
   protected avg d(bqz $$0) {
      return avh.aC;
   }

   @Nullable
   @Override
   protected avg o_() {
      return avh.aA;
   }

   @Override
   public void a(aqm $$0, bta $$1) {
   }

   @Override
   public boolean fD() {
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
   public boolean fE() {
      return false;
   }

   @Override
   public bsj e(btn $$0) {
      return this.v(this.z());
   }

   private bsj v(boolean $$0) {
      if ($$0) {
         return bX;
      } else {
         return this.p_() ? bY : this.al().n();
      }
   }

   @Override
   public ewf l(float $$0) {
      if (this.z()) {
         ewa $$1 = this.v(false).a(this.do());
         ja $$2 = this.dq();
         int $$3 = Integer.MIN_VALUE;

         for (ja $$4 : ja.c(ja.a($$1.a, $$1.b, $$1.c), ja.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dQ().a(dco.b, $$4), this.dQ().a(dco.a, $$4));
            if ($$5 == 15) {
               return ewf.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return ewf.b($$2);
      } else {
         return super.l($$0);
      }
   }

   @Override
   public cuc dD() {
      return new cuc(cuf.uF);
   }

   @Override
   public boolean er() {
      return !this.ci() && !this.z();
   }
}
