import java.util.EnumSet;
import javax.annotation.Nullable;

public class clm extends cmr implements cmc {
   public static final float a = 0.03F;
   boolean cb;
   protected final cev b;
   protected final ces c;

   public clm(bus<? extends clm> $$0, dfm $$1) {
      super($$0, $$1);
      this.bP = new clm.d(this);
      this.a(esm.j, 0.0F);
      this.b = new cev(this, $$1);
      this.c = new ces(this, $$1);
   }

   public static bwo.a n() {
      return cmr.gq().a(bwp.B, 1.0);
   }

   @Override
   protected void q() {
      this.bS.a(1, new clm.c(this, 1.0));
      this.bS.a(2, new clm.f(this, 1.0, 40, 10.0F));
      this.bS.a(2, new clm.a(this, 1.0, false));
      this.bS.a(5, new clm.b(this, 1.0));
      this.bS.a(6, new clm.e(this, 1.0, this.dV().O()));
      this.bS.a(7, new cdc(this, 1.0));
      this.bT.a(1, new cdx(this, clm.class).a(cmt.class));
      this.bT.a(2, new cdy<>(this, cou.class, 10, true, false, ($$0, $$1) -> this.j($$0)));
      this.bT.a(3, new cdy<>(this, coa.class, false));
      this.bT.a(3, new cdy<>(this, chk.class, true));
      this.bT.a(3, new cdy<>(this, cik.class, true, false));
      this.bT.a(5, new cdy<>(this, chz.class, 10, true, false, chz.bY));
   }

   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(but.b).f() && $$0.G_().i() < 0.03F) {
         this.a(but.b, new cwm(cwq.wl));
         this.g(but.b);
      }

      return $$3;
   }

   public static boolean a(bus<clm> $$0, dgd $$1, bur $$2, jh $$3, azu $$4) {
      if (!$$1.b_($$3.e()).a(axi.a) && !bur.a($$2)) {
         return false;
      } else {
         jq<dgo> $$5 = $$1.t($$3);
         boolean $$6 = $$1.ak() != bsh.a && (bur.b($$2) || a($$1, $$3, $$4)) && (bur.a($$2) || $$1.b_($$3).a(axi.a));
         if (!$$6 || !bur.a($$2) && $$2 != bur.j) {
            return $$5.a(axb.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         } else {
            return true;
         }
      }
   }

   private static boolean a(dfn $$0, jh $$1) {
      return $$1.v() < $$0.O() - 5;
   }

   @Override
   protected awm t() {
      return this.bj() ? awn.hF : awn.hE;
   }

   @Override
   protected awm e(btb $$0) {
      return this.bj() ? awn.hJ : awn.hI;
   }

   @Override
   protected awm n_() {
      return this.bj() ? awn.hH : awn.hG;
   }

   @Override
   protected awm v() {
      return awn.hL;
   }

   @Override
   protected awm aV() {
      return awn.hM;
   }

   @Override
   protected boolean gm() {
      return true;
   }

   @Override
   protected cwm gn() {
      return cwm.k;
   }

   @Override
   protected void a(azu $$0, bsi $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(but.a, new cwm(cwq.wk));
         } else {
            this.a(but.a, new cwm(cwq.rm));
         }
      }
   }

   @Override
   protected boolean a(cwm $$0, cwm $$1, but $$2) {
      if ($$1.a(cwq.wl)) {
         return false;
      } else if ($$1.a(cwq.wk)) {
         return $$0.a(cwq.wk) ? $$0.o() < $$1.o() : false;
      } else {
         return $$0.a(cwq.wk) ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean go() {
      return false;
   }

   @Override
   public boolean a(dfp $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bvh $$0) {
      return $$0 != null ? !this.dV().T() || $$0.bj() : false;
   }

   @Override
   public boolean cJ() {
      return !this.ck();
   }

   boolean gw() {
      if (this.cb) {
         return true;
      } else {
         bvh $$0 = this.aa_();
         return $$0 != null && $$0.bj();
      }
   }

   @Override
   public void a_(ezy $$0) {
      if (this.di() && this.bo() && this.gw()) {
         this.a(0.01F, $$0);
         this.a(bvl.a, this.dy());
         this.h(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void bp() {
      if (!this.dV().C) {
         if (this.dj() && this.bo() && this.gw()) {
            this.bR = this.b;
            this.i(true);
         } else {
            this.bR = this.c;
            this.i(false);
         }
      }
   }

   @Override
   public boolean cl() {
      return this.ck();
   }

   protected boolean gp() {
      esj $$0 = this.L().k();
      if ($$0 != null) {
         jh $$1 = $$0.l();
         if ($$1 != null) {
            double $$2 = this.i((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            if ($$2 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(bvh $$0, float $$1) {
      cwm $$2 = this.eX();
      cwm $$3 = $$2.a(cwq.wk) ? $$2 : new cwm(cwq.wk);
      cqa $$4 = new cqa(this.dV(), this, $$3);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof arp $$9) {
         cpn.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dV().ak().a() * 4));
      }

      this.a(awn.hK, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   public void x(boolean $$0) {
      this.cb = $$0;
   }

   static class a extends cdu {
      private final clm b;

      public a(clm $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.aa_());
      }

      @Override
      public boolean c() {
         return super.c() && this.b.j(this.b.aa_());
      }
   }

   static class b extends ccs {
      private final clm g;

      public b(clm $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.g.dV().T() && this.g.bj() && this.g.dC() >= (double)(this.g.dV().O() - 3);
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(dfp $$0, jh $$1) {
         jh $$2 = $$1.d();
         return $$0.u($$2) && $$0.u($$2.d()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void d() {
         this.g.x(false);
         this.g.bR = this.g.c;
         super.d();
      }

      @Override
      public void e() {
         super.e();
      }
   }

   static class c extends ccf {
      private final bvp a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dfm f;

      public c(bvp $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dV();
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.T()) {
            return false;
         } else if (this.a.bj()) {
            return false;
         } else {
            ezy $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.d;
               this.c = $$0.e;
               this.d = $$0.f;
               return true;
            }
         }
      }

      @Override
      public boolean c() {
         return !this.a.L().m();
      }

      @Override
      public void d() {
         this.a.L().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private ezy h() {
         azu $$0 = this.a.dY();
         jh $$1 = this.a.dv();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            jh $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dis.G)) {
               return ezy.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends cbi {
      private final clm l;

      public d(clm $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bvh $$0 = this.l.aa_();
         if (this.l.gw() && this.l.bj()) {
            if ($$0 != null && $$0.dC() > this.l.dC() || this.l.cb) {
               this.l.h(this.l.dy().b(0.0, 0.002, 0.0));
            }

            if (this.k != cbi.a.b || this.l.L().m()) {
               this.l.C(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(azm.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.b(this.l.dL(), $$5, 90.0F));
            this.l.aW = this.l.dL();
            float $$6 = (float)(this.h * this.l.h(bwp.v));
            float $$7 = azm.h(0.125F, this.l.fn(), $$6);
            this.l.C($$7);
            this.l.h(this.l.dy().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aJ()) {
               this.l.h(this.l.dy().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends ccf {
      private final clm a;
      private final double b;
      private final int c;
      private boolean d;

      public e(clm $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean b() {
         return !this.a.dV().T() && this.a.bj() && this.a.dC() < (double)(this.c - 2);
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dC() < (double)(this.c - 1) && (this.a.L().m() || this.a.gp())) {
            ezy $$0 = cgc.a(this.a, 4, 8, new ezy(this.a.dA(), (double)(this.c - 1), this.a.dG()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.L().a($$0.d, $$0.e, $$0.f, this.b);
         }
      }

      @Override
      public void d() {
         this.a.x(true);
         this.d = false;
      }

      @Override
      public void e() {
         this.a.x(false);
      }
   }

   static class f extends cde {
      private final clm a;

      public f(cmc $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (clm)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.eX().a(cwq.wk);
      }

      @Override
      public void d() {
         super.d();
         this.a.w(true);
         this.a.c(bsj.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fD();
         this.a.w(false);
      }
   }
}
