import java.util.EnumSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cai extends bzt {
   private static final aie<Integer> bW = aih.a(cai.class, aig.b);
   private static final aie<Integer> bX = aih.a(cai.class, aig.b);
   private static final aie<Integer> bY = aih.a(cai.class, aig.b);
   private static final aie<Byte> bZ = aih.a(cai.class, aig.a);
   private static final aie<Byte> ca = aih.a(cai.class, aig.a);
   private static final aie<Byte> cb = aih.a(cai.class, aig.a);
   static final byu cc = byu.b().a(8.0);
   private static final bnr cd = bnu.au.n().a(0.5F).a(bnq.a().a(bnp.a, 0.0F, 0.40625F, 0.0F));
   private static final int ce = 2;
   private static final int cf = 4;
   private static final int cg = 8;
   private static final int ch = 16;
   private static final int ci = 5;
   public static final int bT = 32;
   private static final int cj = 32;
   boolean ck;
   boolean cl;
   public int bU;
   private ens cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;
   cai.g ct;
   static final Predicate<cds> cu = $$0 -> {
      coz $$1 = $$0.q();
      return ($$1.a(cyq.mZ.j()) || $$1.a(cyq.eg.j())) && $$0.bx() && !$$0.z();
   };

   public cai(bnu<? extends cai> $$0, cvn $$1) {
      super($$0, $$1);
      this.bL = new cai.h(this);
      if (!this.o_()) {
         this.s(true);
      }
   }

   @Override
   public boolean f(coz $$0) {
      bnv $$1 = boi.h($$0);
      return !this.c($$1).b() ? false : $$1 == bnv.a && super.f($$0);
   }

   public int u() {
      return this.am.b(bW);
   }

   public void u(int $$0) {
      this.am.b(bW, $$0);
   }

   public boolean w() {
      return this.x(2);
   }

   public boolean A() {
      return this.x(8);
   }

   public void w(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gg() {
      return this.x(16);
   }

   public void x(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gm() {
      return this.am.b(bY) > 0;
   }

   public void y(boolean $$0) {
      this.am.b(bY, $$0 ? 1 : 0);
   }

   private int gB() {
      return this.am.b(bY);
   }

   private void w(int $$0) {
      this.am.b(bY, $$0);
   }

   public void z(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.v(0);
      }
   }

   public int gn() {
      return this.am.b(bX);
   }

   public void v(int $$0) {
      this.am.b(bX, $$0);
   }

   public cai.a go() {
      return cai.a.a(this.am.b(bZ));
   }

   public void a(cai.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cai.a.a(this.af);
      }

      this.am.b(bZ, (byte)$$0.a());
   }

   public cai.a gp() {
      return cai.a.a(this.am.b(ca));
   }

   public void b(cai.a $$0) {
      if ($$0.a() > 6) {
         $$0 = cai.a.a(this.af);
      }

      this.am.b(ca, (byte)$$0.a());
   }

   public boolean gq() {
      return this.x(4);
   }

   public void A(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bW, 0);
      this.am.a(bX, 0);
      this.am.a(bZ, (byte)0);
      this.am.a(ca, (byte)0);
      this.am.a(cb, (byte)0);
      this.am.a(bY, 0);
   }

   private boolean x(int $$0) {
      return (this.am.b(cb) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.am.b(cb);
      if ($$1) {
         this.am.b(cb, (byte)($$2 | $$0));
      } else {
         this.am.b(cb, (byte)($$2 & ~$$0));
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("MainGene", this.go().c());
      $$0.a("HiddenGene", this.gp().c());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a(cai.a.a($$0.l("MainGene")));
      this.b(cai.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bnj a(aov $$0, bnj $$1) {
      cai $$2 = bnu.au.a((cvn)$$0);
      if ($$2 != null) {
         if ($$1 instanceof cai $$3) {
            $$2.a(this, $$3);
         }

         $$2.gz();
      }

      return $$2;
   }

   @Override
   protected void B() {
      this.bO.a(0, new buv(this));
      this.bO.a(2, new cai.i(this, 2.0));
      this.bO.a(2, new cai.d(this, 1.0));
      this.bO.a(3, new cai.b(this, 1.2F, true));
      this.bO.a(4, new bwj(this, 1.0, cry.a(cyq.mZ.j()), false));
      this.bO.a(6, new cai.c<>(this, chh.class, 8.0F, 2.0, 2.0));
      this.bO.a(6, new cai.c<>(this, cen.class, 4.0F, 2.0, 2.0));
      this.bO.a(7, new cai.k());
      this.bO.a(8, new cai.f(this));
      this.bO.a(8, new cai.l(this));
      this.ct = new cai.g(this, chh.class, 6.0F);
      this.bO.a(9, this.ct);
      this.bO.a(10, new bvw(this));
      this.bO.a(12, new cai.j(this));
      this.bO.a(13, new bva(this, 1.25));
      this.bO.a(14, new bwo(this, 1.0));
      this.bP.a(1, new cai.e(this).a(new Class[0]));
   }

   public static bpk.a gr() {
      return boi.C().a(bpl.o, 0.15F).a(bpl.c, 6.0);
   }

   public cai.a gs() {
      return cai.a.a(this.go(), this.gp());
   }

   public boolean gt() {
      return this.gs() == cai.a.b;
   }

   public boolean gu() {
      return this.gs() == cai.a.c;
   }

   public boolean gv() {
      return this.gs() == cai.a.d;
   }

   public boolean gw() {
      return this.gs() == cai.a.e;
   }

   public boolean gx() {
      return this.gs() == cai.a.f;
   }

   @Override
   public boolean fY() {
      return this.gs() == cai.a.g;
   }

   @Override
   public boolean a(chh $$0) {
      return false;
   }

   @Override
   public boolean B(bno $$0) {
      this.a(atk.rX, 1.0F, 1.0F);
      if (!this.fY()) {
         this.cl = true;
      }

      return super.B($$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.gu()) {
         if (this.dM().aa() && !this.aZ()) {
            this.w(true);
            this.y(false);
         } else if (!this.gm()) {
            this.w(false);
         }
      }

      bog $$0 = this.q();
      if ($$0 == null) {
         this.ck = false;
         this.cl = false;
      }

      if (this.u() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.u() == 29 || this.u() == 14) {
            this.a(atk.rT, 1.0F, 1.0F);
         }

         this.u(this.u() - 1);
      }

      if (this.w()) {
         this.v(this.gn() + 1);
         if (this.gn() > 20) {
            this.z(false);
            this.gI();
         } else if (this.gn() == 1) {
            this.a(atk.rN, 1.0F, 1.0F);
         }
      }

      if (this.gq()) {
         this.gH();
      } else {
         this.bU = 0;
      }

      if (this.A()) {
         this.s(0.0F);
      }

      this.gE();
      this.gC();
      this.gF();
      this.gG();
   }

   public boolean gy() {
      return this.gu() && this.dM().aa();
   }

   private void gC() {
      if (!this.gm() && this.A() && !this.gy() && !this.c(bnv.a).b() && this.af.a(80) == 1) {
         this.y(true);
      } else if (this.c(bnv.a).b() || !this.A()) {
         this.y(false);
      }

      if (this.gm()) {
         this.gD();
         if (!this.dM().B && this.gB() > 80 && this.af.a(20) == 1) {
            if (this.gB() > 100 && this.l(this.c(bnv.a))) {
               if (!this.dM().B) {
                  this.a(bnv.a, coz.h);
                  this.b(dpp.m);
               }

               this.w(false);
            }

            this.y(false);
            return;
         }

         this.w(this.gB() + 1);
      }
   }

   private void gD() {
      if (this.gB() % 5 == 0) {
         this.a(atk.rR, 0.5F + 0.5F * (float)this.af.a(2), (this.af.i() - this.af.i()) * 0.2F + 1.0F);

         for (int $$0 = 0; $$0 < 6; $$0++) {
            ens $$1 = new ens(((double)this.af.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.af.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.dE() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dC() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.af.i()) * 0.6 - 0.3;
            ens $$3 = new ens(((double)this.af.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.af.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aU * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.dr(), this.dv() + 1.0, this.dx());
            this.dM().a(new jv(jz.Q, this.c(bnv.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }
   }

   private void gE() {
      this.co = this.cn;
      if (this.A()) {
         this.cn = Math.min(1.0F, this.cn + 0.15F);
      } else {
         this.cn = Math.max(0.0F, this.cn - 0.19F);
      }
   }

   private void gF() {
      this.cq = this.cp;
      if (this.gg()) {
         this.cp = Math.min(1.0F, this.cp + 0.15F);
      } else {
         this.cp = Math.max(0.0F, this.cp - 0.19F);
      }
   }

   private void gG() {
      this.cs = this.cr;
      if (this.gq()) {
         this.cr = Math.min(1.0F, this.cr + 0.15F);
      } else {
         this.cr = Math.max(0.0F, this.cr - 0.19F);
      }
   }

   public float E(float $$0) {
      return awh.i($$0, this.co, this.cn);
   }

   public float F(float $$0) {
      return awh.i($$0, this.cq, this.cp);
   }

   public float G(float $$0) {
      return awh.i($$0, this.cs, this.cr);
   }

   private void gH() {
      this.bU++;
      if (this.bU > 32) {
         this.A(false);
      } else {
         if (!this.dM().B) {
            ens $$0 = this.dp();
            if (this.bU == 1) {
               float $$1 = this.dC() * (float) (Math.PI / 180.0);
               float $$2 = this.o_() ? 0.1F : 0.2F;
               this.cm = new ens($$0.c + (double)(-awh.a($$1) * $$2), 0.0, $$0.e + (double)(awh.b($$1) * $$2));
               this.g(this.cm.b(0.0, 0.27, 0.0));
            } else if ((float)this.bU != 7.0F && (float)this.bU != 15.0F && (float)this.bU != 23.0F) {
               this.o(this.cm.c, $$0.d, this.cm.e);
            } else {
               this.o(0.0, this.aC() ? 0.27 : $$0.d, 0.0);
            }
         }
      }
   }

   private void gI() {
      ens $$0 = this.dp();
      this.dM()
         .a(
            jz.ad,
            this.dr() - (double)(this.dg() + 1.0F) * 0.5 * (double)awh.a(this.aU * (float) (Math.PI / 180.0)),
            this.dv() - 0.1F,
            this.dx() + (double)(this.dg() + 1.0F) * 0.5 * (double)awh.b(this.aU * (float) (Math.PI / 180.0)),
            $$0.c,
            0.0,
            $$0.e
         );
      this.a(atk.rO, 1.0F, 1.0F);

      for (cai $$2 : this.dM().a(cai.class, this.cH().g(10.0))) {
         if (!$$2.o_() && $$2.aC() && !$$2.aZ() && $$2.gA()) {
            $$2.fb();
         }
      }

      if (!this.dM().y_() && this.af.a(700) == 0 && this.dM().Z().b(cvj.f)) {
         this.a(cpc.qP);
      }
   }

   @Override
   protected void b(cds $$0) {
      if (this.c(bnv.a).b() && cu.test($$0)) {
         this.a($$0);
         coz $$1 = $$0.q();
         this.a(bnv.a, $$1);
         this.e(bnv.a);
         this.a($$0, $$1.M());
         $$0.am();
      }
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      if (!this.dM().B) {
         this.w(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      awo $$5 = $$0.F_();
      this.a(cai.a.a($$5));
      this.b(cai.a.a($$5));
      this.gz();
      if ($$3 == null) {
         $$3 = new bnj.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(cai $$0, @Nullable cai $$1) {
      if ($$1 == null) {
         if (this.af.h()) {
            this.a($$0.gJ());
            this.b(cai.a.a(this.af));
         } else {
            this.a(cai.a.a(this.af));
            this.b($$0.gJ());
         }
      } else if (this.af.h()) {
         this.a($$0.gJ());
         this.b($$1.gJ());
      } else {
         this.a($$1.gJ());
         this.b($$0.gJ());
      }

      if (this.af.a(32) == 0) {
         this.a(cai.a.a(this.af));
      }

      if (this.af.a(32) == 0) {
         this.b(cai.a.a(this.af));
      }
   }

   private cai.a gJ() {
      return this.af.h() ? this.go() : this.gp();
   }

   public void gz() {
      if (this.gx()) {
         this.f(bpl.n).a(10.0);
      }

      if (this.gt()) {
         this.f(bpl.o).a(0.07F);
      }
   }

   void gK() {
      if (!this.aZ()) {
         this.A(0.0F);
         this.N().n();
         this.w(true);
      }
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if (this.gy()) {
         return blu.d;
      } else if (this.gg()) {
         this.x(false);
         return blu.a(this.dM().B);
      } else if (this.m($$2)) {
         if (this.q() != null) {
            this.ck = true;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.h() / 20) * 0.1F), true);
         } else if (!this.dM().B && this.h() == 0 && this.gh()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
         } else {
            if (this.dM().B || this.A() || this.aZ()) {
               return blu.d;
            }

            this.gK();
            this.y(true);
            coz $$3 = this.c(bnv.a);
            if (!$$3.b() && !$$0.fU().d) {
               this.b($$3);
            }

            this.a(bnv.a, new coz($$2.d(), 1));
            this.a($$0, $$1, $$2);
         }

         return blu.a;
      } else {
         return blu.d;
      }
   }

   @Nullable
   @Override
   protected atj y() {
      if (this.fY()) {
         return atk.rU;
      } else {
         return this.gu() ? atk.rV : atk.rP;
      }
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.rS, 0.15F, 1.0F);
   }

   @Override
   public boolean m(coz $$0) {
      return $$0.a(cyq.mZ.j());
   }

   private boolean l(coz $$0) {
      return this.m($$0) || $$0.a(cyq.eg.j());
   }

   @Nullable
   @Override
   protected atj n_() {
      return atk.rQ;
   }

   @Nullable
   @Override
   protected atj d(bmn $$0) {
      return atk.rW;
   }

   public boolean gA() {
      return !this.gg() && !this.gy() && !this.gm() && !this.gq() && !this.A();
   }

   @Override
   public bnr e(bor $$0) {
      return this.o_() ? cd : super.e($$0);
   }

   public static enum a implements axc {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      public static final axc.a<cai.a> h = axc.a(cai.a::values);
      private static final IntFunction<cai.a> i = auz.a(cai.a::a, values(), auz.a.a);
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

      static cai.a a(cai.a $$0, cai.a $$1) {
         if ($$0.b()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static cai.a a(int $$0) {
         return i.apply($$0);
      }

      public static cai.a a(String $$0) {
         return h.a($$0, a);
      }

      public static cai.a a(awo $$0) {
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

   static class b extends bvl {
      private final cai b;

      public b(cai $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.gA() && super.a();
      }
   }

   static class c<T extends bog> extends bui<T> {
      private final cai i;

      public c(cai $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bnt.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gu() && this.i.gA() && super.a();
      }
   }

   static class d extends bun {
      private final cai d;
      private int e;

      public d(cai $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         if (!super.a() || this.d.u() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.ag) {
               this.d.u(32);
               this.e = this.d.ag + 600;
               if (this.d.cY()) {
                  chh $$0 = this.b.a(cai.cc, this.d);
                  this.d.ct.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         hz $$0 = this.d.dm();
         hz.a $$1 = new hz.a();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            for (int $$3 = 0; $$3 < 8; $$3++) {
               for (int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for (int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(cyq.mZ)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends bwt {
      private final cai a;

      public e(cai $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.ck && !this.a.cl) {
            return super.b();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(boi $$0, bog $$1) {
         if ($$0 instanceof cai && $$0.fY()) {
            $$0.h($$1);
         }
      }
   }

   static class f extends bvb {
      private final cai a;
      private int b;

      public f(cai $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.ag && this.a.gt() && this.a.gA() && this.a.af.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         return !this.a.aZ() && (this.a.gt() || this.a.af.a(b(600)) != 1) ? this.a.af.a(b(2000)) != 1 : false;
      }

      @Override
      public void c() {
         this.a.x(true);
         this.b = 0;
      }

      @Override
      public void d() {
         this.a.x(false);
         this.b = this.a.ag + 200;
      }
   }

   static class g extends bvj {
      private final cai h;

      public g(cai $$0, Class<? extends bog> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bog $$0) {
         this.c = $$0;
      }

      @Override
      public boolean b() {
         return this.c != null && super.b();
      }

      @Override
      public boolean a() {
         if (this.b.eh().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == chh.class) {
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

            return this.h.gA() && this.c != null;
         }
      }

      @Override
      public void e() {
         if (this.c != null) {
            super.e();
         }
      }
   }

   static class h extends bue {
      private final cai l;

      public h(cai $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.gA()) {
            super.a();
         }
      }
   }

   static class i extends bvu {
      private final cai h;

      public i(cai $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dB() || this.b.bN();
      }

      @Override
      public boolean b() {
         if (this.h.A()) {
            this.h.N().n();
            return false;
         } else {
            return super.b();
         }
      }
   }

   static class j extends bvb {
      private final cai a;

      public j(cai $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvb.a.a, bvb.a.b, bvb.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.o_() || this.a.gv()) && this.a.aC()) {
            if (!this.a.gA()) {
               return false;
            } else {
               float $$0 = this.a.dC() * (float) (Math.PI / 180.0);
               float $$1 = -awh.a($$0);
               float $$2 = awh.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? awh.j((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? awh.j((double)$$2) : 0;
               if (this.a.dM().a_(this.a.dm().b($$3, -1, $$4)).i()) {
                  return true;
               } else {
                  return this.a.gv() && this.a.af.a(b(60)) == 1 ? true : this.a.af.a(b(500)) == 1;
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
      public boolean S_() {
         return false;
      }
   }

   class k extends bvb {
      private int b;

      public k() {
         this.a(EnumSet.of(bvb.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= cai.this.ag && !cai.this.o_() && !cai.this.aZ() && cai.this.gA() && cai.this.u() <= 0) {
            List<cds> $$0 = cai.this.dM().a(cds.class, cai.this.cH().c(6.0, 6.0, 6.0), cai.cu);
            return !$$0.isEmpty() || !cai.this.c(bnv.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return !cai.this.aZ() && (cai.this.gt() || cai.this.af.a(b(600)) != 1) ? cai.this.af.a(b(2000)) != 1 : false;
      }

      @Override
      public void e() {
         if (!cai.this.A() && !cai.this.c(bnv.a).b()) {
            cai.this.gK();
         }
      }

      @Override
      public void c() {
         List<cds> $$0 = cai.this.dM().a(cds.class, cai.this.cH().c(8.0, 8.0, 8.0), cai.cu);
         if (!$$0.isEmpty() && cai.this.c(bnv.a).b()) {
            cai.this.N().a($$0.get(0), 1.2F);
         } else if (!cai.this.c(bnv.a).b()) {
            cai.this.gK();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         coz $$0 = cai.this.c(bnv.a);
         if (!$$0.b()) {
            cai.this.b($$0);
            cai.this.a(bnv.a, coz.h);
            int $$1 = cai.this.gt() ? cai.this.af.a(50) + 10 : cai.this.af.a(150) + 10;
            this.b = cai.this.ag + $$1 * 20;
         }

         cai.this.w(false);
      }
   }

   static class l extends bvb {
      private final cai a;

      public l(cai $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.o_() && this.a.gA()) {
            return this.a.gx() && this.a.af.a(b(500)) == 1 ? true : this.a.af.a(b(6000)) == 1;
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
