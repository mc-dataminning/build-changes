import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chn extends cgy {
   private static final ajy<Integer> ca = akc.a(chn.class, aka.b);
   private static final ajy<Integer> cc = akc.a(chn.class, aka.b);
   private static final ajy<Integer> cd = akc.a(chn.class, aka.b);
   private static final ajy<Byte> ce = akc.a(chn.class, aka.a);
   private static final ajy<Byte> cf = akc.a(chn.class, aka.a);
   private static final ajy<Byte> cg = akc.a(chn.class, aka.a);
   static final cfy ch = cfy.b().a(8.0);
   private static final buo ci = bus.aN.n().a(0.5F).a(bun.a().a(bum.a, 0.0F, 0.40625F, 0.0F));
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
   chn.g cy;

   public chn(bus<? extends chn> $$0, dgi $$1) {
      super($$0, $$1);
      this.bP = new chn.h(this);
      if (!this.e_()) {
         this.a_(true);
      }
   }

   @Override
   protected boolean f(but $$0) {
      return $$0 == but.a && this.fN();
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

   public boolean gs() {
      return this.v(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gt() {
      return this.al.a(cd) > 0;
   }

   public void z(boolean $$0) {
      this.al.a(cd, $$0 ? 1 : 0);
   }

   private int gP() {
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

   public int gu() {
      return this.al.a(cc);
   }

   public void t(int $$0) {
      this.al.a(cc, $$0);
   }

   public chn.a gv() {
      return chn.a.a(this.al.a(ce));
   }

   public void a(chn.a $$0) {
      if ($$0.a() > 6) {
         $$0 = chn.a.a(this.ae);
      }

      this.al.a(ce, (byte)$$0.a());
   }

   public chn.a gw() {
      return chn.a.a(this.al.a(cf));
   }

   public void b(chn.a $$0) {
      if ($$0.a() > 6) {
         $$0 = chn.a.a(this.ae);
      }

      this.al.a(cf, (byte)$$0.a());
   }

   public boolean gE() {
      return this.v(4);
   }

   public void B(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(akc.a $$0) {
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
      $$0.a("MainGene", this.gv().c());
      $$0.a("HiddenGene", this.gw().c());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(chn.a.a($$0.l("MainGene")));
      this.b(chn.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public buc a(ard $$0, buc $$1) {
      chn $$2 = bus.aN.a($$0, bur.e);
      if ($$2 != null) {
         if ($$1 instanceof chn $$3) {
            $$2.a(this, $$3);
         }

         $$2.gN();
      }

      return $$2;
   }

   @Override
   protected void E() {
      this.bS.a(0, new cbz(this));
      this.bS.a(2, new chn.i(this, 2.0));
      this.bS.a(2, new chn.d(this, 1.0));
      this.bS.a(3, new chn.b(this, 1.2F, true));
      this.bS.a(4, new cdn(this, 1.0, $$0 -> $$0.a(awy.at), false));
      this.bS.a(6, new chn.c<>(this, cox.class, 8.0F, 2.0, 2.0));
      this.bS.a(6, new chn.c<>(this, cly.class, 4.0F, 2.0, 2.0));
      this.bS.a(7, new chn.k());
      this.bS.a(8, new chn.f(this));
      this.bS.a(8, new chn.l(this));
      this.cy = new chn.g(this, cox.class, 6.0F);
      this.bS.a(9, this.cy);
      this.bS.a(10, new cda(this));
      this.bS.a(12, new chn.j(this));
      this.bS.a(13, new cce(this, 1.25));
      this.bS.a(14, new cds(this, 1.0));
      this.bT.a(1, new chn.e(this).a(new Class[0]));
   }

   public static bwo.a gF() {
      return cgy.gx().a(bwp.v, 0.15F).a(bwp.c, 6.0);
   }

   public chn.a gG() {
      return chn.a.a(this.gv(), this.gw());
   }

   public boolean gH() {
      return this.gG() == chn.a.b;
   }

   public boolean gI() {
      return this.gG() == chn.a.c;
   }

   public boolean gJ() {
      return this.gG() == chn.a.d;
   }

   public boolean gK() {
      return this.gG() == chn.a.e;
   }

   public boolean gL() {
      return this.gG() == chn.a.f;
   }

   @Override
   public boolean gh() {
      return this.gG() == chn.a.g;
   }

   @Override
   public boolean y() {
      return false;
   }

   @Override
   public boolean c(ard $$0, bul $$1) {
      if (!this.gh()) {
         this.cq = true;
      }

      return super.c($$0, $$1);
   }

   @Override
   public void gj() {
      this.a(awa.td, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.gI()) {
         if (this.dV().af() && !this.bj()) {
            this.x(true);
            this.z(false);
         } else if (!this.gt()) {
            this.x(false);
         }
      }

      bvh $$0 = this.O_();
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
         this.t(this.gu() + 1);
         if (this.gu() > 20) {
            this.A(false);
            this.gW();
         } else if (this.gu() == 1) {
            this.a(awa.sT, 1.0F, 1.0F);
         }
      }

      if (this.gE()) {
         this.gV();
      } else {
         this.bZ = 0;
      }

      if (this.x()) {
         this.w(0.0F);
      }

      this.gS();
      this.gQ();
      this.gT();
      this.gU();
   }

   public boolean gM() {
      return this.gI() && this.dV().af();
   }

   private void gQ() {
      if (!this.gt() && this.x() && !this.gM() && !this.a(but.a).f() && this.ae.a(80) == 1) {
         this.z(true);
      } else if (this.a(but.a).f() || !this.x()) {
         this.z(false);
      }

      if (this.gt()) {
         this.gR();
         if (!this.dV().C && this.gP() > 80 && this.ae.a(20) == 1) {
            if (this.gP() > 100 && this.a(but.a).a(awy.au)) {
               if (!this.dV().C) {
                  this.a(but.a, cwp.j);
                  this.a(ebt.m);
               }

               this.x(false);
            }

            this.z(false);
            return;
         }

         this.u(this.gP() + 1);
      }
   }

   private void gR() {
      if (this.gP() % 5 == 0) {
         this.a(awa.sX, 0.5F + 0.5F * (float)this.ae.a(2), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            fba $$1 = new fba(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ae.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dN() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dL() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ae.i()) * 0.6 - 0.3;
            fba $$3 = new fba(((double)this.ae.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ae.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aX * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dA(), this.dE() + 1.0, this.dG());
            this.dV().a(new lp(lt.T, this.a(but.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void gS() {
      this.ct = this.cs;
      if (this.x()) {
         this.cs = Math.min(1.0F, this.cs + 0.15F);
      } else {
         this.cs = Math.max(0.0F, this.cs - 0.19F);
      }
   }

   private void gT() {
      this.cv = this.cu;
      if (this.gs()) {
         this.cu = Math.min(1.0F, this.cu + 0.15F);
      } else {
         this.cu = Math.max(0.0F, this.cu - 0.19F);
      }
   }

   private void gU() {
      this.cx = this.cw;
      if (this.gE()) {
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

   private void gV() {
      this.bZ++;
      if (this.bZ > 32) {
         this.B(false);
      } else {
         if (!this.dV().C) {
            fba $$0 = this.dy();
            if (this.bZ == 1) {
               float $$1 = this.dL() * (float) (Math.PI / 180.0);
               float $$2 = this.e_() ? 0.1F : 0.2F;
               this.cr = new fba($$0.d + (double)(-ayz.a($$1) * $$2), 0.0, $$0.f + (double)(ayz.b($$1) * $$2));
               this.i(this.cr.b(0.0, 0.27, 0.0));
            } else if ((float)this.bZ != 7.0F && (float)this.bZ != 15.0F && (float)this.bZ != 23.0F) {
               this.n(this.cr.d, $$0.e, this.cr.f);
            } else {
               this.n(0.0, this.aJ() ? 0.27 : $$0.e, 0.0);
            }
         }
      }
   }

   private void gW() {
      fba $$0 = this.dy();
      dgi $$1 = this.dV();
      $$1.a(
         lt.ai,
         this.dA() - (double)(this.dq() + 1.0F) * 0.5 * (double)ayz.a(this.aX * (float) (Math.PI / 180.0)),
         this.dE() - 0.1F,
         this.dG() + (double)(this.dq() + 1.0F) * 0.5 * (double)ayz.b(this.aX * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(awa.sU, 1.0F, 1.0F);

      for (chn $$3 : $$1.a(chn.class, this.cR().g(10.0))) {
         if (!$$3.e_() && $$3.aJ() && !$$3.bj() && $$3.gO()) {
            $$3.s();
         }
      }

      if (this.dV() instanceof ard $$4 && $$4.O().b(dge.f)) {
         this.a($$4, evn.aH, this::a);
      }
   }

   @Override
   protected void a(ard $$0, clc $$1) {
      if (this.a(but.a).f() && b($$1)) {
         this.a($$1);
         cwp $$2 = $$1.l();
         this.a(but.a, $$2);
         this.g(but.a);
         this.a($$1, $$2.M());
         $$1.at();
      }
   }

   @Override
   public boolean a(ard $$0, btb $$1, float $$2) {
      this.x(false);
      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      azh $$4 = $$0.H_();
      this.a(chn.a.a($$4));
      this.b(chn.a.a($$4));
      this.gN();
      if ($$3 == null) {
         $$3 = new buc.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(chn $$0, @Nullable chn $$1) {
      if ($$1 == null) {
         if (this.ae.h()) {
            this.a($$0.gX());
            this.b(chn.a.a(this.ae));
         } else {
            this.a(chn.a.a(this.ae));
            this.b($$0.gX());
         }
      } else if (this.ae.h()) {
         this.a($$0.gX());
         this.b($$1.gX());
      } else {
         this.a($$1.gX());
         this.b($$0.gX());
      }

      if (this.ae.a(32) == 0) {
         this.a(chn.a.a(this.ae));
      }

      if (this.ae.a(32) == 0) {
         this.b(chn.a.a(this.ae));
      }
   }

   private chn.a gX() {
      return this.ae.h() ? this.gv() : this.gw();
   }

   public void gN() {
      if (this.gL()) {
         this.g(bwp.s).a(10.0);
      }

      if (this.gH()) {
         this.g(bwp.v).a(0.07F);
      }
   }

   void gY() {
      if (!this.bj()) {
         this.G(0.0F);
         this.P().m();
         this.x(true);
      }
   }

   @Override
   public bsk b(cox $$0, bsj $$1) {
      cwp $$2 = $$0.b($$1);
      if (this.gM()) {
         return bsk.e;
      } else if (this.gs()) {
         this.y(false);
         return bsk.a;
      } else if (this.j($$2)) {
         if (this.O_() != null) {
            this.cp = true;
         }

         if (this.e_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.Y_() / 20) * 0.1F), true);
         } else if (!this.dV().C && this.Y_() == 0 && this.gz()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
         } else {
            if (!(this.dV() instanceof ard $$3) || this.x() || this.bj()) {
               return bsk.e;
            }

            this.gY();
            this.z(true);
            cwp $$4 = this.a(but.a);
            if (!$$4.f() && !$$0.fV()) {
               this.a($$3, $$4);
            }

            this.a(but.a, new cwp($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return bsk.b;
      } else {
         return bsk.e;
      }
   }

   @Nullable
   @Override
   protected avz u() {
      if (this.gh()) {
         return awa.ta;
      } else {
         return this.gI() ? awa.tb : awa.sV;
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
   protected avz e(btb $$0) {
      return awa.tc;
   }

   public boolean gO() {
      return !this.gs() && !this.gM() && !this.gt() && !this.gE() && !this.x();
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? ci : super.e($$0);
   }

   private static boolean b(clc $$0) {
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

      public static final azv.a<chn.a> h = azv.a(chn.a::values);
      private static final IntFunction<chn.a> i = axq.a(chn.a::a, values(), axq.a.a);
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

      static chn.a a(chn.a $$0, chn.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static chn.a a(int $$0) {
         return i.apply($$0);
      }

      public static chn.a a(String $$0) {
         return h.a($$0, a);
      }

      public static chn.a a(azh $$0) {
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

   static class b extends ccp {
      private final chn b;

      public b(chn $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gO() && super.b();
      }
   }

   static class c<T extends bvh> extends cbm<T> {
      private final chn i;

      public c(chn $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, buq.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gI() && this.i.gO() && super.b();
      }
   }

   static class d extends cbr {
      private final chn d;
      private int e;

      public d(chn $$0, double $$1) {
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
               if (this.d.dj()) {
                  cox $$0 = this.b.a(chn.ch, this.d);
                  this.d.cy.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         ji $$0 = this.d.dv();
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

   static class e extends cdx {
      private final chn a;

      public e(chn $$0, Class<?>... $$1) {
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
      protected void a(bvj $$0, bvh $$1) {
         if ($$0 instanceof chn && $$0.gh()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends ccf {
      private final chn a;
      private int b;

      public f(chn $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return this.b < this.a.af && this.a.gH() && this.a.gO() && this.a.ae.a(b(400)) == 1;
      }

      @Override
      public boolean c() {
         return !this.a.bj() && (this.a.gH() || this.a.ae.a(b(600)) != 1) ? this.a.ae.a(b(2000)) != 1 : false;
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

   static class g extends ccn {
      private final chn h;

      public g(chn $$0, Class<? extends bvh> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bvh $$0) {
         this.c = $$0;
      }

      @Override
      public boolean c() {
         return this.c != null && super.c();
      }

      @Override
      public boolean b() {
         if (this.b.dY().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               ard $$0 = a(this.b);
               if (this.f == cox.class) {
                  this.c = $$0.a(this.g, this.b, this.b.dA(), this.b.dE(), this.b.dG());
               } else {
                  this.c = $$0.a(
                     this.b.dV().a(this.f, this.b.cR().c((double)this.d, 3.0, (double)this.d), $$0x -> true),
                     this.g,
                     this.b,
                     this.b.dA(),
                     this.b.dE(),
                     this.b.dG()
                  );
               }
            }

            return this.h.gO() && this.c != null;
         }
      }

      @Override
      public void a() {
         if (this.c != null) {
            super.a();
         }
      }
   }

   static class h extends cbi {
      private final chn l;

      public h(chn $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gO()) {
            super.a();
         }
      }
   }

   static class i extends ccy {
      private final chn a;

      public i(chn $$0, double $$1) {
         super($$0, $$1, awr.G);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (this.a.x()) {
            this.a.P().m();
            return false;
         } else {
            return super.c();
         }
      }
   }

   static class j extends ccf {
      private final chn a;

      public j(chn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccf.a.a, ccf.a.b, ccf.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.e_() || this.a.gJ()) && this.a.aJ()) {
            if (!this.a.gO()) {
               return false;
            } else {
               float $$0 = this.a.dL() * (float) (Math.PI / 180.0);
               float $$1 = -ayz.a($$0);
               float $$2 = ayz.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? ayz.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? ayz.j((double)$$2) : 0;
               if (this.a.dV().a_(this.a.dv().b($$3, -1, $$4)).l()) {
                  return true;
               } else {
                  return this.a.gJ() && this.a.ae.a(b(60)) == 1 ? true : this.a.ae.a(b(500)) == 1;
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

   class k extends ccf {
      private int b;

      public k() {
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean b() {
         if (this.b > chn.this.af || chn.this.e_() || chn.this.bj() || !chn.this.gO() || chn.this.p() > 0) {
            return false;
         } else {
            return !chn.this.a(but.a).f() ? true : !chn.this.dV().a(clc.class, chn.this.cR().c(6.0, 6.0, 6.0), chn::b).isEmpty();
         }
      }

      @Override
      public boolean c() {
         return !chn.this.bj() && (chn.this.gH() || chn.this.ae.a(b(600)) != 1) ? chn.this.ae.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!chn.this.x() && !chn.this.a(but.a).f()) {
            chn.this.gY();
         }
      }

      @Override
      public void d() {
         if (chn.this.a(but.a).f()) {
            List<clc> $$0 = chn.this.dV().a(clc.class, chn.this.cR().c(8.0, 8.0, 8.0), chn::b);
            if (!$$0.isEmpty()) {
               chn.this.P().a($$0.getFirst(), 1.2F);
            }
         } else {
            chn.this.gY();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cwp $$0 = chn.this.a(but.a);
         if (!$$0.f()) {
            chn.this.a(a(chn.this.dV()), $$0);
            chn.this.a(but.a, cwp.j);
            int $$1 = chn.this.gH() ? chn.this.ae.a(50) + 10 : chn.this.ae.a(150) + 10;
            this.b = chn.this.af + $$1 * 20;
         }

         chn.this.x(false);
      }
   }

   static class l extends ccf {
      private final chn a;

      public l(chn $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.e_() && this.a.gO()) {
            return this.a.gL() && this.a.ae.a(b(500)) == 1 ? true : this.a.ae.a(b(6000)) == 1;
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
