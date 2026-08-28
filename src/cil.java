import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cil extends chw {
   private static final alc<Integer> cb = alg.a(cil.class, ale.b);
   private static final alc<Integer> cd = alg.a(cil.class, ale.b);
   private static final alc<Integer> ce = alg.a(cil.class, ale.b);
   private static final alc<Byte> cf = alg.a(cil.class, ale.a);
   private static final alc<Byte> cg = alg.a(cil.class, ale.a);
   private static final alc<Byte> ch = alg.a(cil.class, ale.a);
   static final cgw ci = cgw.b().a(8.0);
   private static final bvm cj = bvq.aO.n().a(0.5F).a(bvl.a().a(bvk.a, 0.0F, 0.40625F, 0.0F));
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
   private fbx cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   private float cy;
   cil.g cz;

   public cil(bvq<? extends cil> $$0, dhh $$1) {
      super($$0, $$1);
      this.bQ = new cil.h(this);
      if (!this.e_()) {
         this.a_(true);
      }
   }

   @Override
   protected boolean f(bvr $$0) {
      return $$0 == bvr.a && this.fN();
   }

   public int p() {
      return this.al.a(cb);
   }

   public void s(int $$0) {
      this.al.a(cb, $$0);
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

   public boolean go() {
      return this.v(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gp() {
      return this.al.a(ce) > 0;
   }

   public void z(boolean $$0) {
      this.al.a(ce, $$0 ? 1 : 0);
   }

   private int gL() {
      return this.al.a(ce);
   }

   private void u(int $$0) {
      this.al.a(ce, $$0);
   }

   public void A(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.t(0);
      }
   }

   public int gq() {
      return this.al.a(cd);
   }

   public void t(int $$0) {
      this.al.a(cd, $$0);
   }

   public cil.a gr() {
      return cil.a.a(this.al.a(cf));
   }

   public void a(cil.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cil.a.a(this.ae);
      }

      this.al.a(cf, (byte)$$0.a());
   }

   public cil.a gs() {
      return cil.a.a(this.al.a(cg));
   }

   public void b(cil.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cil.a.a(this.ae);
      }

      this.al.a(cg, (byte)$$0.a());
   }

   public boolean gA() {
      return this.v(4);
   }

   public void B(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
      $$0.a(cd, 0);
      $$0.a(cf, (byte)0);
      $$0.a(cg, (byte)0);
      $$0.a(ch, (byte)0);
      $$0.a(ce, 0);
   }

   private boolean v(int $$0) {
      return (this.al.a(ch) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.al.a(ch);
      if ($$1) {
         this.al.a(ch, (byte)($$2 | $$0));
      } else {
         this.al.a(ch, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gr().c());
      $$0.a("HiddenGene", this.gs().c());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(cil.a.a($$0.l("MainGene")));
      this.b(cil.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bva a(ash $$0, bva $$1) {
      cil $$2 = bvq.aO.a($$0, bvp.e);
      if ($$2 != null) {
         if ($$1 instanceof cil $$3) {
            $$2.a(this, $$3);
         }

         $$2.gJ();
      }

      return $$2;
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccx(this));
      this.bT.a(2, new cil.i(this, 2.0));
      this.bT.a(2, new cil.d(this, 1.0));
      this.bT.a(3, new cil.b(this, 1.2F, true));
      this.bT.a(4, new cel(this, 1.0, $$0 -> $$0.a(ayd.av), false));
      this.bT.a(6, new cil.c<>(this, cpw.class, 8.0F, 2.0, 2.0));
      this.bT.a(6, new cil.c<>(this, cmw.class, 4.0F, 2.0, 2.0));
      this.bT.a(7, new cil.k());
      this.bT.a(8, new cil.f(this));
      this.bT.a(8, new cil.l(this));
      this.cz = new cil.g(this, cpw.class, 6.0F);
      this.bT.a(9, this.cz);
      this.bT.a(10, new cdy(this));
      this.bT.a(12, new cil.j(this));
      this.bT.a(13, new cdc(this, 1.25));
      this.bT.a(14, new ceq(this, 1.0));
      this.bU.a(1, new cil.e(this).a(new Class[0]));
   }

   public static bxm.a gB() {
      return chw.gt().a(bxn.v, 0.15F).a(bxn.c, 6.0);
   }

   public cil.a gC() {
      return cil.a.a(this.gr(), this.gs());
   }

   public boolean gD() {
      return this.gC() == cil.a.b;
   }

   public boolean gE() {
      return this.gC() == cil.a.c;
   }

   public boolean gF() {
      return this.gC() == cil.a.d;
   }

   public boolean gG() {
      return this.gC() == cil.a.e;
   }

   public boolean gH() {
      return this.gC() == cil.a.f;
   }

   @Override
   public boolean gd() {
      return this.gC() == cil.a.g;
   }

   @Override
   public boolean y() {
      return false;
   }

   @Override
   public boolean c(ash $$0, bvj $$1) {
      if (!this.gd()) {
         this.cr = true;
      }

      return super.c($$0, $$1);
   }

   @Override
   public void gf() {
      this.a(axf.sX, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.gE()) {
         if (this.dW().ae() && !this.bj()) {
            this.x(true);
            this.z(false);
         } else if (!this.gp()) {
            this.x(false);
         }
      }

      bwf $$0 = this.O_();
      if ($$0 == null) {
         this.cq = false;
         this.cr = false;
      }

      if (this.p() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.p() == 29 || this.p() == 14) {
            this.a(axf.sT, 1.0F, 1.0F);
         }

         this.s(this.p() - 1);
      }

      if (this.t()) {
         this.t(this.gq() + 1);
         if (this.gq() > 20) {
            this.A(false);
            this.gS();
         } else if (this.gq() == 1) {
            this.a(axf.sN, 1.0F, 1.0F);
         }
      }

      if (this.gA()) {
         this.gR();
      } else {
         this.ca = 0;
      }

      if (this.x()) {
         this.w(0.0F);
      }

      this.gO();
      this.gM();
      this.gP();
      this.gQ();
   }

   public boolean gI() {
      return this.gE() && this.dW().ae();
   }

   private void gM() {
      if (!this.gp() && this.x() && !this.gI() && !this.a(bvr.a).f() && this.ae.a(80) == 1) {
         this.z(true);
      } else if (this.a(bvr.a).f() || !this.x()) {
         this.z(false);
      }

      if (this.gp()) {
         this.gN();
         if (!this.dW().C && this.gL() > 80 && this.ae.a(20) == 1) {
            if (this.gL() > 100 && this.a(bvr.a).a(ayd.aw)) {
               if (!this.dW().C) {
                  this.a(bvr.a, cxo.j);
                  this.a(ecq.m);
               }

               this.x(false);
            }

            this.z(false);
            return;
         }

         this.u(this.gL() + 1);
      }
   }

   private void gN() {
      if (this.gL() % 5 == 0) {
         this.a(axf.sR, 0.5F + 0.5F * (float)this.ae.a(2), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            fbx $$1 = new fbx(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ae.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dO() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dM() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ae.i()) * 0.6 - 0.3;
            fbx $$3 = new fbx(((double)this.ae.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ae.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aX * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dB(), this.dF() + 1.0, this.dH());
            this.dW().a(new lo(ls.S, this.a(bvr.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void gO() {
      this.cu = this.ct;
      if (this.x()) {
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
      return bae.h($$0, this.cu, this.ct);
   }

   public float K(float $$0) {
      return bae.h($$0, this.cw, this.cv);
   }

   public float L(float $$0) {
      return bae.h($$0, this.cy, this.cx);
   }

   private void gR() {
      this.ca++;
      if (this.ca > 32) {
         this.B(false);
      } else {
         if (!this.dW().C) {
            fbx $$0 = this.dz();
            if (this.ca == 1) {
               float $$1 = this.dM() * (float) (Math.PI / 180.0);
               float $$2 = this.e_() ? 0.1F : 0.2F;
               this.cs = new fbx($$0.d + (double)(-bae.a($$1) * $$2), 0.0, $$0.f + (double)(bae.b($$1) * $$2));
               this.h(this.cs.b(0.0, 0.27, 0.0));
            } else if ((float)this.ca != 7.0F && (float)this.ca != 15.0F && (float)this.ca != 23.0F) {
               this.n(this.cs.d, $$0.e, this.cs.f);
            } else {
               this.n(0.0, this.aJ() ? 0.27 : $$0.e, 0.0);
            }
         }
      }
   }

   private void gS() {
      fbx $$0 = this.dz();
      dhh $$1 = this.dW();
      $$1.a(
         ls.ah,
         this.dB() - (double)(this.dr() + 1.0F) * 0.5 * (double)bae.a(this.aX * (float) (Math.PI / 180.0)),
         this.dF() - 0.1F,
         this.dH() + (double)(this.dr() + 1.0F) * 0.5 * (double)bae.b(this.aX * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(axf.sO, 1.0F, 1.0F);

      for (cil $$3 : $$1.a(cil.class, this.cR().g(10.0))) {
         if (!$$3.e_() && $$3.aJ() && !$$3.bj() && $$3.gK()) {
            $$3.s();
         }
      }

      if (this.dW() instanceof ash $$4 && $$4.N().b(dhd.f)) {
         this.a($$4, ewk.aH, this::a);
      }
   }

   @Override
   protected void a(ash $$0, cma $$1) {
      if (this.a(bvr.a).f() && b($$1)) {
         this.a($$1);
         cxo $$2 = $$1.l();
         this.a(bvr.a, $$2);
         this.g(bvr.a);
         this.a($$1, $$2.L());
         $$1.at();
      }
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      this.x(false);
      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      bam $$4 = $$0.H_();
      this.a(cil.a.a($$4));
      this.b(cil.a.a($$4));
      this.gJ();
      if ($$3 == null) {
         $$3 = new bva.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cil $$0, @Nullable cil $$1) {
      if ($$1 == null) {
         if (this.ae.h()) {
            this.a($$0.gT());
            this.b(cil.a.a(this.ae));
         } else {
            this.a(cil.a.a(this.ae));
            this.b($$0.gT());
         }
      } else if (this.ae.h()) {
         this.a($$0.gT());
         this.b($$1.gT());
      } else {
         this.a($$1.gT());
         this.b($$0.gT());
      }

      if (this.ae.a(32) == 0) {
         this.a(cil.a.a(this.ae));
      }

      if (this.ae.a(32) == 0) {
         this.b(cil.a.a(this.ae));
      }
   }

   private cil.a gT() {
      return this.ae.h() ? this.gr() : this.gs();
   }

   public void gJ() {
      if (this.gH()) {
         this.g(bxn.s).a(10.0);
      }

      if (this.gD()) {
         this.g(bxn.v).a(0.07F);
      }
   }

   void gU() {
      if (!this.bj()) {
         this.G(0.0F);
         this.L().o();
         this.x(true);
      }
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      if (this.gI()) {
         return bti.e;
      } else if (this.go()) {
         this.y(false);
         return bti.a;
      } else if (this.j($$2)) {
         if (this.O_() != null) {
            this.cq = true;
         }

         if (this.e_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.Z_() / 20) * 0.1F), true);
         } else if (!this.dW().C && this.Z_() == 0 && this.gv()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
         } else {
            if (!(this.dW() instanceof ash $$3) || this.x() || this.bj()) {
               return bti.e;
            }

            this.gU();
            this.z(true);
            cxo $$4 = this.a(bvr.a);
            if (!$$4.f() && !$$0.fV()) {
               this.a($$3, $$4);
            }

            this.a(bvr.a, new cxo($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return bti.b;
      } else {
         return bti.e;
      }
   }

   @Nullable
   @Override
   protected axe u() {
      if (this.gd()) {
         return axf.sU;
      } else {
         return this.gE() ? axf.sV : axf.sP;
      }
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.sS, 0.15F, 1.0F);
   }

   @Override
   public boolean j(cxo $$0) {
      return $$0.a(ayd.av);
   }

   @Nullable
   @Override
   protected axe o_() {
      return axf.sQ;
   }

   @Nullable
   @Override
   protected axe e(btz $$0) {
      return axf.sW;
   }

   public boolean gK() {
      return !this.go() && !this.gI() && !this.gp() && !this.gA() && !this.x();
   }

   @Override
   public bvm e(bwr $$0) {
      return this.e_() ? cj : super.e($$0);
   }

   private static boolean b(cma $$0) {
      return $$0.l().a(ayd.aw) && $$0.bL() && !$$0.v();
   }

   public static enum a implements bba {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final bba.a<cil.a> h = bba.a(cil.a::values);
      private static final IntFunction<cil.a> i = ayv.a(cil.a::a, values(), ayv.a.a);
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

      static cil.a a(cil.a $$0, cil.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cil.a a(int $$0) {
         return i.apply($$0);
      }

      public static cil.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cil.a a(bam $$0) {
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

   static class b extends cdn {
      private final cil b;

      public b(cil $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gK() && super.b();
      }
   }

   static class c<T extends bwf> extends cck<T> {
      private final cil i;

      public c(cil $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bvo.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gE() && this.i.gK() && super.b();
      }
   }

   static class d extends ccp {
      private final cil d;
      private int e;

      public d(cil $$0, double $$1) {
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
                  cpw $$0 = this.b.a(cil.ci, this.d);
                  this.d.cz.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         jh $$0 = this.d.dw();
         jh.a $$1 = new jh.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dkn.nu)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cev {
      private final cil a;

      public e(cil $$0, Class<?>... $$1) {
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
      protected void a(bwh $$0, bwf $$1) {
         if ($$0 instanceof cil && $$0.gd()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends cdd {
      private final cil a;
      private int b;

      public f(cil $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return this.b < this.a.af && this.a.gD() && this.a.gK() && this.a.ae.a(b(400)) == 1;
      }

      @Override
      public boolean c() {
         return !this.a.bj() && (this.a.gD() || this.a.ae.a(b(600)) != 1) ? this.a.ae.a(b(2000)) != 1 : false;
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

   static class g extends cdl {
      private final cil h;

      public g(cil $$0, Class<? extends bwf> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bwf $$0) {
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
               ash $$0 = a(this.b);
               if (this.f == cpw.class) {
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

   static class h extends ccg {
      private final cil l;

      public h(cil $$0) {
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

   static class i extends cdw {
      private final cil a;

      public i(cil $$0, double $$1) {
         super($$0, $$1, axw.G);
         this.a = $$0;
      }

      @Override
      public boolean c() {
         if (this.a.x()) {
            this.a.L().o();
            return false;
         } else {
            return super.c();
         }
      }
   }

   static class j extends cdd {
      private final cil a;

      public j(cil $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdd.a.a, cdd.a.b, cdd.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.e_() || this.a.gF()) && this.a.aJ()) {
            if (!this.a.gK()) {
               return false;
            } else {
               float $$0 = this.a.dM() * (float) (Math.PI / 180.0);
               float $$1 = -bae.a($$0);
               float $$2 = bae.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? bae.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? bae.j((double)$$2) : 0;
               if (this.a.dW().a_(this.a.dw().b($$3, -1, $$4)).l()) {
                  return true;
               } else {
                  return this.a.gF() && this.a.ae.a(b(60)) == 1 ? true : this.a.ae.a(b(500)) == 1;
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

   class k extends cdd {
      private int b;

      public k() {
         this.a(EnumSet.of(cdd.a.a));
      }

      @Override
      public boolean b() {
         if (this.b > cil.this.af || cil.this.e_() || cil.this.bj() || !cil.this.gK() || cil.this.p() > 0) {
            return false;
         } else {
            return !cil.this.a(bvr.a).f() ? true : !cil.this.dW().a(cma.class, cil.this.cR().c(6.0, 6.0, 6.0), cil::b).isEmpty();
         }
      }

      @Override
      public boolean c() {
         return !cil.this.bj() && (cil.this.gD() || cil.this.ae.a(b(600)) != 1) ? cil.this.ae.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!cil.this.x() && !cil.this.a(bvr.a).f()) {
            cil.this.gU();
         }
      }

      @Override
      public void d() {
         if (cil.this.a(bvr.a).f()) {
            List<cma> $$0 = cil.this.dW().a(cma.class, cil.this.cR().c(8.0, 8.0, 8.0), cil::b);
            if (!$$0.isEmpty()) {
               cil.this.L().a($$0.getFirst(), 1.2F);
            }
         } else {
            cil.this.gU();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cxo $$0 = cil.this.a(bvr.a);
         if (!$$0.f()) {
            cil.this.a(a(cil.this.dW()), $$0);
            cil.this.a(bvr.a, cxo.j);
            int $$1 = cil.this.gD() ? cil.this.ae.a(50) + 10 : cil.this.ae.a(150) + 10;
            this.b = cil.this.af + $$1 * 20;
         }

         cil.this.x(false);
      }
   }

   static class l extends cdd {
      private final cil a;

      public l(cil $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.e_() && this.a.gK()) {
            return this.a.gH() && this.a.ae.a(b(500)) == 1 ? true : this.a.ae.a(b(6000)) == 1;
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
