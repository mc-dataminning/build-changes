import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmc extends cnh implements cms {
   public static final float a = 0.03F;
   boolean cc;
   protected final cfl b;
   protected final cfi c;

   public cmc(bvi<? extends cmc> $$0, dgz $$1) {
      super($$0, $$1);
      this.bQ = new cmc.d(this);
      this.a(euh.j, 0.0F);
      this.b = new cfl(this, $$1);
      this.c = new cfi(this, $$1);
   }

   public static bxe.a m() {
      return cnh.gr().a(bxf.B, 1.0);
   }

   @Override
   protected void p() {
      this.bT.a(1, new cmc.c(this, 1.0));
      this.bT.a(2, new cmc.f(this, 1.0, 40, 10.0F));
      this.bT.a(2, new cmc.a(this, 1.0, false));
      this.bT.a(5, new cmc.b(this, 1.0));
      this.bT.a(6, new cmc.e(this, 1.0, this.dW().P()));
      this.bT.a(7, new cds(this, 1.0));
      this.bU.a(1, new cen(this, cmc.class).a(cnj.class));
      this.bU.a(2, new ceo<>(this, cpo.class, 10, true, false, ($$0, $$1) -> this.j($$0)));
      this.bU.a(3, new ceo<>(this, cov.class, false));
      this.bU.a(3, new ceo<>(this, cia.class, true));
      this.bU.a(3, new ceo<>(this, cja.class, true, false));
      this.bU.a(5, new ceo<>(this, cip.class, 10, true, false, cip.bZ));
   }

   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bvj.b).f() && $$0.H_().i() < 0.03F) {
         this.a(bvj.b, new cxg(cxk.wT));
         this.g(bvj.b);
      }

      return $$3;
   }

   public static boolean a(bvi<cmc> $$0, dhq $$1, bvh $$2, jh $$3, bac $$4) {
      if (!$$1.b_($$3.e()).a(axq.a) && !bvh.a($$2)) {
         return false;
      } else {
         jq<dib> $$5 = $$1.t($$3);
         boolean $$6 = $$1.am() != bsx.a && (bvh.b($$2) || a($$1, $$3, $$4)) && (bvh.a($$2) || $$1.b_($$3).a(axq.a));
         if (!$$6 || !bvh.a($$2) && $$2 != bvh.j) {
            return $$5.a(axj.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         } else {
            return true;
         }
      }
   }

   private static boolean a(dha $$0, jh $$1) {
      return $$1.v() < $$0.P() - 5;
   }

   @Override
   protected awu u() {
      return this.bj() ? awv.hZ : awv.hY;
   }

   @Override
   protected awu e(btr $$0) {
      return this.bj() ? awv.id : awv.ic;
   }

   @Override
   protected awu o_() {
      return this.bj() ? awv.ib : awv.ia;
   }

   @Override
   protected awu t() {
      return awv.if;
   }

   @Override
   protected awu aV() {
      return awv.ig;
   }

   @Override
   protected boolean x() {
      return true;
   }

   @Override
   protected cxg go() {
      return cxg.j;
   }

   @Override
   protected void a(bac $$0, bsy $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bvj.a, new cxg(cxk.wS));
         } else {
            this.a(bvj.a, new cxg(cxk.rS));
         }
      }
   }

   @Override
   protected boolean a(cxg $$0, cxg $$1, bvj $$2) {
      if ($$1.a(cxk.wT)) {
         return false;
      } else if ($$1.a(cxk.wS)) {
         return $$0.a(cxk.wS) ? $$0.o() < $$1.o() : false;
      } else {
         return $$0.a(cxk.wS) ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   public boolean a(dhc $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bvx $$0) {
      return $$0 != null ? !this.dW().V() || $$0.bj() : false;
   }

   @Override
   public boolean cJ() {
      return !this.ck();
   }

   boolean gx() {
      if (this.cc) {
         return true;
      } else {
         bvx $$0 = this.O_();
         return $$0 != null && $$0.bj();
      }
   }

   @Override
   public void a_(fbr $$0) {
      if (this.di() && this.bo() && this.gx()) {
         this.a(0.01F, $$0);
         this.a(bwb.a, this.dz());
         this.h(this.dz().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void bp() {
      if (!this.dW().C) {
         if (this.dk() && this.bo() && this.gx()) {
            this.bS = this.b;
            this.i(true);
         } else {
            this.bS = this.c;
            this.i(false);
         }
      }
   }

   @Override
   public boolean cl() {
      return this.ck();
   }

   protected boolean gq() {
      eue $$0 = this.L().k();
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
   public void a(bvx $$0, float $$1) {
      cxg $$2 = this.eZ();
      cxg $$3 = $$2.a(cxk.wS) ? $$2 : new cxg(cxk.wS);
      cqu $$4 = new cqu(this.dW(), this, $$3);
      double $$5 = $$0.dB() - this.dB();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dD();
      double $$7 = $$0.dH() - this.dH();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dW() instanceof arx $$9) {
         cqh.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dW().am().a() * 4));
      }

      this.a(awv.ie, 1.0F, 1.0F / (this.dZ().i() * 0.4F + 0.8F));
   }

   public void x(boolean $$0) {
      this.cc = $$0;
   }

   static class a extends cek {
      private final cmc b;

      public a(cmc $$0, double $$1, boolean $$2) {
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

   static class b extends cdi {
      private final cmc g;

      public b(cmc $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.g.dW().V() && this.g.bj() && this.g.dD() >= (double)(this.g.dW().P() - 3);
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(dhc $$0, jh $$1) {
         jh $$2 = $$1.d();
         return $$0.u($$2) && $$0.u($$2.d()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void d() {
         this.g.x(false);
         this.g.bS = this.g.c;
         super.d();
      }

      @Override
      public void e() {
         super.e();
      }
   }

   static class c extends ccv {
      private final bwf a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dgz f;

      public c(bwf $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dW();
         this.a(EnumSet.of(ccv.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.V()) {
            return false;
         } else if (this.a.bj()) {
            return false;
         } else {
            fbr $$0 = this.h();
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
      private fbr h() {
         bac $$0 = this.a.dZ();
         jh $$1 = this.a.dw();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            jh $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dkf.J)) {
               return fbr.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends cby {
      private final cmc l;

      public d(cmc $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bvx $$0 = this.l.O_();
         if (this.l.gx() && this.l.bj()) {
            if ($$0 != null && $$0.dD() > this.l.dD() || this.l.cc) {
               this.l.h(this.l.dz().b(0.0, 0.002, 0.0));
            }

            if (this.k != cby.a.b || this.l.L().m()) {
               this.l.C(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dB();
            double $$2 = this.f - this.l.dD();
            double $$3 = this.g - this.l.dH();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(azu.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.b(this.l.dM(), $$5, 90.0F));
            this.l.aX = this.l.dM();
            float $$6 = (float)(this.h * this.l.h(bxf.v));
            float $$7 = azu.h(0.125F, this.l.fp(), $$6);
            this.l.C($$7);
            this.l.h(this.l.dz().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aJ()) {
               this.l.h(this.l.dz().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends ccv {
      private final cmc a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cmc $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean b() {
         return !this.a.dW().V() && this.a.bj() && this.a.dD() < (double)(this.c - 2);
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dD() < (double)(this.c - 1) && (this.a.L().m() || this.a.gq())) {
            fbr $$0 = cgs.a(this.a, 4, 8, new fbr(this.a.dB(), (double)(this.c - 1), this.a.dH()), (float) (Math.PI / 2));
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

   static class f extends cdu {
      private final cmc a;

      public f(cms $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cmc)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.eZ().a(cxk.wS);
      }

      @Override
      public void d() {
         super.d();
         this.a.w(true);
         this.a.c(bsz.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fF();
         this.a.w(false);
      }
   }
}
