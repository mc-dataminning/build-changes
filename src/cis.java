import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cis extends btk {
   public static final int b = 5;
   private static final boolean bO = true;
   private static final ka bP = new ka(0.0F, 0.0F, 0.0F);
   private static final ka bQ = new ka(0.0F, 0.0F, 0.0F);
   private static final ka bR = new ka(-10.0F, 0.0F, -10.0F);
   private static final ka bS = new ka(-15.0F, 0.0F, 10.0F);
   private static final ka bT = new ka(-1.0F, 0.0F, -1.0F);
   private static final ka bU = new ka(1.0F, 0.0F, 1.0F);
   private static final bss bV = bss.c(0.0F, 0.0F);
   private static final bss bW = bsv.d.n().a(0.5F).b(0.9875F);
   private static final double bX = 0.1;
   private static final double bY = 0.9;
   private static final double bZ = 0.4;
   private static final double ca = 1.6;
   public static final int c = 8;
   public static final int d = 16;
   public static final int e = 1;
   public static final int f = 4;
   public static final int g = 8;
   public static final int bF = 16;
   public static final akg<Byte> bG = akk.a(cis.class, aki.a);
   public static final akg<ka> bH = akk.a(cis.class, aki.n);
   public static final akg<ka> bI = akk.a(cis.class, aki.n);
   public static final akg<ka> bJ = akk.a(cis.class, aki.n);
   public static final akg<ka> bK = akk.a(cis.class, aki.n);
   public static final akg<ka> bL = akk.a(cis.class, aki.n);
   public static final akg<ka> bM = akk.a(cis.class, aki.n);
   private static final Predicate<bsp> cb = $$0 -> $$0 instanceof coo && ((coo)$$0).v() == coo.a.a;
   private final jr<cuk> cc = jr.a(2, cuk.l);
   private final jr<cuk> cd = jr.a(4, cuk.l);
   private boolean ce;
   public long bN;
   private int cf;
   private ka cg = bP;
   private ka ch = bQ;
   private ka ci = bR;
   private ka cj = bS;
   private ka ck = bT;
   private ka cl = bU;

   public cis(bsv<? extends cis> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public cis(dbt $$0, double $$1, double $$2, double $$3) {
      this(bsv.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bur.a s() {
      return dU().a(bus.v, 0.0);
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
   protected void a(akk.a $$0) {
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
   public Iterable<cuk> fa() {
      return this.cc;
   }

   @Override
   public Iterable<cuk> eZ() {
      return this.cd;
   }

   @Override
   public cuk a(bsw $$0) {
      switch ($$0.a()) {
         case a:
            return this.cc.get($$0.b());
         case b:
            return this.cd.get($$0.b());
         default:
            return cuk.l;
      }
   }

   @Override
   public boolean d(bsw $$0) {
      return $$0 != bsw.g;
   }

   @Override
   public void a(bsw $$0, cuk $$1) {
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
   public boolean f(cuk $$0) {
      bsw $$1 = btm.h($$0);
      return this.a($$1).e() && !this.f($$1);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      ux $$1 = new ux();

      for (cuk $$2 : this.cd) {
         $$1.add($$2.b(this.dR()));
      }

      $$0.a("ArmorItems", $$1);
      ux $$3 = new ux();

      for (cuk $$4 : this.cc) {
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
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         ux $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.cd.size(); $$2++) {
            ur $$3 = $$1.a($$2);
            this.cd.set($$2, cuk.a(this.dR(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         ux $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.cc.size(); $$5++) {
            ur $$6 = $$4.a($$5);
            this.cc.set($$5, cuk.a(this.dR(), $$6));
         }
      }

      this.k($$0.q("Invisible"));
      this.t($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cf = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.u($$0.q("Marker"));
      this.ag = !this.H();
      ur $$7 = $$0.p("Pose");
      this.c($$7);
   }

   private void c(ur $$0) {
      ux $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bP : new ka($$1));
      ux $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bQ : new ka($$2));
      ux $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bR : new ka($$3));
      ux $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bS : new ka($$4));
      ux $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bT : new ka($$5));
      ux $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bU : new ka($$6));
   }

   private ur I() {
      ur $$0 = new ur();
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
   protected void D(bsp $$0) {
   }

   @Override
   protected void q() {
      for (bsp $$1 : this.dP().a(this, this.cK(), cb)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bqp a(cms $$0, evm $$1, bqo $$2) {
      cuk $$3 = $$0.b($$2);
      if (this.z() || $$3.a(cun.uL)) {
         return bqp.e;
      } else if ($$0.N_()) {
         return bqp.a;
      } else if ($$0.dP().B) {
         return bqp.c;
      } else {
         bsw $$4 = btm.h($$3);
         if ($$3.e()) {
            bsw $$5 = this.k($$1);
            bsw $$6 = this.f($$5) ? $$4 : $$5;
            if (this.c($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bqp.a;
            }
         } else {
            if (this.f($$4)) {
               return bqp.f;
            }

            if ($$4.a() == bsw.a.a && !this.v()) {
               return bqp.f;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bqp.a;
            }
         }

         return bqp.e;
      }
   }

   private bsw k(evm $$0) {
      bsw $$1 = bsw.a;
      boolean $$2 = this.u();
      double $$3 = $$0.d / (double)(this.ee() * this.ed());
      bsw $$4 = bsw.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.c($$4)) {
         $$1 = bsw.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.c(bsw.e)) {
         $$1 = bsw.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.c(bsw.d)) {
         $$1 = bsw.d;
      } else if ($$3 >= 1.6 && this.c(bsw.f)) {
         $$1 = bsw.f;
      } else if (!this.c(bsw.a) && this.c(bsw.b)) {
         $$1 = bsw.b;
      }

      return $$1;
   }

   private boolean f(bsw $$0) {
      return (this.cf & 1 << $$0.d()) != 0 || $$0.a() == bsw.a.a && !this.v();
   }

   private boolean a(cms $$0, bsw $$1, cuk $$2, bqo $$3) {
      cuk $$4 = this.a($$1);
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
   public boolean a(bri $$0, float $$1) {
      if (this.dP().B || this.dK()) {
         return false;
      } else if ($$0.a(awn.e)) {
         this.an();
         return false;
      } else if (this.b($$0) || this.ce || this.z()) {
         return false;
      } else if ($$0.a(awn.m)) {
         this.i($$0);
         this.an();
         return false;
      } else if ($$0.a(awn.v)) {
         if (this.bQ()) {
            this.g($$0, 0.15F);
         } else {
            this.g(5);
         }

         return false;
      } else if ($$0.a(awn.w) && this.eA() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.a(awn.C);
         boolean $$3 = $$0.a(awn.B);
         if (!$$2 && !$$3) {
            return false;
         } else {
            if ($$0.d() instanceof cms $$4 && !$$4.gd().e) {
               return false;
            }

            if ($$0.g()) {
               this.M();
               this.K();
               this.an();
               return true;
            } else {
               long $$5 = this.dP().Z();
               if ($$5 - this.bN > 5L && !$$3) {
                  this.dP().a(this, (byte)32);
                  this.a(dwq.o, $$0.d());
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
            this.dP().a(this.du(), this.dw(), this.dA(), avw.aC, this.de(), 0.3F, 1.0F, false);
            this.bN = this.dP().Z();
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
      if (this.dP() instanceof arb) {
         ((arb)this.dP())
            .a(
               new la(lj.b, dew.n.n()),
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

   private void g(bri $$0, float $$1) {
      float $$2 = this.eA();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.i($$0);
         this.an();
      } else {
         this.t($$2);
         this.a(dwq.o, $$0.d());
      }
   }

   private void h(bri $$0) {
      cuk $$1 = new cuk(cun.uF);
      $$1.b(km.f, this.ah());
      deu.a(this.dP(), this.dp(), $$1);
      this.i($$0);
   }

   private void i(bri $$0) {
      this.M();
      this.g($$0);

      for (int $$1 = 0; $$1 < this.cc.size(); $$1++) {
         cuk $$2 = this.cc.get($$1);
         if (!$$2.e()) {
            deu.a(this.dP(), this.dp().c(), $$2);
            this.cc.set($$1, cuk.l);
         }
      }

      for (int $$3 = 0; $$3 < this.cd.size(); $$3++) {
         cuk $$4 = this.cd.get($$3);
         if (!$$4.e()) {
            deu.a(this.dP(), this.dp().c(), $$4);
            this.cd.set($$3, cuk.l);
         }
      }
   }

   private void M() {
      this.dP().a(null, this.du(), this.dw(), this.dA(), avw.aA, this.de(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aZ = this.O;
      this.aY = this.dF();
      return 0.0F;
   }

   @Override
   public void a(evm $$0) {
      if (this.H()) {
         super.a($$0);
      }
   }

   @Override
   public void o(float $$0) {
      this.aZ = this.O = $$0;
      this.bb = this.ba = $$0;
   }

   @Override
   public void n(float $$0) {
      this.aZ = this.O = $$0;
      this.bb = this.ba = $$0;
   }

   @Override
   public void l() {
      super.l();
      ka $$0 = this.ao.a(bH);
      if (!this.cg.equals($$0)) {
         this.a($$0);
      }

      ka $$1 = this.ao.a(bI);
      if (!this.ch.equals($$1)) {
         this.b($$1);
      }

      ka $$2 = this.ao.a(bJ);
      if (!this.ci.equals($$2)) {
         this.c($$2);
      }

      ka $$3 = this.ao.a(bK);
      if (!this.cj.equals($$3)) {
         this.d($$3);
      }

      ka $$4 = this.ao.a(bL);
      if (!this.ck.equals($$4)) {
         this.e($$4);
      }

      ka $$5 = this.ao.a(bM);
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
      this.a(bsp.c.a);
      this.a(dwq.p);
   }

   @Override
   public boolean a(dbl $$0) {
      return this.ch();
   }

   @Override
   public env k_() {
      return this.z() ? env.d : super.k_();
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

   public void a(ka $$0) {
      this.cg = $$0;
      this.ao.a(bH, $$0);
   }

   public void b(ka $$0) {
      this.ch = $$0;
      this.ao.a(bI, $$0);
   }

   public void c(ka $$0) {
      this.ci = $$0;
      this.ao.a(bJ, $$0);
   }

   public void d(ka $$0) {
      this.cj = $$0;
      this.ao.a(bK, $$0);
   }

   public void e(ka $$0) {
      this.ck = $$0;
      this.ao.a(bL, $$0);
   }

   public void f(ka $$0) {
      this.cl = $$0;
      this.ao.a(bM, $$0);
   }

   public ka A() {
      return this.cg;
   }

   public ka B() {
      return this.ch;
   }

   public ka C() {
      return this.ci;
   }

   public ka D() {
      return this.cj;
   }

   public ka E() {
      return this.ck;
   }

   public ka G() {
      return this.cl;
   }

   @Override
   public boolean bz() {
      return super.bz() && !this.z();
   }

   @Override
   public boolean u(bsp $$0) {
      return $$0 instanceof cms && !this.dP().a((cms)$$0, this.dp());
   }

   @Override
   public bte fu() {
      return bte.b;
   }

   @Override
   public btk.a eL() {
      return new btk.a(avw.aB, avw.aB);
   }

   @Nullable
   @Override
   protected avv d(bri $$0) {
      return avw.aC;
   }

   @Nullable
   @Override
   protected avv o_() {
      return avw.aA;
   }

   @Override
   public void a(arb $$0, btj $$1) {
   }

   @Override
   public boolean fG() {
      return false;
   }

   @Override
   public void a(akg<?> $$0) {
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
   public bss e(btw $$0) {
      return this.v(this.z());
   }

   private bss v(boolean $$0) {
      if ($$0) {
         return bV;
      } else {
         return this.p_() ? bW : this.ak().n();
      }
   }

   @Override
   public evm k(float $$0) {
      if (this.z()) {
         evh $$1 = this.v(false).a(this.dn());
         iz $$2 = this.dp();
         int $$3 = Integer.MIN_VALUE;

         for (iz $$4 : iz.c(iz.a($$1.a, $$1.b, $$1.c), iz.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dP().a(dcc.b, $$4), this.dP().a(dcc.a, $$4));
            if ($$5 == 15) {
               return evm.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.i();
            }
         }

         return evm.b($$2);
      } else {
         return super.k($$0);
      }
   }

   @Override
   public cuk dC() {
      return new cuk(cun.uF);
   }

   @Override
   public boolean eu() {
      return !this.ch() && !this.z();
   }
}
