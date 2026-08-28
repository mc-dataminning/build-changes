import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgs extends cgd {
   private static final akh<Integer> ca = akl.a(cgs.class, akj.b);
   private static final akh<Integer> cc = akl.a(cgs.class, akj.b);
   private static final akh<Integer> cd = akl.a(cgs.class, akj.b);
   private static final akh<Byte> ce = akl.a(cgs.class, akj.a);
   private static final akh<Byte> cf = akl.a(cgs.class, akj.a);
   private static final akh<Byte> cg = akl.a(cgs.class, akj.a);
   static final cfd ch = cfd.b().a(8.0);
   private static final btu ci = bty.aw.n().a(0.5F).a(btt.a().a(bts.a, 0.0F, 0.40625F, 0.0F));
   private static final int cj = 2;
   private static final int ck = 4;
   private static final int cl = 8;
   private static final int cm = 16;
   private static final int cn = 5;
   public static final int bY = 32;
   private static final int co = 32;
   boolean cp;
   boolean cq;
   public int bZ;
   private eyw cr;
   private float cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   cgs.g cy;
   static final Predicate<ckh> cA = $$0 -> {
      cvs $$1 = $$0.m();
      return ($$1.a(dho.mZ.q()) || $$1.a(dho.eg.q())) && $$0.bI() && !$$0.w();
   };

   public cgs(bty<? extends cgs> $$0, dej $$1) {
      super($$0, $$1);
      this.bP = new cgs.h(this);
      if (!this.p_()) {
         this.a_(true);
      }
   }

   @Override
   public boolean e(cvs $$0) {
      btz $$1 = this.g($$0);
      return !this.a($$1).f() ? false : $$1 == btz.a && super.e($$0);
   }

   public int q() {
      return this.am.a(ca);
   }

   public void t(int $$0) {
      this.am.a(ca, $$0);
   }

   public boolean t() {
      return this.w(2);
   }

   public boolean y() {
      return this.w(8);
   }

   public void x(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean go() {
      return this.w(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gp() {
      return this.am.a(cd) > 0;
   }

   public void z(boolean $$0) {
      this.am.a(cd, $$0 ? 1 : 0);
   }

   private int gL() {
      return this.am.a(cd);
   }

   private void v(int $$0) {
      this.am.a(cd, $$0);
   }

   public void A(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.u(0);
      }
   }

   public int gq() {
      return this.am.a(cc);
   }

   public void u(int $$0) {
      this.am.a(cc, $$0);
   }

   public cgs.a gr() {
      return cgs.a.a(this.am.a(ce));
   }

   public void a(cgs.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cgs.a.a(this.af);
      }

      this.am.a(ce, (byte)$$0.a());
   }

   public cgs.a gs() {
      return cgs.a.a(this.am.a(cf));
   }

   public void b(cgs.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cgs.a.a(this.af);
      }

      this.am.a(cf, (byte)$$0.a());
   }

   public boolean gA() {
      return this.w(4);
   }

   public void B(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
      $$0.a(cc, 0);
      $$0.a(ce, (byte)0);
      $$0.a(cf, (byte)0);
      $$0.a(cg, (byte)0);
      $$0.a(cd, 0);
   }

   private boolean w(int $$0) {
      return (this.am.a(cg) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.am.a(cg);
      if ($$1) {
         this.am.a(cg, (byte)($$2 | $$0));
      } else {
         this.am.a(cg, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gr().c());
      $$0.a("HiddenGene", this.gs().c());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.a(cgs.a.a($$0.l("MainGene")));
      this.b(cgs.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public btk a(arj $$0, btk $$1) {
      cgs $$2 = bty.aw.a($$0, btx.e);
      if ($$2 != null) {
         if ($$1 instanceof cgs $$3) {
            $$2.a(this, $$3);
         }

         $$2.gJ();
      }

      return $$2;
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbe(this));
      this.bS.a(2, new cgs.i(this, 2.0));
      this.bS.a(2, new cgs.d(this, 1.0));
      this.bS.a(3, new cgs.b(this, 1.2F, true));
      this.bS.a(4, new ccs(this, 1.0, $$0 -> $$0.a(axe.aq), false));
      this.bS.a(6, new cgs.c<>(this, cnx.class, 8.0F, 2.0, 2.0));
      this.bS.a(6, new cgs.c<>(this, cld.class, 4.0F, 2.0, 2.0));
      this.bS.a(7, new cgs.k());
      this.bS.a(8, new cgs.f(this));
      this.bS.a(8, new cgs.l(this));
      this.cy = new cgs.g(this, cnx.class, 6.0F);
      this.bS.a(9, this.cy);
      this.bS.a(10, new ccf(this));
      this.bS.a(12, new cgs.j(this));
      this.bS.a(13, new cbj(this, 1.25));
      this.bS.a(14, new ccx(this, 1.0));
      this.bT.a(1, new cgs.e(this).a(new Class[0]));
   }

   public static bvt.a gB() {
      return cgd.gt().a(bvu.v, 0.15F).a(bvu.c, 6.0);
   }

   public cgs.a gC() {
      return cgs.a.a(this.gr(), this.gs());
   }

   public boolean gD() {
      return this.gC() == cgs.a.b;
   }

   public boolean gE() {
      return this.gC() == cgs.a.c;
   }

   public boolean gF() {
      return this.gC() == cgs.a.d;
   }

   public boolean gG() {
      return this.gC() == cgs.a.e;
   }

   public boolean gH() {
      return this.gC() == cgs.a.f;
   }

   @Override
   public boolean gf() {
      return this.gC() == cgs.a.g;
   }

   @Override
   public boolean A() {
      return false;
   }

   @Override
   public boolean E(btr $$0) {
      if (!this.gf()) {
         this.cq = true;
      }

      return super.E($$0);
   }

   @Override
   public void gh() {
      this.a(awg.sF, 1.0F, 1.0F);
   }

   @Override
   public void l() {
      super.l();
      if (this.gE()) {
         if (this.dS().ad() && !this.bi()) {
            this.x(true);
            this.z(false);
         } else if (!this.gp()) {
            this.x(false);
         }
      }

      bun $$0 = this.m();
      if ($$0 == null) {
         this.cp = false;
         this.cq = false;
      }

      if (this.q() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.q() == 29 || this.q() == 14) {
            this.a(awg.sB, 1.0F, 1.0F);
         }

         this.t(this.q() - 1);
      }

      if (this.t()) {
         this.u(this.gq() + 1);
         if (this.gq() > 20) {
            this.A(false);
            this.gS();
         } else if (this.gq() == 1) {
            this.a(awg.sv, 1.0F, 1.0F);
         }
      }

      if (this.gA()) {
         this.gR();
      } else {
         this.bZ = 0;
      }

      if (this.y()) {
         this.w(0.0F);
      }

      this.gO();
      this.gM();
      this.gP();
      this.gQ();
   }

   public boolean gI() {
      return this.gE() && this.dS().ad();
   }

   private void gM() {
      if (!this.gp() && this.y() && !this.gI() && !this.a(btz.a).f() && this.af.a(80) == 1) {
         this.z(true);
      } else if (this.a(btz.a).f() || !this.y()) {
         this.z(false);
      }

      if (this.gp()) {
         this.gN();
         if (!this.dS().B && this.gL() > 80 && this.af.a(20) == 1) {
            if (this.gL() > 100 && this.m(this.a(btz.a))) {
               if (!this.dS().B) {
                  this.a(btz.a, cvs.k);
                  this.a(dzp.m);
               }

               this.x(false);
            }

            this.z(false);
            return;
         }

         this.v(this.gL() + 1);
      }
   }

   private void gN() {
      if (this.gL() % 5 == 0) {
         this.a(awg.sz, 0.5F + 0.5F * (float)this.af.a(2), (this.af.i() - this.af.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            eyw $$1 = new eyw(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.af.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dK() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dI() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.af.i()) * 0.6 - 0.3;
            eyw $$3 = new eyw(((double)this.af.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.af.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aT * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dx(), this.dB() + 1.0, this.dD());
            this.dS().a(new lk(lo.S, this.a(btz.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void gO() {
      this.ct = this.cs;
      if (this.y()) {
         this.cs = Math.min(1.0F, this.cs + 0.15F);
      } else {
         this.cs = Math.max(0.0F, this.cs - 0.19F);
      }
   }

   private void gP() {
      this.cv = this.cu;
      if (this.go()) {
         this.cu = Math.min(1.0F, this.cu + 0.15F);
      } else {
         this.cu = Math.max(0.0F, this.cu - 0.19F);
      }
   }

   private void gQ() {
      this.cx = this.cw;
      if (this.gA()) {
         this.cw = Math.min(1.0F, this.cw + 0.15F);
      } else {
         this.cw = Math.max(0.0F, this.cw - 0.19F);
      }
   }

   public float J(float $$0) {
      return azf.h($$0, this.ct, this.cs);
   }

   public float K(float $$0) {
      return azf.h($$0, this.cv, this.cu);
   }

   public float L(float $$0) {
      return azf.h($$0, this.cx, this.cw);
   }

   private void gR() {
      this.bZ++;
      if (this.bZ > 32) {
         this.B(false);
      } else {
         if (!this.dS().B) {
            eyw $$0 = this.dv();
            if (this.bZ == 1) {
               float $$1 = this.dI() * (float) (Math.PI / 180.0);
               float $$2 = this.p_() ? 0.1F : 0.2F;
               this.cr = new eyw($$0.d + (double)(-azf.a($$1) * $$2), 0.0, $$0.f + (double)(azf.b($$1) * $$2));
               this.h(this.cr.b(0.0, 0.27, 0.0));
            } else if ((float)this.bZ != 7.0F && (float)this.bZ != 15.0F && (float)this.bZ != 23.0F) {
               this.n(this.cr.d, $$0.e, this.cr.f);
            } else {
               this.n(0.0, this.aH() ? 0.27 : $$0.e, 0.0);
            }
         }
      }
   }

   private void gS() {
      eyw $$0 = this.dv();
      dej $$1 = this.dS();
      $$1.a(
         lo.ag,
         this.dx() - (double)(this.dn() + 1.0F) * 0.5 * (double)azf.a(this.aT * (float) (Math.PI / 180.0)),
         this.dB() - 0.1F,
         this.dD() + (double)(this.dn() + 1.0F) * 0.5 * (double)azf.b(this.aT * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(awg.sw, 1.0F, 1.0F);

      for (cgs $$3 : $$1.a(cgs.class, this.cO().g(10.0))) {
         if (!$$3.p_() && $$3.aH() && !$$3.bi() && $$3.gK()) {
            $$3.v();
         }
      }

      if (!$$1.x_() && $$1.ac().b(def.f)) {
         arj $$4 = (arj)$$1;
         etq $$5 = $$4.o().bd().b(eth.aF);
         eto $$6 = new eto.a($$4).a(ewh.f, this.dq()).a(ewh.a, this).a(ewg.j);

         for (cvs $$8 : $$5.a($$6)) {
            this.b($$8);
         }
      }
   }

   @Override
   protected void b(ckh $$0) {
      if (this.a(btz.a).f() && cA.test($$0)) {
         this.a($$0);
         cvs $$1 = $$0.m();
         this.a(btz.a, $$1);
         this.f(btz.a);
         this.a($$0, $$1.K());
         $$0.as();
      }
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (!this.dS().B) {
         this.x(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      azn $$4 = $$0.D_();
      this.a(cgs.a.a($$4));
      this.b(cgs.a.a($$4));
      this.gJ();
      if ($$3 == null) {
         $$3 = new btk.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cgs $$0, @Nullable cgs $$1) {
      if ($$1 == null) {
         if (this.af.h()) {
            this.a($$0.gT());
            this.b(cgs.a.a(this.af));
         } else {
            this.a(cgs.a.a(this.af));
            this.b($$0.gT());
         }
      } else if (this.af.h()) {
         this.a($$0.gT());
         this.b($$1.gT());
      } else {
         this.a($$1.gT());
         this.b($$0.gT());
      }

      if (this.af.a(32) == 0) {
         this.a(cgs.a.a(this.af));
      }

      if (this.af.a(32) == 0) {
         this.b(cgs.a.a(this.af));
      }
   }

   private cgs.a gT() {
      return this.af.h() ? this.gr() : this.gs();
   }

   public void gJ() {
      if (this.gH()) {
         this.g(bvu.s).a(10.0);
      }

      if (this.gD()) {
         this.g(bvu.v).a(0.07F);
      }
   }

   void gU() {
      if (!this.bi()) {
         this.G(0.0F);
         this.P().o();
         this.x(true);
      }
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if (this.gI()) {
         return brs.e;
      } else if (this.go()) {
         this.y(false);
         return brs.a;
      } else if (this.n($$2)) {
         if (this.m() != null) {
            this.cp = true;
         }

         if (this.p_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dS().B && this.g() == 0 && this.gv()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
         } else {
            if (this.dS().B || this.y() || this.bi()) {
               return brs.e;
            }

            this.gU();
            this.z(true);
            cvs $$3 = this.a(btz.a);
            if (!$$3.f() && !$$0.fR()) {
               this.b($$3);
            }

            this.a(btz.a, new cvs($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return brs.b;
      } else {
         return brs.e;
      }
   }

   @Nullable
   @Override
   protected awf w() {
      if (this.gf()) {
         return awg.sC;
      } else {
         return this.gE() ? awg.sD : awg.sx;
      }
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.sA, 0.15F, 1.0F);
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.aq);
   }

   private boolean m(cvs $$0) {
      return this.n($$0) || $$0.a(dho.eg.q());
   }

   @Nullable
   @Override
   protected awf o_() {
      return awg.sy;
   }

   @Nullable
   @Override
   protected awf d(bsj $$0) {
      return awg.sE;
   }

   public boolean gK() {
      return !this.go() && !this.gI() && !this.gp() && !this.gA() && !this.y();
   }

   @Override
   public btu e(buz $$0) {
      return this.p_() ? ci : super.e($$0);
   }

   public static enum a implements bab {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final bab.a<cgs.a> h = bab.a(cgs.a::values);
      private static final IntFunction<cgs.a> i = axw.a(cgs.a::a, values(), axw.a.a);
      private static final int j = 6;
      private final int k;
      private final String l;
      private final boolean m;

      private a(final int $$0, final String $$1, final boolean $$2) {
         this.k = $$0;
         this.l = $$1;
         this.m = $$2;
      }

      public int a() {
         return this.k;
      }

      @Override
      public String c() {
         return this.l;
      }

      public boolean b() {
         return this.m;
      }

      static cgs.a a(cgs.a $$0, cgs.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cgs.a a(int $$0) {
         return i.apply($$0);
      }

      public static cgs.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cgs.a a(azn $$0) {
         int $$1 = $$0.a(16);
         if ($$1 == 0) {
            return b;
         } else if ($$1 == 1) {
            return c;
         } else if ($$1 == 2) {
            return d;
         } else if ($$1 == 4) {
            return g;
         } else if ($$1 < 9) {
            return f;
         } else {
            return $$1 < 11 ? e : a;
         }
      }
   }

   static class b extends cbu {
      private final cgs b;

      public b(cgs $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gK() && super.b();
      }
   }

   static class c<T extends bun> extends car<T> {
      private final cgs i;

      public c(cgs $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, btw.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gE() && this.i.gK() && super.b();
      }
   }

   static class d extends caw {
      private final cgs d;
      private int e;

      public d(cgs $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         if (!super.b() || this.d.q() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.ag) {
               this.d.t(32);
               this.e = this.d.ag + 600;
               if (this.d.df()) {
                  cnx $$0 = this.b.a(cgs.ch, this.d);
                  this.d.cy.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         jf $$0 = this.d.ds();
         jf.a $$1 = new jf.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dho.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cdc {
      private final cgs a;

      public e(cgs $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (!this.a.cp && !this.a.cq) {
            return super.c();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(bup $$0, bun $$1) {
         if ($$0 instanceof cgs && $$0.gf()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends cbk {
      private final cgs a;
      private int b;

      public f(cgs $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return this.b < this.a.ag && this.a.gD() && this.a.gK() && this.a.af.a(b(400)) == 1;
      }

      @Override
      public boolean c() {
         return !this.a.bi() && (this.a.gD() || this.a.af.a(b(600)) != 1) ? this.a.af.a(b(2000)) != 1 : false;
      }

      @Override
      public void d() {
         this.a.y(true);
         this.b = 0;
      }

      @Override
      public void e() {
         this.a.y(false);
         this.b = this.a.ag + 200;
      }
   }

   static class g extends cbs {
      private final cgs h;

      public g(cgs $$0, Class<? extends bun> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bun $$0) {
         this.c = $$0;
      }

      @Override
      public boolean c() {
         return this.c != null && super.c();
      }

      @Override
      public boolean b() {
         if (this.b.dV().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == cnx.class) {
                  this.c = this.b.dS().a(this.g, this.b, this.b.dx(), this.b.dB(), this.b.dD());
               } else {
                  this.c = this.b
                     .dS()
                     .a(
                        this.b.dS().a(this.f, this.b.cO().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.dx(),
                        this.b.dB(),
                        this.b.dD()
                     );
               }
            }

            return this.h.gK() && this.c != null;
         }
      }

      @Override
      public void a() {
         if (this.c != null) {
            super.a();
         }
      }
   }

   static class h extends can {
      private final cgs l;

      public h(cgs $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gK()) {
            super.a();
         }
      }
   }

   static class i extends ccd {
      private final cgs a;

      public i(cgs $$0, double $$1) {
         super($$0, $$1, awx.G);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (this.a.y()) {
            this.a.P().o();
            return false;
         } else {
            return super.c();
         }
      }
   }

   static class j extends cbk {
      private final cgs a;

      public j(cgs $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbk.a.a, cbk.a.b, cbk.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.p_() || this.a.gF()) && this.a.aH()) {
            if (!this.a.gK()) {
               return false;
            } else {
               float $$0 = this.a.dI() * (float) (Math.PI / 180.0);
               float $$1 = -azf.a($$0);
               float $$2 = azf.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? azf.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? azf.j((double)$$2) : 0;
               if (this.a.dS().a_(this.a.ds().b($$3, -1, $$4)).l()) {
                  return true;
               } else {
                  return this.a.gF() && this.a.af.a(b(60)) == 1 ? true : this.a.af.a(b(500)) == 1;
               }
            }
         } else {
            return false;
         }
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void d() {
         this.a.B(true);
      }

      @Override
      public boolean T_() {
         return false;
      }
   }

   class k extends cbk {
      private int b;

      public k() {
         this.a(EnumSet.of(cbk.a.a));
      }

      @Override
      public boolean b() {
         if (this.b <= cgs.this.ag && !cgs.this.p_() && !cgs.this.bi() && cgs.this.gK() && cgs.this.q() <= 0) {
            List<ckh> $$0 = cgs.this.dS().a(ckh.class, cgs.this.cO().c(6.0, 6.0, 6.0), cgs.cA);
            return !$$0.isEmpty() || !cgs.this.a(btz.a).f();
         } else {
            return false;
         }
      }

      @Override
      public boolean c() {
         return !cgs.this.bi() && (cgs.this.gD() || cgs.this.af.a(b(600)) != 1) ? cgs.this.af.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!cgs.this.y() && !cgs.this.a(btz.a).f()) {
            cgs.this.gU();
         }
      }

      @Override
      public void d() {
         List<ckh> $$0 = cgs.this.dS().a(ckh.class, cgs.this.cO().c(8.0, 8.0, 8.0), cgs.cA);
         if (!$$0.isEmpty() && cgs.this.a(btz.a).f()) {
            cgs.this.P().a($$0.get(0), 1.2F);
         } else if (!cgs.this.a(btz.a).f()) {
            cgs.this.gU();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cvs $$0 = cgs.this.a(btz.a);
         if (!$$0.f()) {
            cgs.this.b($$0);
            cgs.this.a(btz.a, cvs.k);
            int $$1 = cgs.this.gD() ? cgs.this.af.a(50) + 10 : cgs.this.af.a(150) + 10;
            this.b = cgs.this.ag + $$1 * 20;
         }

         cgs.this.x(false);
      }
   }

   static class l extends cbk {
      private final cgs a;

      public l(cgs $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.p_() && this.a.gK()) {
            return this.a.gH() && this.a.af.a(b(500)) == 1 ? true : this.a.af.a(b(6000)) == 1;
         } else {
            return false;
         }
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void d() {
         this.a.A(true);
      }
   }
}
