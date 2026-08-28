import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmf extends bvh implements clo {
   private static final ajx<Integer> bZ = akb.a(cmf.class, ajz.b);
   public static final int a = 1;
   public static final int b = 127;
   public static final int c = 4;
   public float d;
   public float bX;
   public float bY;
   private boolean ca;

   public cmf(buq<? extends cmf> $$0, dgg $$1) {
      super($$0, $$1);
      this.cN();
      this.bP = new cmf.d(this);
   }

   @Override
   protected void B() {
      this.bS.a(1, new cmf.b(this));
      this.bS.a(2, new cmf.a(this));
      this.bS.a(3, new cmf.e(this));
      this.bS.a(5, new cmf.c(this));
      this.bT.a(1, new cdw<>(this, cov.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dD() - this.dD()) <= 4.0));
      this.bT.a(3, new cdw<>(this, chi.class, true));
   }

   @Override
   public awa dn() {
      return awa.f;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bZ, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = ayy.a($$0, 1, 127);
      this.al.a(bZ, $$2);
      this.ay();
      this.m_();
      this.g(bwn.s).a((double)($$2 * $$2));
      this.g(bwn.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(bwn.c).a((double)$$2);
      if ($$1) {
         this.x(this.eS());
      }

      this.bN = $$2;
   }

   public int gp() {
      return this.al.a(bZ);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Size", this.gp() - 1);
      $$0.a("wasOnGround", this.ca);
   }

   @Override
   public void a(tq $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.ca = $$0.q("wasOnGround");
   }

   public boolean gq() {
      return this.gp() <= 1;
   }

   protected lr p() {
      return lt.W;
   }

   @Override
   protected boolean Y() {
      return this.gp() > 0;
   }

   @Override
   public void h() {
      this.bY = this.bX;
      this.bX = this.bX + (this.d - this.bX) * 0.5F;
      super.h();
      if (this.aJ() && !this.ca) {
         float $$0 = this.a(this.aw()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ae.i() * (float) (Math.PI * 2);
            float $$4 = this.ae.i() * 0.5F + 0.5F;
            float $$5 = ayy.a($$3) * $$1 * $$4;
            float $$6 = ayy.b($$3) * $$1 * $$4;
            this.dW().a(this.p(), this.dB() + (double)$$5, this.dD(), this.dH() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gn(), this.fg(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aJ() && this.ca) {
         this.d = 1.0F;
      }

      this.ca = this.aJ();
      this.x();
   }

   protected void x() {
      this.d *= 0.6F;
   }

   protected int t() {
      return this.ae.a(20) + 10;
   }

   @Override
   public void m_() {
      double $$0 = this.dB();
      double $$1 = this.dD();
      double $$2 = this.dH();
      super.m_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(ajx<?> $$0) {
      if (bZ.equals($$0)) {
         this.m_();
         this.v(this.aZ);
         this.aX = this.aZ;
         if (this.bj() && this.ae.a(20) == 0) {
            this.bs();
         }
      }

      super.a($$0);
   }

   @Override
   public buq<? extends cmf> aq() {
      return (buq<? extends cmf>)super.aq();
   }

   @Override
   public void a(buj.d $$0) {
      int $$1 = this.gp();
      if (!this.dW().C && $$1 > 1 && this.eF()) {
         float $$2 = this.a(this.aw()).a();
         float $$3 = $$2 / 2.0F;
         int $$4 = $$1 / 2;
         int $$5 = 2 + this.ae.a(3);
         fby $$6 = this.cr();

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$3;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$3;
            this.a(this.aq(), new bue(buf.b, false, false, $$6), bup.k, $$3x -> {
               $$3x.a($$4, true);
               $$3x.b(this.dB() + (double)$$8, this.dD() + 0.5, this.dH() + (double)$$9, this.ae.i() * 360.0F, 0.0F);
            });
         }
      }

      super.a($$0);
   }

   @Override
   public void h(buj $$0) {
      super.h($$0);
      if ($$0 instanceof chi && this.gl()) {
         this.j((bvf)$$0);
      }
   }

   @Override
   public void a_(cov $$0) {
      if (this.gl()) {
         this.j($$0);
      }
   }

   protected void j(bvf $$0) {
      if (this.dW() instanceof arc $$1 && this.bL() && this.i($$0) && this.E($$0)) {
         bsz $$2 = this.dX().b((bvf)this);
         if ($$0.a($$1, $$2, this.gm())) {
            this.a(avz.xP, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            dcz.a($$1, (buj)$$0, $$2);
         }
      }
   }

   @Override
   protected fay a(buj $$0, bum $$1, float $$2) {
      return new fay(0.0, (double)$$1.b() - 0.015625 * (double)this.gp() * (double)$$2, 0.0);
   }

   protected boolean gl() {
      return !this.gq() && this.dk();
   }

   protected float gm() {
      return (float)this.h(bwn.c);
   }

   @Override
   protected avy e(bsz $$0) {
      return this.gq() ? avz.yU : avz.xR;
   }

   @Override
   protected avy o_() {
      return this.gq() ? avz.yT : avz.xQ;
   }

   protected avy gn() {
      return this.gq() ? avz.yW : avz.xT;
   }

   public static boolean c(buq<cmf> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      if ($$1.am() != bsf.a) {
         if (bup.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.t($$3).a(awn.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ar() && $$1.A($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dhe)) {
            return false;
         }

         dfm $$5 = new dfm($$3);
         boolean $$6 = edp.a($$5.h, $$5.i, ((dhe)$$1).E(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float fg() {
      return 0.4F * (float)this.gp();
   }

   @Override
   public int aa() {
      return 0;
   }

   protected boolean gr() {
      return this.gp() > 0;
   }

   @Override
   public void s() {
      fay $$0 = this.dz();
      this.n($$0.d, (double)this.fj(), $$0.f);
      this.ar = true;
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      azg $$4 = $$0.H_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float m() {
      float $$0 = this.gq() ? 1.4F : 0.8F;
      return ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * $$0;
   }

   protected avy go() {
      return this.gq() ? avz.yV : avz.xS;
   }

   @Override
   public bum e(bvr $$0) {
      return super.e($$0).a((float)this.gp());
   }

   static class a extends ccd {
      private final cmf a;
      private int b;

      public a(cmf $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccd.a.b));
      }

      @Override
      public boolean b() {
         bvf $$0 = this.a.O_();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.I() instanceof cmf.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         bvf $$0 = this.a.O_();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bvf $$0 = this.a.O_();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.I() instanceof cmf.d $$1) {
            $$1.a(this.a.dM(), this.a.gl());
         }
      }
   }

   static class b extends ccd {
      private final cmf a;

      public b(cmf $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccd.a.c, ccd.a.a));
         $$0.L().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bj() || this.a.bx()) && this.a.I() instanceof cmf.d;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.dZ().i() < 0.8F) {
            this.a.J().a();
         }

         if (this.a.I() instanceof cmf.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends ccd {
      private final cmf a;

      public c(cmf $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccd.a.c, ccd.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bZ();
      }

      @Override
      public void a() {
         if (this.a.I() instanceof cmf.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends cbg {
      private float l;
      private int m;
      private final cmf n;
      private boolean o;

      public d(cmf $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dM() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = cbg.a.b;
      }

      @Override
      public void a() {
         this.d.v(this.b(this.d.dM(), this.l, 90.0F));
         this.d.aZ = this.d.dM();
         this.d.aX = this.d.dM();
         if (this.k != cbg.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = cbg.a.a;
            if (this.d.aJ()) {
               this.d.C((float)(this.h * this.d.h(bwn.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.t();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.J().a();
                  if (this.n.gr()) {
                     this.n.a(this.n.go(), this.n.fg(), this.n.m());
                  }
               } else {
                  this.n.bn = 0.0F;
                  this.n.bp = 0.0F;
                  this.d.C(0.0F);
               }
            } else {
               this.d.C((float)(this.h * this.d.h(bwn.v)));
            }
         }
      }
   }

   static class e extends ccd {
      private final cmf a;
      private float b;
      private int c;

      public e(cmf $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccd.a.b));
      }

      @Override
      public boolean b() {
         return this.a.O_() == null && (this.a.aJ() || this.a.bj() || this.a.bx() || this.a.b(btq.y)) && this.a.I() instanceof cmf.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dZ().a(60));
            this.b = (float)this.a.dZ().a(360);
         }

         if (this.a.I() instanceof cmf.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
