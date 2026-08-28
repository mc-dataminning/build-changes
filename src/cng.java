import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cng extends bwi implements cmp {
   private static final alc<Integer> ca = alg.a(cng.class, ale.b);
   public static final int a = 1;
   public static final int b = 127;
   public static final int c = 4;
   public float d;
   public float bY;
   public float bZ;
   private boolean cb;

   public cng(bvr<? extends cng> $$0, dhi $$1) {
      super($$0, $$1);
      this.cN();
      this.bQ = new cng.d(this);
   }

   @Override
   protected void B() {
      this.bT.a(1, new cng.b(this));
      this.bT.a(2, new cng.a(this));
      this.bT.a(3, new cng.e(this));
      this.bT.a(5, new cng.c(this));
      this.bU.a(1, new cex<>(this, cpx.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dD() - this.dD()) <= 4.0));
      this.bU.a(3, new cex<>(this, cij.class, true));
   }

   @Override
   public axg dn() {
      return axg.f;
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(ca, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = bae.a($$0, 1, 127);
      this.al.a(ca, $$2);
      this.ay();
      this.m_();
      this.g(bxo.s).a((double)($$2 * $$2));
      this.g(bxo.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(bxo.c).a((double)$$2);
      if ($$1) {
         this.x(this.eS());
      }

      this.bO = $$2;
   }

   public int go() {
      return this.al.a(ca);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Size", this.go() - 1);
      $$0.a("wasOnGround", this.cb);
   }

   @Override
   public void a(ux $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.cb = $$0.q("wasOnGround");
   }

   public boolean gp() {
      return this.go() <= 1;
   }

   protected lq p() {
      return ls.V;
   }

   @Override
   protected boolean X() {
      return this.go() > 0;
   }

   @Override
   public void h() {
      this.bZ = this.bY;
      this.bY = this.bY + (this.d - this.bY) * 0.5F;
      super.h();
      if (this.aJ() && !this.cb) {
         float $$0 = this.a(this.aw()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ae.i() * (float) (Math.PI * 2);
            float $$4 = this.ae.i() * 0.5F + 0.5F;
            float $$5 = bae.a($$3) * $$1 * $$4;
            float $$6 = bae.b($$3) * $$1 * $$4;
            this.dW().a(this.p(), this.dB() + (double)$$5, this.dD(), this.dH() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gm(), this.fg(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aJ() && this.cb) {
         this.d = 1.0F;
      }

      this.cb = this.aJ();
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
   public void a(alc<?> $$0) {
      if (ca.equals($$0)) {
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
   public bvr<? extends cng> aq() {
      return (bvr<? extends cng>)super.aq();
   }

   @Override
   public void a(bvk.d $$0) {
      int $$1 = this.go();
      if (!this.dW().C && $$1 > 1 && this.eF()) {
         float $$2 = this.a(this.aw()).a();
         float $$3 = $$2 / 2.0F;
         int $$4 = $$1 / 2;
         int $$5 = 2 + this.ae.a(3);
         fcy $$6 = this.cr();

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$3;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$3;
            this.a(this.aq(), new bvf(bvg.b, false, false, $$6), bvq.k, $$3x -> {
               $$3x.a($$4, true);
               $$3x.b(this.dB() + (double)$$8, this.dD() + 0.5, this.dH() + (double)$$9, this.ae.i() * 360.0F, 0.0F);
            });
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bvk $$0) {
      super.h($$0);
      if ($$0 instanceof cij && this.gk()) {
         this.j((bwg)$$0);
      }
   }

   @Override
   public void a_(cpx $$0) {
      if (this.gk()) {
         this.j($$0);
      }
   }

   protected void j(bwg $$0) {
      if (this.dW() instanceof ash $$1 && this.bL() && this.i($$0) && this.E($$0)) {
         bua $$2 = this.dX().b((bwg)this);
         if ($$0.a($$1, $$2, this.gl())) {
            this.a(axf.xJ, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            deb.a($$1, (bvk)$$0, $$2);
         }
      }
   }

   @Override
   protected fby a(bvk $$0, bvn $$1, float $$2) {
      return new fby(0.0, (double)$$1.b() - 0.015625 * (double)this.go() * (double)$$2, 0.0);
   }

   protected boolean gk() {
      return !this.gp() && this.dk();
   }

   protected float gl() {
      return (float)this.h(bxo.c);
   }

   @Override
   protected axe e(bua $$0) {
      return this.gp() ? axf.yF : axf.xL;
   }

   @Override
   protected axe o_() {
      return this.gp() ? axf.yE : axf.xK;
   }

   protected axe gm() {
      return this.gp() ? axf.yH : axf.xN;
   }

   public static boolean c(bvr<cng> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      if ($$1.al() != btg.a) {
         if (bvq.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.t($$3).a(axt.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.aq() && $$1.A($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dig)) {
            return false;
         }

         dgo $$5 = new dgo($$3);
         boolean $$6 = eep.a($$5.h, $$5.i, ((dig)$$1).D(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float fg() {
      return 0.4F * (float)this.go();
   }

   @Override
   public int Z() {
      return 0;
   }

   protected boolean gq() {
      return this.go() > 0;
   }

   @Override
   public void s() {
      fby $$0 = this.dz();
      this.n($$0.d, (double)this.fj(), $$0.f);
      this.ar = true;
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      bam $$4 = $$0.H_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float m() {
      float $$0 = this.gp() ? 1.4F : 0.8F;
      return ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * $$0;
   }

   protected axe gn() {
      return this.gp() ? axf.yG : axf.xM;
   }

   @Override
   public bvn e(bws $$0) {
      return super.e($$0).a((float)this.go());
   }

   static class a extends cde {
      private final cng a;
      private int b;

      public a(cng $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cde.a.b));
      }

      @Override
      public boolean b() {
         bwg $$0 = this.a.O_();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.I() instanceof cng.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         bwg $$0 = this.a.O_();
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
         bwg $$0 = this.a.O_();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.I() instanceof cng.d $$1) {
            $$1.a(this.a.dM(), this.a.gk());
         }
      }
   }

   static class b extends cde {
      private final cng a;

      public b(cng $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cde.a.c, cde.a.a));
         $$0.L().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bj() || this.a.bx()) && this.a.I() instanceof cng.d;
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

         if (this.a.I() instanceof cng.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends cde {
      private final cng a;

      public c(cng $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cde.a.c, cde.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bZ();
      }

      @Override
      public void a() {
         if (this.a.I() instanceof cng.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends cch {
      private float l;
      private int m;
      private final cng n;
      private boolean o;

      public d(cng $$0) {
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
         this.k = cch.a.b;
      }

      @Override
      public void a() {
         this.d.v(this.b(this.d.dM(), this.l, 90.0F));
         this.d.aZ = this.d.dM();
         this.d.aX = this.d.dM();
         if (this.k != cch.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = cch.a.a;
            if (this.d.aJ()) {
               this.d.C((float)(this.h * this.d.h(bxo.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.t();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.J().a();
                  if (this.n.gq()) {
                     this.n.a(this.n.gn(), this.n.fg(), this.n.m());
                  }
               } else {
                  this.n.bo = 0.0F;
                  this.n.bq = 0.0F;
                  this.d.C(0.0F);
               }
            } else {
               this.d.C((float)(this.h * this.d.h(bxo.v)));
            }
         }
      }
   }

   static class e extends cde {
      private final cng a;
      private float b;
      private int c;

      public e(cng $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cde.a.b));
      }

      @Override
      public boolean b() {
         return this.a.O_() == null && (this.a.aJ() || this.a.bj() || this.a.bx() || this.a.b(bur.y)) && this.a.I() instanceof cng.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dZ().a(60));
            this.b = (float)this.a.dZ().a(360);
         }

         if (this.a.I() instanceof cng.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
