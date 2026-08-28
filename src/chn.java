import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chn extends cgy {
   private static final akm<Integer> ca = akq.a(chn.class, ako.b);
   private static final akm<Integer> cc = akq.a(chn.class, ako.b);
   private static final akm<Integer> cd = akq.a(chn.class, ako.b);
   private static final akm<Byte> ce = akq.a(chn.class, ako.a);
   private static final akm<Byte> cf = akq.a(chn.class, ako.a);
   private static final akm<Byte> cg = akq.a(chn.class, ako.a);
   static final cfy ch = cfy.b().a(8.0);
   private static final buo ci = bus.aK.n().a(0.5F).a(bun.a().a(bum.a, 0.0F, 0.40625F, 0.0F));
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
   private ezy cr;
   private float cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   chn.g cy;

   public chn(bus<? extends chn> $$0, dfm $$1) {
      super($$0, $$1);
      this.bP = new chn.h(this);
      if (!this.e_()) {
         this.a_(true);
      }
   }

   @Override
   protected boolean f(but $$0) {
      return $$0 == but.a && this.fL();
   }

   public int n() {
      return this.al.a(ca);
   }

   public void s(int $$0) {
      this.al.a(ca, $$0);
   }

   public boolean q() {
      return this.v(2);
   }

   public boolean v() {
      return this.v(8);
   }

   public void x(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gm() {
      return this.v(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gn() {
      return this.al.a(cd) > 0;
   }

   public void z(boolean $$0) {
      this.al.a(cd, $$0 ? 1 : 0);
   }

   private int gJ() {
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

   public int go() {
      return this.al.a(cc);
   }

   public void t(int $$0) {
      this.al.a(cc, $$0);
   }

   public chn.a gp() {
      return chn.a.a(this.al.a(ce));
   }

   public void a(chn.a $$0) {
      if ($$0.a() > 6) {
         $$0 = chn.a.a(this.ae);
      }

      this.al.a(ce, (byte)$$0.a());
   }

   public chn.a gq() {
      return chn.a.a(this.al.a(cf));
   }

   public void b(chn.a $$0) {
      if ($$0.a() > 6) {
         $$0 = chn.a.a(this.ae);
      }

      this.al.a(cf, (byte)$$0.a());
   }

   public boolean gy() {
      return this.v(4);
   }

   public void B(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(akq.a $$0) {
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
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gp().c());
      $$0.a("HiddenGene", this.gq().c());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.a(chn.a.a($$0.l("MainGene")));
      this.b(chn.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public buc a(arp $$0, buc $$1) {
      chn $$2 = bus.aK.a($$0, bur.e);
      if ($$2 != null) {
         if ($$1 instanceof chn $$3) {
            $$2.a(this, $$3);
         }

         $$2.gH();
      }

      return $$2;
   }

   @Override
   protected void B() {
      this.bS.a(0, new cbz(this));
      this.bS.a(2, new chn.i(this, 2.0));
      this.bS.a(2, new chn.d(this, 1.0));
      this.bS.a(3, new chn.b(this, 1.2F, true));
      this.bS.a(4, new cdn(this, 1.0, $$0 -> $$0.a(axl.au), false));
      this.bS.a(6, new chn.c<>(this, cou.class, 8.0F, 2.0, 2.0));
      this.bS.a(6, new chn.c<>(this, cly.class, 4.0F, 2.0, 2.0));
      this.bS.a(7, new chn.k());
      this.bS.a(8, new chn.f(this));
      this.bS.a(8, new chn.l(this));
      this.cy = new chn.g(this, cou.class, 6.0F);
      this.bS.a(9, this.cy);
      this.bS.a(10, new cda(this));
      this.bS.a(12, new chn.j(this));
      this.bS.a(13, new cce(this, 1.25));
      this.bS.a(14, new cds(this, 1.0));
      this.bT.a(1, new chn.e(this).a(new Class[0]));
   }

   public static bwo.a gz() {
      return cgy.gr().a(bwp.v, 0.15F).a(bwp.c, 6.0);
   }

   public chn.a gA() {
      return chn.a.a(this.gp(), this.gq());
   }

   public boolean gB() {
      return this.gA() == chn.a.b;
   }

   public boolean gC() {
      return this.gA() == chn.a.c;
   }

   public boolean gD() {
      return this.gA() == chn.a.d;
   }

   public boolean gE() {
      return this.gA() == chn.a.e;
   }

   public boolean gF() {
      return this.gA() == chn.a.f;
   }

   @Override
   public boolean gb() {
      return this.gA() == chn.a.g;
   }

   @Override
   public boolean y() {
      return false;
   }

   @Override
   public boolean c(arp $$0, bul $$1) {
      if (!this.gb()) {
         this.cq = true;
      }

      return super.c($$0, $$1);
   }

   @Override
   public void gd() {
      this.a(awn.sD, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.gC()) {
         if (this.dV().ad() && !this.bj()) {
            this.x(true);
            this.z(false);
         } else if (!this.gn()) {
            this.x(false);
         }
      }

      bvh $$0 = this.aa_();
      if ($$0 == null) {
         this.cp = false;
         this.cq = false;
      }

      if (this.n() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.n() == 29 || this.n() == 14) {
            this.a(awn.sz, 1.0F, 1.0F);
         }

         this.s(this.n() - 1);
      }

      if (this.q()) {
         this.t(this.go() + 1);
         if (this.go() > 20) {
            this.A(false);
            this.gQ();
         } else if (this.go() == 1) {
            this.a(awn.st, 1.0F, 1.0F);
         }
      }

      if (this.gy()) {
         this.gP();
      } else {
         this.bZ = 0;
      }

      if (this.v()) {
         this.w(0.0F);
      }

      this.gM();
      this.gK();
      this.gN();
      this.gO();
   }

   public boolean gG() {
      return this.gC() && this.dV().ad();
   }

   private void gK() {
      if (!this.gn() && this.v() && !this.gG() && !this.a(but.a).f() && this.ae.a(80) == 1) {
         this.z(true);
      } else if (this.a(but.a).f() || !this.v()) {
         this.z(false);
      }

      if (this.gn()) {
         this.gL();
         if (!this.dV().C && this.gJ() > 80 && this.ae.a(20) == 1) {
            if (this.gJ() > 100 && this.a(but.a).a(axl.av)) {
               if (!this.dV().C) {
                  this.a(but.a, cwm.k);
                  this.a(ear.m);
               }

               this.x(false);
            }

            this.z(false);
            return;
         }

         this.u(this.gJ() + 1);
      }
   }

   private void gL() {
      if (this.gJ() % 5 == 0) {
         this.a(awn.sx, 0.5F + 0.5F * (float)this.ae.a(2), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            ezy $$1 = new ezy(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ae.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dN() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dL() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ae.i()) * 0.6 - 0.3;
            ezy $$3 = new ezy(((double)this.ae.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ae.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aW * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dA(), this.dE() + 1.0, this.dG());
            this.dV().a(new lo(ls.S, this.a(but.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void gM() {
      this.ct = this.cs;
      if (this.v()) {
         this.cs = Math.min(1.0F, this.cs + 0.15F);
      } else {
         this.cs = Math.max(0.0F, this.cs - 0.19F);
      }
   }

   private void gN() {
      this.cv = this.cu;
      if (this.gm()) {
         this.cu = Math.min(1.0F, this.cu + 0.15F);
      } else {
         this.cu = Math.max(0.0F, this.cu - 0.19F);
      }
   }

   private void gO() {
      this.cx = this.cw;
      if (this.gy()) {
         this.cw = Math.min(1.0F, this.cw + 0.15F);
      } else {
         this.cw = Math.max(0.0F, this.cw - 0.19F);
      }
   }

   public float J(float $$0) {
      return azm.h($$0, this.ct, this.cs);
   }

   public float K(float $$0) {
      return azm.h($$0, this.cv, this.cu);
   }

   public float L(float $$0) {
      return azm.h($$0, this.cx, this.cw);
   }

   private void gP() {
      this.bZ++;
      if (this.bZ > 32) {
         this.B(false);
      } else {
         if (!this.dV().C) {
            ezy $$0 = this.dy();
            if (this.bZ == 1) {
               float $$1 = this.dL() * (float) (Math.PI / 180.0);
               float $$2 = this.e_() ? 0.1F : 0.2F;
               this.cr = new ezy($$0.d + (double)(-azm.a($$1) * $$2), 0.0, $$0.f + (double)(azm.b($$1) * $$2));
               this.h(this.cr.b(0.0, 0.27, 0.0));
            } else if ((float)this.bZ != 7.0F && (float)this.bZ != 15.0F && (float)this.bZ != 23.0F) {
               this.n(this.cr.d, $$0.e, this.cr.f);
            } else {
               this.n(0.0, this.aJ() ? 0.27 : $$0.e, 0.0);
            }
         }
      }
   }

   private void gQ() {
      ezy $$0 = this.dy();
      dfm $$1 = this.dV();
      $$1.a(
         ls.ag,
         this.dA() - (double)(this.dq() + 1.0F) * 0.5 * (double)azm.a(this.aW * (float) (Math.PI / 180.0)),
         this.dE() - 0.1F,
         this.dG() + (double)(this.dq() + 1.0F) * 0.5 * (double)azm.b(this.aW * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(awn.su, 1.0F, 1.0F);

      for (chn $$3 : $$1.a(chn.class, this.cR().g(10.0))) {
         if (!$$3.e_() && $$3.aJ() && !$$3.bj() && $$3.gI()) {
            $$3.s();
         }
      }

      if (this.dV() instanceof arp $$4 && $$4.N().b(dfi.f)) {
         this.a($$4, euj.aH, this::a);
      }
   }

   @Override
   protected void a(arp $$0, clc $$1) {
      if (this.a(but.a).f() && b($$1)) {
         this.a($$1);
         cwm $$2 = $$1.j();
         this.a(but.a, $$2);
         this.g(but.a);
         this.a($$1, $$2.L());
         $$1.at();
      }
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      this.x(false);
      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      azu $$4 = $$0.G_();
      this.a(chn.a.a($$4));
      this.b(chn.a.a($$4));
      this.gH();
      if ($$3 == null) {
         $$3 = new buc.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(chn $$0, @Nullable chn $$1) {
      if ($$1 == null) {
         if (this.ae.h()) {
            this.a($$0.gR());
            this.b(chn.a.a(this.ae));
         } else {
            this.a(chn.a.a(this.ae));
            this.b($$0.gR());
         }
      } else if (this.ae.h()) {
         this.a($$0.gR());
         this.b($$1.gR());
      } else {
         this.a($$1.gR());
         this.b($$0.gR());
      }

      if (this.ae.a(32) == 0) {
         this.a(chn.a.a(this.ae));
      }

      if (this.ae.a(32) == 0) {
         this.b(chn.a.a(this.ae));
      }
   }

   private chn.a gR() {
      return this.ae.h() ? this.gp() : this.gq();
   }

   public void gH() {
      if (this.gF()) {
         this.g(bwp.s).a(10.0);
      }

      if (this.gB()) {
         this.g(bwp.v).a(0.07F);
      }
   }

   void gS() {
      if (!this.bj()) {
         this.G(0.0F);
         this.L().o();
         this.x(true);
      }
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if (this.gG()) {
         return bsk.e;
      } else if (this.gm()) {
         this.y(false);
         return bsk.a;
      } else if (this.j($$2)) {
         if (this.aa_() != null) {
            this.cp = true;
         }

         if (this.e_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.X_() / 20) * 0.1F), true);
         } else if (!this.dV().C && this.X_() == 0 && this.gt()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
         } else {
            if (!(this.dV() instanceof arp $$3) || this.v() || this.bj()) {
               return bsk.e;
            }

            this.gS();
            this.z(true);
            cwm $$4 = this.a(but.a);
            if (!$$4.f() && !$$0.fT()) {
               this.a($$3, $$4);
            }

            this.a(but.a, new cwm($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return bsk.b;
      } else {
         return bsk.e;
      }
   }

   @Nullable
   @Override
   protected awm t() {
      if (this.gb()) {
         return awn.sA;
      } else {
         return this.gC() ? awn.sB : awn.sv;
      }
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.sy, 0.15F, 1.0F);
   }

   @Override
   public boolean j(cwm $$0) {
      return $$0.a(axl.au);
   }

   @Nullable
   @Override
   protected awm n_() {
      return awn.sw;
   }

   @Nullable
   @Override
   protected awm e(btb $$0) {
      return awn.sC;
   }

   public boolean gI() {
      return !this.gm() && !this.gG() && !this.gn() && !this.gy() && !this.v();
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? ci : super.e($$0);
   }

   private static boolean b(clc $$0) {
      return $$0.j().a(axl.av) && $$0.bL() && !$$0.t();
   }

   public static enum a implements bai {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final bai.a<chn.a> h = bai.a(chn.a::values);
      private static final IntFunction<chn.a> i = ayd.a(chn.a::a, values(), ayd.a.a);
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

      public static chn.a a(azu $$0) {
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
         return this.b.gI() && super.b();
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
         return this.i.gC() && this.i.gI() && super.b();
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
         if (!super.b() || this.d.n() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.af) {
               this.d.s(32);
               this.e = this.d.af + 600;
               if (this.d.dj()) {
                  cou $$0 = this.b.a(chn.ch, this.d);
                  this.d.cy.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         jh $$0 = this.d.dv();
         jh.a $$1 = new jh.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dis.mZ)) {
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
         if ($$0 instanceof chn && $$0.gb()) {
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
         return this.b < this.a.af && this.a.gB() && this.a.gI() && this.a.ae.a(b(400)) == 1;
      }

      @Override
      public boolean c() {
         return !this.a.bj() && (this.a.gB() || this.a.ae.a(b(600)) != 1) ? this.a.ae.a(b(2000)) != 1 : false;
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
               arp $$0 = a(this.b);
               if (this.f == cou.class) {
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

            return this.h.gI() && this.c != null;
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
         if (this.l.gI()) {
            super.a();
         }
      }
   }

   static class i extends ccy {
      private final chn a;

      public i(chn $$0, double $$1) {
         super($$0, $$1, axe.G);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (this.a.v()) {
            this.a.L().o();
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
         if ((this.a.e_() || this.a.gD()) && this.a.aJ()) {
            if (!this.a.gI()) {
               return false;
            } else {
               float $$0 = this.a.dL() * (float) (Math.PI / 180.0);
               float $$1 = -azm.a($$0);
               float $$2 = azm.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? azm.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? azm.j((double)$$2) : 0;
               if (this.a.dV().a_(this.a.dv().b($$3, -1, $$4)).l()) {
                  return true;
               } else {
                  return this.a.gD() && this.a.ae.a(b(60)) == 1 ? true : this.a.ae.a(b(500)) == 1;
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

   class k extends ccf {
      private int b;

      public k() {
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean b() {
         if (this.b > chn.this.af || chn.this.e_() || chn.this.bj() || !chn.this.gI() || chn.this.n() > 0) {
            return false;
         } else {
            return !chn.this.a(but.a).f() ? true : !chn.this.dV().a(clc.class, chn.this.cR().c(6.0, 6.0, 6.0), chn::b).isEmpty();
         }
      }

      @Override
      public boolean c() {
         return !chn.this.bj() && (chn.this.gB() || chn.this.ae.a(b(600)) != 1) ? chn.this.ae.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!chn.this.v() && !chn.this.a(but.a).f()) {
            chn.this.gS();
         }
      }

      @Override
      public void d() {
         if (chn.this.a(but.a).f()) {
            List<clc> $$0 = chn.this.dV().a(clc.class, chn.this.cR().c(8.0, 8.0, 8.0), chn::b);
            if (!$$0.isEmpty()) {
               chn.this.L().a($$0.getFirst(), 1.2F);
            }
         } else {
            chn.this.gS();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cwm $$0 = chn.this.a(but.a);
         if (!$$0.f()) {
            chn.this.a(a(chn.this.dV()), $$0);
            chn.this.a(but.a, cwm.k);
            int $$1 = chn.this.gB() ? chn.this.ae.a(50) + 10 : chn.this.ae.a(150) + 10;
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
         if (this.a.e_() && this.a.gI()) {
            return this.a.gF() && this.a.ae.a(b(500)) == 1 ? true : this.a.ae.a(b(6000)) == 1;
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
