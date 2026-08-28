import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cko extends bve {
   public static final int b = 5;
   private static final boolean bR = true;
   public static final ki c = new ki(0.0F, 0.0F, 0.0F);
   public static final ki d = new ki(0.0F, 0.0F, 0.0F);
   public static final ki e = new ki(-10.0F, 0.0F, -10.0F);
   public static final ki f = new ki(-15.0F, 0.0F, 10.0F);
   public static final ki g = new ki(-1.0F, 0.0F, -1.0F);
   public static final ki h = new ki(1.0F, 0.0F, 1.0F);
   private static final bul bS = bul.c(0.0F, 0.0F);
   private static final bul bT = bup.d.n().a(0.5F).b(0.9875F);
   private static final double bU = 0.1;
   private static final double bV = 0.9;
   private static final double bW = 0.4;
   private static final double bX = 1.6;
   public static final int i = 8;
   public static final int j = 16;
   public static final int k = 1;
   public static final int l = 4;
   public static final int bH = 8;
   public static final int bI = 16;
   public static final ako<Byte> bJ = aks.a(cko.class, akq.a);
   public static final ako<ki> bK = aks.a(cko.class, akq.n);
   public static final ako<ki> bL = aks.a(cko.class, akq.n);
   public static final ako<ki> bM = aks.a(cko.class, akq.n);
   public static final ako<ki> bN = aks.a(cko.class, akq.n);
   public static final ako<ki> bO = aks.a(cko.class, akq.n);
   public static final ako<ki> bP = aks.a(cko.class, akq.n);
   private static final Predicate<bui> bY = $$0 -> {
      if ($$0 instanceof cqo $$1 && $$1.D()) {
         return true;
      }

      return false;
   };
   private final jz<cwf> bZ = jz.a(2, cwf.k);
   private final jz<cwf> ca = jz.a(4, cwf.k);
   private boolean cb;
   public long bQ;
   private int cc;
   private ki cd = c;
   private ki ce = d;
   private ki cf = e;
   private ki cg = f;
   private ki ch = g;
   private ki ci = h;

   public cko(bup<? extends cko> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cko(dff $$0, double $$1, double $$2, double $$3) {
      this(bup.d, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static bwl.a q() {
      return eg().a(bwm.B, 0.0);
   }

   @Override
   public void j_() {
      double $$0 = this.dD();
      double $$1 = this.dF();
      double $$2 = this.dJ();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   private boolean I() {
      return !this.A() && !this.be();
   }

   @Override
   public boolean dl() {
      return super.dl() && this.I();
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(bJ, (byte)0);
      $$0.a(bK, c);
      $$0.a(bL, d);
      $$0.a(bM, e);
      $$0.a(bN, f);
      $$0.a(bO, g);
      $$0.a(bP, h);
   }

   @Override
   public Iterable<cwf> ff() {
      return this.bZ;
   }

   @Override
   public Iterable<cwf> fe() {
      return this.ca;
   }

   @Override
   public cwf a(buq $$0) {
      switch ($$0.a()) {
         case a:
            return this.bZ.get($$0.b());
         case b:
            return this.ca.get($$0.b());
         default:
            return cwf.k;
      }
   }

   @Override
   public boolean e(buq $$0) {
      return $$0 != buq.g && !this.g($$0);
   }

   @Override
   public void a(buq $$0, cwf $$1) {
      this.c($$1);
      switch ($$0.a()) {
         case a:
            this.a($$0, this.bZ.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.ca.set($$0.b(), $$1), $$1);
      }
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      ut $$1 = new ut();

      for (cwf $$2 : this.ca) {
         $$1.add($$2.b(this.ea()));
      }

      $$0.a("ArmorItems", $$1);
      ut $$3 = new ut();

      for (cwf $$4 : this.bZ) {
         $$3.add($$4.b(this.ea()));
      }

      $$0.a("HandItems", $$3);
      $$0.a("Invisible", this.cr());
      $$0.a("Small", this.t());
      $$0.a("ShowArms", this.w());
      $$0.a("DisabledSlots", this.cc);
      $$0.a("NoBasePlate", !this.y());
      if (this.A()) {
         $$0.a("Marker", this.A());
      }

      $$0.a("Pose", this.J());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         ut $$1 = $$0.c("ArmorItems", 10);

         for (int $$2 = 0; $$2 < this.ca.size(); $$2++) {
            un $$3 = $$1.a($$2);
            this.ca.set($$2, cwf.a(this.ea(), $$3));
         }
      }

      if ($$0.b("HandItems", 9)) {
         ut $$4 = $$0.c("HandItems", 10);

         for (int $$5 = 0; $$5 < this.bZ.size(); $$5++) {
            un $$6 = $$4.a($$5);
            this.bZ.set($$5, cwf.a(this.ea(), $$6));
         }
      }

      this.k($$0.q("Invisible"));
      this.u($$0.q("Small"));
      this.a($$0.q("ShowArms"));
      this.cc = $$0.h("DisabledSlots");
      this.b($$0.q("NoBasePlate"));
      this.v($$0.q("Marker"));
      this.ae = !this.I();
      un $$7 = $$0.p("Pose");
      this.c($$7);
   }

   private void c(un $$0) {
      ut $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? c : new ki($$1));
      ut $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? d : new ki($$2));
      ut $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? e : new ki($$3));
      ut $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? f : new ki($$4));
      ut $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? g : new ki($$5));
      ut $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? h : new ki($$6));
   }

   private un J() {
      un $$0 = new un();
      if (!c.equals(this.cd)) {
         $$0.a("Head", this.cd.a());
      }

      if (!d.equals(this.ce)) {
         $$0.a("Body", this.ce.a());
      }

      if (!e.equals(this.cf)) {
         $$0.a("LeftArm", this.cf.a());
      }

      if (!f.equals(this.cg)) {
         $$0.a("RightArm", this.cg.a());
      }

      if (!g.equals(this.ch)) {
         $$0.a("LeftLeg", this.ch.a());
      }

      if (!h.equals(this.ci)) {
         $$0.a("RightLeg", this.ci.a());
      }

      return $$0;
   }

   @Override
   public boolean bK() {
      return false;
   }

   @Override
   protected void F(bui $$0) {
   }

   @Override
   protected void r() {
      for (bui $$1 : this.dY().a(this, this.cT(), bY)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bsh a(cor $$0, ezr $$1, bsg $$2) {
      cwf $$3 = $$0.b($$2);
      if (this.A() || $$3.a(cwj.vd)) {
         return bsh.e;
      } else if ($$0.R_()) {
         return bsh.a;
      } else if ($$0.dY().C) {
         return bsh.b;
      } else {
         buq $$4 = this.f($$3);
         if ($$3.f()) {
            buq $$5 = this.k($$1);
            buq $$6 = this.g($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bsh.b;
            }
         } else {
            if (this.g($$4)) {
               return bsh.d;
            }

            if ($$4.a() == buq.a.a && !this.w()) {
               return bsh.d;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bsh.b;
            }
         }

         return bsh.e;
      }
   }

   private buq k(ezr $$0) {
      buq $$1 = buq.a;
      boolean $$2 = this.t();
      double $$3 = $$0.e / (double)(this.em() * this.el());
      buq $$4 = buq.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.d($$4)) {
         $$1 = buq.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.d(buq.e)) {
         $$1 = buq.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.d(buq.d)) {
         $$1 = buq.d;
      } else if ($$3 >= 1.6 && this.d(buq.f)) {
         $$1 = buq.f;
      } else if (!this.d(buq.a) && this.d(buq.b)) {
         $$1 = buq.b;
      }

      return $$1;
   }

   private boolean g(buq $$0) {
      return (this.cc & 1 << $$0.b(0)) != 0 || $$0.a() == buq.a.a && !this.w();
   }

   private boolean a(cor $$0, buq $$1, cwf $$2, bsg $$3) {
      cwf $$4 = this.a($$1);
      if (!$$4.f() && (this.cc & 1 << $$1.b(8)) != 0) {
         return false;
      } else if ($$4.f() && (this.cc & 1 << $$1.b(16)) != 0) {
         return false;
      } else if ($$0.fY() && $$4.f() && !$$2.f()) {
         this.a($$1, $$2.c(1));
         return true;
      } else if ($$2.f() || $$2.L() <= 1) {
         this.a($$1, $$2);
         $$0.a($$3, $$4);
         return true;
      } else if (!$$4.f()) {
         return false;
      } else {
         this.a($$1, $$2.a(1));
         return true;
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.dT()) {
         return false;
      } else if (!(this.dY() instanceof arq $$2)) {
         return false;
      } else if (!this.dY().ac().b(dfb.c) && $$0.d() instanceof bvg) {
         return false;
      } else if ($$0.a(axf.d)) {
         this.au();
         return false;
      } else if (this.b($$0) || this.cb || this.A()) {
         return false;
      } else if ($$0.a(axf.l)) {
         this.c($$2, $$0);
         this.au();
         return false;
      } else if ($$0.a(axf.u)) {
         if (this.ca()) {
            this.a($$2, $$0, 0.15F);
         } else {
            this.d(5.0F);
         }

         return false;
      } else if ($$0.a(axf.v) && this.eH() > 0.5F) {
         this.a($$2, $$0, 4.0F);
         return false;
      } else {
         boolean $$4 = $$0.a(axf.B);
         boolean $$5 = $$0.a(axf.A);
         if (!$$4 && !$$5) {
            return false;
         } else {
            if ($$0.d() instanceof cor $$6 && !$$6.gm().e) {
               return false;
            }

            if ($$0.h()) {
               this.M();
               this.K();
               this.au();
               return true;
            } else {
               long $$7 = $$2.aa();
               if ($$7 - this.bQ > 5L && !$$5) {
                  $$2.a(this, (byte)32);
                  this.a(eak.o, $$0.d());
                  this.bQ = $$7;
               } else {
                  this.b($$2, $$0);
                  this.K();
                  this.au();
               }

               return true;
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 32) {
         if (this.dY().C) {
            this.dY().a(this.dD(), this.dF(), this.dJ(), awo.aC, this.do(), 0.3F, 1.0F, false);
            this.bQ = this.dY().aa();
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cT().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void K() {
      if (this.dY() instanceof arq) {
         ((arq)this.dY())
            .a(
               new lk(ls.b, dil.n.m()),
               this.dD(),
               this.e(0.6666666666666666),
               this.dJ(),
               10,
               (double)(this.dt() / 4.0F),
               (double)(this.du() / 4.0F),
               (double)(this.dt() / 4.0F),
               0.05
            );
      }
   }

   private void a(arq $$0, bsy $$1, float $$2) {
      float $$3 = this.eH();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.c($$0, $$1);
         this.au();
      } else {
         this.x($$3);
         this.a(eak.o, $$1.d());
      }
   }

   private void b(arq $$0, bsy $$1) {
      cwf $$2 = new cwf(cwj.uX);
      $$2.b(ku.g, this.ao());
      dij.a(this.dY(), this.dy(), $$2);
      this.c($$0, $$1);
   }

   private void c(arq $$0, bsy $$1) {
      this.M();
      this.a($$0, $$1);

      for (int $$2 = 0; $$2 < this.bZ.size(); $$2++) {
         cwf $$3 = this.bZ.get($$2);
         if (!$$3.f()) {
            dij.a(this.dY(), this.dy().d(), $$3);
            this.bZ.set($$2, cwf.k);
         }
      }

      for (int $$4 = 0; $$4 < this.ca.size(); $$4++) {
         cwf $$5 = this.ca.get($$4);
         if (!$$5.f()) {
            dij.a(this.dY(), this.dy().d(), $$5);
            this.ca.set($$4, cwf.k);
         }
      }
   }

   private void M() {
      this.dY().a(null, this.dD(), this.dF(), this.dJ(), awo.aA, this.do(), 1.0F, 1.0F);
   }

   @Override
   protected float f(float $$0, float $$1) {
      this.aY = this.O;
      this.aX = this.dO();
      return 0.0F;
   }

   @Override
   public void a_(ezr $$0) {
      if (this.I()) {
         super.a_($$0);
      }
   }

   @Override
   public void r(float $$0) {
      this.aY = this.O = $$0;
      this.ba = this.aZ = $$0;
   }

   @Override
   public void q(float $$0) {
      this.aY = this.O = $$0;
      this.ba = this.aZ = $$0;
   }

   @Override
   public void l() {
      super.l();
      ki $$0 = this.am.a(bK);
      if (!this.cd.equals($$0)) {
         this.a($$0);
      }

      ki $$1 = this.am.a(bL);
      if (!this.ce.equals($$1)) {
         this.b($$1);
      }

      ki $$2 = this.am.a(bM);
      if (!this.cf.equals($$2)) {
         this.c($$2);
      }

      ki $$3 = this.am.a(bN);
      if (!this.cg.equals($$3)) {
         this.d($$3);
      }

      ki $$4 = this.am.a(bO);
      if (!this.ch.equals($$4)) {
         this.e($$4);
      }

      ki $$5 = this.am.a(bP);
      if (!this.ci.equals($$5)) {
         this.f($$5);
      }
   }

   @Override
   protected void L() {
      this.k(this.cb);
   }

   @Override
   public void k(boolean $$0) {
      this.cb = $$0;
      super.k($$0);
   }

   @Override
   public boolean p_() {
      return this.t();
   }

   @Override
   public void au() {
      this.a(bui.c.a);
      this.a(eak.p);
   }

   @Override
   public boolean a(dex $$0) {
      return $$0.g() ? this.cr() : true;
   }

   @Override
   public ert k_() {
      return this.A() ? ert.d : super.k_();
   }

   @Override
   public boolean r_() {
      return this.A();
   }

   private void u(boolean $$0) {
      this.am.a(bJ, this.a(this.am.a(bJ), 1, $$0));
   }

   public boolean t() {
      return (this.am.a(bJ) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.am.a(bJ, this.a(this.am.a(bJ), 4, $$0));
   }

   public boolean w() {
      return (this.am.a(bJ) & 4) != 0;
   }

   public void b(boolean $$0) {
      this.am.a(bJ, this.a(this.am.a(bJ), 8, $$0));
   }

   public boolean y() {
      return (this.am.a(bJ) & 8) == 0;
   }

   private void v(boolean $$0) {
      this.am.a(bJ, this.a(this.am.a(bJ), 16, $$0));
   }

   public boolean A() {
      return (this.am.a(bJ) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(ki $$0) {
      this.cd = $$0;
      this.am.a(bK, $$0);
   }

   public void b(ki $$0) {
      this.ce = $$0;
      this.am.a(bL, $$0);
   }

   public void c(ki $$0) {
      this.cf = $$0;
      this.am.a(bM, $$0);
   }

   public void d(ki $$0) {
      this.cg = $$0;
      this.am.a(bN, $$0);
   }

   public void e(ki $$0) {
      this.ch = $$0;
      this.am.a(bO, $$0);
   }

   public void f(ki $$0) {
      this.ci = $$0;
      this.am.a(bP, $$0);
   }

   public ki B() {
      return this.cd;
   }

   public ki C() {
      return this.ce;
   }

   public ki D() {
      return this.cf;
   }

   public ki E() {
      return this.cg;
   }

   public ki F() {
      return this.ch;
   }

   public ki G() {
      return this.ci;
   }

   @Override
   public boolean bJ() {
      return super.bJ() && !this.A();
   }

   @Override
   public boolean v(bui $$0) {
      return $$0 instanceof cor && !this.dY().a((cor)$$0, this.dy());
   }

   @Override
   public buy fB() {
      return buy.b;
   }

   @Override
   public bve.a eQ() {
      return new bve.a(awo.aB, awo.aB);
   }

   @Nullable
   @Override
   protected awn d(bsy $$0) {
      return awo.aC;
   }

   @Nullable
   @Override
   protected awn o_() {
      return awo.aA;
   }

   @Override
   public void a(arq $$0, bvd $$1) {
   }

   @Override
   public boolean fO() {
      return false;
   }

   @Override
   public void a(ako<?> $$0) {
      if (bJ.equals($$0)) {
         this.j_();
         this.J = !this.A();
      }

      super.a($$0);
   }

   @Override
   public boolean fP() {
      return false;
   }

   @Override
   public bul e(bvq $$0) {
      return this.w(this.A());
   }

   private bul w(boolean $$0) {
      if ($$0) {
         return bS;
      } else {
         return this.p_() ? bT : this.ar().n();
      }
   }

   @Override
   public ezr n(float $$0) {
      if (this.A()) {
         ezm $$1 = this.w(false).a(this.dw());
         jh $$2 = this.dy();
         int $$3 = Integer.MIN_VALUE;

         for (jh $$4 : jh.c(jh.a($$1.a, $$1.b, $$1.c), jh.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.dY().a(dfo.b, $$4), this.dY().a(dfo.a, $$4));
            if ($$5 == 15) {
               return ezr.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.j();
            }
         }

         return ezr.b($$2);
      } else {
         return super.n($$0);
      }
   }

   @Override
   public cwf dL() {
      return new cwf(cwj.uX);
   }

   @Override
   public boolean eB() {
      return !this.cr() && !this.A();
   }
}
