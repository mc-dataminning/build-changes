import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cih extends chs {
   private static final alc<Integer> cb = alg.a(cih.class, ale.b);
   private static final alc<Integer> cd = alg.a(cih.class, ale.b);
   private static final alc<Integer> ce = alg.a(cih.class, ale.b);
   private static final alc<Byte> cf = alg.a(cih.class, ale.a);
   private static final alc<Byte> cg = alg.a(cih.class, ale.a);
   private static final alc<Byte> ch = alg.a(cih.class, ale.a);
   static final cgs ci = cgs.b().a(8.0);
   private static final bvi cj = bvm.aO.n().a(0.5F).a(bvh.a().a(bvg.a, 0.0F, 0.40625F, 0.0F));
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
   private fbs cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   private float cy;
   cih.g cz;

   public cih(bvm<? extends cih> $$0, dha $$1) {
      super($$0, $$1);
      this.bQ = new cih.h(this);
      if (!this.e_()) {
         this.a_(true);
      }
   }

   @Override
   protected boolean f(bvn $$0) {
      return $$0 == bvn.a && this.fL();
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

   public boolean gm() {
      return this.v(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gn() {
      return this.al.a(ce) > 0;
   }

   public void z(boolean $$0) {
      this.al.a(ce, $$0 ? 1 : 0);
   }

   private int gJ() {
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

   public int go() {
      return this.al.a(cd);
   }

   public void t(int $$0) {
      this.al.a(cd, $$0);
   }

   public cih.a gp() {
      return cih.a.a(this.al.a(cf));
   }

   public void a(cih.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cih.a.a(this.ae);
      }

      this.al.a(cf, (byte)$$0.a());
   }

   public cih.a gq() {
      return cih.a.a(this.al.a(cg));
   }

   public void b(cih.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cih.a.a(this.ae);
      }

      this.al.a(cg, (byte)$$0.a());
   }

   public boolean gy() {
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
      $$0.a("MainGene", this.gp().c());
      $$0.a("HiddenGene", this.gq().c());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(cih.a.a($$0.l("MainGene")));
      this.b(cih.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public buw a(ash $$0, buw $$1) {
      cih $$2 = bvm.aO.a($$0, bvl.e);
      if ($$2 != null) {
         if ($$1 instanceof cih $$3) {
            $$2.a(this, $$3);
         }

         $$2.gH();
      }

      return $$2;
   }

   @Override
   protected void B() {
      this.bT.a(0, new cct(this));
      this.bT.a(2, new cih.i(this, 2.0));
      this.bT.a(2, new cih.d(this, 1.0));
      this.bT.a(3, new cih.b(this, 1.2F, true));
      this.bT.a(4, new ceh(this, 1.0, $$0 -> $$0.a(ayd.av), false));
      this.bT.a(6, new cih.c<>(this, cps.class, 8.0F, 2.0, 2.0));
      this.bT.a(6, new cih.c<>(this, cms.class, 4.0F, 2.0, 2.0));
      this.bT.a(7, new cih.k());
      this.bT.a(8, new cih.f(this));
      this.bT.a(8, new cih.l(this));
      this.cz = new cih.g(this, cps.class, 6.0F);
      this.bT.a(9, this.cz);
      this.bT.a(10, new cdu(this));
      this.bT.a(12, new cih.j(this));
      this.bT.a(13, new ccy(this, 1.25));
      this.bT.a(14, new cem(this, 1.0));
      this.bU.a(1, new cih.e(this).a(new Class[0]));
   }

   public static bxi.a gz() {
      return chs.gr().a(bxj.v, 0.15F).a(bxj.c, 6.0);
   }

   public cih.a gA() {
      return cih.a.a(this.gp(), this.gq());
   }

   public boolean gB() {
      return this.gA() == cih.a.b;
   }

   public boolean gC() {
      return this.gA() == cih.a.c;
   }

   public boolean gD() {
      return this.gA() == cih.a.d;
   }

   public boolean gE() {
      return this.gA() == cih.a.e;
   }

   public boolean gF() {
      return this.gA() == cih.a.f;
   }

   @Override
   public boolean gb() {
      return this.gA() == cih.a.g;
   }

   @Override
   public boolean y() {
      return false;
   }

   @Override
   public boolean c(ash $$0, bvf $$1) {
      if (!this.gb()) {
         this.cr = true;
      }

      return super.c($$0, $$1);
   }

   @Override
   public void gd() {
      this.a(axf.sW, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.gC()) {
         if (this.dV().ae() && !this.bj()) {
            this.x(true);
            this.z(false);
         } else if (!this.gn()) {
            this.x(false);
         }
      }

      bwb $$0 = this.O_();
      if ($$0 == null) {
         this.cq = false;
         this.cr = false;
      }

      if (this.p() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.p() == 29 || this.p() == 14) {
            this.a(axf.sS, 1.0F, 1.0F);
         }

         this.s(this.p() - 1);
      }

      if (this.t()) {
         this.t(this.go() + 1);
         if (this.go() > 20) {
            this.A(false);
            this.gQ();
         } else if (this.go() == 1) {
            this.a(axf.sM, 1.0F, 1.0F);
         }
      }

      if (this.gy()) {
         this.gP();
      } else {
         this.ca = 0;
      }

      if (this.x()) {
         this.w(0.0F);
      }

      this.gM();
      this.gK();
      this.gN();
      this.gO();
   }

   public boolean gG() {
      return this.gC() && this.dV().ae();
   }

   private void gK() {
      if (!this.gn() && this.x() && !this.gG() && !this.a(bvn.a).f() && this.ae.a(80) == 1) {
         this.z(true);
      } else if (this.a(bvn.a).f() || !this.x()) {
         this.z(false);
      }

      if (this.gn()) {
         this.gL();
         if (!this.dV().C && this.gJ() > 80 && this.ae.a(20) == 1) {
            if (this.gJ() > 100 && this.a(bvn.a).a(ayd.aw)) {
               if (!this.dV().C) {
                  this.a(bvn.a, cxk.k);
                  this.a(ecj.m);
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
         this.a(axf.sQ, 0.5F + 0.5F * (float)this.ae.a(2), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            fbs $$1 = new fbs(((double)this.ae.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ae.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dN() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dL() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ae.i()) * 0.6 - 0.3;
            fbs $$3 = new fbs(((double)this.ae.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ae.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aX * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dA(), this.dE() + 1.0, this.dG());
            this.dV().a(new lo(ls.S, this.a(bvn.a)), $$3.d, $$3.e, $$3.f, $$1.d, $$1.e + 0.05, $$1.f);
         }
      }
   }

   private void gM() {
      this.cu = this.ct;
      if (this.x()) {
         this.ct = Math.min(1.0F, this.ct + 0.15F);
      } else {
         this.ct = Math.max(0.0F, this.ct - 0.19F);
      }
   }

   private void gN() {
      this.cw = this.cv;
      if (this.gm()) {
         this.cv = Math.min(1.0F, this.cv + 0.15F);
      } else {
         this.cv = Math.max(0.0F, this.cv - 0.19F);
      }
   }

   private void gO() {
      this.cy = this.cx;
      if (this.gy()) {
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

   private void gP() {
      this.ca++;
      if (this.ca > 32) {
         this.B(false);
      } else {
         if (!this.dV().C) {
            fbs $$0 = this.dy();
            if (this.ca == 1) {
               float $$1 = this.dL() * (float) (Math.PI / 180.0);
               float $$2 = this.e_() ? 0.1F : 0.2F;
               this.cs = new fbs($$0.d + (double)(-bae.a($$1) * $$2), 0.0, $$0.f + (double)(bae.b($$1) * $$2));
               this.h(this.cs.b(0.0, 0.27, 0.0));
            } else if ((float)this.ca != 7.0F && (float)this.ca != 15.0F && (float)this.ca != 23.0F) {
               this.n(this.cs.d, $$0.e, this.cs.f);
            } else {
               this.n(0.0, this.aJ() ? 0.27 : $$0.e, 0.0);
            }
         }
      }
   }

   private void gQ() {
      fbs $$0 = this.dy();
      dha $$1 = this.dV();
      $$1.a(
         ls.ah,
         this.dA() - (double)(this.dq() + 1.0F) * 0.5 * (double)bae.a(this.aX * (float) (Math.PI / 180.0)),
         this.dE() - 0.1F,
         this.dG() + (double)(this.dq() + 1.0F) * 0.5 * (double)bae.b(this.aX * (float) (Math.PI / 180.0)),
         $$0.d,
         0.0,
         $$0.f
      );
      this.a(axf.sN, 1.0F, 1.0F);

      for (cih $$3 : $$1.a(cih.class, this.cR().g(10.0))) {
         if (!$$3.e_() && $$3.aJ() && !$$3.bj() && $$3.gI()) {
            $$3.s();
         }
      }

      if (this.dV() instanceof ash $$4 && $$4.N().b(dgw.f)) {
         this.a($$4, ewd.aH, this::a);
      }
   }

   @Override
   protected void a(ash $$0, clw $$1) {
      if (this.a(bvn.a).f() && b($$1)) {
         this.a($$1);
         cxk $$2 = $$1.l();
         this.a(bvn.a, $$2);
         this.g(bvn.a);
         this.a($$1, $$2.L());
         $$1.at();
      }
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      this.x(false);
      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      bam $$4 = $$0.H_();
      this.a(cih.a.a($$4));
      this.b(cih.a.a($$4));
      this.gH();
      if ($$3 == null) {
         $$3 = new buw.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cih $$0, @Nullable cih $$1) {
      if ($$1 == null) {
         if (this.ae.h()) {
            this.a($$0.gR());
            this.b(cih.a.a(this.ae));
         } else {
            this.a(cih.a.a(this.ae));
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
         this.a(cih.a.a(this.ae));
      }

      if (this.ae.a(32) == 0) {
         this.b(cih.a.a(this.ae));
      }
   }

   private cih.a gR() {
      return this.ae.h() ? this.gp() : this.gq();
   }

   public void gH() {
      if (this.gF()) {
         this.g(bxj.s).a(10.0);
      }

      if (this.gB()) {
         this.g(bxj.v).a(0.07F);
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
   public bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if (this.gG()) {
         return bte.e;
      } else if (this.gm()) {
         this.y(false);
         return bte.a;
      } else if (this.j($$2)) {
         if (this.O_() != null) {
            this.cq = true;
         }

         if (this.e_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.Z_() / 20) * 0.1F), true);
         } else if (!this.dV().C && this.Z_() == 0 && this.gt()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
         } else {
            if (!(this.dV() instanceof ash $$3) || this.x() || this.bj()) {
               return bte.e;
            }

            this.gS();
            this.z(true);
            cxk $$4 = this.a(bvn.a);
            if (!$$4.f() && !$$0.fT()) {
               this.a($$3, $$4);
            }

            this.a(bvn.a, new cxk($$2.h(), 1));
            this.a($$0, $$1, $$2);
         }

         return bte.b;
      } else {
         return bte.e;
      }
   }

   @Nullable
   @Override
   protected axe u() {
      if (this.gb()) {
         return axf.sT;
      } else {
         return this.gC() ? axf.sU : axf.sO;
      }
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.sR, 0.15F, 1.0F);
   }

   @Override
   public boolean j(cxk $$0) {
      return $$0.a(ayd.av);
   }

   @Nullable
   @Override
   protected axe o_() {
      return axf.sP;
   }

   @Nullable
   @Override
   protected axe e(btv $$0) {
      return axf.sV;
   }

   public boolean gI() {
      return !this.gm() && !this.gG() && !this.gn() && !this.gy() && !this.x();
   }

   @Override
   public bvi e(bwn $$0) {
      return this.e_() ? cj : super.e($$0);
   }

   private static boolean b(clw $$0) {
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

      public static final bba.a<cih.a> h = bba.a(cih.a::values);
      private static final IntFunction<cih.a> i = ayv.a(cih.a::a, values(), ayv.a.a);
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

      static cih.a a(cih.a $$0, cih.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cih.a a(int $$0) {
         return i.apply($$0);
      }

      public static cih.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cih.a a(bam $$0) {
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

   static class b extends cdj {
      private final cih b;

      public b(cih $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return this.b.gI() && super.b();
      }
   }

   static class c<T extends bwb> extends ccg<T> {
      private final cih i;

      public c(cih $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bvk.f::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gC() && this.i.gI() && super.b();
      }
   }

   static class d extends ccl {
      private final cih d;
      private int e;

      public d(cih $$0, double $$1) {
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
                  cps $$0 = this.b.a(cih.ci, this.d);
                  this.d.cz.a($$0);
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
                     if (this.b.a_($$1).a(dkg.nu)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cer {
      private final cih a;

      public e(cih $$0, Class<?>... $$1) {
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
      protected void a(bwd $$0, bwb $$1) {
         if ($$0 instanceof cih && $$0.gb()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends ccz {
      private final cih a;
      private int b;

      public f(cih $$0) {
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

   static class g extends cdh {
      private final cih h;

      public g(cih $$0, Class<? extends bwb> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bwb $$0) {
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
               ash $$0 = a(this.b);
               if (this.f == cps.class) {
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

   static class h extends ccc {
      private final cih l;

      public h(cih $$0) {
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

   static class i extends cds {
      private final cih a;

      public i(cih $$0, double $$1) {
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

   static class j extends ccz {
      private final cih a;

      public j(cih $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccz.a.a, ccz.a.b, ccz.a.c));
      }

      @Override
      public boolean b() {
         if ((this.a.e_() || this.a.gD()) && this.a.aJ()) {
            if (!this.a.gI()) {
               return false;
            } else {
               float $$0 = this.a.dL() * (float) (Math.PI / 180.0);
               float $$1 = -bae.a($$0);
               float $$2 = bae.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? bae.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? bae.j((double)$$2) : 0;
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
      public boolean U_() {
         return false;
      }
   }

   class k extends ccz {
      private int b;

      public k() {
         this.a(EnumSet.of(ccz.a.a));
      }

      @Override
      public boolean b() {
         if (this.b > cih.this.af || cih.this.e_() || cih.this.bj() || !cih.this.gI() || cih.this.p() > 0) {
            return false;
         } else {
            return !cih.this.a(bvn.a).f() ? true : !cih.this.dV().a(clw.class, cih.this.cR().c(6.0, 6.0, 6.0), cih::b).isEmpty();
         }
      }

      @Override
      public boolean c() {
         return !cih.this.bj() && (cih.this.gB() || cih.this.ae.a(b(600)) != 1) ? cih.this.ae.a(b(2000)) != 1 : false;
      }

      @Override
      public void a() {
         if (!cih.this.x() && !cih.this.a(bvn.a).f()) {
            cih.this.gS();
         }
      }

      @Override
      public void d() {
         if (cih.this.a(bvn.a).f()) {
            List<clw> $$0 = cih.this.dV().a(clw.class, cih.this.cR().c(8.0, 8.0, 8.0), cih::b);
            if (!$$0.isEmpty()) {
               cih.this.L().a($$0.getFirst(), 1.2F);
            }
         } else {
            cih.this.gS();
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cxk $$0 = cih.this.a(bvn.a);
         if (!$$0.f()) {
            cih.this.a(a(cih.this.dV()), $$0);
            cih.this.a(bvn.a, cxk.k);
            int $$1 = cih.this.gB() ? cih.this.ae.a(50) + 10 : cih.this.ae.a(150) + 10;
            this.b = cih.this.af + $$1 * 20;
         }

         cih.this.x(false);
      }
   }

   static class l extends ccz {
      private final cih a;

      public l(cih $$0) {
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
