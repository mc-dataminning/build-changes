import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chh extends bsa {
   public static final int b = 5;
   private static final boolean bO = true;
   private static final jo bP = new jo(0.0F, 0.0F, 0.0F);
   private static final jo bQ = new jo(0.0F, 0.0F, 0.0F);
   private static final jo bR = new jo(-10.0F, 0.0F, -10.0F);
   private static final jo bS = new jo(-15.0F, 0.0F, 10.0F);
   private static final jo bT = new jo(-1.0F, 0.0F, -1.0F);
   private static final jo bU = new jo(1.0F, 0.0F, 1.0F);
   private static final brk bV = brk.c(0.0F, 0.0F);
   private static final brk bW = brn.d.n().a(0.5F).b(0.9875F);
   private static final double bX = 0.1;
   private static final double bY = 0.9;
   private static final double bZ = 0.4;
   private static final double ca = 1.6;
   public static final int c = 8;
   public static final int d = 16;
   public static final int e = 1;
   public static final int f = 4;
   public static final int g = 8;
   public static final int h = 16;
   public static final ajm<Byte> bG = ajq.a(chh.class, ajo.a);
   public static final ajm<jo> bH = ajq.a(chh.class, ajo.n);
   public static final ajm<jo> bI = ajq.a(chh.class, ajo.n);
   public static final ajm<jo> bJ = ajq.a(chh.class, ajo.n);
   public static final ajm<jo> bK = ajq.a(chh.class, ajo.n);
   public static final ajm<jo> bL = ajq.a(chh.class, ajo.n);
   public static final ajm<jo> bM = ajq.a(chh.class, ajo.n);
   private static final Predicate<brh> cb = $$0 -> $$0 instanceof cnc && ((cnc)$$0).v() == cnc.a.a;
   private final jf<csz> cc = jf.a(2, csz.i);
   private final jf<csz> cd = jf.a(4, csz.i);
   private boolean ce;
   public long bN;
   private int cf;
   private jo cg = bP;
   private jo ch = bQ;
   private jo ci = bR;
   private jo cj = bS;
   private jo ck = bT;
   private jo cl = bU;

   public chh(brn<? extends chh> $$0, dad $$1) {
      super($$0, $$1);
   }

   public chh(dad $$0, double $$1, double $$2, double $$3) {
      this(brn.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static btg.a r() {
      return dS().a(bth.v, 0.0);
   }

   @Override
   public void j_() {
      double $$0 = this.ds();
      double $$1 = this.du();
      double $$2 = this.dy();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   private boolean H() {
      return !this.z() && !this.aV();
   }

   @Override
   public boolean cZ() {
      return super.cZ() && this.H();
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(bG, (byte)0);
      $$0.a(bH, bP);
      $$0.a(bI, bQ);
      $$0.a(bJ, bR);
      $$0.a(bK, bS);
      $$0.a(bL, bT);
      $$0.a(bM, bU);
   }

   @Override
   public Iterable<csz> eY() {
      return this.cc;
   }

   @Override
   public Iterable<csz> eX() {
      return this.cd;
   }

   @Override
   public csz d(bro $$0) {
      switch ($$0.a()) {
         case a:
            return this.cc.get($$0.b());
         case b:
            return this.cd.get($$0.b());
         default:
            return csz.i;
      }
   }

   @Override
   public boolean c(bro $$0) {
      return $$0 != bro.g;
   }

   @Override
   public void a(bro $$0, csz $$1) {
      this.e($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.cc.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cd.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   public boolean f(csz $$0) {
      bro $$1 = bsc.h($$0);
      return this.d($$1).d() && !this.f($$1);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      ug $$1 = new ug();

      for (csz $$2 : this.cd) {
         $$1.add($$2.b(this.dP()));
      }

      $$0.a("ArmorItems", $$1);
      ug $$3 = new ug();

      for (csz $$4 : this.cc) {
         $$3.add($$4.b(this.dP()));
      }

      $$0.a("HandItems", $$3);
      $$0.a("Invisible", this.cf());
      $$0.a("Small", this.u());
      $$0.a("ShowArms", this.v());
      $$0.a("DisabledSlots", this.cf);
      $$0.a("NoBasePlate", this.y());
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

         for (int $$2 = 0; $$2 < this.cd.size(); $$2++) {
            ua $$3 = $$1.a($$2);
            this.cd.set($$2, csz.a(this.dP(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         ug $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.cc.size(); $$5++) {
            ua $$6 = $$4.a($$5);
            this.cc.set($$5, csz.a(this.dP(), $$6));
         }
      }

      this.k($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cf = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.ag = !this.H();
      ua $$7 = $$0.p("Pose");
      this.c($$7);
   }

   private void c(ua $$0) {
      ug $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bP : new jo($$1));
      ug $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bQ : new jo($$2));
      ug $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bR : new jo($$3));
      ug $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bS : new jo($$4));
      ug $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bT : new jo($$5));
      ug $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bU : new jo($$6));
   }

   private ua I() {
      ua $$0 = new ua();
      if (!bP.equals(this.cg)) {
         $$0.a("Head", this.cg.a());
      }

      if (!bQ.equals(this.ch)) {
         $$0.a("Body", this.ch.a());
      }

      if (!bR.equals(this.ci)) {
         $$0.a("LeftArm", this.ci.a());
      }

      if (!bS.equals(this.cj)) {
         $$0.a("RightArm", this.cj.a());
      }

      if (!bT.equals(this.ck)) {
         $$0.a("LeftLeg", this.ck.a());
      }

      if (!bU.equals(this.cl)) {
         $$0.a("RightLeg", this.cl.a());
      }

      return $$0;
   }

   @Override
   public boolean by() {
      return false;
   }

   @Override
   protected void D(brh $$0) {
   }

   @Override
   protected void q() {
      for (brh $$1 : this.dN().a(this, this.cI(), cb)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bpm a(clh $$0, etp $$1, bpl $$2) {
      csz $$3 = $$0.b($$2);
      if (this.z() || $$3.a(ctc.uL)) {
         return bpm.d;
      } else if ($$0.N_()) {
         return bpm.a;
      } else if ($$0.dN().B) {
         return bpm.b;
      } else {
         bro $$4 = bsc.h($$3);
         if ($$3.d()) {
            bro $$5 = this.j($$1);
            bro $$6 = this.f($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bpm.a;
            }
         } else {
            if (this.f($$4)) {
               return bpm.e;
            }

            if ($$4.a() == bro.a.a && !this.v()) {
               return bpm.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bpm.a;
            }
         }

         return bpm.d;
      }
   }

   private bro j(etp $$0) {
      bro $$1 = bro.a;
      boolean $$2 = this.u();
      double $$3 = $$0.d / (double)(this.ec() * this.eb());
      bro $$4 = bro.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = bro.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(bro.e)) {
         $$1 = bro.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(bro.d)) {
         $$1 = bro.d;
      } else if ($$3 >= 1.6 && this.b(bro.f)) {
         $$1 = bro.f;
      } else if (!this.b(bro.a) && this.b(bro.b)) {
         $$1 = bro.b;
      }

      return $$1;
   }

   private boolean f(bro $$0) {
      return (this.cf & 1 << $$0.d()) != 0 || $$0.a() == bro.a.a && !this.v();
   }

   private boolean a(clh $$0, bro $$1, csz $$2, bpl $$3) {
      csz $$4 = this.d($$1);
      if (!$$4.d() && (this.cf & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.d() && (this.cf & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fN() && $$4.d() && !$$2.d()) {
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
   public boolean a(bqf $$0, float $$1) {
      if (this.dN().B || this.dI()) {
         return false;
      } else if ($$0.a(avt.e)) {
         this.al();
         return false;
      } else if (this.b($$0) || this.ce || this.z()) {
         return false;
      } else if ($$0.a(avt.m)) {
         this.i($$0);
         this.al();
         return false;
      } else if ($$0.a(avt.v)) {
         if (this.bO()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(avt.w) && this.ey() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(avt.C);
         boolean $$3 = $$0.a(avt.B);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof clh $$4 && !$$4.gb().e) {
               return false;
            }

            if ($$0.g()) {
               this.M();
               this.K();
               this.al();
               return true;
            } else {
               long $$5 = this.dN().Y();
               if ($$5 - this.bN > 5L && !$$3) {
                  this.dN().a(this, (byte)32);
                  this.a(dva.o, $$0.d());
                  this.bN = $$5;
               } else {
                  this.h($$0);
                  this.K();
                  this.al();
               }

               return true;
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 32) {
         if (this.dN().B) {
            this.dN().a(this.ds(), this.du(), this.dy(), avc.aC, this.dc(), 0.3F, 1.0F, false);
            this.bN = this.dN().Y();
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cI().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void K() {
      if (this.dN() instanceof aqh) {
         ((aqh)this.dN())
            .a(
               new ko(kx.b, ddg.n.n()),
               this.ds(),
               this.e(0.6666666666666666),
               this.dy(),
               10,
               (double)(this.dh() / 4.0F),
               (double)(this.di() / 4.0F),
               (double)(this.dh() / 4.0F),
               0.05
            );
      }
   }

   private void g(bqf $$0, float $$1) {
      float $$2 = this.ey();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.al();
      } else {
         this.t($$2);
         this.a(dva.o, $$0.d());
      }
   }

   private void h(bqf $$0) {
      csz $$1 = new csz(ctc.uF);
      $$1.b(ka.f, this.af());
      dde.a(this.dN(), this.dn(), $$1);
      this.i($$0);
   }

   private void i(bqf $$0) {
      this.M();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.cc.size(); $$1++) {
         csz $$2 = this.cc.get($$1);
         if (!$$2.d()) {
            dde.a(this.dN(), this.dn().c(), $$2);
            this.cc.set($$1, csz.i);
         }
      }

      for (int $$3 = 0; $$3 < this.cd.size(); $$3++) {
         csz $$4 = this.cd.get($$3);
         if (!$$4.d()) {
            dde.a(this.dN(), this.dn().c(), $$4);
            this.cd.set($$3, csz.i);
         }
      }
   }

   private void M() {
      this.dN().a(null, this.ds(), this.du(), this.dy(), avc.aA, this.dc(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.ba = this.O;
      this.aZ = this.dD();
      return 0.0F;
   }

   @Override
   public void a(etp $$0) {
      if (this.H()) {
         super.a($$0);
      }
   }

   @Override
   public void o(float $$0) {
      this.ba = this.O = $$0;
      this.bc = this.bb = $$0;
   }

   @Override
   public void n(float $$0) {
      this.ba = this.O = $$0;
      this.bc = this.bb = $$0;
   }

   @Override
   public void l() {
      super.l();
      jo $$0 = this.ao.a(bH);
      if (!this.cg.equals($$0)) {
         this.a($$0);
      }

      jo $$1 = this.ao.a(bI);
      if (!this.ch.equals($$1)) {
         this.b($$1);
      }

      jo $$2 = this.ao.a(bJ);
      if (!this.ci.equals($$2)) {
         this.c($$2);
      }

      jo $$3 = this.ao.a(bK);
      if (!this.cj.equals($$3)) {
         this.d($$3);
      }

      jo $$4 = this.ao.a(bL);
      if (!this.ck.equals($$4)) {
         this.e($$4);
      }

      jo $$5 = this.ao.a(bM);
      if (!this.cl.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void J() {
      this.k(this.ce);
   }

   @Override
   public void k(boolean $$0) {
      this.ce = $$0;
      super.k($$0);
   }

   @Override
   public boolean p_() {
      return this.u();
   }

   @Override
   public void al() {
      this.a(brh.c.a);
      this.a(dva.p);
   }

   @Override
   public boolean a(czv $$0) {
      return this.cf();
   }

   @Override
   public emf k_() {
      return this.z() ? emf.d : super.k_();
   }

   @Override
   public boolean r_() {
      return this.z();
   }

   private void t(boolean $$0) {
      this.ao.a(bG, this.a(this.ao.a(bG), 1, $$0));
   }

   public boolean u() {
      return (this.ao.a(bG) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.ao.a(bG, this.a(this.ao.a(bG), 4, $$0));
   }

   @Override
   public boolean v() {
      return (this.ao.a(bG) & 4) != 0;
   }

   public void b(boolean $$0) {
      this.ao.a(bG, this.a(this.ao.a(bG), 8, $$0));
   }

   public boolean y() {
      return (this.ao.a(bG) & 8) != 0;
   }

   private void u(boolean $$0) {
      this.ao.a(bG, this.a(this.ao.a(bG), 16, $$0));
   }

   public boolean z() {
      return (this.ao.a(bG) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(jo $$0) {
      this.cg = $$0;
      this.ao.a(bH, $$0);
   }

   public void b(jo $$0) {
      this.ch = $$0;
      this.ao.a(bI, $$0);
   }

   public void c(jo $$0) {
      this.ci = $$0;
      this.ao.a(bJ, $$0);
   }

   public void d(jo $$0) {
      this.cj = $$0;
      this.ao.a(bK, $$0);
   }

   public void e(jo $$0) {
      this.ck = $$0;
      this.ao.a(bL, $$0);
   }

   public void f(jo $$0) {
      this.cl = $$0;
      this.ao.a(bM, $$0);
   }

   public jo A() {
      return this.cg;
   }

   public jo B() {
      return this.ch;
   }

   public jo C() {
      return this.ci;
   }

   public jo D() {
      return this.cj;
   }

   public jo E() {
      return this.ck;
   }

   public jo G() {
      return this.cl;
   }

   @Override
   public boolean bx() {
      return super.bx() && !this.z();
   }

   @Override
   public boolean u(brh $$0) {
      return $$0 instanceof clh && !this.dN().a((clh)$$0, this.dn());
   }

   @Override
   public bru fs() {
      return bru.b;
   }

   @Override
   public bsa.a eJ() {
      return new bsa.a(avc.aB, avc.aB);
   }

   @Nullable
   @Override
   protected avb d(bqf $$0) {
      return avc.aC;
   }

   @Nullable
   @Override
   protected avb o_() {
      return avc.aA;
   }

   @Override
   public void a(aqh $$0, brz $$1) {
   }

   @Override
   public boolean fE() {
      return false;
   }

   @Override
   public void a(ajm<?> $$0) {
      if (bG.equals($$0)) {
         this.j_();
         this.J = !this.z();
      }

      super.a($$0);
   }

   @Override
   public boolean fF() {
      return false;
   }

   @Override
   public brk e(bsl $$0) {
      return this.v(this.z());
   }

   private brk v(boolean $$0) {
      if ($$0) {
         return bV;
      } else {
         return this.p_() ? bW : this.ai().n();
      }
   }

   @Override
   public etp k(float $$0) {
      if (this.z()) {
         etk $$1 = this.v(false).a(this.dl());
         in $$2 = this.dn();
         int $$3 = Integer.MIN_VALUE;

         for (in $$4 : in.c(in.a($$1.a, $$1.b, $$1.c), in.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dN().a(dam.b, $$4), this.dN().a(dam.a, $$4));
            if ($$5 == 15) {
               return etp.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return etp.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public csz dA() {
      return new csz(ctc.uF);
   }

   @Override
   public boolean es() {
      return !this.cf() && !this.z();
   }
}
