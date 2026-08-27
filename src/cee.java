import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cee extends cdp {
   private static final ajm<Integer> cb = ajq.a(cee.class, ajo.b);
   private static final ajm<Integer> cc = ajq.a(cee.class, ajo.b);
   private static final ajm<Integer> cd = ajq.a(cee.class, ajo.b);
   private static final ajm<Byte> ce = ajq.a(cee.class, ajo.a);
   private static final ajm<Byte> cf = ajq.a(cee.class, ajo.a);
   private static final ajm<Byte> cg = ajq.a(cee.class, ajo.a);
   static final ccq ch = ccq.b().a(8.0);
   private static final brk ci = brn.av.n().a(0.5F).a(brj.a().a(bri.a, 0.0F, 0.40625F, 0.0F));
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
   private etp cr;
   private float cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   cee.g cy;
   static final Predicate<chr> cA = $$0 -> {
      csz $$1 = $$0.p();
      return ($$1.a(ddg.mZ.q()) || $$1.a(ddg.eg.q())) && $$0.bB() && !$$0.y();
   };

   public cee(brn<? extends cee> $$0, dad $$1) {
      super($$0, $$1);
      this.bP = new cee.h(this);
      if (!this.p_()) {
         this.a_(true);
      }
   }

   @Override
   public boolean f(csz $$0) {
      bro $$1 = bsc.h($$0);
      return !this.d($$1).d() ? false : $$1 == bro.a && super.f($$0);
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

   public cee.a gx() {
      return cee.a.a(this.ao.a(ce));
   }

   public void a(cee.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cee.a.a(this.ah);
      }

      this.ao.a(ce, (byte)$$0.a());
   }

   public cee.a gy() {
      return cee.a.a(this.ao.a(cf));
   }

   public void b(cee.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cee.a.a(this.ah);
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
   protected void a(ajq.a $$0) {
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
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gx().c());
      $$0.a("HiddenGene", this.gy().c());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(cee.a.a($$0.l("MainGene")));
      this.b(cee.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public brb a(aqh $$0, brb $$1) {
      cee $$2 = brn.av.a((dad)$$0);
      if ($$2 != null) {
         if ($$1 instanceof cee $$3) {
            $$2.a(this, $$3);
         }

         $$2.gI();
      }

      return $$2;
   }

   @Override
   protected void z() {
      this.bS.a(0, new byr(this));
      this.bS.a(2, new cee.i(this, 2.0));
      this.bS.a(2, new cee.d(this, 1.0));
      this.bS.a(3, new cee.b(this, 1.2F, true));
      this.bS.a(4, new caf(this, 1.0, $$0 -> $$0.a(avz.aq), false));
      this.bS.a(6, new cee.c<>(this, clh.class, 8.0F, 2.0, 2.0));
      this.bS.a(6, new cee.c<>(this, cin.class, 4.0F, 2.0, 2.0));
      this.bS.a(7, new cee.k());
      this.bS.a(8, new cee.f(this));
      this.bS.a(8, new cee.l(this));
      this.cy = new cee.g(this, clh.class, 6.0F);
      this.bS.a(9, this.cy);
      this.bS.a(10, new bzs(this));
      this.bS.a(12, new cee.j(this));
      this.bS.a(13, new byw(this, 1.25));
      this.bS.a(14, new cak(this, 1.0));
      this.bT.a(1, new cee.e(this).a(new Class[0]));
   }

   public static btg.a gA() {
      return bsc.A().a(bth.r, 0.15F).a(bth.c, 6.0);
   }

   public cee.a gB() {
      return cee.a.a(this.gx(), this.gy());
   }

   public boolean gC() {
      return this.gB() == cee.a.b;
   }

   public boolean gD() {
      return this.gB() == cee.a.c;
   }

   public boolean gE() {
      return this.gB() == cee.a.d;
   }

   public boolean gF() {
      return this.gB() == cee.a.e;
   }

   public boolean gG() {
      return this.gB() == cee.a.f;
   }

   @Override
   public boolean gh() {
      return this.gB() == cee.a.g;
   }

   @Override
   public boolean a(clh $$0) {
      return false;
   }

   @Override
   public boolean C(brh $$0) {
      this.a(avc.sq, 1.0F, 1.0F);
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

      bsa $$0 = this.p();
      if ($$0 == null) {
         this.cp = false;
         this.cq = false;
      }

      if (this.r() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.r() == 29 || this.r() == 14) {
            this.a(avc.sm, 1.0F, 1.0F);
         }

         this.u(this.r() - 1);
      }

      if (this.u()) {
         this.v(this.gw() + 1);
         if (this.gw() > 20) {
            this.z(false);
            this.gR();
         } else if (this.gw() == 1) {
            this.a(avc.sg, 1.0F, 1.0F);
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
      if (!this.gv() && this.y() && !this.gH() && !this.d(bro.a).d() && this.ah.a(80) == 1) {
         this.y(true);
      } else if (this.d(bro.a).d() || !this.y()) {
         this.y(false);
      }

      if (this.gv()) {
         this.gM();
         if (!this.dN().B && this.gK() > 80 && this.ah.a(20) == 1) {
            if (this.gK() > 100 && this.n(this.d(bro.a))) {
               if (!this.dN().B) {
                  this.a(bro.a, csz.i);
                  this.a(dva.m);
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
         this.a(avc.sk, 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            etp $$1 = new etp(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ah.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dF() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dD() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ah.i()) * 0.6 - 0.3;
            etp $$3 = new etp(((double)this.ah.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ah.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aZ * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.ds(), this.dw() + 1.0, this.dy());
            this.dN().a(new kt(kx.Q, this.d(bro.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
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
      return axz.i($$0, this.ct, this.cs);
   }

   public float H(float $$0) {
      return axz.i($$0, this.cv, this.cu);
   }

   public float I(float $$0) {
      return axz.i($$0, this.cx, this.cw);
   }

   private void gQ() {
      this.bZ++;
      if (this.bZ > 32) {
         this.A(false);
      } else {
         if (!this.dN().B) {
            etp $$0 = this.dq();
            if (this.bZ == 1) {
               float $$1 = this.dD() * (float) (Math.PI / 180.0);
               float $$2 = this.p_() ? 0.1F : 0.2F;
               this.cr = new etp($$0.c + (double)(-axz.a($$1) * $$2), 0.0, $$0.e + (double)(axz.b($$1) * $$2));
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
      etp $$0 = this.dq();
      dad $$1 = this.dN();
      $$1.a(
         kx.ad,
         this.ds() - (double)(this.dh() + 1.0F) * 0.5 * (double)axz.a(this.aZ * (float) (Math.PI / 180.0)),
         this.dw() - 0.1F,
         this.dy() + (double)(this.dh() + 1.0F) * 0.5 * (double)axz.b(this.aZ * (float) (Math.PI / 180.0)),
         $$0.c,
         0.0,
         $$0.e
      );
      this.a(avc.sh, 1.0F, 1.0F);

      for (cee $$3 : $$1.a(cee.class, this.cI().g(10.0))) {
         if (!$$3.p_() && $$3.aC() && !$$3.bc() && $$3.gJ()) {
            $$3.fh();
         }
      }

      if (!$$1.x_() && $$1.aa().b(czz.f)) {
         aqh $$4 = (aqh)$$1;
         eoq $$5 = $$4.o().be().b(eoj.aO);
         eoo $$6 = new eoo.a($$4).a(erc.f, this.dl()).a(erc.a, this).a(erb.i);

         for (csz $$8 : $$5.a($$6)) {
            this.b($$8);
         }
      }
   }

   @Override
   protected void b(chr $$0) {
      if (this.d(bro.a).d() && cA.test($$0)) {
         this.a($$0);
         csz $$1 = $$0.p();
         this.a(bro.a, $$1);
         this.f(bro.a);
         this.a($$0, $$1.G());
         $$0.am();
      }
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if (!this.dN().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      ayg $$4 = $$0.E_();
      this.a(cee.a.a($$4));
      this.b(cee.a.a($$4));
      this.gI();
      if ($$3 == null) {
         $$3 = new brb.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cee $$0, @Nullable cee $$1) {
      if ($$1 == null) {
         if (this.ah.h()) {
            this.a($$0.gS());
            this.b(cee.a.a(this.ah));
         } else {
            this.a(cee.a.a(this.ah));
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
         this.a(cee.a.a(this.ah));
      }

      if (this.ah.a(32) == 0) {
         this.b(cee.a.a(this.ah));
      }
   }

   private cee.a gS() {
      return this.ah.h() ? this.gx() : this.gy();
   }

   public void gI() {
      if (this.gG()) {
         this.f(bth.q).a(10.0);
      }

      if (this.gC()) {
         this.f(bth.r).a(0.07F);
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
   public bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if (this.gH()) {
         return bpm.d;
      } else if (this.gp()) {
         this.x(false);
         return bpm.a(this.dN().B);
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
               return bpm.d;
            }

            this.gT();
            this.y(true);
            csz $$3 = this.d(bro.a);
            if (!$$3.d() && !$$0.fN()) {
               this.b($$3);
            }

            this.a(bro.a, new csz($$2.f(), 1));
            this.a($$0, $$1, $$2);
         }

         return bpm.a;
      } else {
         return bpm.d;
      }
   }

   @Nullable
   @Override
   protected avb v() {
      if (this.gh()) {
         return avc.sn;
      } else {
         return this.gD() ? avc.so : avc.si;
      }
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.sl, 0.15F, 1.0F);
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.aq);
   }

   private boolean n(csz $$0) {
      return this.o($$0) || $$0.a(ddg.eg.q());
   }

   @Nullable
   @Override
   protected avb o_() {
      return avc.sj;
   }

   @Nullable
   @Override
   protected avb d(bqf $$0) {
      return avc.sp;
   }

   public boolean gJ() {
      return !this.gp() && !this.gH() && !this.gv() && !this.gz() && !this.y();
   }

   @Override
   public brk e(bsl $$0) {
      return this.p_() ? ci : super.e($$0);
   }

   public static enum a implements ayt {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final ayt.a<cee.a> h = ayt.a(cee.a::values);
      private static final IntFunction<cee.a> i = awq.a(cee.a::a, values(), awq.a.a);
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

      static cee.a a(cee.a $$0, cee.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cee.a a(int $$0) {
         return i.apply($$0);
      }

      public static cee.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cee.a a(ayg $$0) {
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

   static class b extends bzh {
      private final cee b;

      public b(cee $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gJ() && super.a();
      }
   }

   static class c<T extends bsa> extends bye<T> {
      private final cee i;

      public c(cee $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, brm.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gD() && this.i.gJ() && super.a();
      }
   }

   static class d extends byj {
      private final cee d;
      private int e;

      public d(cee $$0, double $$1) {
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
                  clh $$0 = this.b.a(cee.ch, this.d);
                  this.d.cy.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         in $$0 = this.d.dn();
         in.a $$1 = new in.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(ddg.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends cap {
      private final cee a;

      public e(cee $$0, Class<?>... $$1) {
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
      protected void a(bsc $$0, bsa $$1) {
         if ($$0 instanceof cee && $$0.gh()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends byx {
      private final cee a;
      private int b;

      public f(cee $$0) {
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

   static class g extends bzf {
      private final cee h;

      public g(cee $$0, Class<? extends bsa> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bsa $$0) {
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
               if (this.f == clh.class) {
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

   static class h extends bya {
      private final cee l;

      public h(cee $$0) {
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

   static class i extends bzq {
      private final cee h;

      public i(cee $$0, double $$1) {
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

   static class j extends byx {
      private final cee a;

      public j(cee $$0) {
         this.a = $$0;
         this.a(EnumSet.of(byx.a.a, byx.a.b, byx.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.p_() || this.a.gE()) && this.a.aC()) {
            if (!this.a.gJ()) {
               return false;
            } else {
               float $$0 = this.a.dD() * (float) (Math.PI / 180.0);
               float $$1 = -axz.a($$0);
               float $$2 = axz.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? axz.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? axz.j((double)$$2) : 0;
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

   class k extends byx {
      private int b;

      public k() {
         this.a(EnumSet.of(byx.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= cee.this.ai && !cee.this.p_() && !cee.this.bc() && cee.this.gJ() && cee.this.r() <= 0) {
            List<chr> $$0 = cee.this.dN().a(chr.class, cee.this.cI().c(6.0, 6.0, 6.0), cee.cA);
            return !$$0.isEmpty() || !cee.this.d(bro.a).d();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !cee.this.bc() && (cee.this.gC() || cee.this.ah.a(b(600)) != 1) ? cee.this.ah.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!cee.this.y() && !cee.this.d(bro.a).d()) {
            cee.this.gT();
         }
      }

      @Override
      public void c() {
         List<chr> $$0 = cee.this.dN().a(chr.class, cee.this.cI().c(8.0, 8.0, 8.0), cee.cA);
         if (!$$0.isEmpty() && cee.this.d(bro.a).d()) {
            cee.this.K().a($$0.get(0), 1.2F);
         } else if (!cee.this.d(bro.a).d()) {
            cee.this.gT();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         csz $$0 = cee.this.d(bro.a);
         if (!$$0.d()) {
            cee.this.b($$0);
            cee.this.a(bro.a, csz.i);
            int $$1 = cee.this.gC() ? cee.this.ah.a(50) + 10 : cee.this.ah.a(150) + 10;
            this.b = cee.this.ai + $$1 * 20;
         }

         cee.this.w(false);
      }
   }

   static class l extends byx {
      private final cee a;

      public l(cee $$0) {
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
