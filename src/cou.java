import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cou extends bxl implements coc {
   private static final akj<Integer> bH = akn.a(cou.class, akl.b);
   public static final int a = 1;
   public static final int b = 127;
   public static final int c = 4;
   public float d;
   public float bF;
   public float bG;
   private boolean bI;

   public cou(bwr<? extends cou> $$0, djh $$1) {
      super($$0, $$1);
      this.cM();
      this.bA = new cou.d(this);
   }

   @Override
   protected void D() {
      this.bD.a(1, new cou.b(this));
      this.bD.a(2, new cou.a(this));
      this.bD.a(3, new cou.e(this));
      this.bD.a(5, new cou.c(this));
      this.bE.a(1, new cfy<>(this, crj.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dB() - this.dB()) <= 4.0));
      this.bE.a(3, new cfy<>(this, cjp.class, true));
   }

   @Override
   public awo dl() {
      return awo.f;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bH, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = azm.a($$0, 1, 127);
      this.al.a(bH, $$2);
      this.av();
      this.i_();
      this.g(byp.s).a((double)($$2 * $$2));
      this.g(byp.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(byp.c).a((double)$$2);
      if ($$1) {
         this.d(this.eT());
      }

      this.by = $$2;
   }

   public int gr() {
      return this.al.a(bH);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Size", this.gr() - 1);
      $$0.a("wasOnGround", this.bI);
   }

   @Override
   public void a(tz $$0) {
      this.a($$0.f("Size") + 1, false);
      super.a($$0);
      this.bI = $$0.o("wasOnGround");
   }

   public boolean gs() {
      return this.gr() <= 1;
   }

   protected lw m() {
      return ly.X;
   }

   @Override
   protected boolean aa() {
      return this.gr() > 0;
   }

   @Override
   public void h() {
      this.bG = this.bF;
      this.bF = this.bF + (this.d - this.bF) * 0.5F;
      super.h();
      if (this.aH() && !this.bI) {
         float $$0 = this.a(this.at()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ae.i() * (float) (Math.PI * 2);
            float $$4 = this.ae.i() * 0.5F + 0.5F;
            float $$5 = azm.a($$3) * $$1 * $$4;
            float $$6 = azm.b($$3) * $$1 * $$4;
            this.dU().a(this.m(), this.dz() + (double)$$5, this.dB(), this.dF() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gp(), this.fd(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aH() && this.bI) {
         this.d = 1.0F;
      }

      this.bI = this.aH();
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
   public void a(akj<?> $$0) {
      if (bH.equals($$0)) {
         this.i_();
         this.w(this.aX);
         this.aV = this.aX;
         if (this.bh() && this.ae.a(20) == 0) {
            this.bp();
         }
      }

      super.a($$0);
   }

   @Override
   public bwr<? extends cou> an() {
      return (bwr<? extends cou>)super.an();
   }

   @Override
   public void a(bwi.d $$0) {
      int $$1 = this.gr();
      if (!this.dU().C && $$1 > 1 && this.eG()) {
         float $$2 = this.a(this.at()).a();
         float $$3 = $$2 / 2.0F;
         int $$4 = $$1 / 2;
         int $$5 = 2 + this.ae.a(3);
         ffx $$6 = this.cp();

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$3;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$3;
            this.a(this.an(), new bwc(bwd.b, false, false, $$6), bwq.k, $$3x -> {
               $$3x.a($$4, true);
               $$3x.b(this.dz() + (double)$$8, this.dB() + 0.5, this.dF() + (double)$$9, this.ae.i() * 360.0F, 0.0F);
            });
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bwi $$0) {
      super.h($$0);
      if ($$0 instanceof cjp && this.t()) {
         this.i((bxj)$$0);
      }
   }

   @Override
   public void a_(crj $$0) {
      if (this.t()) {
         this.i($$0);
      }
   }

   protected void i(bxj $$0) {
      if (this.dU() instanceof arq $$1 && this.bI() && this.h($$0) && this.E($$0)) {
         bux $$2 = this.dV().b((bxj)this);
         if ($$0.a($$1, $$2, this.x())) {
            this.a(awn.yf, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            dfz.a($$1, (bwi)$$0, $$2);
         }
      }
   }

   @Override
   protected fex a(bwi $$0, bwl $$1, float $$2) {
      return new fex(0.0, (double)$$1.b() - 0.015625 * (double)this.gr() * (double)$$2, 0.0);
   }

   protected boolean t() {
      return !this.gs() && this.di();
   }

   protected float x() {
      return (float)this.h(byp.c);
   }

   @Override
   protected awm e(bux $$0) {
      return this.gs() ? awn.zk : awn.yh;
   }

   @Override
   protected awm l_() {
      return this.gs() ? awn.zj : awn.yg;
   }

   protected awm gp() {
      return this.gs() ? awn.zm : awn.yj;
   }

   public static boolean c(bwr<cou> $$0, dji $$1, bwq $$2, iv $$3, azv $$4) {
      if ($$1.an() != bud.a) {
         if (bwq.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.u($$3).a(axb.as) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.as() && $$1.B($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dkg)) {
            return false;
         }

         dio $$5 = new dio($$3);
         boolean $$6 = ehm.a($$5.h, $$5.i, ((dkg)$$1).E(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float fd() {
      return 0.4F * (float)this.gr();
   }

   @Override
   public int ad() {
      return 0;
   }

   protected boolean gt() {
      return this.gr() > 0;
   }

   @Override
   public void s() {
      fex $$0 = this.dx();
      this.n($$0.d, (double)this.fg(), $$0.f);
      this.ar = true;
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      azv $$4 = $$0.C_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float j() {
      float $$0 = this.gs() ? 1.4F : 0.8F;
      return ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * $$0;
   }

   protected awm gq() {
      return this.gs() ? awn.zl : awn.yi;
   }

   @Override
   public bwl e(bxv $$0) {
      return super.e($$0).a((float)this.gr());
   }

   static class a extends cef {
      private final cou a;
      private int b;

      public a(cou $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cef.a.b));
      }

      @Override
      public boolean b() {
         bxj $$0 = this.a.f();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.L() instanceof cou.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         bxj $$0 = this.a.f();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         bxj $$0 = this.a.f();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.L() instanceof cou.d $$1) {
            $$1.a(this.a.dK(), this.a.t());
         }
      }
   }

   static class b extends cef {
      private final cou a;

      public b(cou $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cef.a.c, cef.a.a));
         $$0.O().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bh() || this.a.bu()) && this.a.L() instanceof cou.d;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.dX().i() < 0.8F) {
            this.a.N().a();
         }

         if (this.a.L() instanceof cou.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends cef {
      private final cou a;

      public c(cou $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cef.a.c, cef.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bX();
      }

      @Override
      public void a() {
         if (this.a.L() instanceof cou.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends cdi {
      private float l;
      private int m;
      private final cou n;
      private boolean o;

      public d(cou $$0) {
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
         this.k = cdi.a.b;
      }

      @Override
      public void a() {
         this.d.w(this.b(this.d.dK(), this.l, 90.0F));
         this.d.aX = this.d.dK();
         this.d.aV = this.d.dK();
         if (this.k != cdi.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = cdi.a.a;
            if (this.d.aH()) {
               this.d.B((float)(this.h * this.d.h(byp.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.n();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.N().a();
                  if (this.n.gt()) {
                     this.n.a(this.n.gq(), this.n.fd(), this.n.j());
                  }
               } else {
                  this.n.bg = 0.0F;
                  this.n.bi = 0.0F;
                  this.d.B(0.0F);
               }
            } else {
               this.d.B((float)(this.h * this.d.h(byp.v)));
            }
         }
      }
   }

   static class e extends cef {
      private final cou a;
      private float b;
      private int c;

      public e(cou $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cef.a.b));
      }

      @Override
      public boolean b() {
         return this.a.f() == null && (this.a.aH() || this.a.bh() || this.a.bu() || this.a.b(bvo.y)) && this.a.L() instanceof cou.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dX().a(60));
            this.b = (float)this.a.dX().a(360);
         }

         if (this.a.L() instanceof cou.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
