import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmg extends cnl implements cmw {
   public static final float a = 0.03F;
   boolean bI;
   protected final cfm b;
   protected final cfj c;

   public cmg(bvi<? extends cmg> $$0, dgz $$1) {
      super($$0, $$1);
      this.bz = new cmg.d(this);
      this.a(eun.j, 0.0F);
      this.b = new cfm(this, $$1);
      this.c = new cfj(this, $$1);
   }

   public static bxf.a j() {
      return cnl.gt().a(bxg.B, 1.0);
   }

   @Override
   protected void m() {
      this.bC.a(1, new cmg.c(this, 1.0));
      this.bC.a(2, new cmg.f(this, 1.0, 40, 10.0F));
      this.bC.a(2, new cmg.a(this, 1.0, false));
      this.bC.a(5, new cmg.b(this, 1.0));
      this.bC.a(6, new cmg.e(this, 1.0, this.dU().P()));
      this.bC.a(7, new cdt(this, 1.0));
      this.bD.a(1, new ceo(this, cmg.class).a(cnn.class));
      this.bD.a(2, new cep<>(this, cpr.class, 10, true, false, ($$0, $$1) -> this.j($$0)));
      this.bD.a(3, new cep<>(this, coy.class, false));
      this.bD.a(3, new cep<>(this, cib.class, true));
      this.bD.a(3, new cep<>(this, cje.class, true, false));
      this.bD.a(5, new cep<>(this, cit.class, 10, true, false, cit.bF));
   }

   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bvj.b).f() && $$0.C_().i() < 0.03F) {
         this.a(bvj.b, new cxh(cxl.wV));
         this.g(bvj.b);
      }

      return $$3;
   }

   public static boolean a(bvi<cmg> $$0, dhq $$1, bvh $$2, ji $$3, azh $$4) {
      if (!$$1.b_($$3.e()).a(awv.a) && !bvh.a($$2)) {
         return false;
      } else {
         jr<dic> $$5 = $$1.t($$3);
         boolean $$6 = $$1.an() != bsv.a && (bvh.b($$2) || a($$1, $$3, $$4)) && (bvh.a($$2) || $$1.b_($$3).a(awv.a));
         if (!$$6 || !bvh.a($$2) && $$2 != bvh.j) {
            return $$5.a(awo.ar) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         } else {
            return true;
         }
      }
   }

   private static boolean a(dha $$0, ji $$1) {
      return $$1.v() < $$0.P() - 5;
   }

   @Override
   protected avz u() {
      return this.bj() ? awa.hZ : awa.hY;
   }

   @Override
   protected avz e(btp $$0) {
      return this.bj() ? awa.id : awa.ic;
   }

   @Override
   protected avz l_() {
      return this.bj() ? awa.ib : awa.ia;
   }

   @Override
   protected avz n() {
      return awa.if;
   }

   @Override
   protected avz aV() {
      return awa.ig;
   }

   @Override
   protected boolean q() {
      return true;
   }

   @Override
   protected cxh t() {
      return cxh.k;
   }

   @Override
   protected void a(azh $$0, bsw $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bvj.a, new cxh(cxl.wU));
         } else {
            this.a(bvj.a, new cxh(cxl.rU));
         }
      }
   }

   @Override
   protected boolean a(cxh $$0, cxh $$1, bvj $$2) {
      return $$1.a(cxl.wV) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   public boolean a(dhc $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bvy $$0) {
      return $$0 != null ? !this.dU().V() || $$0.bj() : false;
   }

   @Override
   public boolean cI() {
      return !this.cj();
   }

   boolean gz() {
      if (this.bI) {
         return true;
      } else {
         bvy $$0 = this.f();
         return $$0 != null && $$0.bj();
      }
   }

   @Override
   public void a_(fbx $$0) {
      if (this.bm() && this.gz()) {
         this.a(0.01F, $$0);
         this.a(bwc.a, this.dx());
         this.i(this.dx().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void bn() {
      if (!this.dU().C) {
         if (this.di() && this.bm() && this.gz()) {
            this.bB = this.b;
            this.i(true);
         } else {
            this.bB = this.c;
            this.i(false);
         }
      }
   }

   @Override
   public boolean ck() {
      return this.cj();
   }

   protected boolean gs() {
      euk $$0 = this.O().i();
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
   public void a(bvy $$0, float $$1) {
      cxh $$2 = this.eZ();
      cxh $$3 = $$2.a(cxl.wU) ? $$2 : new cxh(cxl.wU);
      cqx $$4 = new cqx(this.dU(), this, $$3);
      double $$5 = $$0.dz() - this.dz();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dB();
      double $$7 = $$0.dF() - this.dF();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dU() instanceof ard $$9) {
         cqk.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dU().an().a() * 4));
      }

      this.a(awa.ie, 1.0F, 1.0F / (this.dX().i() * 0.4F + 0.8F));
   }

   @Override
   public axf<cxd> Y() {
      return awy.bT;
   }

   public void w(boolean $$0) {
      this.bI = $$0;
   }

   static class a extends cel {
      private final cmg b;

      public a(cmg $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.f());
      }

      @Override
      public boolean c() {
         return super.c() && this.b.j(this.b.f());
      }
   }

   static class b extends cdj {
      private final cmg g;

      public b(cmg $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.g.dU().V() && this.g.bj() && this.g.dB() >= (double)(this.g.dU().P() - 3);
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(dhc $$0, ji $$1) {
         ji $$2 = $$1.d();
         return $$0.u($$2) && $$0.u($$2.d()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void d() {
         this.g.w(false);
         this.g.bB = this.g.c;
         super.d();
      }

      @Override
      public void e() {
         super.e();
      }
   }

   static class c extends ccw {
      private final bwg a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dgz f;

      public c(bwg $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dU();
         this.a(EnumSet.of(ccw.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.V()) {
            return false;
         } else if (this.a.bj()) {
            return false;
         } else {
            fbx $$0 = this.h();
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
      private fbx h() {
         azh $$0 = this.a.dX();
         ji $$1 = this.a.du();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            ji $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dkg.J)) {
               return fbx.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends cbz {
      private final cmg l;

      public d(cmg $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bvy $$0 = this.l.f();
         if (this.l.gz() && this.l.bj()) {
            if ($$0 != null && $$0.dB() > this.l.dB() || this.l.bI) {
               this.l.i(this.l.dx().b(0.0, 0.002, 0.0));
            }

            if (this.k != cbz.a.b || this.l.O().k()) {
               this.l.C(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dz();
            double $$2 = this.f - this.l.dB();
            double $$3 = this.g - this.l.dF();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(ayz.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.w(this.b(this.l.dK(), $$5, 90.0F));
            this.l.aV = this.l.dK();
            float $$6 = (float)(this.h * this.l.h(bxg.v));
            float $$7 = ayz.h(0.125F, this.l.fq(), $$6);
            this.l.C($$7);
            this.l.i(this.l.dx().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aJ()) {
               this.l.i(this.l.dx().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends ccw {
      private final cmg a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cmg $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean b() {
         return !this.a.dU().V() && this.a.bj() && this.a.dB() < (double)(this.c - 2);
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dB() < (double)(this.c - 1) && (this.a.O().k() || this.a.gs())) {
            fbx $$0 = cgt.a(this.a, 4, 8, new fbx(this.a.dz(), (double)(this.c - 1), this.a.dF()), (float) (Math.PI / 2));
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

   static class f extends cdv {
      private final cmg a;

      public f(cmw $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cmg)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.eZ().a(cxl.wU);
      }

      @Override
      public void d() {
         super.d();
         this.a.v(true);
         this.a.c(bsx.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fH();
         this.a.v(false);
      }
   }
}
