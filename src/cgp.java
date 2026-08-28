import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgp extends cga {
   private static final akg<Integer> ca = akk.a(cgp.class, aki.b);
   private static final akg<Integer> cc = akk.a(cgp.class, aki.b);
   private static final akg<Integer> cd = akk.a(cgp.class, aki.b);
   private static final akg<Byte> ce = akk.a(cgp.class, aki.a);
   private static final akg<Byte> cf = akk.a(cgp.class, aki.a);
   private static final akg<Byte> cg = akk.a(cgp.class, aki.a);
   static final cfa ch = cfa.b().a(8.0);
   private static final btr ci = btv.aw.n().a(0.5F).a(btq.a().a(btp.a, 0.0F, 0.40625F, 0.0F));
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
   private eys cr;
   private float cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   cgp.g cy;
   static final Predicate<cke> cA = $$0 -> {
      cvp $$1 = $$0.m();
      return ($$1.a(dhl.mZ.q()) || $$1.a(dhl.eg.q())) && $$0.bI() && !$$0.w();
   };

   public cgp(btv<? extends cgp> $$0, deg $$1) {
      super($$0, $$1);
      this.bP = new cgp.h(this);
      if (!this.o_()) {
         this.a_(true);
      }
   }

   @Override
   public boolean e(cvp $$0) {
      btw $$1 = this.g($$0);
      return !this.a($$1).f() ? false : $$1 == btw.a && super.e($$0);
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

   public boolean gp() {
      return this.w(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gq() {
      return this.am.a(cd) > 0;
   }

   public void z(boolean $$0) {
      this.am.a(cd, $$0 ? 1 : 0);
   }

   private int gM() {
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

   public int gr() {
      return this.am.a(cc);
   }

   public void u(int $$0) {
      this.am.a(cc, $$0);
   }

   public cgp.a gs() {
      return cgp.a.a(this.am.a(ce));
   }

   public void a(cgp.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cgp.a.a(this.af);
      }

      this.am.a(ce, (byte)$$0.a());
   }

   public cgp.a gt() {
      return cgp.a.a(this.am.a(cf));
   }

   public void b(cgp.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cgp.a.a(this.af);
      }

      this.am.a(cf, (byte)$$0.a());
   }

   public boolean gB() {
      return this.w(4);
   }

   public void B(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
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
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gs().c());
      $$0.a("HiddenGene", this.gt().c());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(cgp.a.a($$0.l("MainGene")));
      this.b(cgp.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bth a(arh $$0, bth $$1) {
      cgp $$2 = btv.aw.a($$0, btu.e);
      if ($$2 != null) {
         if ($$1 instanceof cgp $$3) {
            $$2.a(this, $$3);
         }

         $$2.gK();
      }

      return $$2;
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbb(this));
      this.bS.a(2, new cgp.i(this, 2.0));
      this.bS.a(2, new cgp.d(this, 1.0));
      this.bS.a(3, new cgp.b(this, 1.2F, true));
      this.bS.a(4, new ccp(this, 1.0, $$0 -> $$0.a(axc.aq), false));
      this.bS.a(6, new cgp.c<>(this, cnu.class, 8.0F, 2.0, 2.0));
      this.bS.a(6, new cgp.c<>(this, cla.class, 4.0F, 2.0, 2.0));
      this.bS.a(7, new cgp.k());
      this.bS.a(8, new cgp.f(this));
      this.bS.a(8, new cgp.l(this));
      this.cy = new cgp.g(this, cnu.class, 6.0F);
      this.bS.a(9, this.cy);
      this.bS.a(10, new ccc(this));
      this.bS.a(12, new cgp.j(this));
      this.bS.a(13, new cbg(this, 1.25));
      this.bS.a(14, new ccu(this, 1.0));
      this.bT.a(1, new cgp.e(this).a(new Class[0]));
   }

   public static bvq.a gC() {
      return cga.gu().a(bvr.v, 0.15F).a(bvr.c, 6.0);
   }

   public cgp.a gD() {
      return cgp.a.a(this.gs(), this.gt());
   }

   public boolean gE() {
      return this.gD() == cgp.a.b;
   }

   public boolean gF() {
      return this.gD() == cgp.a.c;
   }

   public boolean gG() {
      return this.gD() == cgp.a.d;
   }

   public boolean gH() {
      return this.gD() == cgp.a.e;
   }

   public boolean gI() {
      return this.gD() == cgp.a.f;
   }

   @Override
   public boolean gg() {
      return this.gD() == cgp.a.g;
   }

   @Override
   public boolean A() {
      return false;
   }

   @Override
   public boolean E(bto $$0) {
      if (!this.gg()) {
         this.cq = true;
      }

      return super.E($$0);
   }

   @Override
   public void gi() {
      this.a(awe.sF, 1.0F, 1.0F);
   }

   @Override
   public void l() {
      super.l();
      if (this.gF()) {
         if (this.dS().ad() && !this.bi()) {
            this.x(true);
            this.z(false);
         } else if (!this.gq()) {
            this.x(false);
         }
      }

      buk $$0 = this.m();
      if ($$0 == null) {
         this.cp = false;
         this.cq = false;
      }

      if (this.q() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.q() == 29 || this.q() == 14) {
            this.a(awe.sB, 1.0F, 1.0F);
         }

         this.t(this.q() - 1);
      }

      if (this.t()) {
         this.u(this.gr() + 1);
         if (this.gr() > 20) {
            this.A(false);
            this.gT();
         } else if (this.gr() == 1) {
            this.a(awe.sv, 1.0F, 1.0F);
         }
      }

      if (this.gB()) {
         this.gS();
      } else {
         this.bZ = 0;
      }

      if (this.y()) {
         this.w(0.0F);
      }

      this.gP();
      this.gN();
      this.gQ();
      this.gR();
   }

   public boolean gJ() {
      return this.gF() && this.dS().ad();
   }

   private void gN() {
      if (!this.gq() && this.y() && !this.gJ() && !this.a(btw.a).f() && this.af.a(80) == 1) {
         this.z(true);
      } else if (this.a(btw.a).f() || !this.y()) {
         this.z(false);
      }

      if (this.gq()) {
         this.gO();
         if (!this.dS().B && this.gM() > 80 && this.af.a(20) == 1) {
            if (this.gM() > 100 && this.m(this.a(btw.a))) {
               if (!this.dS().B) {
                  this.a(btw.a, cvp.k);
                  this.a(dzl.m);
               }

               this.x(false);
            }

            this.z(false);
            return;
         }

         this.v(this.gM() + 1);
      }
   }

   private void gO() {
      if (this.gM() % 5 == 0) {
         this.a(awe.sz, 0.5F + 0.5F * (float)this.af.a(2), (this.af.i() - this.af.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            eys $$1 = new eys(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.af.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dK() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dI() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.af.i()) * 0.6 - 0.3;
            eys $$3 = new eys(((double)this.af.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.af.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aT * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dx(), this.dB() + 1.0, this.dD());
            this.dS().a(new lj(ln.S, this.a(btw.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void gP() {
      this.ct = this.cs;
      if (this.y()) {
         this.cs = Math.min(1.0F, this.cs + 0.15F);
      } else {
         this.cs = Math.max(0.0F, this.cs - 0.19F);
      }
   }

   private void gQ() {
      this.cv = this.cu;
      if (this.gp()) {
         this.cu = Math.min(1.0F, this.cu + 0.15F);
      } else {
         this.cu = Math.max(0.0F, this.cu - 0.19F);
      }
   }

   private void gR() {
      this.cx = this.cw;
      if (this.gB()) {
         this.cw = Math.min(1.0F, this.cw + 0.15F);
      } else {
         this.cw = Math.max(0.0F, this.cw - 0.19F);
      }
   }

   public float J(float $$0) {
      return azd.h($$0, this.ct, this.cs);
   }

   public float K(float $$0) {
      return azd.h($$0, this.cv, this.cu);
   }

   public float L(float $$0) {
      return azd.h($$0, this.cx, this.cw);
   }

   private void gS() {
      this.bZ++;
      if (this.bZ > 32) {
         this.B(false);
      } else {
         if (!this.dS().B) {
            eys $$0 = this.dv();
            if (this.bZ == 1) {
               float $$1 = this.dI() * (float) (Math.PI / 180.0);
               float $$2 = this.o_() ? 0.1F : 0.2F;
               this.cr = new eys($$0.d + (double)(-azd.a($$1) * $$2), 0.0, $$0.f + (double)(azd.b($$1) * $$2));
               this.h(this.cr.b(0.0, 0.27, 0.0));
            } else if ((float)this.bZ != 7.0F && (float)this.bZ != 15.0F && (float)this.bZ != 23.0F) {
               this.n(this.cr.d, $$0.e, this.cr.f);
            } else {
               this.n(0.0, this.aH() ? 0.27 : $$0.e, 0.0);
            }
         }
      }
   }

   private void gT() {
      eys $$0 = this.dv();
      deg $$1 = this.dS();
      $$1.a(
         ln.ag,
         this.dx() - (double)(this.dn() + 1.0F) * 0.5 * (double)azd.a(this.aT * (float) (Math.PI / 180.0)),
         this.dB() - 0.1F,
         this.dD() + (double)(this.dn() + 1.0F) * 0.5 * (double)azd.b(this.aT * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(awe.sw, 1.0F, 1.0F);

      for (cgp $$3 : $$1.a(cgp.class, this.cO().g(10.0))) {
         if (!$$3.o_() && $$3.aH() && !$$3.bi() && $$3.gL()) {
            $$3.v();
         }
      }

      if (!$$1.w_() && $$1.ac().b(dec.f)) {
         arh $$4 = (arh)$$1;
         etm $$5 = $$4.o().bd().b(etd.aH);
         etk $$6 = new etk.a($$4).a(ewd.f, this.dq()).a(ewd.a, this).a(ewc.j);

         for (cvp $$8 : $$5.a($$6)) {
            this.b($$8);
         }
      }
   }

   @Override
   protected void b(cke $$0) {
      if (this.a(btw.a).f() && cA.test($$0)) {
         this.a($$0);
         cvp $$1 = $$0.m();
         this.a(btw.a, $$1);
         this.f(btw.a);
         this.a($$0, $$1.J());
         $$0.as();
      }
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (!this.dS().B) {
         this.x(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      azl $$4 = $$0.C_();
      this.a(cgp.a.a($$4));
      this.b(cgp.a.a($$4));
      this.gK();
      if ($$3 == null) {
         $$3 = new bth.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cgp $$0, @Nullable cgp $$1) {
      if ($$1 == null) {
         if (this.af.h()) {
            this.a($$0.gU());
            this.b(cgp.a.a(this.af));
         } else {
            this.a(cgp.a.a(this.af));
            this.b($$0.gU());
         }
      } else if (this.af.h()) {
         this.a($$0.gU());
         this.b($$1.gU());
      } else {
         this.a($$1.gU());
         this.b($$0.gU());
      }

      if (this.af.a(32) == 0) {
         this.a(cgp.a.a(this.af));
      }

      if (this.af.a(32) == 0) {
         this.b(cgp.a.a(this.af));
      }
   }

   private cgp.a gU() {
      return this.af.h() ? this.gs() : this.gt();
   }

   public void gK() {
      if (this.gI()) {
         this.g(bvr.s).a(10.0);
      }

      if (this.gE()) {
         this.g(bvr.v).a(0.07F);
      }
   }

   void gV() {
      if (!this.bi()) {
         this.G(0.0F);
         this.P().o();
         this.x(true);
      }
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if (this.gJ()) {
         return brp.e;
      } else if (this.gp()) {
         this.y(false);
         return brp.a;
      } else if (this.n($$2)) {
         if (this.m() != null) {
            this.cp = true;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dS().B && this.g() == 0 && this.gw()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
         } else {
            if (this.dS().B || this.y() || this.bi()) {
               return brp.e;
            }

            this.gV();
            this.z(true);
            cvp $$3 = this.a(btw.a);
            if (!$$3.f() && !$$0.fQ()) {
               this.b($$3);
            }

            this.a(btw.a, new cvp($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return brp.b;
      } else {
         return brp.e;
      }
   }

   @Nullable
   @Override
   protected awd w() {
      if (this.gg()) {
         return awe.sC;
      } else {
         return this.gF() ? awe.sD : awe.sx;
      }
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.sA, 0.15F, 1.0F);
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.aq);
   }

   private boolean m(cvp $$0) {
      return this.n($$0) || $$0.a(dhl.eg.q());
   }

   @Nullable
   @Override
   protected awd n_() {
      return awe.sy;
   }

   @Nullable
   @Override
   protected awd d(bsg $$0) {
      return awe.sE;
   }

   public boolean gL() {
      return !this.gp() && !this.gJ() && !this.gq() && !this.gB() && !this.y();
   }

   @Override
   public btr e(buw $$0) {
      return this.o_() ? ci : super.e($$0);
   }

   public static enum a implements azz {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final azz.a<cgp.a> h = azz.a(cgp.a::values);
      private static final IntFunction<cgp.a> i = axu.a(cgp.a::a, values(), axu.a.a);
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

      static cgp.a a(cgp.a $$0, cgp.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cgp.a a(int $$0) {
         return i.apply($$0);
      }

      public static cgp.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cgp.a a(azl $$0) {
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

   static class b extends cbr {
      private final cgp b;

      public b(cgp $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gL() && super.b();
      }
   }

   static class c<T extends buk> extends cao<T> {
      private final cgp i;

      public c(cgp $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, btt.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gF() && this.i.gL() && super.b();
      }
   }

   static class d extends cat {
      private final cgp d;
      private int e;

      public d(cgp $$0, double $$1) {
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
                  cnu $$0 = this.b.a(cgp.ch, this.d);
                  this.d.cy.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         je $$0 = this.d.ds();
         je.a $$1 = new je.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dhl.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends ccz {
      private final cgp a;

      public e(cgp $$0, Class<?>... $$1) {
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
      protected void a(bum $$0, buk $$1) {
         if ($$0 instanceof cgp && $$0.gg()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends cbh {
      private final cgp a;
      private int b;

      public f(cgp $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return this.b < this.a.ag && this.a.gE() && this.a.gL() && this.a.af.a(b(400)) == 1;
      }

      @Override
      public boolean c() {
         return !this.a.bi() && (this.a.gE() || this.a.af.a(b(600)) != 1) ? this.a.af.a(b(2000)) != 1 : false;
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

   static class g extends cbp {
      private final cgp h;

      public g(cgp $$0, Class<? extends buk> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(buk $$0) {
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
               if (this.f == cnu.class) {
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

            return this.h.gL() && this.c != null;
         }
      }

      @Override
      public void a() {
         if (this.c != null) {
            super.a();
         }
      }
   }

   static class h extends cak {
      private final cgp l;

      public h(cgp $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gL()) {
            super.a();
         }
      }
   }

   static class i extends cca {
      private final cgp a;

      public i(cgp $$0, double $$1) {
         super($$0, $$1, awv.G);
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

   static class j extends cbh {
      private final cgp a;

      public j(cgp $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbh.a.a, cbh.a.b, cbh.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.o_() || this.a.gG()) && this.a.aH()) {
            if (!this.a.gL()) {
               return false;
            } else {
               float $$0 = this.a.dI() * (float) (Math.PI / 180.0);
               float $$1 = -azd.a($$0);
               float $$2 = azd.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? azd.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? azd.j((double)$$2) : 0;
               if (this.a.dS().a_(this.a.ds().b($$3, -1, $$4)).l()) {
                  return true;
               } else {
                  return this.a.gG() && this.a.af.a(b(60)) == 1 ? true : this.a.af.a(b(500)) == 1;
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
      public boolean S_() {
         return false;
      }
   }

   class k extends cbh {
      private int b;

      public k() {
         this.a(EnumSet.of(cbh.a.a));
      }

      @Override
      public boolean b() {
         if (this.b <= cgp.this.ag && !cgp.this.o_() && !cgp.this.bi() && cgp.this.gL() && cgp.this.q() <= 0) {
            List<cke> $$0 = cgp.this.dS().a(cke.class, cgp.this.cO().c(6.0, 6.0, 6.0), cgp.cA);
            return !$$0.isEmpty() || !cgp.this.a(btw.a).f();
         } else {
            return false;
         }
      }

      @Override
      public boolean c() {
         return !cgp.this.bi() && (cgp.this.gE() || cgp.this.af.a(b(600)) != 1) ? cgp.this.af.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!cgp.this.y() && !cgp.this.a(btw.a).f()) {
            cgp.this.gV();
         }
      }

      @Override
      public void d() {
         List<cke> $$0 = cgp.this.dS().a(cke.class, cgp.this.cO().c(8.0, 8.0, 8.0), cgp.cA);
         if (!$$0.isEmpty() && cgp.this.a(btw.a).f()) {
            cgp.this.P().a($$0.get(0), 1.2F);
         } else if (!cgp.this.a(btw.a).f()) {
            cgp.this.gV();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cvp $$0 = cgp.this.a(btw.a);
         if (!$$0.f()) {
            cgp.this.b($$0);
            cgp.this.a(btw.a, cvp.k);
            int $$1 = cgp.this.gE() ? cgp.this.af.a(50) + 10 : cgp.this.af.a(150) + 10;
            this.b = cgp.this.ag + $$1 * 20;
         }

         cgp.this.x(false);
      }
   }

   static class l extends cbh {
      private final cgp a;

      public l(cgp $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.o_() && this.a.gL()) {
            return this.a.gI() && this.a.af.a(b(500)) == 1 ? true : this.a.af.a(b(6000)) == 1;
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
