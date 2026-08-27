import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chw extends bso {
   public static final int b = 5;
   private static final boolean bO = true;
   private static final jp bP = new jp(0.0F, 0.0F, 0.0F);
   private static final jp bQ = new jp(0.0F, 0.0F, 0.0F);
   private static final jp bR = new jp(-10.0F, 0.0F, -10.0F);
   private static final jp bS = new jp(-15.0F, 0.0F, 10.0F);
   private static final jp bT = new jp(-1.0F, 0.0F, -1.0F);
   private static final jp bU = new jp(1.0F, 0.0F, 1.0F);
   private static final brx bV = brx.c(0.0F, 0.0F);
   private static final brx bW = bsa.d.n().a(0.5F).b(0.9875F);
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
   public static final ajr<Byte> bG = ajv.a(chw.class, ajt.a);
   public static final ajr<jp> bH = ajv.a(chw.class, ajt.n);
   public static final ajr<jp> bI = ajv.a(chw.class, ajt.n);
   public static final ajr<jp> bJ = ajv.a(chw.class, ajt.n);
   public static final ajr<jp> bK = ajv.a(chw.class, ajt.n);
   public static final ajr<jp> bL = ajv.a(chw.class, ajt.n);
   public static final ajr<jp> bM = ajv.a(chw.class, ajt.n);
   private static final Predicate<bru> cb = $$0 -> $$0 instanceof cnr && ((cnr)$$0).v() == cnr.a.a;
   private final jg<cto> cc = jg.a(2, cto.i);
   private final jg<cto> cd = jg.a(4, cto.i);
   private boolean ce;
   public long bN;
   private int cf;
   private jp cg = bP;
   private jp ch = bQ;
   private jp ci = bR;
   private jp cj = bS;
   private jp ck = bT;
   private jp cl = bU;

   public chw(bsa<? extends chw> $$0, dax $$1) {
      super($$0, $$1);
   }

   public chw(dax $$0, double $$1, double $$2, double $$3) {
      this(bsa.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static btv.a s() {
      return dU().a(btw.v, 0.0);
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
   protected void a(ajv.a $$0) {
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
   public Iterable<cto> fa() {
      return this.cc;
   }

   @Override
   public Iterable<cto> eZ() {
      return this.cd;
   }

   @Override
   public cto a(bsb $$0) {
      switch ($$0.a()) {
         case a:
            return this.cc.get($$0.b());
         case b:
            return this.cd.get($$0.b());
         default:
            return cto.i;
      }
   }

   @Override
   public boolean d(bsb $$0) {
      return $$0 != bsb.g;
   }

   @Override
   public void a(bsb $$0, cto $$1) {
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
   public boolean f(cto $$0) {
      bsb $$1 = bsq.h($$0);
      return this.a($$1).e() && !this.f($$1);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      uj $$1 = new uj();

      for (cto $$2 : this.cd) {
         $$1.add($$2.b(this.dR()));
      }

      $$0.a("ArmorItems", $$1);
      uj $$3 = new uj();

      for (cto $$4 : this.cc) {
         $$3.add($$4.b(this.dR()));
      }

      $$0.a("HandItems", $$3);
      $$0.a("Invisible", this.ch());
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
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         uj $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cd.size(); $$2++) {
            ud $$3 = $$1.a($$2);
            this.cd.set($$2, cto.a(this.dR(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         uj $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.cc.size(); $$5++) {
            ud $$6 = $$4.a($$5);
            this.cc.set($$5, cto.a(this.dR(), $$6));
         }
      }

      this.k($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cf = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.ag = !this.H();
      ud $$7 = $$0.p("Pose");
      this.c($$7);
   }

   private void c(ud $$0) {
      uj $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bP : new jp($$1));
      uj $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bQ : new jp($$2));
      uj $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bR : new jp($$3));
      uj $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bS : new jp($$4));
      uj $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bT : new jp($$5));
      uj $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bU : new jp($$6));
   }

   private ud I() {
      ud $$0 = new ud();
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
   public boolean bA() {
      return false;
   }

   @Override
   protected void D(bru $$0) {
   }

   @Override
   protected void q() {
      for (bru $$1 : this.dP().a(this, this.cK(), cb)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bpu a(clw $$0, euk $$1, bpt $$2) {
      cto $$3 = $$0.b($$2);
      if (this.z() || $$3.a(ctr.uL)) {
         return bpu.d;
      } else if ($$0.N_()) {
         return bpu.a;
      } else if ($$0.dP().B) {
         return bpu.b;
      } else {
         bsb $$4 = bsq.h($$3);
         if ($$3.e()) {
            bsb $$5 = this.j($$1);
            bsb $$6 = this.f($$5) ? $$4 : $$5;
            if (this.c($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bpu.a;
            }
         } else {
            if (this.f($$4)) {
               return bpu.e;
            }

            if ($$4.a() == bsb.a.a && !this.v()) {
               return bpu.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bpu.a;
            }
         }

         return bpu.d;
      }
   }

   private bsb j(euk $$0) {
      bsb $$1 = bsb.a;
      boolean $$2 = this.u();
      double $$3 = $$0.d / (double)(this.ee() * this.ed());
      bsb $$4 = bsb.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.c($$4)) {
         $$1 = bsb.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.c(bsb.e)) {
         $$1 = bsb.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.c(bsb.d)) {
         $$1 = bsb.d;
      } else if ($$3 >= 1.6 && this.c(bsb.f)) {
         $$1 = bsb.f;
      } else if (!this.c(bsb.a) && this.c(bsb.b)) {
         $$1 = bsb.b;
      }

      return $$1;
   }

   private boolean f(bsb $$0) {
      return (this.cf & 1 << $$0.d()) != 0 || $$0.a() == bsb.a.a && !this.v();
   }

   private boolean a(clw $$0, bsb $$1, cto $$2, bpt $$3) {
      cto $$4 = this.a($$1);
      if (!$$4.e() && (this.cf & 1 << $$1.d() + 8) != 0) {
         return false;
      } else if ($$4.e() && (this.cf & 1 << $$1.d() + 16) != 0) {
         return false;
      } else if ($$0.fP() && $$4.e() && !$$2.e()) {
         this.a($$1, $$2.c(1));
         return true;
      } else if ($$2.e() || $$2.I() <= 1) {
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
   public boolean a(bqn $$0, float $$1) {
      if (this.dP().B || this.dK()) {
         return false;
      } else if ($$0.a(avy.e)) {
         this.an();
         return false;
      } else if (this.b($$0) || this.ce || this.z()) {
         return false;
      } else if ($$0.a(avy.m)) {
         this.i($$0);
         this.an();
         return false;
      } else if ($$0.a(avy.v)) {
         if (this.bQ()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(avy.w) && this.eA() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(avy.C);
         boolean $$3 = $$0.a(avy.B);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof clw $$4 && !$$4.gd().e) {
               return false;
            }

            if ($$0.g()) {
               this.M();
               this.K();
               this.an();
               return true;
            } else {
               long $$5 = this.dP().Y();
               if ($$5 - this.bN > 5L && !$$3) {
                  this.dP().a(this, (byte)32);
                  this.a(dvu.o, $$0.d());
                  this.bN = $$5;
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
            this.dP().a(this.du(), this.dw(), this.dA(), avh.aC, this.de(), 0.3F, 1.0F, false);
            this.bN = this.dP().Y();
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
      if (this.dP() instanceof aqm) {
         ((aqm)this.dP())
            .a(
               new kp(ky.b, dea.n.n()),
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

   private void g(bqn $$0, float $$1) {
      float $$2 = this.eA();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.an();
      } else {
         this.t($$2);
         this.a(dvu.o, $$0.d());
      }
   }

   private void h(bqn $$0) {
      cto $$1 = new cto(ctr.uF);
      $$1.b(kb.f, this.ah());
      ddy.a(this.dP(), this.dp(), $$1);
      this.i($$0);
   }

   private void i(bqn $$0) {
      this.M();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.cc.size(); $$1++) {
         cto $$2 = this.cc.get($$1);
         if (!$$2.e()) {
            ddy.a(this.dP(), this.dp().c(), $$2);
            this.cc.set($$1, cto.i);
         }
      }

      for (int $$3 = 0; $$3 < this.cd.size(); $$3++) {
         cto $$4 = this.cd.get($$3);
         if (!$$4.e()) {
            ddy.a(this.dP(), this.dp().c(), $$4);
            this.cd.set($$3, cto.i);
         }
      }
   }

   private void M() {
      this.dP().a(null, this.du(), this.dw(), this.dA(), avh.aA, this.de(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.ba = this.O;
      this.aZ = this.dF();
      return 0.0F;
   }

   @Override
   public void a(euk $$0) {
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
      jp $$0 = this.ao.a(bH);
      if (!this.cg.equals($$0)) {
         this.a($$0);
      }

      jp $$1 = this.ao.a(bI);
      if (!this.ch.equals($$1)) {
         this.b($$1);
      }

      jp $$2 = this.ao.a(bJ);
      if (!this.ci.equals($$2)) {
         this.c($$2);
      }

      jp $$3 = this.ao.a(bK);
      if (!this.cj.equals($$3)) {
         this.d($$3);
      }

      jp $$4 = this.ao.a(bL);
      if (!this.ck.equals($$4)) {
         this.e($$4);
      }

      jp $$5 = this.ao.a(bM);
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
   public void an() {
      this.a(bru.c.a);
      this.a(dvu.p);
   }

   @Override
   public boolean a(dap $$0) {
      return this.ch();
   }

   @Override
   public emz k_() {
      return this.z() ? emz.d : super.k_();
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

   public void a(jp $$0) {
      this.cg = $$0;
      this.ao.a(bH, $$0);
   }

   public void b(jp $$0) {
      this.ch = $$0;
      this.ao.a(bI, $$0);
   }

   public void c(jp $$0) {
      this.ci = $$0;
      this.ao.a(bJ, $$0);
   }

   public void d(jp $$0) {
      this.cj = $$0;
      this.ao.a(bK, $$0);
   }

   public void e(jp $$0) {
      this.ck = $$0;
      this.ao.a(bL, $$0);
   }

   public void f(jp $$0) {
      this.cl = $$0;
      this.ao.a(bM, $$0);
   }

   public jp A() {
      return this.cg;
   }

   public jp B() {
      return this.ch;
   }

   public jp C() {
      return this.ci;
   }

   public jp D() {
      return this.cj;
   }

   public jp E() {
      return this.ck;
   }

   public jp G() {
      return this.cl;
   }

   @Override
   public boolean bz() {
      return super.bz() && !this.z();
   }

   @Override
   public boolean u(bru $$0) {
      return $$0 instanceof clw && !this.dP().a((clw)$$0, this.dp());
   }

   @Override
   public bsi fu() {
      return bsi.b;
   }

   @Override
   public bso.a eL() {
      return new bso.a(avh.aB, avh.aB);
   }

   @Nullable
   @Override
   protected avg d(bqn $$0) {
      return avh.aC;
   }

   @Nullable
   @Override
   protected avg o_() {
      return avh.aA;
   }

   @Override
   public void a(aqm $$0, bsn $$1) {
   }

   @Override
   public boolean fG() {
      return false;
   }

   @Override
   public void a(ajr<?> $$0) {
      if (bG.equals($$0)) {
         this.j_();
         this.J = !this.z();
      }

      super.a($$0);
   }

   @Override
   public boolean fH() {
      return false;
   }

   @Override
   public brx e(bta $$0) {
      return this.v(this.z());
   }

   private brx v(boolean $$0) {
      if ($$0) {
         return bV;
      } else {
         return this.p_() ? bW : this.ak().n();
      }
   }

   @Override
   public euk k(float $$0) {
      if (this.z()) {
         euf $$1 = this.v(false).a(this.dn());
         io $$2 = this.dp();
         int $$3 = Integer.MIN_VALUE;

         for (io $$4 : io.c(io.a($$1.a, $$1.b, $$1.c), io.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dP().a(dbg.b, $$4), this.dP().a(dbg.a, $$4));
            if ($$5 == 15) {
               return euk.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return euk.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public cto dC() {
      return new cto(ctr.uF);
   }

   @Override
   public boolean eu() {
      return !this.ch() && !this.z();
   }
}
