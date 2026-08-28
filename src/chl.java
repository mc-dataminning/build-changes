import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chl extends cgw {
   private static final ajx<Integer> ca = akb.a(chl.class, ajz.b);
   private static final ajx<Integer> cc = akb.a(chl.class, ajz.b);
   private static final ajx<Integer> cd = akb.a(chl.class, ajz.b);
   private static final ajx<Byte> ce = akb.a(chl.class, ajz.a);
   private static final ajx<Byte> cf = akb.a(chl.class, ajz.a);
   private static final ajx<Byte> cg = akb.a(chl.class, ajz.a);
   static final cfw ch = cfw.b().a(8.0);
   private static final bum ci = buq.aN.n().a(0.5F).a(bul.a().a(buk.a, 0.0F, 0.40625F, 0.0F));
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
   private fay cr;
   private float cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   chl.g cy;

   public chl(buq<? extends chl> $$0, dgg $$1) {
      super($$0, $$1);
      this.bP = new chl.h(this);
      if (!this.e_()) {
         this.a_(true);
      }
   }

   @Override
   protected boolean f(bur $$0) {
      return $$0 == bur.a && this.fN();
   }

   public int p() {
      return this.al.a(ca);
   }

   public void s(int $$0) {
      this.al.a(ca, $$0);
   }

   public boolean t() {
      return this.v(2);
   }

   public boolean x() {
      return this.v(8);
   }

   public void x(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gp() {
      return this.v(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gq() {
      return this.al.a(cd) > 0;
   }

   public void z(boolean $$0) {
      this.al.a(cd, $$0 ? 1 : 0);
   }

   private int gM() {
      return this.al.a(cd);
   }

   private void u(int $$0) {
      this.al.a(cd, $$0);
   }

   public void A(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.t(0);
      }
   }

   public int gr() {
      return this.al.a(cc);
   }

   public void t(int $$0) {
      this.al.a(cc, $$0);
   }

   public chl.a gs() {
      return chl.a.a(this.al.a(ce));
   }

   public void a(chl.a $$0) {
      if ($$0.a() > 6) {
         $$0 = chl.a.a(this.ae);
      }

      this.al.a(ce, (byte)$$0.a());
   }

   public chl.a gt() {
      return chl.a.a(this.al.a(cf));
   }

   public void b(chl.a $$0) {
      if ($$0.a() > 6) {
         $$0 = chl.a.a(this.ae);
      }

      this.al.a(cf, (byte)$$0.a());
   }

   public boolean gB() {
      return this.v(4);
   }

   public void B(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
      $$0.a(cc, 0);
      $$0.a(ce, (byte)0);
      $$0.a(cf, (byte)0);
      $$0.a(cg, (byte)0);
      $$0.a(cd, 0);
   }

   private boolean v(int $$0) {
      return (this.al.a(cg) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.al.a(cg);
      if ($$1) {
         this.al.a(cg, (byte)($$2 | $$0));
      } else {
         this.al.a(cg, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gs().c());
      $$0.a("HiddenGene", this.gt().c());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(chl.a.a($$0.l("MainGene")));
      this.b(chl.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bua a(arc $$0, bua $$1) {
      chl $$2 = buq.aN.a($$0, bup.e);
      if ($$2 != null) {
         if ($$1 instanceof chl $$3) {
            $$2.a(this, $$3);
         }

         $$2.gK();
      }

      return $$2;
   }

   @Override
   protected void B() {
      this.bS.a(0, new cbx(this));
      this.bS.a(2, new chl.i(this, 2.0));
      this.bS.a(2, new chl.d(this, 1.0));
      this.bS.a(3, new chl.b(this, 1.2F, true));
      this.bS.a(4, new cdl(this, 1.0, $$0 -> $$0.a(awx.at), false));
      this.bS.a(6, new chl.c<>(this, cov.class, 8.0F, 2.0, 2.0));
      this.bS.a(6, new chl.c<>(this, clw.class, 4.0F, 2.0, 2.0));
      this.bS.a(7, new chl.k());
      this.bS.a(8, new chl.f(this));
      this.bS.a(8, new chl.l(this));
      this.cy = new chl.g(this, cov.class, 6.0F);
      this.bS.a(9, this.cy);
      this.bS.a(10, new ccy(this));
      this.bS.a(12, new chl.j(this));
      this.bS.a(13, new ccc(this, 1.25));
      this.bS.a(14, new cdq(this, 1.0));
      this.bT.a(1, new chl.e(this).a(new Class[0]));
   }

   public static bwm.a gC() {
      return cgw.gu().a(bwn.v, 0.15F).a(bwn.c, 6.0);
   }

   public chl.a gD() {
      return chl.a.a(this.gs(), this.gt());
   }

   public boolean gE() {
      return this.gD() == chl.a.b;
   }

   public boolean gF() {
      return this.gD() == chl.a.c;
   }

   public boolean gG() {
      return this.gD() == chl.a.d;
   }

   public boolean gH() {
      return this.gD() == chl.a.e;
   }

   public boolean gI() {
      return this.gD() == chl.a.f;
   }

   @Override
   public boolean ge() {
      return this.gD() == chl.a.g;
   }

   @Override
   public boolean y() {
      return false;
   }

   @Override
   public boolean c(arc $$0, buj $$1) {
      if (!this.ge()) {
         this.cq = true;
      }

      return super.c($$0, $$1);
   }

   @Override
   public void gg() {
      this.a(avz.td, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.gF()) {
         if (this.dW().af() && !this.bj()) {
            this.x(true);
            this.z(false);
         } else if (!this.gq()) {
            this.x(false);
         }
      }

      bvf $$0 = this.O_();
      if ($$0 == null) {
         this.cp = false;
         this.cq = false;
      }

      if (this.p() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.p() == 29 || this.p() == 14) {
            this.a(avz.sZ, 1.0F, 1.0F);
         }

         this.s(this.p() - 1);
      }

      if (this.t()) {
         this.t(this.gr() + 1);
         if (this.gr() > 20) {
            this.A(false);
            this.gT();
         } else if (this.gr() == 1) {
            this.a(avz.sT, 1.0F, 1.0F);
         }
      }

      if (this.gB()) {
         this.gS();
      } else {
         this.bZ = 0;
      }

      if (this.x()) {
         this.w(0.0F);
      }

      this.gP();
      this.gN();
      this.gQ();
      this.gR();
   }

   public boolean gJ() {
      return this.gF() && this.dW().af();
   }

   private void gN() {
      if (!this.gq() && this.x() && !this.gJ() && !this.a(bur.a).f() && this.ae.a(80) == 1) {
         this.z(true);
      } else if (this.a(bur.a).f() || !this.x()) {
         this.z(false);
      }

      if (this.gq()) {
         this.gO();
         if (!this.dW().C && this.gM() > 80 && this.ae.a(20) == 1) {
            if (this.gM() > 100 && this.a(bur.a).a(awx.au)) {
               if (!this.dW().C) {
                  this.a(bur.a, cwn.j);
                  this.a(ebr.m);
               }

               this.x(false);
            }

            this.z(false);
            return;
         }

         this.u(this.gM() + 1);
      }
   }

   private void gO() {
      if (this.gM() % 5 == 0) {
         this.a(avz.sX, 0.5F + 0.5F * (float)this.ae.a(2), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            fay $$1 = new fay(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ae.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dO() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dM() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ae.i()) * 0.6 - 0.3;
            fay $$3 = new fay(((double)this.ae.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ae.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aX * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dB(), this.dF() + 1.0, this.dH());
            this.dW().a(new lp(lt.T, this.a(bur.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void gP() {
      this.ct = this.cs;
      if (this.x()) {
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
      return ayy.h($$0, this.ct, this.cs);
   }

   public float K(float $$0) {
      return ayy.h($$0, this.cv, this.cu);
   }

   public float L(float $$0) {
      return ayy.h($$0, this.cx, this.cw);
   }

   private void gS() {
      this.bZ++;
      if (this.bZ > 32) {
         this.B(false);
      } else {
         if (!this.dW().C) {
            fay $$0 = this.dz();
            if (this.bZ == 1) {
               float $$1 = this.dM() * (float) (Math.PI / 180.0);
               float $$2 = this.e_() ? 0.1F : 0.2F;
               this.cr = new fay($$0.d + (double)(-ayy.a($$1) * $$2), 0.0, $$0.f + (double)(ayy.b($$1) * $$2));
               this.h(this.cr.b(0.0, 0.27, 0.0));
            } else if ((float)this.bZ != 7.0F && (float)this.bZ != 15.0F && (float)this.bZ != 23.0F) {
               this.n(this.cr.d, $$0.e, this.cr.f);
            } else {
               this.n(0.0, this.aJ() ? 0.27 : $$0.e, 0.0);
            }
         }
      }
   }

   private void gT() {
      fay $$0 = this.dz();
      dgg $$1 = this.dW();
      $$1.a(
         lt.ai,
         this.dB() - (double)(this.dr() + 1.0F) * 0.5 * (double)ayy.a(this.aX * (float) (Math.PI / 180.0)),
         this.dF() - 0.1F,
         this.dH() + (double)(this.dr() + 1.0F) * 0.5 * (double)ayy.b(this.aX * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(avz.sU, 1.0F, 1.0F);

      for (chl $$3 : $$1.a(chl.class, this.cR().g(10.0))) {
         if (!$$3.e_() && $$3.aJ() && !$$3.bj() && $$3.gL()) {
            $$3.s();
         }
      }

      if (this.dW() instanceof arc $$4 && $$4.O().b(dgc.f)) {
         this.a($$4, evl.aH, this::a);
      }
   }

   @Override
   protected void a(arc $$0, cla $$1) {
      if (this.a(bur.a).f() && b($$1)) {
         this.a($$1);
         cwn $$2 = $$1.l();
         this.a(bur.a, $$2);
         this.g(bur.a);
         this.a($$1, $$2.M());
         $$1.at();
      }
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      this.x(false);
      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      azg $$4 = $$0.H_();
      this.a(chl.a.a($$4));
      this.b(chl.a.a($$4));
      this.gK();
      if ($$3 == null) {
         $$3 = new bua.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(chl $$0, @Nullable chl $$1) {
      if ($$1 == null) {
         if (this.ae.h()) {
            this.a($$0.gU());
            this.b(chl.a.a(this.ae));
         } else {
            this.a(chl.a.a(this.ae));
            this.b($$0.gU());
         }
      } else if (this.ae.h()) {
         this.a($$0.gU());
         this.b($$1.gU());
      } else {
         this.a($$1.gU());
         this.b($$0.gU());
      }

      if (this.ae.a(32) == 0) {
         this.a(chl.a.a(this.ae));
      }

      if (this.ae.a(32) == 0) {
         this.b(chl.a.a(this.ae));
      }
   }

   private chl.a gU() {
      return this.ae.h() ? this.gs() : this.gt();
   }

   public void gK() {
      if (this.gI()) {
         this.g(bwn.s).a(10.0);
      }

      if (this.gE()) {
         this.g(bwn.v).a(0.07F);
      }
   }

   void gV() {
      if (!this.bj()) {
         this.G(0.0F);
         this.L().m();
         this.x(true);
      }
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if (this.gJ()) {
         return bsi.e;
      } else if (this.gp()) {
         this.y(false);
         return bsi.a;
      } else if (this.j($$2)) {
         if (this.O_() != null) {
            this.cp = true;
         }

         if (this.e_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.Y_() / 20) * 0.1F), true);
         } else if (!this.dW().C && this.Y_() == 0 && this.gw()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
         } else {
            if (!(this.dW() instanceof arc $$3) || this.x() || this.bj()) {
               return bsi.e;
            }

            this.gV();
            this.z(true);
            cwn $$4 = this.a(bur.a);
            if (!$$4.f() && !$$0.fV()) {
               this.a($$3, $$4);
            }

            this.a(bur.a, new cwn($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return bsi.b;
      } else {
         return bsi.e;
      }
   }

   @Nullable
   @Override
   protected avy u() {
      if (this.ge()) {
         return avz.ta;
      } else {
         return this.gF() ? avz.tb : avz.sV;
      }
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.sY, 0.15F, 1.0F);
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.at);
   }

   @Nullable
   @Override
   protected avy o_() {
      return avz.sW;
   }

   @Nullable
   @Override
   protected avy e(bsz $$0) {
      return avz.tc;
   }

   public boolean gL() {
      return !this.gp() && !this.gJ() && !this.gq() && !this.gB() && !this.x();
   }

   @Override
   public bum e(bvr $$0) {
      return this.e_() ? ci : super.e($$0);
   }

   private static boolean b(cla $$0) {
      return $$0.l().a(awx.au) && $$0.bL() && !$$0.v();
   }

   public static enum a implements azu {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final azu.a<chl.a> h = azu.a(chl.a::values);
      private static final IntFunction<chl.a> i = axp.a(chl.a::a, values(), axp.a.a);
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

      static chl.a a(chl.a $$0, chl.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static chl.a a(int $$0) {
         return i.apply($$0);
      }

      public static chl.a a(String $$0) {
         return h.a($$0, a);
      }

      public static chl.a a(azg $$0) {
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

   static class b extends ccn {
      private final chl b;

      public b(chl $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gL() && super.b();
      }
   }

   static class c<T extends bvf> extends cbk<T> {
      private final chl i;

      public c(chl $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, buo.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gF() && this.i.gL() && super.b();
      }
   }

   static class d extends cbp {
      private final chl d;
      private int e;

      public d(chl $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         if (!super.b() || this.d.p() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.af) {
               this.d.s(32);
               this.e = this.d.af + 600;
               if (this.d.dk()) {
                  cov $$0 = this.b.a(chl.ch, this.d);
                  this.d.cy.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         ji $$0 = this.d.dw();
         ji.a $$1 = new ji.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(djm.nB)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cdv {
      private final chl a;

      public e(chl $$0, Class<?>... $$1) {
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
      protected void a(bvh $$0, bvf $$1) {
         if ($$0 instanceof chl && $$0.ge()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends ccd {
      private final chl a;
      private int b;

      public f(chl $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return this.b < this.a.af && this.a.gE() && this.a.gL() && this.a.ae.a(b(400)) == 1;
      }

      @Override
      public boolean c() {
         return !this.a.bj() && (this.a.gE() || this.a.ae.a(b(600)) != 1) ? this.a.ae.a(b(2000)) != 1 : false;
      }

      @Override
      public void d() {
         this.a.y(true);
         this.b = 0;
      }

      @Override
      public void e() {
         this.a.y(false);
         this.b = this.a.af + 200;
      }
   }

   static class g extends ccl {
      private final chl h;

      public g(chl $$0, Class<? extends bvf> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bvf $$0) {
         this.c = $$0;
      }

      @Override
      public boolean c() {
         return this.c != null && super.c();
      }

      @Override
      public boolean b() {
         if (this.b.dZ().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               arc $$0 = a(this.b);
               if (this.f == cov.class) {
                  this.c = $$0.a(this.g, this.b, this.b.dB(), this.b.dF(), this.b.dH());
               } else {
                  this.c = $$0.a(
                     this.b.dW().a(this.f, this.b.cR().c((double)this.d, 3.0, (double)this.d), $$0x -> true),
                     this.g,
                     this.b,
                     this.b.dB(),
                     this.b.dF(),
                     this.b.dH()
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

   static class h extends cbg {
      private final chl l;

      public h(chl $$0) {
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

   static class i extends ccw {
      private final chl a;

      public i(chl $$0, double $$1) {
         super($$0, $$1, awq.G);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (this.a.x()) {
            this.a.L().m();
            return false;
         } else {
            return super.c();
         }
      }
   }

   static class j extends ccd {
      private final chl a;

      public j(chl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccd.a.a, ccd.a.b, ccd.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.e_() || this.a.gG()) && this.a.aJ()) {
            if (!this.a.gL()) {
               return false;
            } else {
               float $$0 = this.a.dM() * (float) (Math.PI / 180.0);
               float $$1 = -ayy.a($$0);
               float $$2 = ayy.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? ayy.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? ayy.j((double)$$2) : 0;
               if (this.a.dW().a_(this.a.dw().b($$3, -1, $$4)).l()) {
                  return true;
               } else {
                  return this.a.gG() && this.a.ae.a(b(60)) == 1 ? true : this.a.ae.a(b(500)) == 1;
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
      public boolean U_() {
         return false;
      }
   }

   class k extends ccd {
      private int b;

      public k() {
         this.a(EnumSet.of(ccd.a.a));
      }

      @Override
      public boolean b() {
         if (this.b > chl.this.af || chl.this.e_() || chl.this.bj() || !chl.this.gL() || chl.this.p() > 0) {
            return false;
         } else {
            return !chl.this.a(bur.a).f() ? true : !chl.this.dW().a(cla.class, chl.this.cR().c(6.0, 6.0, 6.0), chl::b).isEmpty();
         }
      }

      @Override
      public boolean c() {
         return !chl.this.bj() && (chl.this.gE() || chl.this.ae.a(b(600)) != 1) ? chl.this.ae.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!chl.this.x() && !chl.this.a(bur.a).f()) {
            chl.this.gV();
         }
      }

      @Override
      public void d() {
         if (chl.this.a(bur.a).f()) {
            List<cla> $$0 = chl.this.dW().a(cla.class, chl.this.cR().c(8.0, 8.0, 8.0), chl::b);
            if (!$$0.isEmpty()) {
               chl.this.L().a($$0.getFirst(), 1.2F);
            }
         } else {
            chl.this.gV();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cwn $$0 = chl.this.a(bur.a);
         if (!$$0.f()) {
            chl.this.a(a(chl.this.dW()), $$0);
            chl.this.a(bur.a, cwn.j);
            int $$1 = chl.this.gE() ? chl.this.ae.a(50) + 10 : chl.this.ae.a(150) + 10;
            this.b = chl.this.af + $$1 * 20;
         }

         chl.this.x(false);
      }
   }

   static class l extends ccd {
      private final chl a;

      public l(chl $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.e_() && this.a.gL()) {
            return this.a.gI() && this.a.ae.a(b(500)) == 1 ? true : this.a.ae.a(b(6000)) == 1;
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
