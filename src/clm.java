import java.util.EnumSet;
import javax.annotation.Nullable;

public class clm extends cmr implements cmc {
   public static final float a = 0.03F;
   boolean cb;
   protected final cev b;
   protected final ces c;

   public clm(bus<? extends clm> $$0, dgi $$1) {
      super($$0, $$1);
      this.bP = new clm.d(this);
      this.a(etq.j, 0.0F);
      this.b = new cev(this, $$1);
      this.c = new ces(this, $$1);
   }

   public static bwo.a m() {
      return cmr.gv().a(bwp.B, 1.0);
   }

   @Override
   protected void p() {
      this.bS.a(1, new clm.c(this, 1.0));
      this.bS.a(2, new clm.f(this, 1.0, 40, 10.0F));
      this.bS.a(2, new clm.a(this, 1.0, false));
      this.bS.a(5, new clm.b(this, 1.0));
      this.bS.a(6, new clm.e(this, 1.0, this.dV().P()));
      this.bS.a(7, new cdc(this, 1.0));
      this.bT.a(1, new cdx(this, clm.class).a(cmt.class));
      this.bT.a(2, new cdy<>(this, cox.class, 10, true, false, ($$0, $$1) -> this.j($$0)));
      this.bT.a(3, new cdy<>(this, cod.class, false));
      this.bT.a(3, new cdy<>(this, chk.class, true));
      this.bT.a(3, new cdy<>(this, cik.class, true, false));
      this.bT.a(5, new cdy<>(this, chz.class, 10, true, false, chz.bY));
   }

   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(but.b).f() && $$0.H_().i() < 0.03F) {
         this.a(but.b, new cwp(cwt.wT));
         this.g(but.b);
      }

      return $$3;
   }

   public static boolean a(bus<clm> $$0, dgz $$1, bur $$2, ji $$3, azh $$4) {
      if (!$$1.b_($$3.e()).a(awv.a) && !bur.a($$2)) {
         return false;
      } else {
         jr<dhk> $$5 = $$1.t($$3);
         boolean $$6 = $$1.am() != bsh.a && (bur.b($$2) || a($$1, $$3, $$4)) && (bur.a($$2) || $$1.b_($$3).a(awv.a));
         if (!$$6 || !bur.a($$2) && $$2 != bur.j) {
            return $$5.a(awo.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         } else {
            return true;
         }
      }
   }

   private static boolean a(dgj $$0, ji $$1) {
      return $$1.v() < $$0.P() - 5;
   }

   @Override
   protected avz u() {
      return this.bj() ? awa.hZ : awa.hY;
   }

   @Override
   protected avz e(btb $$0) {
      return this.bj() ? awa.id : awa.ic;
   }

   @Override
   protected avz o_() {
      return this.bj() ? awa.ib : awa.ia;
   }

   @Override
   protected avz t() {
      return awa.if;
   }

   @Override
   protected avz aV() {
      return awa.ig;
   }

   @Override
   protected boolean x() {
      return true;
   }

   @Override
   protected cwp gs() {
      return cwp.j;
   }

   @Override
   protected void a(azh $$0, bsi $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(but.a, new cwp(cwt.wS));
         } else {
            this.a(but.a, new cwp(cwt.rS));
         }
      }
   }

   @Override
   protected boolean a(cwp $$0, cwp $$1, but $$2) {
      return $$1.a(cwt.wT) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean gt() {
      return false;
   }

   @Override
   public boolean a(dgl $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bvh $$0) {
      return $$0 != null ? !this.dV().V() || $$0.bj() : false;
   }

   @Override
   public boolean cJ() {
      return !this.ck();
   }

   boolean gB() {
      if (this.cb) {
         return true;
      } else {
         bvh $$0 = this.O_();
         return $$0 != null && $$0.bj();
      }
   }

   @Override
   public void a_(fba $$0) {
      if (this.dh() && this.bo() && this.gB()) {
         this.a(0.01F, $$0);
         this.a(bvl.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void bp() {
      if (!this.dV().C) {
         if (this.dj() && this.bo() && this.gB()) {
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

   protected boolean gu() {
      etn $$0 = this.P().i();
      if ($$0 != null) {
         ji $$1 = $$0.l();
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
      cwp $$2 = this.eZ();
      cwp $$3 = $$2.a(cwt.wS) ? $$2 : new cwp(cwt.wS);
      cqd $$4 = new cqd(this.dV(), this, $$3);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof ard $$9) {
         cpq.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dV().am().a() * 4));
      }

      this.a(awa.ie, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public axf<cwl> Z() {
      return awy.bS;
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
         return super.b() && this.b.j(this.b.O_());
      }

      @Override
      public boolean c() {
         return super.c() && this.b.j(this.b.O_());
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
         return super.b() && !this.g.dV().V() && this.g.bj() && this.g.dC() >= (double)(this.g.dV().P() - 3);
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(dgl $$0, ji $$1) {
         ji $$2 = $$1.d();
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
      private final dgi f;

      public c(bvp $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dV();
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.V()) {
            return false;
         } else if (this.a.bj()) {
            return false;
         } else {
            fba $$0 = this.h();
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
         return !this.a.P().k();
      }

      @Override
      public void d() {
         this.a.P().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private fba h() {
         azh $$0 = this.a.dY();
         ji $$1 = this.a.dv();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            ji $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(djo.J)) {
               return fba.c($$3);
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
         bvh $$0 = this.l.O_();
         if (this.l.gB() && this.l.bj()) {
            if ($$0 != null && $$0.dC() > this.l.dC() || this.l.cb) {
               this.l.i(this.l.dy().b(0.0, 0.002, 0.0));
            }

            if (this.k != cbi.a.b || this.l.P().k()) {
               this.l.C(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(ayz.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.b(this.l.dL(), $$5, 90.0F));
            this.l.aX = this.l.dL();
            float $$6 = (float)(this.h * this.l.h(bwp.v));
            float $$7 = ayz.h(0.125F, this.l.fp(), $$6);
            this.l.C($$7);
            this.l.i(this.l.dy().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aJ()) {
               this.l.i(this.l.dy().b(0.0, -0.008, 0.0));
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
         return !this.a.dV().V() && this.a.bj() && this.a.dC() < (double)(this.c - 2);
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dC() < (double)(this.c - 1) && (this.a.P().k() || this.a.gu())) {
            fba $$0 = cgc.a(this.a, 4, 8, new fba(this.a.dA(), (double)(this.c - 1), this.a.dG()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.P().a($$0.d, $$0.e, $$0.f, this.b);
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
         return super.b() && this.a.eZ().a(cwt.wS);
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
         this.a.fF();
         this.a.w(false);
      }
   }
}
