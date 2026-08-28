import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cnb extends bwa implements cmk {
   private static final ajx<Integer> bG = akb.a(cnb.class, ajz.b);
   public static final int a = 1;
   public static final int b = 127;
   public static final int c = 4;
   public float d;
   public float bE;
   public float bF;
   private boolean bH;

   public cnb(bvi<? extends cnb> $$0, dgz $$1) {
      super($$0, $$1);
      this.cM();
      this.bz = new cnb.d(this);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cnb.b(this));
      this.bC.a(2, new cnb.a(this));
      this.bC.a(3, new cnb.e(this));
      this.bC.a(5, new cnb.c(this));
      this.bD.a(1, new cep<>(this, cpr.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dB() - this.dB()) <= 4.0));
      this.bD.a(3, new cep<>(this, cib.class, true));
   }

   @Override
   public awb dl() {
      return awb.f;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bG, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = ayz.a($$0, 1, 127);
      this.al.a(bG, $$2);
      this.ay();
      this.i_();
      this.g(bxg.s).a((double)($$2 * $$2));
      this.g(bxg.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(bxg.c).a((double)$$2);
      if ($$1) {
         this.d(this.eS());
      }

      this.bx = $$2;
   }

   public int gq() {
      return this.al.a(bG);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Size", this.gq() - 1);
      $$0.a("wasOnGround", this.bH);
   }

   @Override
   public void a(tq $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bH = $$0.q("wasOnGround");
   }

   public boolean gr() {
      return this.gq() <= 1;
   }

   protected lr m() {
      return lt.X;
   }

   @Override
   protected boolean aa() {
      return this.gq() > 0;
   }

   @Override
   public void h() {
      this.bF = this.bE;
      this.bE = this.bE + (this.d - this.bE) * 0.5F;
      super.h();
      if (this.aJ() && !this.bH) {
         float $$0 = this.a(this.aw()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ae.i() * (float) (Math.PI * 2);
            float $$4 = this.ae.i() * 0.5F + 0.5F;
            float $$5 = ayz.a($$3) * $$1 * $$4;
            float $$6 = ayz.b($$3) * $$1 * $$4;
            this.dU().a(this.m(), this.dz() + (double)$$5, this.dB(), this.dF() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.go(), this.fg(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aJ() && this.bH) {
         this.d = 1.0F;
      }

      this.bH = this.aJ();
      this.q();
   }

   @Override
   protected void q() {
      this.d *= 0.6F;
   }

   protected int n() {
      return this.ae.a(20) + 10;
   }

   @Override
   public void i_() {
      double $$0 = this.dz();
      double $$1 = this.dB();
      double $$2 = this.dF();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(ajx<?> $$0) {
      if (bG.equals($$0)) {
         this.i_();
         this.w(this.aX);
         this.aV = this.aX;
         if (this.bj() && this.ae.a(20) == 0) {
            this.bq();
         }
      }

      super.a($$0);
   }

   @Override
   public bvi<? extends cnb> aq() {
      return (bvi<? extends cnb>)super.aq();
   }

   @Override
   public void a(bva.d $$0) {
      int $$1 = this.gq();
      if (!this.dU().C && $$1 > 1 && this.eF()) {
         float $$2 = this.a(this.aw()).a();
         float $$3 = $$2 / 2.0F;
         int $$4 = $$1 / 2;
         int $$5 = 2 + this.ae.a(3);
         fcx $$6 = this.cq();

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$3;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$3;
            this.a(this.aq(), new buu(buv.b, false, false, $$6), bvh.k, $$3x -> {
               $$3x.a($$4, true);
               $$3x.b(this.dz() + (double)$$8, this.dB() + 0.5, this.dF() + (double)$$9, this.ae.i() * 360.0F, 0.0F);
            });
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bva $$0) {
      super.h($$0);
      if ($$0 instanceof cib && this.t()) {
         this.j((bvy)$$0);
      }
   }

   @Override
   public void a_(cpr $$0) {
      if (this.t()) {
         this.j($$0);
      }
   }

   protected void j(bvy $$0) {
      if (this.dU() instanceof ard $$1 && this.bJ() && this.i($$0) && this.E($$0)) {
         btp $$2 = this.dV().b((bvy)this);
         if ($$0.a($$1, $$2, this.x())) {
            this.a(awa.xZ, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            ddt.a($$1, (bva)$$0, $$2);
         }
      }
   }

   @Override
   protected fbx a(bva $$0, bvd $$1, float $$2) {
      return new fbx(0.0, (double)$$1.b() - 0.015625 * (double)this.gq() * (double)$$2, 0.0);
   }

   protected boolean t() {
      return !this.gr() && this.di();
   }

   protected float x() {
      return (float)this.h(bxg.c);
   }

   @Override
   protected avz e(btp $$0) {
      return this.gr() ? awa.ze : awa.yb;
   }

   @Override
   protected avz l_() {
      return this.gr() ? awa.zd : awa.ya;
   }

   protected avz go() {
      return this.gr() ? awa.zg : awa.yd;
   }

   public static boolean c(bvi<cnb> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      if ($$1.an() != bsv.a) {
         if (bvh.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.t($$3).a(awo.as) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.as() && $$1.A($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dhy)) {
            return false;
         }

         dgg $$5 = new dgg($$3);
         boolean $$6 = een.a($$5.h, $$5.i, ((dhy)$$1).E(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float fg() {
      return 0.4F * (float)this.gq();
   }

   @Override
   public int ac() {
      return 0;
   }

   protected boolean gs() {
      return this.gq() > 0;
   }

   @Override
   public void s() {
      fbx $$0 = this.dx();
      this.n($$0.d, (double)this.fj(), $$0.f);
      this.ar = true;
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      azh $$4 = $$0.C_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float j() {
      float $$0 = this.gr() ? 1.4F : 0.8F;
      return ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * $$0;
   }

   protected avz gp() {
      return this.gr() ? awa.zf : awa.yc;
   }

   @Override
   public bvd e(bwk $$0) {
      return super.e($$0).a((float)this.gq());
   }

   static class a extends ccw {
      private final cnb a;
      private int b;

      public a(cnb $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccw.a.b));
      }

      @Override
      public boolean b() {
         bvy $$0 = this.a.f();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.L() instanceof cnb.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         bvy $$0 = this.a.f();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         bvy $$0 = this.a.f();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.L() instanceof cnb.d $$1) {
            $$1.a(this.a.dK(), this.a.t());
         }
      }
   }

   static class b extends ccw {
      private final cnb a;

      public b(cnb $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccw.a.c, ccw.a.a));
         $$0.O().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bj() || this.a.bv()) && this.a.L() instanceof cnb.d;
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.dX().i() < 0.8F) {
            this.a.N().a();
         }

         if (this.a.L() instanceof cnb.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends ccw {
      private final cnb a;

      public c(cnb $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccw.a.c, ccw.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bY();
      }

      @Override
      public void a() {
         if (this.a.L() instanceof cnb.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends cbz {
      private float l;
      private int m;
      private final cnb n;
      private boolean o;

      public d(cnb $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dK() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = cbz.a.b;
      }

      @Override
      public void a() {
         this.d.w(this.b(this.d.dK(), this.l, 90.0F));
         this.d.aX = this.d.dK();
         this.d.aV = this.d.dK();
         if (this.k != cbz.a.b) {
            this.d.H(0.0F);
         } else {
            this.k = cbz.a.a;
            if (this.d.aJ()) {
               this.d.C((float)(this.h * this.d.h(bxg.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.n();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.N().a();
                  if (this.n.gs()) {
                     this.n.a(this.n.gp(), this.n.fg(), this.n.j());
                  }
               } else {
                  this.n.bg = 0.0F;
                  this.n.bi = 0.0F;
                  this.d.C(0.0F);
               }
            } else {
               this.d.C((float)(this.h * this.d.h(bxg.v)));
            }
         }
      }
   }

   static class e extends ccw {
      private final cnb a;
      private float b;
      private int c;

      public e(cnb $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccw.a.b));
      }

      @Override
      public boolean b() {
         return this.a.f() == null && (this.a.aJ() || this.a.bj() || this.a.bv() || this.a.b(bug.y)) && this.a.L() instanceof cnb.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dX().a(60));
            this.b = (float)this.a.dX().a(360);
         }

         if (this.a.L() instanceof cnb.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
