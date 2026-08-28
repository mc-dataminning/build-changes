import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cns extends bwt implements cnb {
   private static final akg<Integer> bF = akk.a(cns.class, aki.b);
   public static final int a = 1;
   public static final int b = 127;
   public static final int c = 4;
   public float d;
   public float bD;
   public float bE;
   private boolean bG;

   public cns(bwb<? extends cns> $$0, dhp $$1) {
      super($$0, $$1);
      this.cN();
      this.by = new cns.d(this);
   }

   @Override
   protected void D() {
      this.bB.a(1, new cns.b(this));
      this.bB.a(2, new cns.a(this));
      this.bB.a(3, new cns.e(this));
      this.bB.a(5, new cns.c(this));
      this.bC.a(1, new cfg<>(this, cqi.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
      this.bC.a(3, new cfg<>(this, cis.class, true));
   }

   @Override
   public awl dm() {
      return awl.f;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bF, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = azk.a($$0, 1, 127);
      this.al.a(bF, $$2);
      this.ay();
      this.i_();
      this.g(bxx.s).a((double)($$2 * $$2));
      this.g(bxx.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(bxx.c).a((double)$$2);
      if ($$1) {
         this.d(this.eT());
      }

      this.bw = $$2;
   }

   public int go() {
      return this.al.a(bF);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Size", this.go() - 1);
      $$0.a("wasOnGround", this.bG);
   }

   @Override
   public void a(tw $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bG = $$0.q("wasOnGround");
   }

   public boolean gp() {
      return this.go() <= 1;
   }

   protected lt m() {
      return lv.X;
   }

   @Override
   protected boolean aa() {
      return this.go() > 0;
   }

   @Override
   public void h() {
      this.bE = this.bD;
      this.bD = this.bD + (this.d - this.bD) * 0.5F;
      super.h();
      if (this.aJ() && !this.bG) {
         float $$0 = this.a(this.aw()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ae.i() * (float) (Math.PI * 2);
            float $$4 = this.ae.i() * 0.5F + 0.5F;
            float $$5 = azk.a($$3) * $$1 * $$4;
            float $$6 = azk.b($$3) * $$1 * $$4;
            this.dV().a(this.m(), this.dA() + (double)$$5, this.dC(), this.dG() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gm(), this.fd(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aJ() && this.bG) {
         this.d = 1.0F;
      }

      this.bG = this.aJ();
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
      double $$0 = this.dA();
      double $$1 = this.dC();
      double $$2 = this.dG();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(akg<?> $$0) {
      if (bF.equals($$0)) {
         this.i_();
         this.w(this.aW);
         this.aU = this.aW;
         if (this.bj() && this.ae.a(20) == 0) {
            this.br();
         }
      }

      super.a($$0);
   }

   @Override
   public bwb<? extends cns> aq() {
      return (bwb<? extends cns>)super.aq();
   }

   @Override
   public void a(bvs.e $$0) {
      int $$1 = this.go();
      if (!this.dV().C && $$1 > 1 && this.eG()) {
         float $$2 = this.a(this.aw()).a();
         float $$3 = $$2 / 2.0F;
         int $$4 = $$1 / 2;
         int $$5 = 2 + this.ae.a(3);
         fdu $$6 = this.cr();

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$3;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$3;
            this.a(this.aq(), new bvm(bvn.b, false, false, $$6), bwa.k, $$3x -> {
               $$3x.a($$4, true);
               $$3x.b(this.dA() + (double)$$8, this.dC() + 0.5, this.dG() + (double)$$9, this.ae.i() * 360.0F, 0.0F);
            });
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bvs $$0) {
      super.h($$0);
      if ($$0 instanceof cis && this.t()) {
         this.j((bwr)$$0);
      }
   }

   @Override
   public void a_(cqi $$0) {
      if (this.t()) {
         this.j($$0);
      }
   }

   protected void j(bwr $$0) {
      if (this.dV() instanceof arn $$1 && this.bK() && this.i($$0) && this.E($$0)) {
         buh $$2 = this.dW().b((bwr)this);
         if ($$0.a($$1, $$2, this.x())) {
            this.a(awk.xZ, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            dej.a($$1, (bvs)$$0, $$2);
         }
      }
   }

   @Override
   protected fcu a(bvs $$0, bvv $$1, float $$2) {
      return new fcu(0.0, (double)$$1.b() - 0.015625 * (double)this.go() * (double)$$2, 0.0);
   }

   protected boolean t() {
      return !this.gp() && this.dj();
   }

   protected float x() {
      return (float)this.h(bxx.c);
   }

   @Override
   protected awj e(buh $$0) {
      return this.gp() ? awk.ze : awk.yb;
   }

   @Override
   protected awj l_() {
      return this.gp() ? awk.zd : awk.ya;
   }

   protected awj gm() {
      return this.gp() ? awk.zg : awk.yd;
   }

   public static boolean c(bwb<cns> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      if ($$1.an() != btn.a) {
         if (bwa.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.t($$3).a(awy.as) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.as() && $$1.A($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dio)) {
            return false;
         }

         dgw $$5 = new dgw($$3);
         boolean $$6 = efk.a($$5.h, $$5.i, ((dio)$$1).E(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float fd() {
      return 0.4F * (float)this.go();
   }

   @Override
   public int ac() {
      return 0;
   }

   protected boolean gq() {
      return this.go() > 0;
   }

   @Override
   public void s() {
      fcu $$0 = this.dy();
      this.n($$0.d, (double)this.fg(), $$0.f);
      this.ar = true;
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      azs $$4 = $$0.C_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float j() {
      float $$0 = this.gp() ? 1.4F : 0.8F;
      return ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * $$0;
   }

   protected awj gn() {
      return this.gp() ? awk.zf : awk.yc;
   }

   @Override
   public bvv e(bxd $$0) {
      return super.e($$0).a((float)this.go());
   }

   static class a extends cdn {
      private final cns a;
      private int b;

      public a(cns $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdn.a.b));
      }

      @Override
      public boolean b() {
         bwr $$0 = this.a.f();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.L() instanceof cns.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         bwr $$0 = this.a.f();
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
         bwr $$0 = this.a.f();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.L() instanceof cns.d $$1) {
            $$1.a(this.a.dL(), this.a.t());
         }
      }
   }

   static class b extends cdn {
      private final cns a;

      public b(cns $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdn.a.c, cdn.a.a));
         $$0.O().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bj() || this.a.bw()) && this.a.L() instanceof cns.d;
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.dY().i() < 0.8F) {
            this.a.N().a();
         }

         if (this.a.L() instanceof cns.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends cdn {
      private final cns a;

      public c(cns $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdn.a.c, cdn.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bZ();
      }

      @Override
      public void a() {
         if (this.a.L() instanceof cns.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends ccq {
      private float l;
      private int m;
      private final cns n;
      private boolean o;

      public d(cns $$0) {
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
         this.k = ccq.a.b;
      }

      @Override
      public void a() {
         this.d.w(this.b(this.d.dL(), this.l, 90.0F));
         this.d.aW = this.d.dL();
         this.d.aU = this.d.dL();
         if (this.k != ccq.a.b) {
            this.d.H(0.0F);
         } else {
            this.k = ccq.a.a;
            if (this.d.aJ()) {
               this.d.C((float)(this.h * this.d.h(bxx.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.n();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.N().a();
                  if (this.n.gq()) {
                     this.n.a(this.n.gn(), this.n.fd(), this.n.j());
                  }
               } else {
                  this.n.bf = 0.0F;
                  this.n.bh = 0.0F;
                  this.d.C(0.0F);
               }
            } else {
               this.d.C((float)(this.h * this.d.h(bxx.v)));
            }
         }
      }
   }

   static class e extends cdn {
      private final cns a;
      private float b;
      private int c;

      public e(cns $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdn.a.b));
      }

      @Override
      public boolean b() {
         return this.a.f() == null && (this.a.aJ() || this.a.bj() || this.a.bw() || this.a.b(buy.y)) && this.a.L() instanceof cns.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dY().a(60));
            this.b = (float)this.a.dY().a(360);
         }

         if (this.a.L() instanceof cns.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
