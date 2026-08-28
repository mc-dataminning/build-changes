import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmk extends cnp implements cna {
   public static final float a = 0.03F;
   boolean cc;
   protected final cft b;
   protected final cfq c;

   public cmk(bvq<? extends cmk> $$0, dhh $$1) {
      super($$0, $$1);
      this.bQ = new cmk.d(this);
      this.a(eun.j, 0.0F);
      this.b = new cft(this, $$1);
      this.c = new cfq(this, $$1);
   }

   public static bxm.a m() {
      return cnp.gr().a(bxn.B, 1.0);
   }

   @Override
   protected void p() {
      this.bT.a(1, new cmk.c(this, 1.0));
      this.bT.a(2, new cmk.f(this, 1.0, 40, 10.0F));
      this.bT.a(2, new cmk.a(this, 1.0, false));
      this.bT.a(5, new cmk.b(this, 1.0));
      this.bT.a(6, new cmk.e(this, 1.0, this.dW().O()));
      this.bT.a(7, new cea(this, 1.0));
      this.bU.a(1, new cev(this, cmk.class).a(cnr.class));
      this.bU.a(2, new cew<>(this, cpw.class, 10, true, false, ($$0, $$1) -> this.j($$0)));
      this.bU.a(3, new cew<>(this, cpd.class, false));
      this.bU.a(3, new cew<>(this, cii.class, true));
      this.bU.a(3, new cew<>(this, cji.class, true, false));
      this.bU.a(5, new cew<>(this, cix.class, 10, true, false, cix.bZ));
   }

   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bvr.b).f() && $$0.H_().i() < 0.03F) {
         this.a(bvr.b, new cxo(cxs.wJ));
         this.g(bvr.b);
      }

      return $$3;
   }

   public static boolean a(bvq<cmk> $$0, dhy $$1, bvp $$2, jh $$3, bam $$4) {
      if (!$$1.b_($$3.e()).a(aya.a) && !bvp.a($$2)) {
         return false;
      } else {
         jq<dij> $$5 = $$1.t($$3);
         boolean $$6 = $$1.al() != btf.a && (bvp.b($$2) || a($$1, $$3, $$4)) && (bvp.a($$2) || $$1.b_($$3).a(aya.a));
         if (!$$6 || !bvp.a($$2) && $$2 != bvp.j) {
            return $$5.a(axt.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         } else {
            return true;
         }
      }
   }

   private static boolean a(dhi $$0, jh $$1) {
      return $$1.v() < $$0.O() - 5;
   }

   @Override
   protected axe u() {
      return this.bj() ? axf.hY : axf.hX;
   }

   @Override
   protected axe e(btz $$0) {
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
   protected cxo go() {
      return cxo.j;
   }

   @Override
   protected void a(bam $$0, btg $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bvr.a, new cxo(cxs.wI));
         } else {
            this.a(bvr.a, new cxo(cxs.rJ));
         }
      }
   }

   @Override
   protected boolean a(cxo $$0, cxo $$1, bvr $$2) {
      if ($$1.a(cxs.wJ)) {
         return false;
      } else if ($$1.a(cxs.wI)) {
         return $$0.a(cxs.wI) ? $$0.o() < $$1.o() : false;
      } else {
         return $$0.a(cxs.wI) ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   public boolean a(dhk $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bwf $$0) {
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
         bwf $$0 = this.O_();
         return $$0 != null && $$0.bj();
      }
   }

   @Override
   public void a_(fbx $$0) {
      if (this.di() && this.bo() && this.gx()) {
         this.a(0.01F, $$0);
         this.a(bwj.a, this.dz());
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
      euk $$0 = this.L().k();
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
   public void a(bwf $$0, float $$1) {
      cxo $$2 = this.eZ();
      cxo $$3 = $$2.a(cxs.wI) ? $$2 : new cxo(cxs.wI);
      crc $$4 = new crc(this.dW(), this, $$3);
      double $$5 = $$0.dB() - this.dB();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dD();
      double $$7 = $$0.dH() - this.dH();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dW() instanceof ash $$9) {
         cqp.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dW().al().a() * 4));
      }

      this.a(axf.id, 1.0F, 1.0F / (this.dZ().i() * 0.4F + 0.8F));
   }

   public void x(boolean $$0) {
      this.cc = $$0;
   }

   static class a extends ces {
      private final cmk b;

      public a(cmk $$0, double $$1, boolean $$2) {
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

   static class b extends cdq {
      private final cmk g;

      public b(cmk $$0, double $$1) {
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
      protected boolean a(dhk $$0, jh $$1) {
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

   static class c extends cdd {
      private final bwn a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dhh f;

      public c(bwn $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dW();
         this.a(EnumSet.of(cdd.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.U()) {
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
         return !this.a.L().m();
      }

      @Override
      public void d() {
         this.a.L().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private fbx h() {
         bam $$0 = this.a.dZ();
         jh $$1 = this.a.dw();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            jh $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dkn.J)) {
               return fbx.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends ccg {
      private final cmk l;

      public d(cmk $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bwf $$0 = this.l.O_();
         if (this.l.gx() && this.l.bj()) {
            if ($$0 != null && $$0.dD() > this.l.dD() || this.l.cc) {
               this.l.h(this.l.dz().b(0.0, 0.002, 0.0));
            }

            if (this.k != ccg.a.b || this.l.L().m()) {
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
            float $$6 = (float)(this.h * this.l.h(bxn.v));
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

   static class e extends cdd {
      private final cmk a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cmk $$0, double $$1, int $$2) {
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
            fbx $$0 = cha.a(this.a, 4, 8, new fbx(this.a.dB(), (double)(this.c - 1), this.a.dH()), (float) (Math.PI / 2));
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

   static class f extends cec {
      private final cmk a;

      public f(cna $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cmk)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.eZ().a(cxs.wI);
      }

      @Override
      public void d() {
         super.d();
         this.a.w(true);
         this.a.c(bth.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fF();
         this.a.w(false);
      }
   }
}
