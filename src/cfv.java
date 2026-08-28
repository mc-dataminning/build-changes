import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfv extends cfg {
   private static final akk<Integer> cb = ako.a(cfv.class, akm.b);
   private static final akk<Integer> cc = ako.a(cfv.class, akm.b);
   private static final akk<Integer> cd = ako.a(cfv.class, akm.b);
   private static final akk<Byte> ce = ako.a(cfv.class, akm.a);
   private static final akk<Byte> cf = ako.a(cfv.class, akm.a);
   private static final akk<Byte> cg = ako.a(cfv.class, akm.a);
   static final ceh ch = ceh.b().a(8.0);
   private static final bsy ci = btb.aw.n().a(0.5F).a(bsx.a().a(bsw.a, 0.0F, 0.40625F, 0.0F));
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
   private evs cr;
   private float cs;
   private float ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   cfv.g cz;
   static final Predicate<cji> cA = $$0 -> {
      cuq $$1 = $$0.p();
      return ($$1.a(dfc.mZ.r()) || $$1.a(dfc.eg.r())) && $$0.bD() && !$$0.y();
   };

   public cfv(btb<? extends cfv> $$0, dbz $$1) {
      super($$0, $$1);
      this.bP = new cfv.h(this);
      if (!this.p_()) {
         this.a_(true);
      }
   }

   @Override
   public boolean f(cuq $$0) {
      btc $$1 = bts.h($$0);
      return !this.a($$1).e() ? false : $$1 == btc.a && super.f($$0);
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

   public cfv.a gy() {
      return cfv.a.a(this.ao.a(ce));
   }

   public void a(cfv.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cfv.a.a(this.ah);
      }

      this.ao.a(ce, (byte)$$0.a());
   }

   public cfv.a gz() {
      return cfv.a.a(this.ao.a(cf));
   }

   public void b(cfv.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cfv.a.a(this.ah);
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
   protected void a(ako.a $$0) {
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
   public void b(us $$0) {
      super.b($$0);
      $$0.a("MainGene", this.gy().c());
      $$0.a("HiddenGene", this.gz().c());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a(cfv.a.a($$0.l("MainGene")));
      this.b(cfv.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bsp a(arf $$0, bsp $$1) {
      cfv $$2 = btb.aw.a((dbz)$$0);
      if ($$2 != null) {
         if ($$1 instanceof cfv $$3) {
            $$2.a(this, $$3);
         }

         $$2.gJ();
      }

      return $$2;
   }

   @Override
   protected void z() {
      this.bS.a(0, new cai(this));
      this.bS.a(2, new cfv.i(this, 2.0));
      this.bS.a(2, new cfv.d(this, 1.0));
      this.bS.a(3, new cfv.b(this, 1.2F, true));
      this.bS.a(4, new cbw(this, 1.0, $$0 -> $$0.a(awy.aq), false));
      this.bS.a(6, new cfv.c<>(this, cmy.class, 8.0F, 2.0, 2.0));
      this.bS.a(6, new cfv.c<>(this, cke.class, 4.0F, 2.0, 2.0));
      this.bS.a(7, new cfv.k());
      this.bS.a(8, new cfv.f(this));
      this.bS.a(8, new cfv.l(this));
      this.cz = new cfv.g(this, cmy.class, 6.0F);
      this.bS.a(9, this.cz);
      this.bS.a(10, new cbj(this));
      this.bS.a(12, new cfv.j(this));
      this.bS.a(13, new can(this, 1.25));
      this.bS.a(14, new ccb(this, 1.0));
      this.bT.a(1, new cfv.e(this).a(new Class[0]));
   }

   public static bux.a gB() {
      return bts.A().a(buy.r, 0.15F).a(buy.c, 6.0);
   }

   public cfv.a gC() {
      return cfv.a.a(this.gy(), this.gz());
   }

   public boolean gD() {
      return this.gC() == cfv.a.b;
   }

   public boolean gE() {
      return this.gC() == cfv.a.c;
   }

   public boolean gF() {
      return this.gC() == cfv.a.d;
   }

   public boolean gG() {
      return this.gC() == cfv.a.e;
   }

   public boolean gH() {
      return this.gC() == cfv.a.f;
   }

   @Override
   public boolean gi() {
      return this.gC() == cfv.a.g;
   }

   @Override
   public boolean a(cmy $$0) {
      return false;
   }

   @Override
   public boolean C(bsv $$0) {
      this.a(awa.sB, 1.0F, 1.0F);
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

      btq $$0 = this.p();
      if ($$0 == null) {
         this.cp = false;
         this.cq = false;
      }

      if (this.s() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.s() == 29 || this.s() == 14) {
            this.a(awa.sx, 1.0F, 1.0F);
         }

         this.u(this.s() - 1);
      }

      if (this.u()) {
         this.v(this.gx() + 1);
         if (this.gx() > 20) {
            this.z(false);
            this.gS();
         } else if (this.gx() == 1) {
            this.a(awa.sr, 1.0F, 1.0F);
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
      if (!this.gw() && this.y() && !this.gI() && !this.a(btc.a).e() && this.ah.a(80) == 1) {
         this.y(true);
      } else if (this.a(btc.a).e() || !this.y()) {
         this.y(false);
      }

      if (this.gw()) {
         this.gN();
         if (!this.dP().B && this.gL() > 80 && this.ah.a(20) == 1) {
            if (this.gL() > 100 && this.n(this.a(btc.a))) {
               if (!this.dP().B) {
                  this.a(btc.a, cuq.l);
                  this.a(dww.m);
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
         this.a(awa.sv, 0.5F + 0.5F * (float)this.ah.a(2), (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            evs $$1 = new evs(((double)this.ah.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.ah.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dH() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dF() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.ah.i()) * 0.6 - 0.3;
            evs $$3 = new evs(((double)this.ah.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.ah.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aY * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.du(), this.dy() + 1.0, this.dA());
            this.dP().a(new le(li.S, this.a(btc.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
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
      return ayz.i($$0, this.ct, this.cs);
   }

   public float H(float $$0) {
      return ayz.i($$0, this.cv, this.cu);
   }

   public float I(float $$0) {
      return ayz.i($$0, this.cx, this.cw);
   }

   private void gR() {
      this.bZ++;
      if (this.bZ > 32) {
         this.A(false);
      } else {
         if (!this.dP().B) {
            evs $$0 = this.ds();
            if (this.bZ == 1) {
               float $$1 = this.dF() * (float) (Math.PI / 180.0);
               float $$2 = this.p_() ? 0.1F : 0.2F;
               this.cr = new evs($$0.c + (double)(-ayz.a($$1) * $$2), 0.0, $$0.e + (double)(ayz.b($$1) * $$2));
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
      evs $$0 = this.ds();
      dbz $$1 = this.dP();
      $$1.a(
         li.ag,
         this.du() - (double)(this.dj() + 1.0F) * 0.5 * (double)ayz.a(this.aY * (float) (Math.PI / 180.0)),
         this.dy() - 0.1F,
         this.dA() + (double)(this.dj() + 1.0F) * 0.5 * (double)ayz.b(this.aY * (float) (Math.PI / 180.0)),
         $$0.c,
         0.0,
         $$0.e
      );
      this.a(awa.ss, 1.0F, 1.0F);

      for (cfv $$3 : $$1.a(cfv.class, this.cK().g(10.0))) {
         if (!$$3.p_() && $$3.aE() && !$$3.be() && $$3.gK()) {
            $$3.fj();
         }
      }

      if (!$$1.x_() && $$1.ab().b(dbv.f)) {
         arf $$4 = (arf)$$1;
         eqo $$5 = $$4.o().be().b(eqf.aV);
         eqm $$6 = new eqm.a($$4).a(etf.f, this.dn()).a(etf.a, this).a(ete.j);

         for (cuq $$8 : $$5.a($$6)) {
            this.b($$8);
         }
      }
   }

   @Override
   protected void b(cji $$0) {
      if (this.a(btc.a).e() && cA.test($$0)) {
         this.a($$0);
         cuq $$1 = $$0.p();
         this.a(btc.a, $$1);
         this.f(btc.a);
         this.a($$0, $$1.I());
         $$0.ao();
      }
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      if (!this.dP().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      azh $$4 = $$0.E_();
      this.a(cfv.a.a($$4));
      this.b(cfv.a.a($$4));
      this.gJ();
      if ($$3 == null) {
         $$3 = new bsp.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public void a(cfv $$0, @Nullable cfv $$1) {
      if ($$1 == null) {
         if (this.ah.h()) {
            this.a($$0.gT());
            this.b(cfv.a.a(this.ah));
         } else {
            this.a(cfv.a.a(this.ah));
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
         this.a(cfv.a.a(this.ah));
      }

      if (this.ah.a(32) == 0) {
         this.b(cfv.a.a(this.ah));
      }
   }

   private cfv.a gT() {
      return this.ah.h() ? this.gy() : this.gz();
   }

   public void gJ() {
      if (this.gH()) {
         this.f(buy.q).a(10.0);
      }

      if (this.gD()) {
         this.f(buy.r).a(0.07F);
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
   public bqv b(cmy $$0, bqu $$1) {
      cuq $$2 = $$0.b($$1);
      if (this.gI()) {
         return bqv.e;
      } else if (this.gq()) {
         this.x(false);
         return bqv.a(this.dP().B);
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
               return bqv.e;
            }

            this.gU();
            this.y(true);
            cuq $$3 = this.a(btc.a);
            if (!$$3.e() && !$$0.fP()) {
               this.b($$3);
            }

            this.a(btc.a, new cuq($$2.g(), 1));
            this.a($$0, $$1, $$2);
         }

         return bqv.a;
      } else {
         return bqv.e;
      }
   }

   @Nullable
   @Override
   protected avz v() {
      if (this.gi()) {
         return awa.sy;
      } else {
         return this.gE() ? awa.sz : awa.st;
      }
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
      this.a(awa.sw, 0.15F, 1.0F);
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awy.aq);
   }

   private boolean n(cuq $$0) {
      return this.o($$0) || $$0.a(dfc.eg.r());
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.su;
   }

   @Nullable
   @Override
   protected avz d(bro $$0) {
      return awa.sA;
   }

   public boolean gK() {
      return !this.gq() && !this.gI() && !this.gw() && !this.gA() && !this.y();
   }

   @Override
   public bsy e(buc $$0) {
      return this.p_() ? ci : super.e($$0);
   }

   public static enum a implements azu {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final azu.a<cfv.a> h = azu.a(cfv.a::values);
      private static final IntFunction<cfv.a> i = axp.a(cfv.a::a, values(), axp.a.a);
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

      static cfv.a a(cfv.a $$0, cfv.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cfv.a a(int $$0) {
         return i.apply($$0);
      }

      public static cfv.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cfv.a a(azh $$0) {
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

   static class b extends cay {
      private final cfv b;

      public b(cfv $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gK() && super.a();
      }
   }

   static class c<T extends btq> extends bzv<T> {
      private final cfv i;

      public c(cfv $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bta.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gE() && this.i.gK() && super.a();
      }
   }

   static class d extends caa {
      private final cfv d;
      private int e;

      public d(cfv $$0, double $$1) {
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
                  cmy $$0 = this.b.a(cfv.ch, this.d);
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
                     if (this.b.a_($$1).a(dfc.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends ccg {
      private final cfv a;

      public e(cfv $$0, Class<?>... $$1) {
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
      protected void a(bts $$0, btq $$1) {
         if ($$0 instanceof cfv && $$0.gi()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends cao {
      private final cfv a;
      private int b;

      public f(cfv $$0) {
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

   static class g extends caw {
      private final cfv h;

      public g(cfv $$0, Class<? extends btq> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(btq $$0) {
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
               if (this.f == cmy.class) {
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

   static class h extends bzr {
      private final cfv l;

      public h(cfv $$0) {
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

   static class i extends cbh {
      private final cfv h;

      public i(cfv $$0, double $$1) {
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

   static class j extends cao {
      private final cfv a;

      public j(cfv $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cao.a.a, cao.a.b, cao.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.p_() || this.a.gF()) && this.a.aE()) {
            if (!this.a.gK()) {
               return false;
            } else {
               float $$0 = this.a.dF() * (float) (Math.PI / 180.0);
               float $$1 = -ayz.a($$0);
               float $$2 = ayz.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? ayz.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? ayz.j((double)$$2) : 0;
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

   class k extends cao {
      private int b;

      public k() {
         this.a(EnumSet.of(cao.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= cfv.this.ai && !cfv.this.p_() && !cfv.this.be() && cfv.this.gK() && cfv.this.s() <= 0) {
            List<cji> $$0 = cfv.this.dP().a(cji.class, cfv.this.cK().c(6.0, 6.0, 6.0), cfv.cA);
            return !$$0.isEmpty() || !cfv.this.a(btc.a).e();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !cfv.this.be() && (cfv.this.gD() || cfv.this.ah.a(b(600)) != 1) ? cfv.this.ah.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!cfv.this.y() && !cfv.this.a(btc.a).e()) {
            cfv.this.gU();
         }
      }

      @Override
      public void c() {
         List<cji> $$0 = cfv.this.dP().a(cji.class, cfv.this.cK().c(8.0, 8.0, 8.0), cfv.cA);
         if (!$$0.isEmpty() && cfv.this.a(btc.a).e()) {
            cfv.this.K().a($$0.get(0), 1.2F);
         } else if (!cfv.this.a(btc.a).e()) {
            cfv.this.gU();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cuq $$0 = cfv.this.a(btc.a);
         if (!$$0.e()) {
            cfv.this.b($$0);
            cfv.this.a(btc.a, cuq.l);
            int $$1 = cfv.this.gD() ? cfv.this.ah.a(50) + 10 : cfv.this.ah.a(150) + 10;
            this.b = cfv.this.ai + $$1 * 20;
         }

         cfv.this.w(false);
      }
   }

   static class l extends cao {
      private final cfv a;

      public l(cfv $$0) {
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
