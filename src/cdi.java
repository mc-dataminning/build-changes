import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdi extends cct {
   private static final ajk<Integer> cb = ajo.a(cdi.class, ajm.b);
   private static final ajk<Integer> cc = ajo.a(cdi.class, ajm.b);
   private static final ajk<Integer> cd = ajo.a(cdi.class, ajm.b);
   private static final ajk<Byte> ce = ajo.a(cdi.class, ajm.a);
   private static final ajk<Byte> cf = ajo.a(cdi.class, ajm.a);
   private static final ajk<Byte> cg = ajo.a(cdi.class, ajm.a);
   static final cbu ch = cbu.b().a(8.0);
   private static final bqo ci = bqr.av.n().a(0.5F).a(bqn.a().a(bqm.a, 0.0F, 0.40625F, 0.0F));
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
   private etf cr;
   private float cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   cdi.g cy;
   static final Predicate<cgv> cA = $$0 -> {
      csd $$1 = $$0.p();
      return ($$1.a(dcx.mZ.p()) || $$1.a(dcx.eg.p())) && $$0.bB() && !$$0.y();
   };

   public cdi(bqr<? extends cdi> $$0, czu $$1) {
      super($$0, $$1);
      this.bP = new cdi.h(this);
      if (!this.p_()) {
         this.a_(true);
      }
   }

   @Override
   public boolean f(csd $$0) {
      bqs $$1 = brg.h($$0);
      return !this.d($$1).d() ? false : $$1 == bqs.a && super.f($$0);
   }

   public int r() {
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

   public cdi.a gx() {
      return cdi.a.a(this.ao.a(ce));
   }

   public void a(cdi.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cdi.a.a(this.ah);
      }

      this.ao.a(ce, (byte)$$0.a());
   }

   public cdi.a gy() {
      return cdi.a.a(this.ao.a(cf));
   }

   public void b(cdi.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cdi.a.a(this.ah);
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
   protected void a(ajo.a $$0) {
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
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gx().c());
      $$0.a("HiddenGene", this.gy().c());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.a(cdi.a.a($$0.l("MainGene")));
      this.b(cdi.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bqf a(aqe $$0, bqf $$1) {
      cdi $$2 = bqr.av.a((czu)$$0);
      if ($$2 != null) {
         if ($$1 instanceof cdi $$3) {
            $$2.a(this, $$3);
         }

         $$2.gI();
      }

      return $$2;
   }

   @Override
   protected void z() {
      this.bS.a(0, new bxv(this));
      this.bS.a(2, new cdi.i(this, 2.0));
      this.bS.a(2, new cdi.d(this, 1.0));
      this.bS.a(3, new cdi.b(this, 1.2F, true));
      this.bS.a(4, new bzj(this, 1.0, cwd.a(dcx.mZ.p()), false));
      this.bS.a(6, new cdi.c<>(this, ckl.class, 8.0F, 2.0, 2.0));
      this.bS.a(6, new cdi.c<>(this, chr.class, 4.0F, 2.0, 2.0));
      this.bS.a(7, new cdi.k());
      this.bS.a(8, new cdi.f(this));
      this.bS.a(8, new cdi.l(this));
      this.cy = new cdi.g(this, ckl.class, 6.0F);
      this.bS.a(9, this.cy);
      this.bS.a(10, new byw(this));
      this.bS.a(12, new cdi.j(this));
      this.bS.a(13, new bya(this, 1.25));
      this.bS.a(14, new bzo(this, 1.0));
      this.bT.a(1, new cdi.e(this).a(new Class[0]));
   }

   public static bsk.a gA() {
      return brg.A().a(bsl.r, 0.15F).a(bsl.c, 6.0);
   }

   public cdi.a gB() {
      return cdi.a.a(this.gx(), this.gy());
   }

   public boolean gC() {
      return this.gB() == cdi.a.b;
   }

   public boolean gD() {
      return this.gB() == cdi.a.c;
   }

   public boolean gE() {
      return this.gB() == cdi.a.d;
   }

   public boolean gF() {
      return this.gB() == cdi.a.e;
   }

   public boolean gG() {
      return this.gB() == cdi.a.f;
   }

   @Override
   public boolean gh() {
      return this.gB() == cdi.a.g;
   }

   @Override
   public boolean a(ckl $$0) {
      return false;
   }

   @Override
   public boolean C(bql $$0) {
      this.a(auz.sp, 1.0F, 1.0F);
      if (!this.gh()) {
         this.cq = true;
      }

      return super.C($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.gD()) {
         if (this.dN().ab() && !this.bc()) {
            this.w(true);
            this.y(false);
         } else if (!this.gv()) {
            this.w(false);
         }
      }

      bre $$0 = this.p();
      if ($$0 == null) {
         this.cp = false;
         this.cq = false;
      }

      if (this.r() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.r() == 29 || this.r() == 14) {
            this.a(auz.sl, 1.0F, 1.0F);
         }

         this.u(this.r() - 1);
      }

      if (this.u()) {
         this.v(this.gw() + 1);
         if (this.gw() > 20) {
            this.z(false);
            this.gR();
         } else if (this.gw() == 1) {
            this.a(auz.sf, 1.0F, 1.0F);
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
      return this.gD() && this.dN().ab();
   }

   private void gL() {
      if (!this.gv() && this.y() && !this.gH() && !this.d(bqs.a).d() && this.ah.a(80) == 1) {
         this.y(true);
      } else if (this.d(bqs.a).d() || !this.y()) {
         this.y(false);
      }

      if (this.gv()) {
         this.gM();
         if (!this.dN().B && this.gK() > 80 && this.ah.a(20) == 1) {
            if (this.gK() > 100 && this.n(this.d(bqs.a))) {
               if (!this.dN().B) {
                  this.a(bqs.a, csd.i);
                  this.a(dur.m);
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
         this.a(auz.sj, 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            etf $$1 = new etf(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ah.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dF() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dD() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ah.i()) * 0.6 - 0.3;
            etf $$3 = new etf(((double)this.ah.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ah.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aZ * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.ds(), this.dw() + 1.0, this.dy());
            this.dN().a(new ks(kw.Q, this.d(bqs.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
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
      return axw.i($$0, this.ct, this.cs);
   }

   public float H(float $$0) {
      return axw.i($$0, this.cv, this.cu);
   }

   public float I(float $$0) {
      return axw.i($$0, this.cx, this.cw);
   }

   private void gQ() {
      this.bZ++;
      if (this.bZ > 32) {
         this.A(false);
      } else {
         if (!this.dN().B) {
            etf $$0 = this.dq();
            if (this.bZ == 1) {
               float $$1 = this.dD() * (float) (Math.PI / 180.0);
               float $$2 = this.p_() ? 0.1F : 0.2F;
               this.cr = new etf($$0.c + (double)(-axw.a($$1) * $$2), 0.0, $$0.e + (double)(axw.b($$1) * $$2));
               this.g(this.cr.b(0.0, 0.27, 0.0));
            } else if ((float)this.bZ != 7.0F && (float)this.bZ != 15.0F && (float)this.bZ != 23.0F) {
               this.o(this.cr.c, $$0.d, this.cr.e);
            } else {
               this.o(0.0, this.aC() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gR() {
      etf $$0 = this.dq();
      czu $$1 = this.dN();
      $$1.a(
         kw.ad,
         this.ds() - (double)(this.dh() + 1.0F) * 0.5 * (double)axw.a(this.aZ * (float) (Math.PI / 180.0)),
         this.dw() - 0.1F,
         this.dy() + (double)(this.dh() + 1.0F) * 0.5 * (double)axw.b(this.aZ * (float) (Math.PI / 180.0)),
         $$0.c,
         0.0,
         $$0.e
      );
      this.a(auz.sg, 1.0F, 1.0F);

      for (cdi $$3 : $$1.a(cdi.class, this.cI().g(10.0))) {
         if (!$$3.p_() && $$3.aC() && !$$3.bc() && $$3.gJ()) {
            $$3.fh();
         }
      }

      if (!$$1.x_() && $$1.aa().b(czq.f)) {
         aqe $$4 = (aqe)$$1;
         eoi $$5 = $$4.o().aM().getLootTable(eny.aO);
         eog $$6 = new eog.a($$4).a(eqt.f, this.dl()).a(eqt.a, this).a(eqs.i);

         for (csd $$8 : $$5.a($$6)) {
            this.b($$8);
         }
      }
   }

   @Override
   protected void b(cgv $$0) {
      if (this.d(bqs.a).d() && cA.test($$0)) {
         this.a($$0);
         csd $$1 = $$0.p();
         this.a(bqs.a, $$1);
         this.f(bqs.a);
         this.a($$0, $$1.G());
         $$0.am();
      }
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (!this.dN().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      ayd $$4 = $$0.E_();
      this.a(cdi.a.a($$4));
      this.b(cdi.a.a($$4));
      this.gI();
      if ($$3 == null) {
         $$3 = new bqf.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cdi $$0, @Nullable cdi $$1) {
      if ($$1 == null) {
         if (this.ah.h()) {
            this.a($$0.gS());
            this.b(cdi.a.a(this.ah));
         } else {
            this.a(cdi.a.a(this.ah));
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
         this.a(cdi.a.a(this.ah));
      }

      if (this.ah.a(32) == 0) {
         this.b(cdi.a.a(this.ah));
      }
   }

   private cdi.a gS() {
      return this.ah.h() ? this.gx() : this.gy();
   }

   public void gI() {
      if (this.gG()) {
         this.f(bsl.q).a(10.0);
      }

      if (this.gC()) {
         this.f(bsl.r).a(0.07F);
      }
   }

   void gT() {
      if (!this.bc()) {
         this.C(0.0F);
         this.K().n();
         this.w(true);
      }
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if (this.gH()) {
         return boq.d;
      } else if (this.gp()) {
         this.x(false);
         return boq.a(this.dN().B);
      } else if (this.o($$2)) {
         if (this.p() != null) {
            this.cp = true;
         }

         if (this.p_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dN().B && this.g() == 0 && this.gq()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dN().B || this.y() || this.bc()) {
               return boq.d;
            }

            this.gT();
            this.y(true);
            csd $$3 = this.d(bqs.a);
            if (!$$3.d() && !$$0.fN()) {
               this.b($$3);
            }

            this.a(bqs.a, new csd($$2.f(), 1));
            this.a($$0, $$1, $$2);
         }

         return boq.a;
      } else {
         return boq.d;
      }
   }

   @Nullable
   @Override
   protected auy v() {
      if (this.gh()) {
         return auz.sm;
      } else {
         return this.gD() ? auz.sn : auz.sh;
      }
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.sk, 0.15F, 1.0F);
   }

   @Override
   public boolean o(csd $$0) {
      return $$0.a(dcx.mZ.p());
   }

   private boolean n(csd $$0) {
      return this.o($$0) || $$0.a(dcx.eg.p());
   }

   @Nullable
   @Override
   protected auy o_() {
      return auz.si;
   }

   @Nullable
   @Override
   protected auy d(bpj $$0) {
      return auz.so;
   }

   public boolean gJ() {
      return !this.gp() && !this.gH() && !this.gv() && !this.gz() && !this.y();
   }

   @Override
   public bqo e(brp $$0) {
      return this.p_() ? ci : super.e($$0);
   }

   public static enum a implements ayq {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final ayq.a<cdi.a> h = ayq.a(cdi.a::values);
      private static final IntFunction<cdi.a> i = awn.a(cdi.a::a, values(), awn.a.a);
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

      static cdi.a a(cdi.a $$0, cdi.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cdi.a a(int $$0) {
         return i.apply($$0);
      }

      public static cdi.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cdi.a a(ayd $$0) {
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

   static class b extends byl {
      private final cdi b;

      public b(cdi $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gJ() && super.a();
      }
   }

   static class c<T extends bre> extends bxi<T> {
      private final cdi i;

      public c(cdi $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bqq.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gD() && this.i.gJ() && super.a();
      }
   }

   static class d extends bxn {
      private final cdi d;
      private int e;

      public d(cdi $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         if (!super.a() || this.d.r() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.ai) {
               this.d.u(32);
               this.e = this.d.ai + 600;
               if (this.d.cZ()) {
                  ckl $$0 = this.b.a(cdi.ch, this.d);
                  this.d.cy.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         im $$0 = this.d.dn();
         im.a $$1 = new im.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dcx.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends bzt {
      private final cdi a;

      public e(cdi $$0, Class<?>... $$1) {
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
      protected void a(brg $$0, bre $$1) {
         if ($$0 instanceof cdi && $$0.gh()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends byb {
      private final cdi a;
      private int b;

      public f(cdi $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ai && this.a.gC() && this.a.gJ() && this.a.ah.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.bc() && (this.a.gC() || this.a.ah.a(b(600)) != 1) ? this.a.ah.a(b(2000)) != 1 : false;
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

   static class g extends byj {
      private final cdi h;

      public g(cdi $$0, Class<? extends bre> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bre $$0) {
         this.c = $$0;
      }

      @Override
      public boolean b() {
         return this.c != null && super.b();
      }

      @Override
      public boolean a() {
         if (this.b.ej().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == ckl.class) {
                  this.c = this.b.dN().a(this.g, this.b, this.b.ds(), this.b.dw(), this.b.dy());
               } else {
                  this.c = this.b
                     .dN()
                     .a(
                        this.b.dN().a(this.f, this.b.cI().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.ds(),
                        this.b.dw(),
                        this.b.dy()
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

   static class h extends bxe {
      private final cdi l;

      public h(cdi $$0) {
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

   static class i extends byu {
      private final cdi h;

      public i(cdi $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dC() || this.b.bO();
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

   static class j extends byb {
      private final cdi a;

      public j(cdi $$0) {
         this.a = $$0;
         this.a(EnumSet.of(byb.a.a, byb.a.b, byb.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.p_() || this.a.gE()) && this.a.aC()) {
            if (!this.a.gJ()) {
               return false;
            } else {
               float $$0 = this.a.dD() * (float) (Math.PI / 180.0);
               float $$1 = -axw.a($$0);
               float $$2 = axw.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? axw.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? axw.j((double)$$2) : 0;
               if (this.a.dN().a_(this.a.dn().b($$3, -1, $$4)).i()) {
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

   class k extends byb {
      private int b;

      public k() {
         this.a(EnumSet.of(byb.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= cdi.this.ai && !cdi.this.p_() && !cdi.this.bc() && cdi.this.gJ() && cdi.this.r() <= 0) {
            List<cgv> $$0 = cdi.this.dN().a(cgv.class, cdi.this.cI().c(6.0, 6.0, 6.0), cdi.cA);
            return !$$0.isEmpty() || !cdi.this.d(bqs.a).d();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !cdi.this.bc() && (cdi.this.gC() || cdi.this.ah.a(b(600)) != 1) ? cdi.this.ah.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!cdi.this.y() && !cdi.this.d(bqs.a).d()) {
            cdi.this.gT();
         }
      }

      @Override
      public void c() {
         List<cgv> $$0 = cdi.this.dN().a(cgv.class, cdi.this.cI().c(8.0, 8.0, 8.0), cdi.cA);
         if (!$$0.isEmpty() && cdi.this.d(bqs.a).d()) {
            cdi.this.K().a($$0.get(0), 1.2F);
         } else if (!cdi.this.d(bqs.a).d()) {
            cdi.this.gT();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         csd $$0 = cdi.this.d(bqs.a);
         if (!$$0.d()) {
            cdi.this.b($$0);
            cdi.this.a(bqs.a, csd.i);
            int $$1 = cdi.this.gC() ? cdi.this.ah.a(50) + 10 : cdi.this.ah.a(150) + 10;
            this.b = cdi.this.ai + $$1 * 20;
         }

         cdi.this.w(false);
      }
   }

   static class l extends byb {
      private final cdi a;

      public l(cdi $$0) {
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
