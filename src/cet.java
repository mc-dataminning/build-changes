import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cet extends cee {
   private static final ajr<Integer> cb = ajv.a(cet.class, ajt.b);
   private static final ajr<Integer> cc = ajv.a(cet.class, ajt.b);
   private static final ajr<Integer> cd = ajv.a(cet.class, ajt.b);
   private static final ajr<Byte> ce = ajv.a(cet.class, ajt.a);
   private static final ajr<Byte> cf = ajv.a(cet.class, ajt.a);
   private static final ajr<Byte> cg = ajv.a(cet.class, ajt.a);
   static final cdf ch = cdf.b().a(8.0);
   private static final brx ci = bsa.aw.n().a(0.5F).a(brw.a().a(brv.a, 0.0F, 0.40625F, 0.0F));
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
   private euk cr;
   private float cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   cet.g cy;
   static final Predicate<cig> cA = $$0 -> {
      cto $$1 = $$0.p();
      return ($$1.a(dea.mZ.q()) || $$1.a(dea.eg.q())) && $$0.bD() && !$$0.y();
   };

   public cet(bsa<? extends cet> $$0, dax $$1) {
      super($$0, $$1);
      this.bP = new cet.h(this);
      if (!this.p_()) {
         this.a_(true);
      }
   }

   @Override
   public boolean f(cto $$0) {
      bsb $$1 = bsq.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsb.a && super.f($$0);
   }

   public int s() {
      return this.ao.a(cb);
   }

   public void u(int $$0) {
      this.ao.a(cb, $$0);
   }

   public boolean u() {
      return this.x(2);
   }

   public boolean y() {
      return this.x(8);
   }

   public void w(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gp() {
      return this.x(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gv() {
      return this.ao.a(cd) > 0;
   }

   public void y(boolean $$0) {
      this.ao.a(cd, $$0 ? 1 : 0);
   }

   private int gK() {
      return this.ao.a(cd);
   }

   private void w(int $$0) {
      this.ao.a(cd, $$0);
   }

   public void z(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.v(0);
      }
   }

   public int gw() {
      return this.ao.a(cc);
   }

   public void v(int $$0) {
      this.ao.a(cc, $$0);
   }

   public cet.a gx() {
      return cet.a.a(this.ao.a(ce));
   }

   public void a(cet.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cet.a.a(this.ah);
      }

      this.ao.a(ce, (byte)$$0.a());
   }

   public cet.a gy() {
      return cet.a.a(this.ao.a(cf));
   }

   public void b(cet.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cet.a.a(this.ah);
      }

      this.ao.a(cf, (byte)$$0.a());
   }

   public boolean gz() {
      return this.x(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
      $$0.a(cc, 0);
      $$0.a(ce, (byte)0);
      $$0.a(cf, (byte)0);
      $$0.a(cg, (byte)0);
      $$0.a(cd, 0);
   }

   private boolean x(int $$0) {
      return (this.ao.a(cg) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.ao.a(cg);
      if ($$1) {
         this.ao.a(cg, (byte)($$2 | $$0));
      } else {
         this.ao.a(cg, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gx().c());
      $$0.a("HiddenGene", this.gy().c());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a(cet.a.a($$0.l("MainGene")));
      this.b(cet.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bro a(aqm $$0, bro $$1) {
      cet $$2 = bsa.aw.a((dax)$$0);
      if ($$2 != null) {
         if ($$1 instanceof cet $$3) {
            $$2.a(this, $$3);
         }

         $$2.gI();
      }

      return $$2;
   }

   @Override
   protected void z() {
      this.bS.a(0, new bzg(this));
      this.bS.a(2, new cet.i(this, 2.0));
      this.bS.a(2, new cet.d(this, 1.0));
      this.bS.a(3, new cet.b(this, 1.2F, true));
      this.bS.a(4, new cau(this, 1.0, $$0 -> $$0.a(awe.aq), false));
      this.bS.a(6, new cet.c<>(this, clw.class, 8.0F, 2.0, 2.0));
      this.bS.a(6, new cet.c<>(this, cjc.class, 4.0F, 2.0, 2.0));
      this.bS.a(7, new cet.k());
      this.bS.a(8, new cet.f(this));
      this.bS.a(8, new cet.l(this));
      this.cy = new cet.g(this, clw.class, 6.0F);
      this.bS.a(9, this.cy);
      this.bS.a(10, new cah(this));
      this.bS.a(12, new cet.j(this));
      this.bS.a(13, new bzl(this, 1.25));
      this.bS.a(14, new caz(this, 1.0));
      this.bT.a(1, new cet.e(this).a(new Class[0]));
   }

   public static btv.a gA() {
      return bsq.A().a(btw.r, 0.15F).a(btw.c, 6.0);
   }

   public cet.a gB() {
      return cet.a.a(this.gx(), this.gy());
   }

   public boolean gC() {
      return this.gB() == cet.a.b;
   }

   public boolean gD() {
      return this.gB() == cet.a.c;
   }

   public boolean gE() {
      return this.gB() == cet.a.d;
   }

   public boolean gF() {
      return this.gB() == cet.a.e;
   }

   public boolean gG() {
      return this.gB() == cet.a.f;
   }

   @Override
   public boolean gh() {
      return this.gB() == cet.a.g;
   }

   @Override
   public boolean a(clw $$0) {
      return false;
   }

   @Override
   public boolean C(bru $$0) {
      this.a(avh.sB, 1.0F, 1.0F);
      if (!this.gh()) {
         this.cq = true;
      }

      return super.C($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.gD()) {
         if (this.dP().ab() && !this.be()) {
            this.w(true);
            this.y(false);
         } else if (!this.gv()) {
            this.w(false);
         }
      }

      bso $$0 = this.p();
      if ($$0 == null) {
         this.cp = false;
         this.cq = false;
      }

      if (this.s() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.s() == 29 || this.s() == 14) {
            this.a(avh.sx, 1.0F, 1.0F);
         }

         this.u(this.s() - 1);
      }

      if (this.u()) {
         this.v(this.gw() + 1);
         if (this.gw() > 20) {
            this.z(false);
            this.gR();
         } else if (this.gw() == 1) {
            this.a(avh.sr, 1.0F, 1.0F);
         }
      }

      if (this.gz()) {
         this.gQ();
      } else {
         this.bZ = 0;
      }

      if (this.y()) {
         this.s(0.0F);
      }

      this.gN();
      this.gL();
      this.gO();
      this.gP();
   }

   public boolean gH() {
      return this.gD() && this.dP().ab();
   }

   private void gL() {
      if (!this.gv() && this.y() && !this.gH() && !this.a(bsb.a).e() && this.ah.a(80) == 1) {
         this.y(true);
      } else if (this.a(bsb.a).e() || !this.y()) {
         this.y(false);
      }

      if (this.gv()) {
         this.gM();
         if (!this.dP().B && this.gK() > 80 && this.ah.a(20) == 1) {
            if (this.gK() > 100 && this.n(this.a(bsb.a))) {
               if (!this.dP().B) {
                  this.a(bsb.a, cto.i);
                  this.a(dvu.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.w(this.gK() + 1);
      }
   }

   private void gM() {
      if (this.gK() % 5 == 0) {
         this.a(avh.sv, 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            euk $$1 = new euk(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ah.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dH() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dF() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ah.i()) * 0.6 - 0.3;
            euk $$3 = new euk(((double)this.ah.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ah.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aZ * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.du(), this.dy() + 1.0, this.dA());
            this.dP().a(new ku(ky.S, this.a(bsb.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gN() {
      this.ct = this.cs;
      if (this.y()) {
         this.cs = Math.min(1.0F, this.cs + 0.15F);
      } else {
         this.cs = Math.max(0.0F, this.cs - 0.19F);
      }
   }

   private void gO() {
      this.cv = this.cu;
      if (this.gp()) {
         this.cu = Math.min(1.0F, this.cu + 0.15F);
      } else {
         this.cu = Math.max(0.0F, this.cu - 0.19F);
      }
   }

   private void gP() {
      this.cx = this.cw;
      if (this.gz()) {
         this.cw = Math.min(1.0F, this.cw + 0.15F);
      } else {
         this.cw = Math.max(0.0F, this.cw - 0.19F);
      }
   }

   public float G(float $$0) {
      return ayd.i($$0, this.ct, this.cs);
   }

   public float H(float $$0) {
      return ayd.i($$0, this.cv, this.cu);
   }

   public float I(float $$0) {
      return ayd.i($$0, this.cx, this.cw);
   }

   private void gQ() {
      this.bZ++;
      if (this.bZ > 32) {
         this.A(false);
      } else {
         if (!this.dP().B) {
            euk $$0 = this.ds();
            if (this.bZ == 1) {
               float $$1 = this.dF() * (float) (Math.PI / 180.0);
               float $$2 = this.p_() ? 0.1F : 0.2F;
               this.cr = new euk($$0.c + (double)(-ayd.a($$1) * $$2), 0.0, $$0.e + (double)(ayd.b($$1) * $$2));
               this.g(this.cr.b(0.0, 0.27, 0.0));
            } else if ((float)this.bZ != 7.0F && (float)this.bZ != 15.0F && (float)this.bZ != 23.0F) {
               this.o(this.cr.c, $$0.d, this.cr.e);
            } else {
               this.o(0.0, this.aE() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gR() {
      euk $$0 = this.ds();
      dax $$1 = this.dP();
      $$1.a(
         ky.ag,
         this.du() - (double)(this.dj() + 1.0F) * 0.5 * (double)ayd.a(this.aZ * (float) (Math.PI / 180.0)),
         this.dy() - 0.1F,
         this.dA() + (double)(this.dj() + 1.0F) * 0.5 * (double)ayd.b(this.aZ * (float) (Math.PI / 180.0)),
         $$0.c,
         0.0,
         $$0.e
      );
      this.a(avh.ss, 1.0F, 1.0F);

      for (cet $$3 : $$1.a(cet.class, this.cK().g(10.0))) {
         if (!$$3.p_() && $$3.aE() && !$$3.be() && $$3.gJ()) {
            $$3.fj();
         }
      }

      if (!$$1.x_() && $$1.aa().b(dat.f)) {
         aqm $$4 = (aqm)$$1;
         epk $$5 = $$4.o().be().b(epd.aT);
         epi $$6 = new epi.a($$4).a(erx.f, this.dn()).a(erx.a, this).a(erw.j);

         for (cto $$8 : $$5.a($$6)) {
            this.b($$8);
         }
      }
   }

   @Override
   protected void b(cig $$0) {
      if (this.a(bsb.a).e() && cA.test($$0)) {
         this.a($$0);
         cto $$1 = $$0.p();
         this.a(bsb.a, $$1);
         this.f(bsb.a);
         this.a($$0, $$1.I());
         $$0.ao();
      }
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (!this.dP().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      ayk $$4 = $$0.E_();
      this.a(cet.a.a($$4));
      this.b(cet.a.a($$4));
      this.gI();
      if ($$3 == null) {
         $$3 = new bro.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cet $$0, @Nullable cet $$1) {
      if ($$1 == null) {
         if (this.ah.h()) {
            this.a($$0.gS());
            this.b(cet.a.a(this.ah));
         } else {
            this.a(cet.a.a(this.ah));
            this.b($$0.gS());
         }
      } else if (this.ah.h()) {
         this.a($$0.gS());
         this.b($$1.gS());
      } else {
         this.a($$1.gS());
         this.b($$0.gS());
      }

      if (this.ah.a(32) == 0) {
         this.a(cet.a.a(this.ah));
      }

      if (this.ah.a(32) == 0) {
         this.b(cet.a.a(this.ah));
      }
   }

   private cet.a gS() {
      return this.ah.h() ? this.gx() : this.gy();
   }

   public void gI() {
      if (this.gG()) {
         this.f(btw.q).a(10.0);
      }

      if (this.gC()) {
         this.f(btw.r).a(0.07F);
      }
   }

   void gT() {
      if (!this.be()) {
         this.C(0.0F);
         this.K().n();
         this.w(true);
      }
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if (this.gH()) {
         return bpu.d;
      } else if (this.gp()) {
         this.x(false);
         return bpu.a(this.dP().B);
      } else if (this.o($$2)) {
         if (this.p() != null) {
            this.cp = true;
         }

         if (this.p_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dP().B && this.g() == 0 && this.gq()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dP().B || this.y() || this.be()) {
               return bpu.d;
            }

            this.gT();
            this.y(true);
            cto $$3 = this.a(bsb.a);
            if (!$$3.e() && !$$0.fP()) {
               this.b($$3);
            }

            this.a(bsb.a, new cto($$2.g(), 1));
            this.a($$0, $$1, $$2);
         }

         return bpu.a;
      } else {
         return bpu.d;
      }
   }

   @Nullable
   @Override
   protected avg v() {
      if (this.gh()) {
         return avh.sy;
      } else {
         return this.gD() ? avh.sz : avh.st;
      }
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.sw, 0.15F, 1.0F);
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.aq);
   }

   private boolean n(cto $$0) {
      return this.o($$0) || $$0.a(dea.eg.q());
   }

   @Nullable
   @Override
   protected avg o_() {
      return avh.su;
   }

   @Nullable
   @Override
   protected avg d(bqn $$0) {
      return avh.sA;
   }

   public boolean gJ() {
      return !this.gp() && !this.gH() && !this.gv() && !this.gz() && !this.y();
   }

   @Override
   public brx e(bta $$0) {
      return this.p_() ? ci : super.e($$0);
   }

   public static enum a implements ayx {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final ayx.a<cet.a> h = ayx.a(cet.a::values);
      private static final IntFunction<cet.a> i = awv.a(cet.a::a, values(), awv.a.a);
      private static final int j = 6;
      private final int k;
      private final String l;
      private final boolean m;

      private a(int $$0, String $$1, boolean $$2) {
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

      static cet.a a(cet.a $$0, cet.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cet.a a(int $$0) {
         return i.apply($$0);
      }

      public static cet.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cet.a a(ayk $$0) {
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

   static class b extends bzw {
      private final cet b;

      public b(cet $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gJ() && super.a();
      }
   }

   static class c<T extends bso> extends byt<T> {
      private final cet i;

      public c(cet $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, brz.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gD() && this.i.gJ() && super.a();
      }
   }

   static class d extends byy {
      private final cet d;
      private int e;

      public d(cet $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         if (!super.a() || this.d.s() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.ai) {
               this.d.u(32);
               this.e = this.d.ai + 600;
               if (this.d.db()) {
                  clw $$0 = this.b.a(cet.ch, this.d);
                  this.d.cy.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         io $$0 = this.d.dp();
         io.a $$1 = new io.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dea.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cbe {
      private final cet a;

      public e(cet $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.cp && !this.a.cq) {
            return super.b();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(bsq $$0, bso $$1) {
         if ($$0 instanceof cet && $$0.gh()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bzm {
      private final cet a;
      private int b;

      public f(cet $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ai && this.a.gC() && this.a.gJ() && this.a.ah.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.be() && (this.a.gC() || this.a.ah.a(b(600)) != 1) ? this.a.ah.a(b(2000)) != 1 : false;
      }

      @Override
      public void c() {
         this.a.x(true);
         this.b = 0;
      }

      @Override
      public void d() {
         this.a.x(false);
         this.b = this.a.ai + 200;
      }
   }

   static class g extends bzu {
      private final cet h;

      public g(cet $$0, Class<? extends bso> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bso $$0) {
         this.c = $$0;
      }

      @Override
      public boolean b() {
         return this.c != null && super.b();
      }

      @Override
      public boolean a() {
         if (this.b.el().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == clw.class) {
                  this.c = this.b.dP().a(this.g, this.b, this.b.du(), this.b.dy(), this.b.dA());
               } else {
                  this.c = this.b
                     .dP()
                     .a(
                        this.b.dP().a(this.f, this.b.cK().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.du(),
                        this.b.dy(),
                        this.b.dA()
                     );
               }
            }

            return this.h.gJ() && this.c != null;
         }
      }

      @Override
      public void e() {
         if (this.c != null) {
            super.e();
         }
      }
   }

   static class h extends byp {
      private final cet l;

      public h(cet $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gJ()) {
            super.a();
         }
      }
   }

   static class i extends caf {
      private final cet h;

      public i(cet $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dE() || this.b.bQ();
      }

      @Override
      public boolean b() {
         if (this.h.y()) {
            this.h.K().n();
            return false;
         } else {
            return super.b();
         }
      }
   }

   static class j extends bzm {
      private final cet a;

      public j(cet $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzm.a.a, bzm.a.b, bzm.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.p_() || this.a.gE()) && this.a.aE()) {
            if (!this.a.gJ()) {
               return false;
            } else {
               float $$0 = this.a.dF() * (float) (Math.PI / 180.0);
               float $$1 = -ayd.a($$0);
               float $$2 = ayd.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? ayd.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? ayd.j((double)$$2) : 0;
               if (this.a.dP().a_(this.a.dp().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gE() && this.a.ah.a(b(60)) == 1 ? true : this.a.ah.a(b(500)) == 1;
               }
            }
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void c() {
         this.a.A(true);
      }

      @Override
      public boolean Q_() {
         return false;
      }
   }

   class k extends bzm {
      private int b;

      public k() {
         this.a(EnumSet.of(bzm.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= cet.this.ai && !cet.this.p_() && !cet.this.be() && cet.this.gJ() && cet.this.s() <= 0) {
            List<cig> $$0 = cet.this.dP().a(cig.class, cet.this.cK().c(6.0, 6.0, 6.0), cet.cA);
            return !$$0.isEmpty() || !cet.this.a(bsb.a).e();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !cet.this.be() && (cet.this.gC() || cet.this.ah.a(b(600)) != 1) ? cet.this.ah.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!cet.this.y() && !cet.this.a(bsb.a).e()) {
            cet.this.gT();
         }
      }

      @Override
      public void c() {
         List<cig> $$0 = cet.this.dP().a(cig.class, cet.this.cK().c(8.0, 8.0, 8.0), cet.cA);
         if (!$$0.isEmpty() && cet.this.a(bsb.a).e()) {
            cet.this.K().a($$0.get(0), 1.2F);
         } else if (!cet.this.a(bsb.a).e()) {
            cet.this.gT();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cto $$0 = cet.this.a(bsb.a);
         if (!$$0.e()) {
            cet.this.b($$0);
            cet.this.a(bsb.a, cto.i);
            int $$1 = cet.this.gC() ? cet.this.ah.a(50) + 10 : cet.this.ah.a(150) + 10;
            this.b = cet.this.ai + $$1 * 20;
         }

         cet.this.w(false);
      }
   }

   static class l extends bzm {
      private final cet a;

      public l(cet $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.p_() && this.a.gJ()) {
            return this.a.gG() && this.a.ah.a(b(500)) == 1 ? true : this.a.ah.a(b(6000)) == 1;
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void c() {
         this.a.z(true);
      }
   }
}
