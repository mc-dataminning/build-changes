import java.util.EnumSet;
import javax.annotation.Nullable;

public class cml extends cnq implements cnb {
   public static final float a = 0.03F;
   boolean cc;
   protected final cfu b;
   protected final cfr c;

   public cml(bvr<? extends cml> $$0, dhi $$1) {
      super($$0, $$1);
      this.bQ = new cml.d(this);
      this.a(euo.j, 0.0F);
      this.b = new cfu(this, $$1);
      this.c = new cfr(this, $$1);
   }

   public static bxn.a m() {
      return cnq.gr().a(bxo.B, 1.0);
   }

   @Override
   protected void p() {
      this.bT.a(1, new cml.c(this, 1.0));
      this.bT.a(2, new cml.f(this, 1.0, 40, 10.0F));
      this.bT.a(2, new cml.a(this, 1.0, false));
      this.bT.a(5, new cml.b(this, 1.0));
      this.bT.a(6, new cml.e(this, 1.0, this.dW().O()));
      this.bT.a(7, new ceb(this, 1.0));
      this.bU.a(1, new cew(this, cml.class).a(cns.class));
      this.bU.a(2, new cex<>(this, cpx.class, 10, true, false, ($$0, $$1) -> this.j($$0)));
      this.bU.a(3, new cex<>(this, cpe.class, false));
      this.bU.a(3, new cex<>(this, cij.class, true));
      this.bU.a(3, new cex<>(this, cjj.class, true, false));
      this.bU.a(5, new cex<>(this, ciy.class, 10, true, false, ciy.bZ));
   }

   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bvs.b).f() && $$0.H_().i() < 0.03F) {
         this.a(bvs.b, new cxp(cxt.wJ));
         this.g(bvs.b);
      }

      return $$3;
   }

   public static boolean a(bvr<cml> $$0, dhz $$1, bvq $$2, jh $$3, bam $$4) {
      if (!$$1.b_($$3.e()).a(aya.a) && !bvq.a($$2)) {
         return false;
      } else {
         jq<dik> $$5 = $$1.t($$3);
         boolean $$6 = $$1.al() != btg.a && (bvq.b($$2) || a($$1, $$3, $$4)) && (bvq.a($$2) || $$1.b_($$3).a(aya.a));
         if (!$$6 || !bvq.a($$2) && $$2 != bvq.j) {
            return $$5.a(axt.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         } else {
            return true;
         }
      }
   }

   private static boolean a(dhj $$0, jh $$1) {
      return $$1.v() < $$0.O() - 5;
   }

   @Override
   protected axe u() {
      return this.bj() ? axf.hY : axf.hX;
   }

   @Override
   protected axe e(bua $$0) {
      return this.bj() ? axf.ic : axf.ib;
   }

   @Override
   protected axe o_() {
      return this.bj() ? axf.ia : axf.hZ;
   }

   @Override
   protected axe t() {
      return axf.ie;
   }

   @Override
   protected axe aV() {
      return axf.if;
   }

   @Override
   protected boolean x() {
      return true;
   }

   @Override
   protected cxp go() {
      return cxp.j;
   }

   @Override
   protected void a(bam $$0, bth $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bvs.a, new cxp(cxt.wI));
         } else {
            this.a(bvs.a, new cxp(cxt.rJ));
         }
      }
   }

   @Override
   protected boolean a(cxp $$0, cxp $$1, bvs $$2) {
      if ($$1.a(cxt.wJ)) {
         return false;
      } else if ($$1.a(cxt.wI)) {
         return $$0.a(cxt.wI) ? $$0.o() < $$1.o() : false;
      } else {
         return $$0.a(cxt.wI) ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   public boolean a(dhl $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bwg $$0) {
      return $$0 != null ? !this.dW().U() || $$0.bj() : false;
   }

   @Override
   public boolean cJ() {
      return !this.ck();
   }

   boolean gx() {
      if (this.cc) {
         return true;
      } else {
         bwg $$0 = this.O_();
         return $$0 != null && $$0.bj();
      }
   }

   @Override
   public void a_(fby $$0) {
      if (this.di() && this.bo() && this.gx()) {
         this.a(0.01F, $$0);
         this.a(bwk.a, this.dz());
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
      eul $$0 = this.L().k();
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
   public void a(bwg $$0, float $$1) {
      cxp $$2 = this.eZ();
      cxp $$3 = $$2.a(cxt.wI) ? $$2 : new cxp(cxt.wI);
      crd $$4 = new crd(this.dW(), this, $$3);
      double $$5 = $$0.dB() - this.dB();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dD();
      double $$7 = $$0.dH() - this.dH();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dW() instanceof ash $$9) {
         cqq.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dW().al().a() * 4));
      }

      this.a(axf.id, 1.0F, 1.0F / (this.dZ().i() * 0.4F + 0.8F));
   }

   public void x(boolean $$0) {
      this.cc = $$0;
   }

   static class a extends cet {
      private final cml b;

      public a(cml $$0, double $$1, boolean $$2) {
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

   static class b extends cdr {
      private final cml g;

      public b(cml $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.g.dW().U() && this.g.bj() && this.g.dD() >= (double)(this.g.dW().O() - 3);
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(dhl $$0, jh $$1) {
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

   static class c extends cde {
      private final bwo a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dhi f;

      public c(bwo $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dW();
         this.a(EnumSet.of(cde.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.U()) {
            return false;
         } else if (this.a.bj()) {
            return false;
         } else {
            fby $$0 = this.h();
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
      private fby h() {
         bam $$0 = this.a.dZ();
         jh $$1 = this.a.dw();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            jh $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dko.J)) {
               return fby.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends cch {
      private final cml l;

      public d(cml $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bwg $$0 = this.l.O_();
         if (this.l.gx() && this.l.bj()) {
            if ($$0 != null && $$0.dD() > this.l.dD() || this.l.cc) {
               this.l.h(this.l.dz().b(0.0, 0.002, 0.0));
            }

            if (this.k != cch.a.b || this.l.L().m()) {
               this.l.C(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dB();
            double $$2 = this.f - this.l.dD();
            double $$3 = this.g - this.l.dH();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(bae.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.b(this.l.dM(), $$5, 90.0F));
            this.l.aX = this.l.dM();
            float $$6 = (float)(this.h * this.l.h(bxo.v));
            float $$7 = bae.h(0.125F, this.l.fp(), $$6);
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

   static class e extends cde {
      private final cml a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cml $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean b() {
         return !this.a.dW().U() && this.a.bj() && this.a.dD() < (double)(this.c - 2);
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dD() < (double)(this.c - 1) && (this.a.L().m() || this.a.gq())) {
            fby $$0 = chb.a(this.a, 4, 8, new fby(this.a.dB(), (double)(this.c - 1), this.a.dH()), (float) (Math.PI / 2));
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

   static class f extends ced {
      private final cml a;

      public f(cnb $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cml)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.eZ().a(cxt.wI);
      }

      @Override
      public void d() {
         super.d();
         this.a.w(true);
         this.a.c(bti.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fF();
         this.a.w(false);
      }
   }
}
