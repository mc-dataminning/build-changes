import java.util.EnumSet;
import javax.annotation.Nullable;

public class cob extends cph implements cos {
   public static final float a = 0.03F;
   boolean bJ;
   protected final cgv b;
   protected final cgs c;

   public cob(bwr<? extends cob> $$0, djm $$1) {
      super($$0, $$1);
      this.bA = new cob.d(this);
      this.a(exr.j, 0.0F);
      this.b = new cgv(this, $$1);
      this.c = new cgs(this, $$1);
   }

   public static byo.a j() {
      return cph.gu().a(byp.B, 1.0);
   }

   @Override
   protected void m() {
      this.bD.a(1, new cob.c(this, 1.0));
      this.bD.a(2, new cob.f(this, 1.0, 40, 10.0F));
      this.bD.a(2, new cob.a(this, 1.0, false));
      this.bD.a(5, new cob.b(this, 1.0));
      this.bD.a(6, new cob.e(this, 1.0, this.dU().P()));
      this.bD.a(7, new cfc(this, 1.0));
      this.bE.a(1, new cfx(this, cob.class).a(cpj.class));
      this.bE.a(2, new cfy<>(this, crm.class, 10, true, false, ($$0, $$1) -> this.i($$0)));
      this.bE.a(3, new cfy<>(this, cqt.class, false));
      this.bE.a(3, new cfy<>(this, cjp.class, true));
      this.bE.a(3, new cfy<>(this, cko.class, true, false));
      this.bE.a(5, new cfy<>(this, ckg.class, 10, true, false, ckg.bG));
   }

   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bws.b).f() && $$0.C_().i() < 0.03F) {
         this.a(bws.b, new czn(czr.xe));
         this.g(bws.b);
      }

      return $$3;
   }

   public static boolean a(bwr<cob> $$0, dkd $$1, bwq $$2, iv $$3, azv $$4) {
      if (!$$1.b_($$3.e()).a(axh.a) && !bwq.a($$2)) {
         return false;
      } else {
         jf<dkp> $$5 = $$1.u($$3);
         boolean $$6 = $$1.an() != bud.a && (bwq.b($$2) || a($$1, $$3, $$4)) && (bwq.a($$2) || $$1.b_($$3).a(axh.a));
         if (!$$6 || !bwq.a($$2) && $$2 != bwq.j) {
            return $$5.a(axb.ar) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         } else {
            return true;
         }
      }
   }

   private static boolean a(djn $$0, iv $$1) {
      return $$1.v() < $$0.P() - 5;
   }

   @Override
   protected awm u() {
      return this.bh() ? awn.ic : awn.ib;
   }

   @Override
   protected awm e(bux $$0) {
      return this.bh() ? awn.ig : awn.if;
   }

   @Override
   protected awm l_() {
      return this.bh() ? awn.ie : awn.id;
   }

   @Override
   protected awm n() {
      return awn.ii;
   }

   @Override
   protected awm aT() {
      return awn.ij;
   }

   @Override
   protected boolean q() {
      return true;
   }

   @Override
   protected czn t() {
      return czn.k;
   }

   @Override
   protected void a(azv $$0, bue $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bws.a, new czn(czr.xd));
         } else {
            this.a(bws.a, new czn(czr.sd));
         }
      }
   }

   @Override
   protected boolean a(czn $$0, czn $$1, bws $$2) {
      return $$1.a(czr.xe) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   public boolean a(djp $$0) {
      return $$0.f(this);
   }

   public boolean i(@Nullable bxj $$0) {
      return $$0 != null ? !this.dU().V() || $$0.bh() : false;
   }

   @Override
   public boolean cI() {
      return !this.ci();
   }

   boolean gA() {
      if (this.bJ) {
         return true;
      } else {
         bxj $$0 = this.f();
         return $$0 != null && $$0.bh();
      }
   }

   @Override
   public void a_(ffc $$0) {
      if (this.bl() && this.gA()) {
         this.a(0.01F, $$0);
         this.a(bxn.a, this.dx());
         this.i(this.dx().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void bm() {
      if (!this.dU().C) {
         if (this.di() && this.bl() && this.gA()) {
            this.bC = this.b;
            this.i(true);
         } else {
            this.bC = this.c;
            this.i(false);
         }
      }
   }

   @Override
   public boolean cj() {
      return this.ci();
   }

   protected boolean gt() {
      exo $$0 = this.O().i();
      if ($$0 != null) {
         iv $$1 = $$0.l();
         if ($$1 != null) {
            double $$2 = this.h((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            if ($$2 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(bxj $$0, float $$1) {
      czn $$2 = this.fa();
      czn $$3 = $$2.a(czr.xd) ? $$2 : new czn(czr.xd);
      csv $$4 = new csv(this.dU(), this, $$3);
      double $$5 = $$0.dz() - this.dz();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dB();
      double $$7 = $$0.dF() - this.dF();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dU() instanceof arq $$9) {
         csh.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dU().an().a() * 4));
      }

      this.a(awn.ih, 1.0F, 1.0F / (this.dX().i() * 0.4F + 0.8F));
   }

   @Override
   public axr<czj> Y() {
      return axk.bU;
   }

   public void w(boolean $$0) {
      this.bJ = $$0;
   }

   static class a extends cfu {
      private final cob b;

      public a(cob $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b.i(this.b.f());
      }

      @Override
      public boolean c() {
         return super.c() && this.b.i(this.b.f());
      }
   }

   static class b extends ces {
      private final cob g;

      public b(cob $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.g.dU().V() && this.g.bh() && this.g.dB() >= (double)(this.g.dU().P() - 3);
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(djp $$0, iv $$1) {
         iv $$2 = $$1.d();
         return $$0.v($$2) && $$0.v($$2.d()) ? $$0.a_($$1).b($$0, $$1, this.g) : false;
      }

      @Override
      public void d() {
         this.g.w(false);
         this.g.bC = this.g.c;
         super.d();
      }

      @Override
      public void e() {
         super.e();
      }
   }

   static class c extends cef {
      private final bxr a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final djm f;

      public c(bxr $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dU();
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.V()) {
            return false;
         } else if (this.a.bh()) {
            return false;
         } else {
            ffc $$0 = this.h();
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
         return !this.a.O().k();
      }

      @Override
      public void d() {
         this.a.O().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private ffc h() {
         azv $$0 = this.a.dX();
         iv $$1 = this.a.du();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            iv $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dmt.J)) {
               return ffc.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends cdi {
      private final cob l;

      public d(cob $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bxj $$0 = this.l.f();
         if (this.l.gA() && this.l.bh()) {
            if ($$0 != null && $$0.dB() > this.l.dB() || this.l.bJ) {
               this.l.i(this.l.dx().b(0.0, 0.002, 0.0));
            }

            if (this.k != cdi.a.b || this.l.O().k()) {
               this.l.B(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dz();
            double $$2 = this.f - this.l.dB();
            double $$3 = this.g - this.l.dF();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(azm.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.w(this.b(this.l.dK(), $$5, 90.0F));
            this.l.aV = this.l.dK();
            float $$6 = (float)(this.h * this.l.h(byp.v));
            float $$7 = azm.h(0.125F, this.l.fn(), $$6);
            this.l.B($$7);
            this.l.i(this.l.dx().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aH()) {
               this.l.i(this.l.dx().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends cef {
      private final cob a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cob $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean b() {
         return !this.a.dU().V() && this.a.bh() && this.a.dB() < (double)(this.c - 2);
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dB() < (double)(this.c - 1) && (this.a.O().k() || this.a.gt())) {
            ffc $$0 = cic.a(this.a, 4, 8, new ffc(this.a.dz(), (double)(this.c - 1), this.a.dF()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.O().a($$0.d, $$0.e, $$0.f, this.b);
         }
      }

      @Override
      public void d() {
         this.a.w(true);
         this.d = false;
      }

      @Override
      public void e() {
         this.a.w(false);
      }
   }

   static class f extends cfe {
      private final cob a;

      public f(cos $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cob)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.fa().a(czr.xd);
      }

      @Override
      public void d() {
         super.d();
         this.a.v(true);
         this.a.c(buf.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fE();
         this.a.v(false);
      }
   }
}
