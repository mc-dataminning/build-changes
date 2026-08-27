import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cet extends cee {
   private static final ajy<Integer> ck = akc.a(cet.class, aka.b);
   private static final ajy<Integer> cl = akc.a(cet.class, aka.b);
   private static final ajy<Integer> cm = akc.a(cet.class, aka.b);
   private static final ajy<Byte> cn = akc.a(cet.class, aka.a);
   private static final ajy<Byte> co = akc.a(cet.class, aka.a);
   private static final ajy<Byte> cp = akc.a(cet.class, aka.a);
   static final cde cq = cde.b().a(8.0);
   private static final bry cr = bsb.ax.n().a(0.5F).a(brx.a().a(brw.a, 0.0F, 0.40625F, 0.0F));
   private static final int cs = 2;
   private static final int ct = 4;
   private static final int cu = 8;
   private static final int cv = 16;
   private static final int cw = 5;
   public static final int ch = 32;
   private static final int cx = 32;
   boolean cy;
   boolean cz;
   public int ci;
   private ewu cA;
   private float cB;
   private float cC;
   private float cD;
   private float cE;
   private float cF;
   private float cG;
   cet.g cH;
   static final Predicate<cig> cI = $$0 -> {
      cuh $$1 = $$0.p();
      return ($$1.a(dfe.nX.q()) || $$1.a(dfe.eY.q())) && $$0.bI() && !$$0.y();
   };

   public cet(bsb<? extends cet> $$0, dca $$1) {
      super($$0, $$1);
      this.bY = new cet.h(this);
      if (!this.o_()) {
         this.a_(true);
      }
   }

   @Override
   public boolean f(cuh $$0) {
      bsc $$1 = bsq.h($$0);
      return !this.d($$1).d() ? false : $$1 == bsc.a && super.f($$0);
   }

   public int r() {
      return this.as.a(ck);
   }

   public void v(int $$0) {
      this.as.a(ck, $$0);
   }

   public boolean t() {
      return this.y(2);
   }

   public boolean x() {
      return this.y(8);
   }

   public void w(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gy() {
      return this.y(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gE() {
      return this.as.a(cm) > 0;
   }

   public void y(boolean $$0) {
      this.as.a(cm, $$0 ? 1 : 0);
   }

   private int gT() {
      return this.as.a(cm);
   }

   private void x(int $$0) {
      this.as.a(cm, $$0);
   }

   public void z(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.w(0);
      }
   }

   public int gF() {
      return this.as.a(cl);
   }

   public void w(int $$0) {
      this.as.a(cl, $$0);
   }

   public cet.a gG() {
      return cet.a.a(this.as.a(cn));
   }

   public void a(cet.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cet.a.a(this.al);
      }

      this.as.a(cn, (byte)$$0.a());
   }

   public cet.a gH() {
      return cet.a.a(this.as.a(co));
   }

   public void b(cet.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cet.a.a(this.al);
      }

      this.as.a(co, (byte)$$0.a());
   }

   public boolean gI() {
      return this.y(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
      $$0.a(cl, 0);
      $$0.a(cn, (byte)0);
      $$0.a(co, (byte)0);
      $$0.a(cp, (byte)0);
      $$0.a(cm, 0);
   }

   private boolean y(int $$0) {
      return (this.as.a(cp) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.as.a(cp);
      if ($$1) {
         this.as.a(cp, (byte)($$2 | $$0));
      } else {
         this.as.a(cp, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gG().c());
      $$0.a("HiddenGene", this.gH().c());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(cet.a.a($$0.l("MainGene")));
      this.b(cet.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public brp a(aqt $$0, brp $$1) {
      cet $$2 = bsb.ax.a((dca)$$0);
      if ($$2 != null) {
         if ($$1 instanceof cet $$3) {
            $$2.a(this, $$3);
         }

         $$2.gR();
      }

      return $$2;
   }

   @Override
   protected void y() {
      this.cb.a(0, new bzf(this));
      this.cb.a(2, new cet.i(this, 2.0));
      this.cb.a(2, new cet.d(this, 1.0));
      this.cb.a(3, new cet.b(this, 1.2F, true));
      this.cb.a(4, new cat(this, 1.0, $$0 -> $$0.a(awm.aq), false));
      this.cb.a(6, new cet.c<>(this, cly.class, 8.0F, 2.0, 2.0));
      this.cb.a(6, new cet.c<>(this, cjd.class, 4.0F, 2.0, 2.0));
      this.cb.a(7, new cet.k());
      this.cb.a(8, new cet.f(this));
      this.cb.a(8, new cet.l(this));
      this.cH = new cet.g(this, cly.class, 6.0F);
      this.cb.a(9, this.cH);
      this.cb.a(10, new cag(this));
      this.cb.a(12, new cet.j(this));
      this.cb.a(13, new bzk(this, 1.25));
      this.cb.a(14, new cay(this, 1.0));
      this.cc.a(1, new cet.e(this).a(new Class[0]));
   }

   public static btu.a gJ() {
      return bsq.A().a(btv.r, 0.15F).a(btv.c, 6.0);
   }

   public cet.a gK() {
      return cet.a.a(this.gG(), this.gH());
   }

   public boolean gL() {
      return this.gK() == cet.a.b;
   }

   public boolean gM() {
      return this.gK() == cet.a.c;
   }

   public boolean gN() {
      return this.gK() == cet.a.d;
   }

   public boolean gO() {
      return this.gK() == cet.a.e;
   }

   public boolean gP() {
      return this.gK() == cet.a.f;
   }

   @Override
   public boolean gq() {
      return this.gK() == cet.a.g;
   }

   @Override
   public boolean a(cly $$0) {
      return false;
   }

   @Override
   public boolean C(brv $$0) {
      this.a(avo.sZ, 1.0F, 1.0F);
      if (!this.gq()) {
         this.cz = true;
      }

      return super.C($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.gM()) {
         if (this.dU().ac() && !this.bi()) {
            this.w(true);
            this.y(false);
         } else if (!this.gE()) {
            this.w(false);
         }
      }

      bso $$0 = this.p();
      if ($$0 == null) {
         this.cy = false;
         this.cz = false;
      }

      if (this.r() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.r() == 29 || this.r() == 14) {
            this.a(avo.sV, 1.0F, 1.0F);
         }

         this.v(this.r() - 1);
      }

      if (this.t()) {
         this.w(this.gF() + 1);
         if (this.gF() > 20) {
            this.z(false);
            this.ha();
         } else if (this.gF() == 1) {
            this.a(avo.sP, 1.0F, 1.0F);
         }
      }

      if (this.gI()) {
         this.gZ();
      } else {
         this.ci = 0;
      }

      if (this.x()) {
         this.s(0.0F);
      }

      this.gW();
      this.gU();
      this.gX();
      this.gY();
   }

   public boolean gQ() {
      return this.gM() && this.dU().ac();
   }

   private void gU() {
      if (!this.gE() && this.x() && !this.gQ() && !this.d(bsc.a).d() && this.al.a(80) == 1) {
         this.y(true);
      } else if (this.d(bsc.a).d() || !this.x()) {
         this.y(false);
      }

      if (this.gE()) {
         this.gV();
         if (!this.dU().C && this.gT() > 80 && this.al.a(20) == 1) {
            if (this.gT() > 100 && this.n(this.d(bsc.a))) {
               if (!this.dU().C) {
                  this.a(bsc.a, cuh.i);
                  this.a(dxv.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.x(this.gT() + 1);
      }
   }

   private void gV() {
      if (this.gT() % 5 == 0) {
         this.a(avo.sT, 0.5F + 0.5F * (float)this.al.a(2), (this.al.i() - this.al.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            ewu $$1 = new ewu(((double)this.al.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.al.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dM() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dK() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.al.i()) * 0.6 - 0.3;
            ewu $$3 = new ewu(((double)this.al.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.al.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.bj * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dz(), this.dD() + 1.0, this.dF());
            this.dU().a(new kx(lb.Q, this.d(bsc.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gW() {
      this.cC = this.cB;
      if (this.x()) {
         this.cB = Math.min(1.0F, this.cB + 0.15F);
      } else {
         this.cB = Math.max(0.0F, this.cB - 0.19F);
      }
   }

   private void gX() {
      this.cE = this.cD;
      if (this.gy()) {
         this.cD = Math.min(1.0F, this.cD + 0.15F);
      } else {
         this.cD = Math.max(0.0F, this.cD - 0.19F);
      }
   }

   private void gY() {
      this.cG = this.cF;
      if (this.gI()) {
         this.cF = Math.min(1.0F, this.cF + 0.15F);
      } else {
         this.cF = Math.max(0.0F, this.cF - 0.19F);
      }
   }

   public float G(float $$0) {
      return aym.i($$0, this.cC, this.cB);
   }

   public float H(float $$0) {
      return aym.i($$0, this.cE, this.cD);
   }

   public float I(float $$0) {
      return aym.i($$0, this.cG, this.cF);
   }

   private void gZ() {
      this.ci++;
      if (this.ci > 32) {
         this.A(false);
      } else {
         if (!this.dU().C) {
            ewu $$0 = this.dx();
            if (this.ci == 1) {
               float $$1 = this.dK() * (float) (Math.PI / 180.0);
               float $$2 = this.o_() ? 0.1F : 0.2F;
               this.cA = new ewu($$0.c + (double)(-aym.a($$1) * $$2), 0.0, $$0.e + (double)(aym.b($$1) * $$2));
               this.g(this.cA.b(0.0, 0.27, 0.0));
            } else if ((float)this.ci != 7.0F && (float)this.ci != 15.0F && (float)this.ci != 23.0F) {
               this.o(this.cA.c, $$0.d, this.cA.e);
            } else {
               this.o(0.0, this.aE() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void ha() {
      ewu $$0 = this.dx();
      dca $$1 = this.dU();
      $$1.a(
         lb.ae,
         this.dz() - (double)(this.do() + 1.0F) * 0.5 * (double)aym.a(this.bj * (float) (Math.PI / 180.0)),
         this.dD() - 0.1F,
         this.dF() + (double)(this.do() + 1.0F) * 0.5 * (double)aym.b(this.bj * (float) (Math.PI / 180.0)),
         $$0.c,
         0.0,
         $$0.e
      );
      this.a(avo.sQ, 1.0F, 1.0F);

      for (cet $$3 : $$1.a(cet.class, this.cP().g(10.0))) {
         if (!$$3.o_() && $$3.aE() && !$$3.bi() && $$3.gS()) {
            $$3.fs();
         }
      }

      if (!$$1.x_() && $$1.ab().b(dbw.f)) {
         aqt $$4 = (aqt)$$1;
         eru $$5 = $$4.o().be().b(ern.bh);
         ers $$6 = new ers.a($$4).a(eug.f, this.ds()).a(eug.a, this).a(euf.i);

         for (cuh $$8 : $$5.a($$6)) {
            this.b($$8);
         }
      }
   }

   @Override
   protected void b(cig $$0) {
      if (this.d(bsc.a).d() && cI.test($$0)) {
         this.a($$0);
         cuh $$1 = $$0.p();
         this.a(bsc.a, $$1);
         this.f(bsc.a);
         this.a($$0, $$1.G());
         $$0.ao();
      }
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (!this.dU().C) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      ayt $$4 = $$0.F_();
      this.a(cet.a.a($$4));
      this.b(cet.a.a($$4));
      this.gR();
      if ($$3 == null) {
         $$3 = new brp.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cet $$0, @Nullable cet $$1) {
      if ($$1 == null) {
         if (this.al.h()) {
            this.a($$0.hb());
            this.b(cet.a.a(this.al));
         } else {
            this.a(cet.a.a(this.al));
            this.b($$0.hb());
         }
      } else if (this.al.h()) {
         this.a($$0.hb());
         this.b($$1.hb());
      } else {
         this.a($$1.hb());
         this.b($$0.hb());
      }

      if (this.al.a(32) == 0) {
         this.a(cet.a.a(this.al));
      }

      if (this.al.a(32) == 0) {
         this.b(cet.a.a(this.al));
      }
   }

   private cet.a hb() {
      return this.al.h() ? this.gG() : this.gH();
   }

   public void gR() {
      if (this.gP()) {
         this.f(btv.q).a(10.0);
      }

      if (this.gL()) {
         this.f(btv.r).a(0.07F);
      }
   }

   void hc() {
      if (!this.bi()) {
         this.C(0.0F);
         this.J().n();
         this.w(true);
      }
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if (this.gQ()) {
         return bqa.d;
      } else if (this.gy()) {
         this.x(false);
         return bqa.a(this.dU().C);
      } else if (this.o($$2)) {
         if (this.p() != null) {
            this.cy = true;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dU().C && this.g() == 0 && this.gz()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dU().C || this.x() || this.bi()) {
               return bqa.d;
            }

            this.hc();
            this.y(true);
            cuh $$3 = this.d(bsc.a);
            if (!$$3.d() && !$$0.fY()) {
               this.b($$3);
            }

            this.a(bsc.a, new cuh($$2.f(), 1));
            this.a($$0, $$1, $$2);
         }

         return bqa.a;
      } else {
         return bqa.d;
      }
   }

   @Nullable
   @Override
   protected avn u() {
      if (this.gq()) {
         return avo.sW;
      } else {
         return this.gM() ? avo.sX : avo.sR;
      }
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.sU, 0.15F, 1.0F);
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.aq);
   }

   private boolean n(cuh $$0) {
      return this.o($$0) || $$0.a(dfe.eY.q());
   }

   @Nullable
   @Override
   protected avn n_() {
      return avo.sS;
   }

   @Nullable
   @Override
   protected avn d(bqt $$0) {
      return avo.sY;
   }

   public boolean gS() {
      return !this.gy() && !this.gQ() && !this.gE() && !this.gI() && !this.x();
   }

   @Override
   public bry e(bsz $$0) {
      return this.o_() ? cr : super.e($$0);
   }

   public static enum a implements azg {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final azg.a<cet.a> h = azg.a(cet.a::values);
      private static final IntFunction<cet.a> i = axd.a(cet.a::a, values(), axd.a.a);
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

      public static cet.a a(ayt $$0) {
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

   static class b extends bzv {
      private final cet b;

      public b(cet $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gS() && super.a();
      }
   }

   static class c<T extends bso> extends bys<T> {
      private final cet i;

      public c(cet $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsa.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gM() && this.i.gS() && super.a();
      }
   }

   static class d extends byx {
      private final cet d;
      private int e;

      public d(cet $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         if (!super.a() || this.d.r() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.am) {
               this.d.v(32);
               this.e = this.d.am + 600;
               if (this.d.dg()) {
                  cly $$0 = this.b.a(cet.cq, this.d);
                  this.d.cH.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         ir $$0 = this.d.du();
         ir.a $$1 = new ir.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dfe.nX)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cbd {
      private final cet a;

      public e(cet $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.cy && !this.a.cz) {
            return super.b();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(bsq $$0, bso $$1) {
         if ($$0 instanceof cet && $$0.gq()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bzl {
      private final cet a;
      private int b;

      public f(cet $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.am && this.a.gL() && this.a.gS() && this.a.al.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.bi() && (this.a.gL() || this.a.al.a(b(600)) != 1) ? this.a.al.a(b(2000)) != 1 : false;
      }

      @Override
      public void c() {
         this.a.x(true);
         this.b = 0;
      }

      @Override
      public void d() {
         this.a.x(false);
         this.b = this.a.am + 200;
      }
   }

   static class g extends bzt {
      private final cet i;

      public g(cet $$0, Class<? extends bso> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
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
         if (this.b.et().i() >= this.f) {
            return false;
         } else {
            if (this.c == null) {
               if (this.g == cly.class) {
                  this.c = this.b.dU().a(this.h, this.b, this.b.dz(), this.b.dD(), this.b.dF());
               } else {
                  this.c = this.b
                     .dU()
                     .a(
                        this.b.dU().a(this.g, this.b.cP().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.h,
                        this.b,
                        this.b.dz(),
                        this.b.dD(),
                        this.b.dF()
                     );
               }
            }

            return this.i.gS() && this.c != null;
         }
      }

      @Override
      public void e() {
         if (this.c != null) {
            super.e();
         }
      }
   }

   static class h extends byo {
      private final cet l;

      public h(cet $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gS()) {
            super.a();
         }
      }
   }

   static class i extends cae {
      private final cet h;

      public i(cet $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dJ() || this.b.bV();
      }

      @Override
      public boolean b() {
         if (this.h.x()) {
            this.h.J().n();
            return false;
         } else {
            return super.b();
         }
      }
   }

   static class j extends bzl {
      private final cet a;

      public j(cet $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzl.a.a, bzl.a.b, bzl.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.o_() || this.a.gN()) && this.a.aE()) {
            if (!this.a.gS()) {
               return false;
            } else {
               float $$0 = this.a.dK() * (float) (Math.PI / 180.0);
               float $$1 = -aym.a($$0);
               float $$2 = aym.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? aym.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? aym.j((double)$$2) : 0;
               if (this.a.dU().a_(this.a.du().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gN() && this.a.al.a(b(60)) == 1 ? true : this.a.al.a(b(500)) == 1;
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
      public boolean R_() {
         return false;
      }
   }

   class k extends bzl {
      private int b;

      public k() {
         this.a(EnumSet.of(bzl.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= cet.this.am && !cet.this.o_() && !cet.this.bi() && cet.this.gS() && cet.this.r() <= 0) {
            List<cig> $$0 = cet.this.dU().a(cig.class, cet.this.cP().c(6.0, 6.0, 6.0), cet.cI);
            return !$$0.isEmpty() || !cet.this.d(bsc.a).d();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !cet.this.bi() && (cet.this.gL() || cet.this.al.a(b(600)) != 1) ? cet.this.al.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!cet.this.x() && !cet.this.d(bsc.a).d()) {
            cet.this.hc();
         }
      }

      @Override
      public void c() {
         List<cig> $$0 = cet.this.dU().a(cig.class, cet.this.cP().c(8.0, 8.0, 8.0), cet.cI);
         if (!$$0.isEmpty() && cet.this.d(bsc.a).d()) {
            cet.this.J().a($$0.get(0), 1.2F);
         } else if (!cet.this.d(bsc.a).d()) {
            cet.this.hc();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cuh $$0 = cet.this.d(bsc.a);
         if (!$$0.d()) {
            cet.this.b($$0);
            cet.this.a(bsc.a, cuh.i);
            int $$1 = cet.this.gL() ? cet.this.al.a(50) + 10 : cet.this.al.a(150) + 10;
            this.b = cet.this.am + $$1 * 20;
         }

         cet.this.w(false);
      }
   }

   static class l extends bzl {
      private final cet a;

      public l(cet $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.o_() && this.a.gS()) {
            return this.a.gP() && this.a.al.a(b(500)) == 1 ? true : this.a.al.a(b(6000)) == 1;
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
