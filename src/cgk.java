import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgk extends cfv {
   private static final akg<Integer> cb = akk.a(cgk.class, aki.b);
   private static final akg<Integer> cd = akk.a(cgk.class, aki.b);
   private static final akg<Integer> ce = akk.a(cgk.class, aki.b);
   private static final akg<Byte> cf = akk.a(cgk.class, aki.a);
   private static final akg<Byte> cg = akk.a(cgk.class, aki.a);
   private static final akg<Byte> ch = akk.a(cgk.class, aki.a);
   static final cev ci = cev.b().a(8.0);
   private static final btm cj = btq.aw.n().a(0.5F).a(btl.a().a(btk.a, 0.0F, 0.40625F, 0.0F));
   private static final int ck = 2;
   private static final int cl = 4;
   private static final int cm = 8;
   private static final int cn = 16;
   private static final int co = 5;
   public static final int bZ = 32;
   private static final int cp = 32;
   boolean cq;
   boolean cr;
   public int ca;
   private eye cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   private float cy;
   cgk.g cz;
   static final Predicate<cjz> cB = $$0 -> {
      cvl $$1 = $$0.m();
      return ($$1.a(dgx.mZ.r()) || $$1.a(dgx.eg.r())) && $$0.bI() && !$$0.w();
   };

   public cgk(btq<? extends cgk> $$0, dds $$1) {
      super($$0, $$1);
      this.bQ = new cgk.h(this);
      if (!this.o_()) {
         this.a_(true);
      }
   }

   @Override
   public boolean g(cvl $$0) {
      btr $$1 = this.i($$0);
      return !this.a($$1).f() ? false : $$1 == btr.a && super.g($$0);
   }

   public int q() {
      return this.am.a(cb);
   }

   public void t(int $$0) {
      this.am.a(cb, $$0);
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
      return this.am.a(ce) > 0;
   }

   public void z(boolean $$0) {
      this.am.a(ce, $$0 ? 1 : 0);
   }

   private int gL() {
      return this.am.a(ce);
   }

   private void v(int $$0) {
      this.am.a(ce, $$0);
   }

   public void A(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.u(0);
      }
   }

   public int gq() {
      return this.am.a(cd);
   }

   public void u(int $$0) {
      this.am.a(cd, $$0);
   }

   public cgk.a gr() {
      return cgk.a.a(this.am.a(cf));
   }

   public void a(cgk.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cgk.a.a(this.af);
      }

      this.am.a(cf, (byte)$$0.a());
   }

   public cgk.a gs() {
      return cgk.a.a(this.am.a(cg));
   }

   public void b(cgk.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cgk.a.a(this.af);
      }

      this.am.a(cg, (byte)$$0.a());
   }

   public boolean gA() {
      return this.w(4);
   }

   public void B(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
      $$0.a(cd, 0);
      $$0.a(cf, (byte)0);
      $$0.a(cg, (byte)0);
      $$0.a(ch, (byte)0);
      $$0.a(ce, 0);
   }

   private boolean w(int $$0) {
      return (this.am.a(ch) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.am.a(ch);
      if ($$1) {
         this.am.a(ch, (byte)($$2 | $$0));
      } else {
         this.am.a(ch, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gr().c());
      $$0.a("HiddenGene", this.gs().c());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(cgk.a.a($$0.l("MainGene")));
      this.b(cgk.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public btc a(arg $$0, btc $$1) {
      cgk $$2 = btq.aw.a($$0, btp.e);
      if ($$2 != null) {
         if ($$1 instanceof cgk $$3) {
            $$2.a(this, $$3);
         }

         $$2.gJ();
      }

      return $$2;
   }

   @Override
   protected void D() {
      this.bT.a(0, new caw(this));
      this.bT.a(2, new cgk.i(this, 2.0));
      this.bT.a(2, new cgk.d(this, 1.0));
      this.bT.a(3, new cgk.b(this, 1.2F, true));
      this.bT.a(4, new cck(this, 1.0, $$0 -> $$0.a(axb.aq), false));
      this.bT.a(6, new cgk.c<>(this, cnp.class, 8.0F, 2.0, 2.0));
      this.bT.a(6, new cgk.c<>(this, ckv.class, 4.0F, 2.0, 2.0));
      this.bT.a(7, new cgk.k());
      this.bT.a(8, new cgk.f(this));
      this.bT.a(8, new cgk.l(this));
      this.cz = new cgk.g(this, cnp.class, 6.0F);
      this.bT.a(9, this.cz);
      this.bT.a(10, new cbx(this));
      this.bT.a(12, new cgk.j(this));
      this.bT.a(13, new cbb(this, 1.25));
      this.bT.a(14, new ccp(this, 1.0));
      this.bU.a(1, new cgk.e(this).a(new Class[0]));
   }

   public static bvl.a gB() {
      return cfv.gt().a(bvm.v, 0.15F).a(bvm.c, 6.0);
   }

   public cgk.a gC() {
      return cgk.a.a(this.gr(), this.gs());
   }

   public boolean gD() {
      return this.gC() == cgk.a.b;
   }

   public boolean gE() {
      return this.gC() == cgk.a.c;
   }

   public boolean gF() {
      return this.gC() == cgk.a.d;
   }

   public boolean gG() {
      return this.gC() == cgk.a.e;
   }

   public boolean gH() {
      return this.gC() == cgk.a.f;
   }

   @Override
   public boolean gf() {
      return this.gC() == cgk.a.g;
   }

   @Override
   public boolean A() {
      return false;
   }

   @Override
   public boolean E(btj $$0) {
      if (!this.gf()) {
         this.cr = true;
      }

      return super.E($$0);
   }

   @Override
   public void gh() {
      this.a(awd.sF, 1.0F, 1.0F);
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

      buf $$0 = this.m();
      if ($$0 == null) {
         this.cq = false;
         this.cr = false;
      }

      if (this.q() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.q() == 29 || this.q() == 14) {
            this.a(awd.sB, 1.0F, 1.0F);
         }

         this.t(this.q() - 1);
      }

      if (this.t()) {
         this.u(this.gq() + 1);
         if (this.gq() > 20) {
            this.A(false);
            this.gS();
         } else if (this.gq() == 1) {
            this.a(awd.sv, 1.0F, 1.0F);
         }
      }

      if (this.gA()) {
         this.gR();
      } else {
         this.ca = 0;
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
      if (!this.gp() && this.y() && !this.gI() && !this.a(btr.a).f() && this.af.a(80) == 1) {
         this.z(true);
      } else if (this.a(btr.a).f() || !this.y()) {
         this.z(false);
      }

      if (this.gp()) {
         this.gN();
         if (!this.dS().B && this.gL() > 80 && this.af.a(20) == 1) {
            if (this.gL() > 100 && this.o(this.a(btr.a))) {
               if (!this.dS().B) {
                  this.a(btr.a, cvl.k);
                  this.a(dyx.m);
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
         this.a(awd.sz, 0.5F + 0.5F * (float)this.af.a(2), (this.af.i() - this.af.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            eye $$1 = new eye(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.af.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dK() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dI() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.af.i()) * 0.6 - 0.3;
            eye $$3 = new eye(((double)this.af.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.af.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aU * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dx(), this.dB() + 1.0, this.dD());
            this.dS().a(new lj(ln.S, this.a(btr.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void gO() {
      this.cu = this.ct;
      if (this.y()) {
         this.ct = Math.min(1.0F, this.ct + 0.15F);
      } else {
         this.ct = Math.max(0.0F, this.ct - 0.19F);
      }
   }

   private void gP() {
      this.cw = this.cv;
      if (this.go()) {
         this.cv = Math.min(1.0F, this.cv + 0.15F);
      } else {
         this.cv = Math.max(0.0F, this.cv - 0.19F);
      }
   }

   private void gQ() {
      this.cy = this.cx;
      if (this.gA()) {
         this.cx = Math.min(1.0F, this.cx + 0.15F);
      } else {
         this.cx = Math.max(0.0F, this.cx - 0.19F);
      }
   }

   public float J(float $$0) {
      return azc.h($$0, this.cu, this.ct);
   }

   public float K(float $$0) {
      return azc.h($$0, this.cw, this.cv);
   }

   public float L(float $$0) {
      return azc.h($$0, this.cy, this.cx);
   }

   private void gR() {
      this.ca++;
      if (this.ca > 32) {
         this.B(false);
      } else {
         if (!this.dS().B) {
            eye $$0 = this.dv();
            if (this.ca == 1) {
               float $$1 = this.dI() * (float) (Math.PI / 180.0);
               float $$2 = this.o_() ? 0.1F : 0.2F;
               this.cs = new eye($$0.d + (double)(-azc.a($$1) * $$2), 0.0, $$0.f + (double)(azc.b($$1) * $$2));
               this.h(this.cs.b(0.0, 0.27, 0.0));
            } else if ((float)this.ca != 7.0F && (float)this.ca != 15.0F && (float)this.ca != 23.0F) {
               this.n(this.cs.d, $$0.e, this.cs.f);
            } else {
               this.n(0.0, this.aH() ? 0.27 : $$0.e, 0.0);
            }
         }
      }
   }

   private void gS() {
      eye $$0 = this.dv();
      dds $$1 = this.dS();
      $$1.a(
         ln.ag,
         this.dx() - (double)(this.dn() + 1.0F) * 0.5 * (double)azc.a(this.aU * (float) (Math.PI / 180.0)),
         this.dB() - 0.1F,
         this.dD() + (double)(this.dn() + 1.0F) * 0.5 * (double)azc.b(this.aU * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(awd.sw, 1.0F, 1.0F);

      for (cgk $$3 : $$1.a(cgk.class, this.cO().g(10.0))) {
         if (!$$3.o_() && $$3.aH() && !$$3.bi() && $$3.gK()) {
            $$3.v();
         }
      }

      if (!$$1.w_() && $$1.ac().b(ddo.f)) {
         arg $$4 = (arg)$$1;
         esy $$5 = $$4.o().bd().b(esp.aH);
         esw $$6 = new esw.a($$4).a(evp.f, this.dq()).a(evp.a, this).a(evo.j);

         for (cvl $$8 : $$5.a($$6)) {
            this.b($$8);
         }
      }
   }

   @Override
   protected void b(cjz $$0) {
      if (this.a(btr.a).f() && cB.test($$0)) {
         this.a($$0);
         cvl $$1 = $$0.m();
         this.a(btr.a, $$1);
         this.f(btr.a);
         this.a($$0, $$1.J());
         $$0.as();
      }
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (!this.dS().B) {
         this.x(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      azk $$4 = $$0.C_();
      this.a(cgk.a.a($$4));
      this.b(cgk.a.a($$4));
      this.gJ();
      if ($$3 == null) {
         $$3 = new btc.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cgk $$0, @Nullable cgk $$1) {
      if ($$1 == null) {
         if (this.af.h()) {
            this.a($$0.gT());
            this.b(cgk.a.a(this.af));
         } else {
            this.a(cgk.a.a(this.af));
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
         this.a(cgk.a.a(this.af));
      }

      if (this.af.a(32) == 0) {
         this.b(cgk.a.a(this.af));
      }
   }

   private cgk.a gT() {
      return this.af.h() ? this.gr() : this.gs();
   }

   public void gJ() {
      if (this.gH()) {
         this.g(bvm.s).a(10.0);
      }

      if (this.gD()) {
         this.g(bvm.v).a(0.07F);
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
   public brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if (this.gI()) {
         return brk.e;
      } else if (this.go()) {
         this.y(false);
         return brk.a;
      } else if (this.p($$2)) {
         if (this.m() != null) {
            this.cq = true;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dS().B && this.g() == 0 && this.gv()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
         } else {
            if (this.dS().B || this.y() || this.bi()) {
               return brk.e;
            }

            this.gU();
            this.z(true);
            cvl $$3 = this.a(btr.a);
            if (!$$3.f() && !$$0.fP()) {
               this.b($$3);
            }

            this.a(btr.a, new cvl($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return brk.b;
      } else {
         return brk.e;
      }
   }

   @Nullable
   @Override
   protected awc w() {
      if (this.gf()) {
         return awd.sC;
      } else {
         return this.gE() ? awd.sD : awd.sx;
      }
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.sA, 0.15F, 1.0F);
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.aq);
   }

   private boolean o(cvl $$0) {
      return this.p($$0) || $$0.a(dgx.eg.r());
   }

   @Nullable
   @Override
   protected awc n_() {
      return awd.sy;
   }

   @Nullable
   @Override
   protected awc d(bsb $$0) {
      return awd.sE;
   }

   public boolean gK() {
      return !this.go() && !this.gI() && !this.gp() && !this.gA() && !this.y();
   }

   @Override
   public btm e(bur $$0) {
      return this.o_() ? cj : super.e($$0);
   }

   public static enum a implements azy {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final azy.a<cgk.a> h = azy.a(cgk.a::values);
      private static final IntFunction<cgk.a> i = axt.a(cgk.a::a, values(), axt.a.a);
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

      static cgk.a a(cgk.a $$0, cgk.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cgk.a a(int $$0) {
         return i.apply($$0);
      }

      public static cgk.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cgk.a a(azk $$0) {
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

   static class b extends cbm {
      private final cgk b;

      public b(cgk $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gK() && super.b();
      }
   }

   static class c<T extends buf> extends caj<T> {
      private final cgk i;

      public c(cgk $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bto.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gE() && this.i.gK() && super.b();
      }
   }

   static class d extends cao {
      private final cgk d;
      private int e;

      public d(cgk $$0, double $$1) {
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
                  cnp $$0 = this.b.a(cgk.ci, this.d);
                  this.d.cz.a($$0);
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
                     if (this.b.a_($$1).a(dgx.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends ccu {
      private final cgk a;

      public e(cgk $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (!this.a.cq && !this.a.cr) {
            return super.c();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(buh $$0, buf $$1) {
         if ($$0 instanceof cgk && $$0.gf()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends cbc {
      private final cgk a;
      private int b;

      public f(cgk $$0) {
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

   static class g extends cbk {
      private final cgk h;

      public g(cgk $$0, Class<? extends buf> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(buf $$0) {
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
               if (this.f == cnp.class) {
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

   static class h extends caf {
      private final cgk l;

      public h(cgk $$0) {
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

   static class i extends cbv {
      private final cgk a;

      public i(cgk $$0, double $$1) {
         super($$0, $$1, awu.G);
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

   static class j extends cbc {
      private final cgk a;

      public j(cgk $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbc.a.a, cbc.a.b, cbc.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.o_() || this.a.gF()) && this.a.aH()) {
            if (!this.a.gK()) {
               return false;
            } else {
               float $$0 = this.a.dI() * (float) (Math.PI / 180.0);
               float $$1 = -azc.a($$0);
               float $$2 = azc.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? azc.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? azc.j((double)$$2) : 0;
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
      public boolean S_() {
         return false;
      }
   }

   class k extends cbc {
      private int b;

      public k() {
         this.a(EnumSet.of(cbc.a.a));
      }

      @Override
      public boolean b() {
         if (this.b <= cgk.this.ag && !cgk.this.o_() && !cgk.this.bi() && cgk.this.gK() && cgk.this.q() <= 0) {
            List<cjz> $$0 = cgk.this.dS().a(cjz.class, cgk.this.cO().c(6.0, 6.0, 6.0), cgk.cB);
            return !$$0.isEmpty() || !cgk.this.a(btr.a).f();
         } else {
            return false;
         }
      }

      @Override
      public boolean c() {
         return !cgk.this.bi() && (cgk.this.gD() || cgk.this.af.a(b(600)) != 1) ? cgk.this.af.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!cgk.this.y() && !cgk.this.a(btr.a).f()) {
            cgk.this.gU();
         }
      }

      @Override
      public void d() {
         List<cjz> $$0 = cgk.this.dS().a(cjz.class, cgk.this.cO().c(8.0, 8.0, 8.0), cgk.cB);
         if (!$$0.isEmpty() && cgk.this.a(btr.a).f()) {
            cgk.this.P().a($$0.get(0), 1.2F);
         } else if (!cgk.this.a(btr.a).f()) {
            cgk.this.gU();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cvl $$0 = cgk.this.a(btr.a);
         if (!$$0.f()) {
            cgk.this.b($$0);
            cgk.this.a(btr.a, cvl.k);
            int $$1 = cgk.this.gD() ? cgk.this.af.a(50) + 10 : cgk.this.af.a(150) + 10;
            this.b = cgk.this.ag + $$1 * 20;
         }

         cgk.this.x(false);
      }
   }

   static class l extends cbc {
      private final cgk a;

      public l(cgk $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.o_() && this.a.gK()) {
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
