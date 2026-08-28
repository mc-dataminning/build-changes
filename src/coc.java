import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class coc extends bxb implements cnl {
   private static final akh<Integer> bG = akl.a(coc.class, akj.b);
   public static final int a = 1;
   public static final int b = 127;
   public static final int c = 4;
   public float d;
   public float bE;
   public float bF;
   private boolean bH;

   public coc(bwj<? extends coc> $$0, dip $$1) {
      super($$0, $$1);
      this.cN();
      this.bz = new coc.d(this);
   }

   @Override
   protected void D() {
      this.bC.a(1, new coc.b(this));
      this.bC.a(2, new coc.a(this));
      this.bC.a(3, new coc.e(this));
      this.bC.a(5, new coc.c(this));
      this.bD.a(1, new cfo<>(this, cqs.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
      this.bD.a(3, new cfo<>(this, cja.class, true));
   }

   @Override
   public awm dm() {
      return awm.f;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bG, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = azk.a($$0, 1, 127);
      this.al.a(bG, $$2);
      this.ay();
      this.i_();
      this.g(byf.s).a((double)($$2 * $$2));
      this.g(byf.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(byf.c).a((double)$$2);
      if ($$1) {
         this.d(this.eT());
      }

      this.bx = $$2;
   }

   public int go() {
      return this.al.a(bG);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Size", this.go() - 1);
      $$0.a("wasOnGround", this.bH);
   }

   @Override
   public void a(tx $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bH = $$0.q("wasOnGround");
   }

   public boolean gp() {
      return this.go() <= 1;
   }

   protected lv m() {
      return lx.X;
   }

   @Override
   protected boolean aa() {
      return this.go() > 0;
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
            float $$5 = azk.a($$3) * $$1 * $$4;
            float $$6 = azk.b($$3) * $$1 * $$4;
            this.dV().a(this.m(), this.dA() + (double)$$5, this.dC(), this.dG() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gm(), this.fd(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) / 0.8F);
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
      double $$0 = this.dA();
      double $$1 = this.dC();
      double $$2 = this.dG();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(akh<?> $$0) {
      if (bG.equals($$0)) {
         this.i_();
         this.w(this.aX);
         this.aV = this.aX;
         if (this.bj() && this.ae.a(20) == 0) {
            this.br();
         }
      }

      super.a($$0);
   }

   @Override
   public bwj<? extends coc> aq() {
      return (bwj<? extends coc>)super.aq();
   }

   @Override
   public void a(bwa.e $$0) {
      int $$1 = this.go();
      if (!this.dV().C && $$1 > 1 && this.eG()) {
         float $$2 = this.a(this.aw()).a();
         float $$3 = $$2 / 2.0F;
         int $$4 = $$1 / 2;
         int $$5 = 2 + this.ae.a(3);
         few $$6 = this.cr();

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$3;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$3;
            this.a(this.aq(), new bvu(bvv.b, false, false, $$6), bwi.k, $$3x -> {
               $$3x.a($$4, true);
               $$3x.b(this.dA() + (double)$$8, this.dC() + 0.5, this.dG() + (double)$$9, this.ae.i() * 360.0F, 0.0F);
            });
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bwa $$0) {
      super.h($$0);
      if ($$0 instanceof cja && this.t()) {
         this.i((bwz)$$0);
      }
   }

   @Override
   public void a_(cqs $$0) {
      if (this.t()) {
         this.i($$0);
      }
   }

   protected void i(bwz $$0) {
      if (this.dV() instanceof aro $$1 && this.bK() && this.h($$0) && this.E($$0)) {
         bup $$2 = this.dW().b((bwz)this);
         if ($$0.a($$1, $$2, this.x())) {
            this.a(awl.xZ, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            dfh.a($$1, (bwa)$$0, $$2);
         }
      }
   }

   @Override
   protected fdw a(bwa $$0, bwd $$1, float $$2) {
      return new fdw(0.0, (double)$$1.b() - 0.015625 * (double)this.go() * (double)$$2, 0.0);
   }

   protected boolean t() {
      return !this.gp() && this.dj();
   }

   protected float x() {
      return (float)this.h(byf.c);
   }

   @Override
   protected awk e(bup $$0) {
      return this.gp() ? awl.ze : awl.yb;
   }

   @Override
   protected awk l_() {
      return this.gp() ? awl.zd : awl.ya;
   }

   protected awk gm() {
      return this.gp() ? awl.zg : awl.yd;
   }

   public static boolean c(bwj<coc> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      if ($$1.an() != btv.a) {
         if (bwi.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.u($$3).a(awz.as) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.as() && $$1.B($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof djo)) {
            return false;
         }

         dhw $$5 = new dhw($$3);
         boolean $$6 = egm.a($$5.h, $$5.i, ((djo)$$1).E(), 987234911L).a(10) == 0;
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
      fdw $$0 = this.dy();
      this.n($$0.d, (double)this.fg(), $$0.f);
      this.ar = true;
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      azt $$4 = $$0.C_();
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

   protected awk gn() {
      return this.gp() ? awl.zf : awl.yc;
   }

   @Override
   public bwd e(bxl $$0) {
      return super.e($$0).a((float)this.go());
   }

   static class a extends cdv {
      private final coc a;
      private int b;

      public a(coc $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdv.a.b));
      }

      @Override
      public boolean b() {
         bwz $$0 = this.a.f();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.L() instanceof coc.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         bwz $$0 = this.a.f();
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
         bwz $$0 = this.a.f();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.L() instanceof coc.d $$1) {
            $$1.a(this.a.dL(), this.a.t());
         }
      }
   }

   static class b extends cdv {
      private final coc a;

      public b(coc $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdv.a.c, cdv.a.a));
         $$0.O().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bj() || this.a.bw()) && this.a.L() instanceof coc.d;
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

         if (this.a.L() instanceof coc.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends cdv {
      private final coc a;

      public c(coc $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdv.a.c, cdv.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bZ();
      }

      @Override
      public void a() {
         if (this.a.L() instanceof coc.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends ccy {
      private float l;
      private int m;
      private final coc n;
      private boolean o;

      public d(coc $$0) {
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
         this.k = ccy.a.b;
      }

      @Override
      public void a() {
         this.d.w(this.b(this.d.dL(), this.l, 90.0F));
         this.d.aX = this.d.dL();
         this.d.aV = this.d.dL();
         if (this.k != ccy.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = ccy.a.a;
            if (this.d.aJ()) {
               this.d.B((float)(this.h * this.d.h(byf.v)));
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
                  this.n.bg = 0.0F;
                  this.n.bi = 0.0F;
                  this.d.B(0.0F);
               }
            } else {
               this.d.B((float)(this.h * this.d.h(byf.v)));
            }
         }
      }
   }

   static class e extends cdv {
      private final coc a;
      private float b;
      private int c;

      public e(coc $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdv.a.b));
      }

      @Override
      public boolean b() {
         return this.a.f() == null && (this.a.aJ() || this.a.bj() || this.a.bw() || this.a.b(bvg.y)) && this.a.L() instanceof coc.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dY().a(60));
            this.b = (float)this.a.dY().a(360);
         }

         if (this.a.L() instanceof coc.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
