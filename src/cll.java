import java.util.EnumSet;
import javax.annotation.Nullable;

public class cll extends cmq implements cmb {
   public static final float a = 0.03F;
   boolean cb;
   protected final ceu b;
   protected final cer c;

   public cll(bur<? extends cll> $$0, dgi $$1) {
      super($$0, $$1);
      this.bP = new cll.d(this);
      this.a(etq.j, 0.0F);
      this.b = new ceu(this, $$1);
      this.c = new cer(this, $$1);
   }

   public static bwn.a m() {
      return cmq.gs().a(bwo.B, 1.0);
   }

   @Override
   protected void p() {
      this.bS.a(1, new cll.c(this, 1.0));
      this.bS.a(2, new cll.f(this, 1.0, 40, 10.0F));
      this.bS.a(2, new cll.a(this, 1.0, false));
      this.bS.a(5, new cll.b(this, 1.0));
      this.bS.a(6, new cll.e(this, 1.0, this.dW().P()));
      this.bS.a(7, new cdb(this, 1.0));
      this.bT.a(1, new cdw(this, cll.class).a(cms.class));
      this.bT.a(2, new cdx<>(this, cox.class, 10, true, false, ($$0, $$1) -> this.j($$0)));
      this.bT.a(3, new cdx<>(this, cod.class, false));
      this.bT.a(3, new cdx<>(this, chj.class, true));
      this.bT.a(3, new cdx<>(this, cij.class, true, false));
      this.bT.a(5, new cdx<>(this, chy.class, 10, true, false, chy.bY));
   }

   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bus.b).f() && $$0.H_().i() < 0.03F) {
         this.a(bus.b, new cwp(cwt.wT));
         this.g(bus.b);
      }

      return $$3;
   }

   public static boolean a(bur<cll> $$0, dgz $$1, buq $$2, ji $$3, azh $$4) {
      if (!$$1.b_($$3.e()).a(awv.a) && !buq.a($$2)) {
         return false;
      } else {
         jr<dhk> $$5 = $$1.t($$3);
         boolean $$6 = $$1.am() != bsg.a && (buq.b($$2) || a($$1, $$3, $$4)) && (buq.a($$2) || $$1.b_($$3).a(awv.a));
         if (!$$6 || !buq.a($$2) && $$2 != buq.j) {
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
   protected avz e(bta $$0) {
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
   protected cwp gp() {
      return cwp.j;
   }

   @Override
   protected void a(azh $$0, bsh $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bus.a, new cwp(cwt.wS));
         } else {
            this.a(bus.a, new cwp(cwt.rS));
         }
      }
   }

   @Override
   protected boolean a(cwp $$0, cwp $$1, bus $$2) {
      return $$1.a(cwt.wT) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean gq() {
      return false;
   }

   @Override
   public boolean a(dgl $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bvg $$0) {
      return $$0 != null ? !this.dW().V() || $$0.bj() : false;
   }

   @Override
   public boolean cJ() {
      return !this.ck();
   }

   boolean gy() {
      if (this.cb) {
         return true;
      } else {
         bvg $$0 = this.O_();
         return $$0 != null && $$0.bj();
      }
   }

   @Override
   public void a_(fba $$0) {
      if (this.di() && this.bo() && this.gy()) {
         this.a(0.01F, $$0);
         this.a(bvk.a, this.dz());
         this.h(this.dz().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void bp() {
      if (!this.dW().C) {
         if (this.dk() && this.bo() && this.gy()) {
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

   protected boolean gr() {
      etn $$0 = this.L().i();
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
   public void a(bvg $$0, float $$1) {
      cwp $$2 = this.eZ();
      cwp $$3 = $$2.a(cwt.wS) ? $$2 : new cwp(cwt.wS);
      cqd $$4 = new cqd(this.dW(), this, $$3);
      double $$5 = $$0.dB() - this.dB();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dD();
      double $$7 = $$0.dH() - this.dH();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dW() instanceof arc $$9) {
         cpq.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dW().am().a() * 4));
      }

      this.a(awa.ie, 1.0F, 1.0F / (this.dZ().i() * 0.4F + 0.8F));
   }

   @Override
   public axf<cwl> W() {
      return awy.bT;
   }

   public void x(boolean $$0) {
      this.cb = $$0;
   }

   static class a extends cdt {
      private final cll b;

      public a(cll $$0, double $$1, boolean $$2) {
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

   static class b extends ccr {
      private final cll g;

      public b(cll $$0, double $$1) {
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

   static class c extends cce {
      private final bvo a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dgi f;

      public c(bvo $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dW();
         this.a(EnumSet.of(cce.a.a));
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
         return !this.a.L().k();
      }

      @Override
      public void d() {
         this.a.L().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private fba h() {
         azh $$0 = this.a.dZ();
         ji $$1 = this.a.dw();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            ji $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(djo.J)) {
               return fba.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends cbh {
      private final cll l;

      public d(cll $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bvg $$0 = this.l.O_();
         if (this.l.gy() && this.l.bj()) {
            if ($$0 != null && $$0.dD() > this.l.dD() || this.l.cb) {
               this.l.h(this.l.dz().b(0.0, 0.002, 0.0));
            }

            if (this.k != cbh.a.b || this.l.L().k()) {
               this.l.C(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dB();
            double $$2 = this.f - this.l.dD();
            double $$3 = this.g - this.l.dH();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(ayz.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.b(this.l.dM(), $$5, 90.0F));
            this.l.aX = this.l.dM();
            float $$6 = (float)(this.h * this.l.h(bwo.v));
            float $$7 = ayz.h(0.125F, this.l.fp(), $$6);
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

   static class e extends cce {
      private final cll a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cll $$0, double $$1, int $$2) {
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
         if (this.a.dD() < (double)(this.c - 1) && (this.a.L().k() || this.a.gr())) {
            fba $$0 = cgb.a(this.a, 4, 8, new fba(this.a.dB(), (double)(this.c - 1), this.a.dH()), (float) (Math.PI / 2));
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

   static class f extends cdd {
      private final cll a;

      public f(cmb $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cll)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.eZ().a(cwt.wS);
      }

      @Override
      public void d() {
         super.d();
         this.a.w(true);
         this.a.c(bsi.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fF();
         this.a.w(false);
      }
   }
}
