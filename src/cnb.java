import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cnb extends bwd implements cmk {
   private static final alc<Integer> ca = alg.a(cnb.class, ale.b);
   public static final int a = 1;
   public static final int b = 127;
   public static final int c = 4;
   public float d;
   public float bY;
   public float bZ;
   private boolean cb;

   public cnb(bvm<? extends cnb> $$0, dha $$1) {
      super($$0, $$1);
      this.cN();
      this.bQ = new cnb.d(this);
   }

   @Override
   protected void B() {
      this.bT.a(1, new cnb.b(this));
      this.bT.a(2, new cnb.a(this));
      this.bT.a(3, new cnb.e(this));
      this.bT.a(5, new cnb.c(this));
      this.bU.a(1, new ces<>(this, cps.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
      this.bU.a(3, new ces<>(this, cie.class, true));
   }

   @Override
   public axg dm() {
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
      this.g(bxj.s).a((double)($$2 * $$2));
      this.g(bxj.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(bxj.c).a((double)$$2);
      if ($$1) {
         this.x(this.eR());
      }

      this.bO = $$2;
   }

   public int gm() {
      return this.al.a(ca);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Size", this.gm() - 1);
      $$0.a("wasOnGround", this.cb);
   }

   @Override
   public void a(ux $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.cb = $$0.q("wasOnGround");
   }

   public boolean gn() {
      return this.gm() <= 1;
   }

   protected lq p() {
      return ls.V;
   }

   @Override
   protected boolean X() {
      return this.gm() > 0;
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
            this.dV().a(this.p(), this.dA() + (double)$$5, this.dC(), this.dG() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gk(), this.fe(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) / 0.8F);
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
      double $$0 = this.dA();
      double $$1 = this.dC();
      double $$2 = this.dG();
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
   public bvm<? extends cnb> aq() {
      return (bvm<? extends cnb>)super.aq();
   }

   @Override
   public void a(bvf.c $$0) {
      int $$1 = this.gm();
      if (!this.dV().C && $$1 > 1 && this.eE()) {
         float $$2 = this.a(this.aw()).a();
         float $$3 = $$2 / 2.0F;
         int $$4 = $$1 / 2;
         int $$5 = 2 + this.ae.a(3);
         fcs $$6 = this.cr();

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$3;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$3;
            this.a(this.aq(), new bva(bvb.b, false, false, $$6), bvl.k, $$3x -> {
               $$3x.a($$4, true);
               $$3x.b(this.dA() + (double)$$8, this.dC() + 0.5, this.dG() + (double)$$9, this.ae.i() * 360.0F, 0.0F);
            });
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bvf $$0) {
      super.h($$0);
      if ($$0 instanceof cie && this.gi()) {
         this.j((bwb)$$0);
      }
   }

   @Override
   public void a_(cps $$0) {
      if (this.gi()) {
         this.j($$0);
      }
   }

   protected void j(bwb $$0) {
      if (this.dV() instanceof ash $$1 && this.bL() && this.i($$0) && this.E($$0)) {
         btv $$2 = this.dW().b((bwb)this);
         if ($$0.a($$1, $$2, this.gj())) {
            this.a(axf.xI, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            ddt.a($$1, (bvf)$$0, $$2);
         }
      }
   }

   @Override
   protected fbs a(bvf $$0, bvi $$1, float $$2) {
      return new fbs(0.0, (double)$$1.b() - 0.015625 * (double)this.gm() * (double)$$2, 0.0);
   }

   protected boolean gi() {
      return !this.gn() && this.dj();
   }

   protected float gj() {
      return (float)this.h(bxj.c);
   }

   @Override
   protected axe e(btv $$0) {
      return this.gn() ? axf.yE : axf.xK;
   }

   @Override
   protected axe o_() {
      return this.gn() ? axf.yD : axf.xJ;
   }

   protected axe gk() {
      return this.gn() ? axf.yG : axf.xM;
   }

   public static boolean c(bvm<cnb> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      if ($$1.al() != btb.a) {
         if (bvl.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.t($$3).a(axt.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.aq() && $$1.A($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dhy)) {
            return false;
         }

         dgg $$5 = new dgg($$3);
         boolean $$6 = eeh.a($$5.g, $$5.h, ((dhy)$$1).D(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float fe() {
      return 0.4F * (float)this.gm();
   }

   @Override
   public int Z() {
      return 0;
   }

   protected boolean go() {
      return this.gm() > 0;
   }

   @Override
   public void s() {
      fbs $$0 = this.dy();
      this.n($$0.d, (double)this.fh(), $$0.f);
      this.ar = true;
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
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
      float $$0 = this.gn() ? 1.4F : 0.8F;
      return ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * $$0;
   }

   protected axe gl() {
      return this.gn() ? axf.yF : axf.xL;
   }

   @Override
   public bvi e(bwn $$0) {
      return super.e($$0).a((float)this.gm());
   }

   static class a extends ccz {
      private final cnb a;
      private int b;

      public a(cnb $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccz.a.b));
      }

      @Override
      public boolean b() {
         bwb $$0 = this.a.O_();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.I() instanceof cnb.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         bwb $$0 = this.a.O_();
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
         bwb $$0 = this.a.O_();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.I() instanceof cnb.d $$1) {
            $$1.a(this.a.dL(), this.a.gi());
         }
      }
   }

   static class b extends ccz {
      private final cnb a;

      public b(cnb $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccz.a.c, ccz.a.a));
         $$0.L().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bj() || this.a.bx()) && this.a.I() instanceof cnb.d;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.dY().i() < 0.8F) {
            this.a.J().a();
         }

         if (this.a.I() instanceof cnb.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends ccz {
      private final cnb a;

      public c(cnb $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccz.a.c, ccz.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bZ();
      }

      @Override
      public void a() {
         if (this.a.I() instanceof cnb.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends ccc {
      private float l;
      private int m;
      private final cnb n;
      private boolean o;

      public d(cnb $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dL() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = ccc.a.b;
      }

      @Override
      public void a() {
         this.d.v(this.b(this.d.dL(), this.l, 90.0F));
         this.d.aZ = this.d.dL();
         this.d.aX = this.d.dL();
         if (this.k != ccc.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = ccc.a.a;
            if (this.d.aJ()) {
               this.d.C((float)(this.h * this.d.h(bxj.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.t();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.J().a();
                  if (this.n.go()) {
                     this.n.a(this.n.gl(), this.n.fe(), this.n.m());
                  }
               } else {
                  this.n.bo = 0.0F;
                  this.n.bq = 0.0F;
                  this.d.C(0.0F);
               }
            } else {
               this.d.C((float)(this.h * this.d.h(bxj.v)));
            }
         }
      }
   }

   static class e extends ccz {
      private final cnb a;
      private float b;
      private int c;

      public e(cnb $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccz.a.b));
      }

      @Override
      public boolean b() {
         return this.a.O_() == null && (this.a.aJ() || this.a.bj() || this.a.bx() || this.a.b(bum.y)) && this.a.I() instanceof cnb.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dY().a(60));
            this.b = (float)this.a.dY().a(360);
         }

         if (this.a.I() instanceof cnb.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
