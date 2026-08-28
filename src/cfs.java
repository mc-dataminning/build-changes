import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfs extends cfd {
   private static final akj<Integer> cb = akn.a(cfs.class, akl.b);
   private static final akj<Integer> cc = akn.a(cfs.class, akl.b);
   private static final akj<Integer> cd = akn.a(cfs.class, akl.b);
   private static final akj<Byte> ce = akn.a(cfs.class, akl.a);
   private static final akj<Byte> cf = akn.a(cfs.class, akl.a);
   private static final akj<Byte> cg = akn.a(cfs.class, akl.a);
   static final cee ch = cee.b().a(8.0);
   private static final bsv ci = bsy.aw.n().a(0.5F).a(bsu.a().a(bst.a, 0.0F, 0.40625F, 0.0F));
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
   private evp cr;
   private float cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   cfs.g cz;
   static final Predicate<cjf> cA = $$0 -> {
      cun $$1 = $$0.p();
      return ($$1.a(dez.mZ.r()) || $$1.a(dez.eg.r())) && $$0.bD() && !$$0.y();
   };

   public cfs(bsy<? extends cfs> $$0, dbw $$1) {
      super($$0, $$1);
      this.bP = new cfs.h(this);
      if (!this.p_()) {
         this.a_(true);
      }
   }

   @Override
   public boolean f(cun $$0) {
      bsz $$1 = btp.h($$0);
      return !this.a($$1).e() ? false : $$1 == bsz.a && super.f($$0);
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

   public boolean gq() {
      return this.x(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gw() {
      return this.ao.a(cd) > 0;
   }

   public void y(boolean $$0) {
      this.ao.a(cd, $$0 ? 1 : 0);
   }

   private int gL() {
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

   public int gx() {
      return this.ao.a(cc);
   }

   public void v(int $$0) {
      this.ao.a(cc, $$0);
   }

   public cfs.a gy() {
      return cfs.a.a(this.ao.a(ce));
   }

   public void a(cfs.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cfs.a.a(this.ah);
      }

      this.ao.a(ce, (byte)$$0.a());
   }

   public cfs.a gz() {
      return cfs.a.a(this.ao.a(cf));
   }

   public void b(cfs.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cfs.a.a(this.ah);
      }

      this.ao.a(cf, (byte)$$0.a());
   }

   public boolean gA() {
      return this.x(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a(akn.a $$0) {
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
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gy().c());
      $$0.a("HiddenGene", this.gz().c());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a(cfs.a.a($$0.l("MainGene")));
      this.b(cfs.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bsm a(are $$0, bsm $$1) {
      cfs $$2 = bsy.aw.a((dbw)$$0);
      if ($$2 != null) {
         if ($$1 instanceof cfs $$3) {
            $$2.a(this, $$3);
         }

         $$2.gJ();
      }

      return $$2;
   }

   @Override
   protected void z() {
      this.bS.a(0, new caf(this));
      this.bS.a(2, new cfs.i(this, 2.0));
      this.bS.a(2, new cfs.d(this, 1.0));
      this.bS.a(3, new cfs.b(this, 1.2F, true));
      this.bS.a(4, new cbt(this, 1.0, $$0 -> $$0.a(awx.aq), false));
      this.bS.a(6, new cfs.c<>(this, cmv.class, 8.0F, 2.0, 2.0));
      this.bS.a(6, new cfs.c<>(this, ckb.class, 4.0F, 2.0, 2.0));
      this.bS.a(7, new cfs.k());
      this.bS.a(8, new cfs.f(this));
      this.bS.a(8, new cfs.l(this));
      this.cz = new cfs.g(this, cmv.class, 6.0F);
      this.bS.a(9, this.cz);
      this.bS.a(10, new cbg(this));
      this.bS.a(12, new cfs.j(this));
      this.bS.a(13, new cak(this, 1.25));
      this.bS.a(14, new cby(this, 1.0));
      this.bT.a(1, new cfs.e(this).a(new Class[0]));
   }

   public static buu.a gB() {
      return btp.A().a(buv.r, 0.15F).a(buv.c, 6.0);
   }

   public cfs.a gC() {
      return cfs.a.a(this.gy(), this.gz());
   }

   public boolean gD() {
      return this.gC() == cfs.a.b;
   }

   public boolean gE() {
      return this.gC() == cfs.a.c;
   }

   public boolean gF() {
      return this.gC() == cfs.a.d;
   }

   public boolean gG() {
      return this.gC() == cfs.a.e;
   }

   public boolean gH() {
      return this.gC() == cfs.a.f;
   }

   @Override
   public boolean gi() {
      return this.gC() == cfs.a.g;
   }

   @Override
   public boolean a(cmv $$0) {
      return false;
   }

   @Override
   public boolean C(bss $$0) {
      this.a(avz.sB, 1.0F, 1.0F);
      if (!this.gi()) {
         this.cq = true;
      }

      return super.C($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.gE()) {
         if (this.dP().ac() && !this.be()) {
            this.w(true);
            this.y(false);
         } else if (!this.gw()) {
            this.w(false);
         }
      }

      btn $$0 = this.p();
      if ($$0 == null) {
         this.cp = false;
         this.cq = false;
      }

      if (this.s() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.s() == 29 || this.s() == 14) {
            this.a(avz.sx, 1.0F, 1.0F);
         }

         this.u(this.s() - 1);
      }

      if (this.u()) {
         this.v(this.gx() + 1);
         if (this.gx() > 20) {
            this.z(false);
            this.gS();
         } else if (this.gx() == 1) {
            this.a(avz.sr, 1.0F, 1.0F);
         }
      }

      if (this.gA()) {
         this.gR();
      } else {
         this.bZ = 0;
      }

      if (this.y()) {
         this.s(0.0F);
      }

      this.gO();
      this.gM();
      this.gP();
      this.gQ();
   }

   public boolean gI() {
      return this.gE() && this.dP().ac();
   }

   private void gM() {
      if (!this.gw() && this.y() && !this.gI() && !this.a(bsz.a).e() && this.ah.a(80) == 1) {
         this.y(true);
      } else if (this.a(bsz.a).e() || !this.y()) {
         this.y(false);
      }

      if (this.gw()) {
         this.gN();
         if (!this.dP().B && this.gL() > 80 && this.ah.a(20) == 1) {
            if (this.gL() > 100 && this.n(this.a(bsz.a))) {
               if (!this.dP().B) {
                  this.a(bsz.a, cun.l);
                  this.a(dwt.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.w(this.gL() + 1);
      }
   }

   private void gN() {
      if (this.gL() % 5 == 0) {
         this.a(avz.sv, 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            evp $$1 = new evp(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ah.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dH() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dF() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ah.i()) * 0.6 - 0.3;
            evp $$3 = new evp(((double)this.ah.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ah.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aY * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.du(), this.dy() + 1.0, this.dA());
            this.dP().a(new le(li.S, this.a(bsz.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gO() {
      this.ct = this.cs;
      if (this.y()) {
         this.cs = Math.min(1.0F, this.cs + 0.15F);
      } else {
         this.cs = Math.max(0.0F, this.cs - 0.19F);
      }
   }

   private void gP() {
      this.cv = this.cu;
      if (this.gq()) {
         this.cu = Math.min(1.0F, this.cu + 0.15F);
      } else {
         this.cu = Math.max(0.0F, this.cu - 0.19F);
      }
   }

   private void gQ() {
      this.cx = this.cw;
      if (this.gA()) {
         this.cw = Math.min(1.0F, this.cw + 0.15F);
      } else {
         this.cw = Math.max(0.0F, this.cw - 0.19F);
      }
   }

   public float G(float $$0) {
      return ayx.i($$0, this.ct, this.cs);
   }

   public float H(float $$0) {
      return ayx.i($$0, this.cv, this.cu);
   }

   public float I(float $$0) {
      return ayx.i($$0, this.cx, this.cw);
   }

   private void gR() {
      this.bZ++;
      if (this.bZ > 32) {
         this.A(false);
      } else {
         if (!this.dP().B) {
            evp $$0 = this.ds();
            if (this.bZ == 1) {
               float $$1 = this.dF() * (float) (Math.PI / 180.0);
               float $$2 = this.p_() ? 0.1F : 0.2F;
               this.cr = new evp($$0.c + (double)(-ayx.a($$1) * $$2), 0.0, $$0.e + (double)(ayx.b($$1) * $$2));
               this.h(this.cr.b(0.0, 0.27, 0.0));
            } else if ((float)this.bZ != 7.0F && (float)this.bZ != 15.0F && (float)this.bZ != 23.0F) {
               this.o(this.cr.c, $$0.d, this.cr.e);
            } else {
               this.o(0.0, this.aE() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gS() {
      evp $$0 = this.ds();
      dbw $$1 = this.dP();
      $$1.a(
         li.ag,
         this.du() - (double)(this.dj() + 1.0F) * 0.5 * (double)ayx.a(this.aY * (float) (Math.PI / 180.0)),
         this.dy() - 0.1F,
         this.dA() + (double)(this.dj() + 1.0F) * 0.5 * (double)ayx.b(this.aY * (float) (Math.PI / 180.0)),
         $$0.c,
         0.0,
         $$0.e
      );
      this.a(avz.ss, 1.0F, 1.0F);

      for (cfs $$3 : $$1.a(cfs.class, this.cK().g(10.0))) {
         if (!$$3.p_() && $$3.aE() && !$$3.be() && $$3.gK()) {
            $$3.fj();
         }
      }

      if (!$$1.x_() && $$1.ab().b(dbs.f)) {
         are $$4 = (are)$$1;
         eql $$5 = $$4.o().be().b(eqc.aV);
         eqj $$6 = new eqj.a($$4).a(etc.f, this.dn()).a(etc.a, this).a(etb.j);

         for (cun $$8 : $$5.a($$6)) {
            this.b($$8);
         }
      }
   }

   @Override
   protected void b(cjf $$0) {
      if (this.a(bsz.a).e() && cA.test($$0)) {
         this.a($$0);
         cun $$1 = $$0.p();
         this.a(bsz.a, $$1);
         this.f(bsz.a);
         this.a($$0, $$1.I());
         $$0.ao();
      }
   }

   @Override
   public boolean a(brl $$0, float $$1) {
      if (!this.dP().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      azf $$4 = $$0.E_();
      this.a(cfs.a.a($$4));
      this.b(cfs.a.a($$4));
      this.gJ();
      if ($$3 == null) {
         $$3 = new bsm.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cfs $$0, @Nullable cfs $$1) {
      if ($$1 == null) {
         if (this.ah.h()) {
            this.a($$0.gT());
            this.b(cfs.a.a(this.ah));
         } else {
            this.a(cfs.a.a(this.ah));
            this.b($$0.gT());
         }
      } else if (this.ah.h()) {
         this.a($$0.gT());
         this.b($$1.gT());
      } else {
         this.a($$1.gT());
         this.b($$0.gT());
      }

      if (this.ah.a(32) == 0) {
         this.a(cfs.a.a(this.ah));
      }

      if (this.ah.a(32) == 0) {
         this.b(cfs.a.a(this.ah));
      }
   }

   private cfs.a gT() {
      return this.ah.h() ? this.gy() : this.gz();
   }

   public void gJ() {
      if (this.gH()) {
         this.f(buv.q).a(10.0);
      }

      if (this.gD()) {
         this.f(buv.r).a(0.07F);
      }
   }

   void gU() {
      if (!this.be()) {
         this.C(0.0F);
         this.K().n();
         this.w(true);
      }
   }

   @Override
   public bqs b(cmv $$0, bqr $$1) {
      cun $$2 = $$0.b($$1);
      if (this.gI()) {
         return bqs.e;
      } else if (this.gq()) {
         this.x(false);
         return bqs.a(this.dP().B);
      } else if (this.o($$2)) {
         if (this.p() != null) {
            this.cp = true;
         }

         if (this.p_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.g() / 20) * 0.1F), true);
         } else if (!this.dP().B && this.g() == 0 && this.gr()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dP().B || this.y() || this.be()) {
               return bqs.e;
            }

            this.gU();
            this.y(true);
            cun $$3 = this.a(bsz.a);
            if (!$$3.e() && !$$0.fP()) {
               this.b($$3);
            }

            this.a(bsz.a, new cun($$2.g(), 1));
            this.a($$0, $$1, $$2);
         }

         return bqs.a;
      } else {
         return bqs.e;
      }
   }

   @Nullable
   @Override
   protected avy v() {
      if (this.gi()) {
         return avz.sy;
      } else {
         return this.gE() ? avz.sz : avz.st;
      }
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(avz.sw, 0.15F, 1.0F);
   }

   @Override
   public boolean o(cun $$0) {
      return $$0.a(awx.aq);
   }

   private boolean n(cun $$0) {
      return this.o($$0) || $$0.a(dez.eg.r());
   }

   @Nullable
   @Override
   protected avy o_() {
      return avz.su;
   }

   @Nullable
   @Override
   protected avy d(brl $$0) {
      return avz.sA;
   }

   public boolean gK() {
      return !this.gq() && !this.gI() && !this.gw() && !this.gA() && !this.y();
   }

   @Override
   public bsv e(btz $$0) {
      return this.p_() ? ci : super.e($$0);
   }

   public static enum a implements azs {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final azs.a<cfs.a> h = azs.a(cfs.a::values);
      private static final IntFunction<cfs.a> i = axo.a(cfs.a::a, values(), axo.a.a);
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

      static cfs.a a(cfs.a $$0, cfs.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cfs.a a(int $$0) {
         return i.apply($$0);
      }

      public static cfs.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cfs.a a(azf $$0) {
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

   static class b extends cav {
      private final cfs b;

      public b(cfs $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gK() && super.a();
      }
   }

   static class c<T extends btn> extends bzs<T> {
      private final cfs i;

      public c(cfs $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsx.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gE() && this.i.gK() && super.a();
      }
   }

   static class d extends bzx {
      private final cfs d;
      private int e;

      public d(cfs $$0, double $$1) {
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
                  cmv $$0 = this.b.a(cfs.ch, this.d);
                  this.d.cz.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         iz $$0 = this.d.dp();
         iz.a $$1 = new iz.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(dez.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends ccd {
      private final cfs a;

      public e(cfs $$0, Class<?>... $$1) {
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
      protected void a(btp $$0, btn $$1) {
         if ($$0 instanceof cfs && $$0.gi()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends cal {
      private final cfs a;
      private int b;

      public f(cfs $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ai && this.a.gD() && this.a.gK() && this.a.ah.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.be() && (this.a.gD() || this.a.ah.a(b(600)) != 1) ? this.a.ah.a(b(2000)) != 1 : false;
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

   static class g extends cat {
      private final cfs h;

      public g(cfs $$0, Class<? extends btn> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(btn $$0) {
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
               if (this.f == cmv.class) {
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

            return this.h.gK() && this.c != null;
         }
      }

      @Override
      public void e() {
         if (this.c != null) {
            super.e();
         }
      }
   }

   static class h extends bzo {
      private final cfs l;

      public h(cfs $$0) {
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

   static class i extends cbe {
      private final cfs h;

      public i(cfs $$0, double $$1) {
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

   static class j extends cal {
      private final cfs a;

      public j(cfs $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cal.a.a, cal.a.b, cal.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.p_() || this.a.gF()) && this.a.aE()) {
            if (!this.a.gK()) {
               return false;
            } else {
               float $$0 = this.a.dF() * (float) (Math.PI / 180.0);
               float $$1 = -ayx.a($$0);
               float $$2 = ayx.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? ayx.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? ayx.j((double)$$2) : 0;
               if (this.a.dP().a_(this.a.dp().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gF() && this.a.ah.a(b(60)) == 1 ? true : this.a.ah.a(b(500)) == 1;
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

   class k extends cal {
      private int b;

      public k() {
         this.a(EnumSet.of(cal.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= cfs.this.ai && !cfs.this.p_() && !cfs.this.be() && cfs.this.gK() && cfs.this.s() <= 0) {
            List<cjf> $$0 = cfs.this.dP().a(cjf.class, cfs.this.cK().c(6.0, 6.0, 6.0), cfs.cA);
            return !$$0.isEmpty() || !cfs.this.a(bsz.a).e();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !cfs.this.be() && (cfs.this.gD() || cfs.this.ah.a(b(600)) != 1) ? cfs.this.ah.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!cfs.this.y() && !cfs.this.a(bsz.a).e()) {
            cfs.this.gU();
         }
      }

      @Override
      public void c() {
         List<cjf> $$0 = cfs.this.dP().a(cjf.class, cfs.this.cK().c(8.0, 8.0, 8.0), cfs.cA);
         if (!$$0.isEmpty() && cfs.this.a(bsz.a).e()) {
            cfs.this.K().a($$0.get(0), 1.2F);
         } else if (!cfs.this.a(bsz.a).e()) {
            cfs.this.gU();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cun $$0 = cfs.this.a(bsz.a);
         if (!$$0.e()) {
            cfs.this.b($$0);
            cfs.this.a(bsz.a, cun.l);
            int $$1 = cfs.this.gD() ? cfs.this.ah.a(50) + 10 : cfs.this.ah.a(150) + 10;
            this.b = cfs.this.ai + $$1 * 20;
         }

         cfs.this.w(false);
      }
   }

   static class l extends cal {
      private final cfs a;

      public l(cfs $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.p_() && this.a.gK()) {
            return this.a.gH() && this.a.ah.a(b(500)) == 1 ? true : this.a.ah.a(b(6000)) == 1;
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
