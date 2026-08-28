import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chm extends cgx {
   private static final ajx<Integer> ca = akb.a(chm.class, ajz.b);
   private static final ajx<Integer> cc = akb.a(chm.class, ajz.b);
   private static final ajx<Integer> cd = akb.a(chm.class, ajz.b);
   private static final ajx<Byte> ce = akb.a(chm.class, ajz.a);
   private static final ajx<Byte> cf = akb.a(chm.class, ajz.a);
   private static final ajx<Byte> cg = akb.a(chm.class, ajz.a);
   static final cfx ch = cfx.b().a(8.0);
   private static final bun ci = bur.aO.n().a(0.5F).a(bum.a().a(bul.a, 0.0F, 0.40625F, 0.0F));
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
   private fba cr;
   private float cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   chm.g cy;

   public chm(bur<? extends chm> $$0, dgi $$1) {
      super($$0, $$1);
      this.bP = new chm.h(this);
      if (!this.e_()) {
         this.a_(true);
      }
   }

   @Override
   protected boolean f(bus $$0) {
      return $$0 == bus.a && this.fN();
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

   public chm.a gs() {
      return chm.a.a(this.al.a(ce));
   }

   public void a(chm.a $$0) {
      if ($$0.a() > 6) {
         $$0 = chm.a.a(this.ae);
      }

      this.al.a(ce, (byte)$$0.a());
   }

   public chm.a gt() {
      return chm.a.a(this.al.a(cf));
   }

   public void b(chm.a $$0) {
      if ($$0.a() > 6) {
         $$0 = chm.a.a(this.ae);
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
      this.a(chm.a.a($$0.l("MainGene")));
      this.b(chm.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bub a(arc $$0, bub $$1) {
      chm $$2 = bur.aO.a($$0, buq.e);
      if ($$2 != null) {
         if ($$1 instanceof chm $$3) {
            $$2.a(this, $$3);
         }

         $$2.gK();
      }

      return $$2;
   }

   @Override
   protected void B() {
      this.bS.a(0, new cby(this));
      this.bS.a(2, new chm.i(this, 2.0));
      this.bS.a(2, new chm.d(this, 1.0));
      this.bS.a(3, new chm.b(this, 1.2F, true));
      this.bS.a(4, new cdm(this, 1.0, $$0 -> $$0.a(awy.at), false));
      this.bS.a(6, new chm.c<>(this, cox.class, 8.0F, 2.0, 2.0));
      this.bS.a(6, new chm.c<>(this, clx.class, 4.0F, 2.0, 2.0));
      this.bS.a(7, new chm.k());
      this.bS.a(8, new chm.f(this));
      this.bS.a(8, new chm.l(this));
      this.cy = new chm.g(this, cox.class, 6.0F);
      this.bS.a(9, this.cy);
      this.bS.a(10, new ccz(this));
      this.bS.a(12, new chm.j(this));
      this.bS.a(13, new ccd(this, 1.25));
      this.bS.a(14, new cdr(this, 1.0));
      this.bT.a(1, new chm.e(this).a(new Class[0]));
   }

   public static bwn.a gC() {
      return cgx.gu().a(bwo.v, 0.15F).a(bwo.c, 6.0);
   }

   public chm.a gD() {
      return chm.a.a(this.gs(), this.gt());
   }

   public boolean gE() {
      return this.gD() == chm.a.b;
   }

   public boolean gF() {
      return this.gD() == chm.a.c;
   }

   public boolean gG() {
      return this.gD() == chm.a.d;
   }

   public boolean gH() {
      return this.gD() == chm.a.e;
   }

   public boolean gI() {
      return this.gD() == chm.a.f;
   }

   @Override
   public boolean ge() {
      return this.gD() == chm.a.g;
   }

   @Override
   public boolean y() {
      return false;
   }

   @Override
   public boolean c(arc $$0, buk $$1) {
      if (!this.ge()) {
         this.cq = true;
      }

      return super.c($$0, $$1);
   }

   @Override
   public void gg() {
      this.a(awa.td, 1.0F, 1.0F);
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

      bvg $$0 = this.O_();
      if ($$0 == null) {
         this.cp = false;
         this.cq = false;
      }

      if (this.p() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.p() == 29 || this.p() == 14) {
            this.a(awa.sZ, 1.0F, 1.0F);
         }

         this.s(this.p() - 1);
      }

      if (this.t()) {
         this.t(this.gr() + 1);
         if (this.gr() > 20) {
            this.A(false);
            this.gT();
         } else if (this.gr() == 1) {
            this.a(awa.sT, 1.0F, 1.0F);
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
      if (!this.gq() && this.x() && !this.gJ() && !this.a(bus.a).f() && this.ae.a(80) == 1) {
         this.z(true);
      } else if (this.a(bus.a).f() || !this.x()) {
         this.z(false);
      }

      if (this.gq()) {
         this.gO();
         if (!this.dW().C && this.gM() > 80 && this.ae.a(20) == 1) {
            if (this.gM() > 100 && this.a(bus.a).a(awy.au)) {
               if (!this.dW().C) {
                  this.a(bus.a, cwp.j);
                  this.a(ebt.m);
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
         this.a(awa.sX, 0.5F + 0.5F * (float)this.ae.a(2), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            fba $$1 = new fba(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ae.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dO() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dM() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ae.i()) * 0.6 - 0.3;
            fba $$3 = new fba(((double)this.ae.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ae.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aX * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dB(), this.dF() + 1.0, this.dH());
            this.dW().a(new lp(lt.T, this.a(bus.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
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
      return ayz.h($$0, this.ct, this.cs);
   }

   public float K(float $$0) {
      return ayz.h($$0, this.cv, this.cu);
   }

   public float L(float $$0) {
      return ayz.h($$0, this.cx, this.cw);
   }

   private void gS() {
      this.bZ++;
      if (this.bZ > 32) {
         this.B(false);
      } else {
         if (!this.dW().C) {
            fba $$0 = this.dz();
            if (this.bZ == 1) {
               float $$1 = this.dM() * (float) (Math.PI / 180.0);
               float $$2 = this.e_() ? 0.1F : 0.2F;
               this.cr = new fba($$0.d + (double)(-ayz.a($$1) * $$2), 0.0, $$0.f + (double)(ayz.b($$1) * $$2));
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
      fba $$0 = this.dz();
      dgi $$1 = this.dW();
      $$1.a(
         lt.ai,
         this.dB() - (double)(this.dr() + 1.0F) * 0.5 * (double)ayz.a(this.aX * (float) (Math.PI / 180.0)),
         this.dF() - 0.1F,
         this.dH() + (double)(this.dr() + 1.0F) * 0.5 * (double)ayz.b(this.aX * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(awa.sU, 1.0F, 1.0F);

      for (chm $$3 : $$1.a(chm.class, this.cR().g(10.0))) {
         if (!$$3.e_() && $$3.aJ() && !$$3.bj() && $$3.gL()) {
            $$3.s();
         }
      }

      if (this.dW() instanceof arc $$4 && $$4.O().b(dge.f)) {
         this.a($$4, evn.aH, this::a);
      }
   }

   @Override
   protected void a(arc $$0, clb $$1) {
      if (this.a(bus.a).f() && b($$1)) {
         this.a($$1);
         cwp $$2 = $$1.l();
         this.a(bus.a, $$2);
         this.g(bus.a);
         this.a($$1, $$2.M());
         $$1.at();
      }
   }

   @Override
   public boolean a(arc $$0, bta $$1, float $$2) {
      this.x(false);
      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      azh $$4 = $$0.H_();
      this.a(chm.a.a($$4));
      this.b(chm.a.a($$4));
      this.gK();
      if ($$3 == null) {
         $$3 = new bub.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(chm $$0, @Nullable chm $$1) {
      if ($$1 == null) {
         if (this.ae.h()) {
            this.a($$0.gU());
            this.b(chm.a.a(this.ae));
         } else {
            this.a(chm.a.a(this.ae));
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
         this.a(chm.a.a(this.ae));
      }

      if (this.ae.a(32) == 0) {
         this.b(chm.a.a(this.ae));
      }
   }

   private chm.a gU() {
      return this.ae.h() ? this.gs() : this.gt();
   }

   public void gK() {
      if (this.gI()) {
         this.g(bwo.s).a(10.0);
      }

      if (this.gE()) {
         this.g(bwo.v).a(0.07F);
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
   public bsj b(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
      if (this.gJ()) {
         return bsj.e;
      } else if (this.gp()) {
         this.y(false);
         return bsj.a;
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
               return bsj.e;
            }

            this.gV();
            this.z(true);
            cwp $$4 = this.a(bus.a);
            if (!$$4.f() && !$$0.fV()) {
               this.a($$3, $$4);
            }

            this.a(bus.a, new cwp($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return bsj.b;
      } else {
         return bsj.e;
      }
   }

   @Nullable
   @Override
   protected avz u() {
      if (this.ge()) {
         return awa.ta;
      } else {
         return this.gF() ? awa.tb : awa.sV;
      }
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.sY, 0.15F, 1.0F);
   }

   @Override
   public boolean j(cwp $$0) {
      return $$0.a(awy.at);
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.sW;
   }

   @Nullable
   @Override
   protected avz e(bta $$0) {
      return awa.tc;
   }

   public boolean gL() {
      return !this.gp() && !this.gJ() && !this.gq() && !this.gB() && !this.x();
   }

   @Override
   public bun e(bvs $$0) {
      return this.e_() ? ci : super.e($$0);
   }

   private static boolean b(clb $$0) {
      return $$0.l().a(awy.au) && $$0.bL() && !$$0.v();
   }

   public static enum a implements azv {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final azv.a<chm.a> h = azv.a(chm.a::values);
      private static final IntFunction<chm.a> i = axq.a(chm.a::a, values(), axq.a.a);
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

      static chm.a a(chm.a $$0, chm.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static chm.a a(int $$0) {
         return i.apply($$0);
      }

      public static chm.a a(String $$0) {
         return h.a($$0, a);
      }

      public static chm.a a(azh $$0) {
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

   static class b extends cco {
      private final chm b;

      public b(chm $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gL() && super.b();
      }
   }

   static class c<T extends bvg> extends cbl<T> {
      private final chm i;

      public c(chm $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bup.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gF() && this.i.gL() && super.b();
      }
   }

   static class d extends cbq {
      private final chm d;
      private int e;

      public d(chm $$0, double $$1) {
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
                  cox $$0 = this.b.a(chm.ch, this.d);
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
                     if (this.b.a_($$1).a(djo.nB)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cdw {
      private final chm a;

      public e(chm $$0, Class<?>... $$1) {
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
      protected void a(bvi $$0, bvg $$1) {
         if ($$0 instanceof chm && $$0.ge()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends cce {
      private final chm a;
      private int b;

      public f(chm $$0) {
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

   static class g extends ccm {
      private final chm h;

      public g(chm $$0, Class<? extends bvg> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bvg $$0) {
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
               if (this.f == cox.class) {
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

   static class h extends cbh {
      private final chm l;

      public h(chm $$0) {
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

   static class i extends ccx {
      private final chm a;

      public i(chm $$0, double $$1) {
         super($$0, $$1, awr.G);
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

   static class j extends cce {
      private final chm a;

      public j(chm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cce.a.a, cce.a.b, cce.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.e_() || this.a.gG()) && this.a.aJ()) {
            if (!this.a.gL()) {
               return false;
            } else {
               float $$0 = this.a.dM() * (float) (Math.PI / 180.0);
               float $$1 = -ayz.a($$0);
               float $$2 = ayz.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? ayz.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? ayz.j((double)$$2) : 0;
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

   class k extends cce {
      private int b;

      public k() {
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public boolean b() {
         if (this.b > chm.this.af || chm.this.e_() || chm.this.bj() || !chm.this.gL() || chm.this.p() > 0) {
            return false;
         } else {
            return !chm.this.a(bus.a).f() ? true : !chm.this.dW().a(clb.class, chm.this.cR().c(6.0, 6.0, 6.0), chm::b).isEmpty();
         }
      }

      @Override
      public boolean c() {
         return !chm.this.bj() && (chm.this.gE() || chm.this.ae.a(b(600)) != 1) ? chm.this.ae.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!chm.this.x() && !chm.this.a(bus.a).f()) {
            chm.this.gV();
         }
      }

      @Override
      public void d() {
         if (chm.this.a(bus.a).f()) {
            List<clb> $$0 = chm.this.dW().a(clb.class, chm.this.cR().c(8.0, 8.0, 8.0), chm::b);
            if (!$$0.isEmpty()) {
               chm.this.L().a($$0.getFirst(), 1.2F);
            }
         } else {
            chm.this.gV();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cwp $$0 = chm.this.a(bus.a);
         if (!$$0.f()) {
            chm.this.a(a(chm.this.dW()), $$0);
            chm.this.a(bus.a, cwp.j);
            int $$1 = chm.this.gE() ? chm.this.ae.a(50) + 10 : chm.this.ae.a(150) + 10;
            this.b = chm.this.af + $$1 * 20;
         }

         chm.this.x(false);
      }
   }

   static class l extends cce {
      private final chm a;

      public l(chm $$0) {
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
