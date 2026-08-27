import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbt extends cbe {
   private static final aim<Integer> ca = aiq.a(cbt.class, aio.b);
   private static final aim<Integer> cb = aiq.a(cbt.class, aio.b);
   private static final aim<Integer> cc = aiq.a(cbt.class, aio.b);
   private static final aim<Byte> cd = aiq.a(cbt.class, aio.a);
   private static final aim<Byte> ce = aiq.a(cbt.class, aio.a);
   private static final aim<Byte> cf = aiq.a(cbt.class, aio.a);
   static final caf cg = caf.b().a(8.0);
   private static final bpa ch = bpd.aw.n().a(0.5F).a(boz.a().a(boy.a, 0.0F, 0.40625F, 0.0F));
   private static final int ci = 2;
   private static final int cj = 4;
   private static final int ck = 8;
   private static final int cl = 16;
   private static final int cm = 5;
   public static final int bX = 32;
   private static final int cn = 32;
   boolean co;
   boolean cp;
   public int bY;
   private ept cq;
   private float cr;
   private float cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   cbt.g cx;
   static final Predicate<cfe> cz = $$0 -> {
      cqm $$1 = $$0.p();
      return ($$1.a(dae.mZ.l()) || $$1.a(dae.eg.l())) && $$0.bA() && !$$0.y();
   };

   public cbt(bpd<? extends cbt> $$0, cxb $$1) {
      super($$0, $$1);
      this.bO = new cbt.h(this);
      if (!this.o_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(cqm $$0) {
      bpe $$1 = bpr.h($$0);
      return !this.d($$1).b() ? false : $$1 == bpe.a && super.f($$0);
   }

   public int r() {
      return this.an.a(ca);
   }

   public void u(int $$0) {
      this.an.a(ca, $$0);
   }

   public boolean s() {
      return this.x(2);
   }

   public boolean y() {
      return this.x(8);
   }

   public void w(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gn() {
      return this.x(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gt() {
      return this.an.a(cc) > 0;
   }

   public void y(boolean $$0) {
      this.an.a(cc, $$0 ? 1 : 0);
   }

   private int gI() {
      return this.an.a(cc);
   }

   private void w(int $$0) {
      this.an.a(cc, $$0);
   }

   public void z(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.v(0);
      }
   }

   public int gu() {
      return this.an.a(cb);
   }

   public void v(int $$0) {
      this.an.a(cb, $$0);
   }

   public cbt.a gv() {
      return cbt.a.a(this.an.a(cd));
   }

   public void a(cbt.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cbt.a.a(this.ag);
      }

      this.an.a(cd, (byte)$$0.a());
   }

   public cbt.a gw() {
      return cbt.a.a(this.an.a(ce));
   }

   public void b(cbt.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cbt.a.a(this.ag);
      }

      this.an.a(ce, (byte)$$0.a());
   }

   public boolean gx() {
      return this.x(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
      $$0.a(cb, 0);
      $$0.a(cd, (byte)0);
      $$0.a(ce, (byte)0);
      $$0.a(cf, (byte)0);
      $$0.a(cc, 0);
   }

   private boolean x(int $$0) {
      return (this.an.a(cf) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.an.a(cf);
      if ($$1) {
         this.an.a(cf, (byte)($$2 | $$0));
      } else {
         this.an.a(cf, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gv().c());
      $$0.a("HiddenGene", this.gw().c());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.a(cbt.a.a($$0.l("MainGene")));
      this.b(cbt.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bos a(apf $$0, bos $$1) {
      cbt $$2 = bpd.aw.a((cxb)$$0);
      if ($$2 != null) {
         if ($$1 instanceof cbt $$3) {
            $$2.a(this, $$3);
         }

         $$2.gG();
      }

      return $$2;
   }

   @Override
   protected void z() {
      this.bR.a(0, new bwg(this));
      this.bR.a(2, new cbt.i(this, 2.0));
      this.bR.a(2, new cbt.d(this, 1.0));
      this.bR.a(3, new cbt.b(this, 1.2F, true));
      this.bR.a(4, new bxu(this, 1.0, ctm.a(dae.mZ.l()), false));
      this.bR.a(6, new cbt.c<>(this, ciu.class, 8.0F, 2.0, 2.0));
      this.bR.a(6, new cbt.c<>(this, cga.class, 4.0F, 2.0, 2.0));
      this.bR.a(7, new cbt.k());
      this.bR.a(8, new cbt.f(this));
      this.bR.a(8, new cbt.l(this));
      this.cx = new cbt.g(this, ciu.class, 6.0F);
      this.bR.a(9, this.cx);
      this.bR.a(10, new bxh(this));
      this.bR.a(12, new cbt.j(this));
      this.bR.a(13, new bwl(this, 1.25));
      this.bR.a(14, new bxz(this, 1.0));
      this.bS.a(1, new cbt.e(this).a(new Class[0]));
   }

   public static bqv.a gy() {
      return bpr.A().a(bqw.r, 0.15F).a(bqw.c, 6.0);
   }

   public cbt.a gz() {
      return cbt.a.a(this.gv(), this.gw());
   }

   public boolean gA() {
      return this.gz() == cbt.a.b;
   }

   public boolean gB() {
      return this.gz() == cbt.a.c;
   }

   public boolean gC() {
      return this.gz() == cbt.a.d;
   }

   public boolean gD() {
      return this.gz() == cbt.a.e;
   }

   public boolean gE() {
      return this.gz() == cbt.a.f;
   }

   @Override
   public boolean gf() {
      return this.gz() == cbt.a.g;
   }

   @Override
   public boolean a(ciu $$0) {
      return false;
   }

   @Override
   public boolean C(box $$0) {
      this.a(aty.sf, 1.0F, 1.0F);
      if (!this.gf()) {
         this.cp = true;
      }

      return super.C($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.gB()) {
         if (this.dM().aa() && !this.bc()) {
            this.w(true);
            this.y(false);
         } else if (!this.gt()) {
            this.w(false);
         }
      }

      bpp $$0 = this.p();
      if ($$0 == null) {
         this.co = false;
         this.cp = false;
      }

      if (this.r() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.r() == 29 || this.r() == 14) {
            this.a(aty.sb, 1.0F, 1.0F);
         }

         this.u(this.r() - 1);
      }

      if (this.s()) {
         this.v(this.gu() + 1);
         if (this.gu() > 20) {
            this.z(false);
            this.gP();
         } else if (this.gu() == 1) {
            this.a(aty.rV, 1.0F, 1.0F);
         }
      }

      if (this.gx()) {
         this.gO();
      } else {
         this.bY = 0;
      }

      if (this.y()) {
         this.s(0.0F);
      }

      this.gL();
      this.gJ();
      this.gM();
      this.gN();
   }

   public boolean gF() {
      return this.gB() && this.dM().aa();
   }

   private void gJ() {
      if (!this.gt() && this.y() && !this.gF() && !this.d(bpe.a).b() && this.ag.a(80) == 1) {
         this.y(true);
      } else if (this.d(bpe.a).b() || !this.y()) {
         this.y(false);
      }

      if (this.gt()) {
         this.gK();
         if (!this.dM().B && this.gI() > 80 && this.ag.a(20) == 1) {
            if (this.gI() > 100 && this.n(this.d(bpe.a))) {
               if (!this.dM().B) {
                  this.a(bpe.a, cqm.h);
                  this.b(drp.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.w(this.gI() + 1);
      }
   }

   private void gK() {
      if (this.gI() % 5 == 0) {
         this.a(aty.rZ, 0.5F + 0.5F * (float)this.ag.a(2), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            ept $$1 = new ept(((double)this.ag.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ag.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dE() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dC() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ag.i()) * 0.6 - 0.3;
            ept $$3 = new ept(((double)this.ag.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ag.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aX * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dr(), this.dv() + 1.0, this.dx());
            this.dM().a(new jy(kc.R, this.d(bpe.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gL() {
      this.cs = this.cr;
      if (this.y()) {
         this.cr = Math.min(1.0F, this.cr + 0.15F);
      } else {
         this.cr = Math.max(0.0F, this.cr - 0.19F);
      }
   }

   private void gM() {
      this.cu = this.ct;
      if (this.gn()) {
         this.ct = Math.min(1.0F, this.ct + 0.15F);
      } else {
         this.ct = Math.max(0.0F, this.ct - 0.19F);
      }
   }

   private void gN() {
      this.cw = this.cv;
      if (this.gx()) {
         this.cv = Math.min(1.0F, this.cv + 0.15F);
      } else {
         this.cv = Math.max(0.0F, this.cv - 0.19F);
      }
   }

   public float G(float $$0) {
      return aww.i($$0, this.cs, this.cr);
   }

   public float H(float $$0) {
      return aww.i($$0, this.cu, this.ct);
   }

   public float I(float $$0) {
      return aww.i($$0, this.cw, this.cv);
   }

   private void gO() {
      this.bY++;
      if (this.bY > 32) {
         this.A(false);
      } else {
         if (!this.dM().B) {
            ept $$0 = this.dp();
            if (this.bY == 1) {
               float $$1 = this.dC() * (float) (Math.PI / 180.0);
               float $$2 = this.o_() ? 0.1F : 0.2F;
               this.cq = new ept($$0.c + (double)(-aww.a($$1) * $$2), 0.0, $$0.e + (double)(aww.b($$1) * $$2));
               this.g(this.cq.b(0.0, 0.27, 0.0));
            } else if ((float)this.bY != 7.0F && (float)this.bY != 15.0F && (float)this.bY != 23.0F) {
               this.o(this.cq.c, $$0.d, this.cq.e);
            } else {
               this.o(0.0, this.aC() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gP() {
      ept $$0 = this.dp();
      cxb $$1 = this.dM();
      $$1.a(
         kc.ae,
         this.dr() - (double)(this.dg() + 1.0F) * 0.5 * (double)aww.a(this.aX * (float) (Math.PI / 180.0)),
         this.dv() - 0.1F,
         this.dx() + (double)(this.dg() + 1.0F) * 0.5 * (double)aww.b(this.aX * (float) (Math.PI / 180.0)),
         $$0.c,
         0.0,
         $$0.e
      );
      this.a(aty.rW, 1.0F, 1.0F);

      for (cbt $$3 : $$1.a(cbt.class, this.cH().g(10.0))) {
         if (!$$3.o_() && $$3.aC() && !$$3.bc() && $$3.gH()) {
            $$3.fg();
         }
      }

      if (!$$1.x_() && $$1.Z().b(cwx.f)) {
         apf $$4 = (apf)$$1;
         ele $$5 = $$4.o().aM().getLootTable(eku.aL);
         elc $$6 = new elc.a($$4).a(enh.f, this.dk()).a(enh.a, this).a(eng.i);

         for (cqm $$8 : $$5.a($$6)) {
            this.b($$8);
         }
      }
   }

   @Override
   protected void b(cfe $$0) {
      if (this.d(bpe.a).b() && cz.test($$0)) {
         this.a($$0);
         cqm $$1 = $$0.p();
         this.a(bpe.a, $$1);
         this.f(bpe.a);
         this.a($$0, $$1.M());
         $$0.am();
      }
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      if (!this.dM().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      axd $$4 = $$0.E_();
      this.a(cbt.a.a($$4));
      this.b(cbt.a.a($$4));
      this.gG();
      if ($$3 == null) {
         $$3 = new bos.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cbt $$0, @Nullable cbt $$1) {
      if ($$1 == null) {
         if (this.ag.h()) {
            this.a($$0.gQ());
            this.b(cbt.a.a(this.ag));
         } else {
            this.a(cbt.a.a(this.ag));
            this.b($$0.gQ());
         }
      } else if (this.ag.h()) {
         this.a($$0.gQ());
         this.b($$1.gQ());
      } else {
         this.a($$1.gQ());
         this.b($$0.gQ());
      }

      if (this.ag.a(32) == 0) {
         this.a(cbt.a.a(this.ag));
      }

      if (this.ag.a(32) == 0) {
         this.b(cbt.a.a(this.ag));
      }
   }

   private cbt.a gQ() {
      return this.ag.h() ? this.gv() : this.gw();
   }

   public void gG() {
      if (this.gE()) {
         this.f(bqw.q).a(10.0);
      }

      if (this.gA()) {
         this.f(bqw.r).a(0.07F);
      }
   }

   void gR() {
      if (!this.bc()) {
         this.C(0.0F);
         this.K().n();
         this.w(true);
      }
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if (this.gF()) {
         return bnd.d;
      } else if (this.gn()) {
         this.x(false);
         return bnd.a(this.dM().B);
      } else if (this.o($$2)) {
         if (this.p() != null) {
            this.co = true;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dM().B && this.g() == 0 && this.go()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dM().B || this.y() || this.bc()) {
               return bnd.d;
            }

            this.gR();
            this.y(true);
            cqm $$3 = this.d(bpe.a);
            if (!$$3.b() && !$$0.fM()) {
               this.b($$3);
            }

            this.a(bpe.a, new cqm($$2.d(), 1));
            this.a($$0, $$1, $$2);
         }

         return bnd.a;
      } else {
         return bnd.d;
      }
   }

   @Nullable
   @Override
   protected atx v() {
      if (this.gf()) {
         return aty.sc;
      } else {
         return this.gB() ? aty.sd : aty.rX;
      }
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.sa, 0.15F, 1.0F);
   }

   @Override
   public boolean o(cqm $$0) {
      return $$0.a(dae.mZ.l());
   }

   private boolean n(cqm $$0) {
      return this.o($$0) || $$0.a(dae.eg.l());
   }

   @Nullable
   @Override
   protected atx n_() {
      return aty.rY;
   }

   @Nullable
   @Override
   protected atx d(bnw $$0) {
      return aty.se;
   }

   public boolean gH() {
      return !this.gn() && !this.gF() && !this.gt() && !this.gx() && !this.y();
   }

   @Override
   public bpa e(bqa $$0) {
      return this.o_() ? ch : super.e($$0);
   }

   public static enum a implements axq {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final axq.a<cbt.a> h = axq.a(cbt.a::values);
      private static final IntFunction<cbt.a> i = avn.a(cbt.a::a, values(), avn.a.a);
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

      static cbt.a a(cbt.a $$0, cbt.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cbt.a a(int $$0) {
         return i.apply($$0);
      }

      public static cbt.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cbt.a a(axd $$0) {
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

   static class b extends bww {
      private final cbt b;

      public b(cbt $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gH() && super.a();
      }
   }

   static class c<T extends bpp> extends bvt<T> {
      private final cbt i;

      public c(cbt $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bpc.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gB() && this.i.gH() && super.a();
      }
   }

   static class d extends bvy {
      private final cbt d;
      private int e;

      public d(cbt $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         if (!super.a() || this.d.r() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.ah) {
               this.d.u(32);
               this.e = this.d.ah + 600;
               if (this.d.cY()) {
                  ciu $$0 = this.b.a(cbt.cg, this.d);
                  this.d.cx.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         ib $$0 = this.d.dm();
         ib.a $$1 = new ib.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dae.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends bye {
      private final cbt a;

      public e(cbt $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.co && !this.a.cp) {
            return super.b();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(bpr $$0, bpp $$1) {
         if ($$0 instanceof cbt && $$0.gf()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bwm {
      private final cbt a;
      private int b;

      public f(cbt $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ah && this.a.gA() && this.a.gH() && this.a.ag.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.bc() && (this.a.gA() || this.a.ag.a(b(600)) != 1) ? this.a.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void c() {
         this.a.x(true);
         this.b = 0;
      }

      @Override
      public void d() {
         this.a.x(false);
         this.b = this.a.ah + 200;
      }
   }

   static class g extends bwu {
      private final cbt h;

      public g(cbt $$0, Class<? extends bpp> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bpp $$0) {
         this.c = $$0;
      }

      @Override
      public boolean b() {
         return this.c != null && super.b();
      }

      @Override
      public boolean a() {
         if (this.b.ei().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == ciu.class) {
                  this.c = this.b.dM().a(this.g, this.b, this.b.dr(), this.b.dv(), this.b.dx());
               } else {
                  this.c = this.b
                     .dM()
                     .a(
                        this.b.dM().a(this.f, this.b.cH().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.dr(),
                        this.b.dv(),
                        this.b.dx()
                     );
               }
            }

            return this.h.gH() && this.c != null;
         }
      }

      @Override
      public void e() {
         if (this.c != null) {
            super.e();
         }
      }
   }

   static class h extends bvp {
      private final cbt l;

      public h(cbt $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gH()) {
            super.a();
         }
      }
   }

   static class i extends bxf {
      private final cbt h;

      public i(cbt $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dB() || this.b.bN();
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

   static class j extends bwm {
      private final cbt a;

      public j(cbt $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bwm.a.a, bwm.a.b, bwm.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.o_() || this.a.gC()) && this.a.aC()) {
            if (!this.a.gH()) {
               return false;
            } else {
               float $$0 = this.a.dC() * (float) (Math.PI / 180.0);
               float $$1 = -aww.a($$0);
               float $$2 = aww.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? aww.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? aww.j((double)$$2) : 0;
               if (this.a.dM().a_(this.a.dm().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gC() && this.a.ag.a(b(60)) == 1 ? true : this.a.ag.a(b(500)) == 1;
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

   class k extends bwm {
      private int b;

      public k() {
         this.a(EnumSet.of(bwm.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= cbt.this.ah && !cbt.this.o_() && !cbt.this.bc() && cbt.this.gH() && cbt.this.r() <= 0) {
            List<cfe> $$0 = cbt.this.dM().a(cfe.class, cbt.this.cH().c(6.0, 6.0, 6.0), cbt.cz);
            return !$$0.isEmpty() || !cbt.this.d(bpe.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !cbt.this.bc() && (cbt.this.gA() || cbt.this.ag.a(b(600)) != 1) ? cbt.this.ag.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!cbt.this.y() && !cbt.this.d(bpe.a).b()) {
            cbt.this.gR();
         }
      }

      @Override
      public void c() {
         List<cfe> $$0 = cbt.this.dM().a(cfe.class, cbt.this.cH().c(8.0, 8.0, 8.0), cbt.cz);
         if (!$$0.isEmpty() && cbt.this.d(bpe.a).b()) {
            cbt.this.K().a($$0.get(0), 1.2F);
         } else if (!cbt.this.d(bpe.a).b()) {
            cbt.this.gR();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cqm $$0 = cbt.this.d(bpe.a);
         if (!$$0.b()) {
            cbt.this.b($$0);
            cbt.this.a(bpe.a, cqm.h);
            int $$1 = cbt.this.gA() ? cbt.this.ag.a(50) + 10 : cbt.this.ag.a(150) + 10;
            this.b = cbt.this.ah + $$1 * 20;
         }

         cbt.this.w(false);
      }
   }

   static class l extends bwm {
      private final cbt a;

      public l(cbt $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.o_() && this.a.gH()) {
            return this.a.gE() && this.a.ag.a(b(500)) == 1 ? true : this.a.ag.a(b(6000)) == 1;
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
