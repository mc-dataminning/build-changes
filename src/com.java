import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class com extends bxg implements cnv {
   private static final akj<Integer> bH = akn.a(com.class, akl.b);
   public static final int a = 1;
   public static final int b = 127;
   public static final int c = 4;
   public float d;
   public float bF;
   public float bG;
   private boolean bI;

   public com(bwo<? extends com> $$0, dja $$1) {
      super($$0, $$1);
      this.cN();
      this.bA = new com.d(this);
   }

   @Override
   protected void D() {
      this.bD.a(1, new com.b(this));
      this.bD.a(2, new com.a(this));
      this.bD.a(3, new com.e(this));
      this.bD.a(5, new com.c(this));
      this.bE.a(1, new cft<>(this, crc.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
      this.bE.a(3, new cft<>(this, cjk.class, true));
   }

   @Override
   public awo dm() {
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
      this.ay();
      this.i_();
      this.g(byk.s).a((double)($$2 * $$2));
      this.g(byk.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(byk.c).a((double)$$2);
      if ($$1) {
         this.d(this.eU());
      }

      this.by = $$2;
   }

   public int gp() {
      return this.al.a(bH);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Size", this.gp() - 1);
      $$0.a("wasOnGround", this.bI);
   }

   @Override
   public void a(tz $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bI = $$0.q("wasOnGround");
   }

   public boolean gq() {
      return this.gp() <= 1;
   }

   protected lv m() {
      return lx.X;
   }

   @Override
   protected boolean aa() {
      return this.gp() > 0;
   }

   @Override
   public void h() {
      this.bG = this.bF;
      this.bF = this.bF + (this.d - this.bF) * 0.5F;
      super.h();
      if (this.aJ() && !this.bI) {
         float $$0 = this.a(this.aw()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ae.i() * (float) (Math.PI * 2);
            float $$4 = this.ae.i() * 0.5F + 0.5F;
            float $$5 = azm.a($$3) * $$1 * $$4;
            float $$6 = azm.b($$3) * $$1 * $$4;
            this.dV().a(this.m(), this.dA() + (double)$$5, this.dC(), this.dG() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gn(), this.fe(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aJ() && this.bI) {
         this.d = 1.0F;
      }

      this.bI = this.aJ();
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
   public void a(akj<?> $$0) {
      if (bH.equals($$0)) {
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
   public bwo<? extends com> aq() {
      return (bwo<? extends com>)super.aq();
   }

   @Override
   public void a(bwf.e $$0) {
      int $$1 = this.gp();
      if (!this.dV().C && $$1 > 1 && this.eH()) {
         float $$2 = this.a(this.aw()).a();
         float $$3 = $$2 / 2.0F;
         int $$4 = $$1 / 2;
         int $$5 = 2 + this.ae.a(3);
         ffq $$6 = this.cr();

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$3;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$3;
            this.a(this.aq(), new bvz(bwa.b, false, false, $$6), bwn.k, $$3x -> {
               $$3x.a($$4, true);
               $$3x.b(this.dA() + (double)$$8, this.dC() + 0.5, this.dG() + (double)$$9, this.ae.i() * 360.0F, 0.0F);
            });
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bwf $$0) {
      super.h($$0);
      if ($$0 instanceof cjk && this.t()) {
         this.i((bxe)$$0);
      }
   }

   @Override
   public void a_(crc $$0) {
      if (this.t()) {
         this.i($$0);
      }
   }

   protected void i(bxe $$0) {
      if (this.dV() instanceof arq $$1 && this.bK() && this.h($$0) && this.E($$0)) {
         buu $$2 = this.dW().b((bxe)this);
         if ($$0.a($$1, $$2, this.x())) {
            this.a(awn.yf, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            dfs.a($$1, (bwf)$$0, $$2);
         }
      }
   }

   @Override
   protected feq a(bwf $$0, bwi $$1, float $$2) {
      return new feq(0.0, (double)$$1.b() - 0.015625 * (double)this.gp() * (double)$$2, 0.0);
   }

   protected boolean t() {
      return !this.gq() && this.dj();
   }

   protected float x() {
      return (float)this.h(byk.c);
   }

   @Override
   protected awm e(buu $$0) {
      return this.gq() ? awn.zk : awn.yh;
   }

   @Override
   protected awm l_() {
      return this.gq() ? awn.zj : awn.yg;
   }

   protected awm gn() {
      return this.gq() ? awn.zm : awn.yj;
   }

   public static boolean c(bwo<com> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      if ($$1.an() != bua.a) {
         if (bwn.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.u($$3).a(axb.as) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.as() && $$1.B($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof djz)) {
            return false;
         }

         dih $$5 = new dih($$3);
         boolean $$6 = ehf.a($$5.h, $$5.i, ((djz)$$1).E(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float fe() {
      return 0.4F * (float)this.gp();
   }

   @Override
   public int ac() {
      return 0;
   }

   protected boolean gr() {
      return this.gp() > 0;
   }

   @Override
   public void s() {
      feq $$0 = this.dy();
      this.n($$0.d, (double)this.fh(), $$0.f);
      this.ar = true;
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
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
      float $$0 = this.gq() ? 1.4F : 0.8F;
      return ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * $$0;
   }

   protected awm go() {
      return this.gq() ? awn.zl : awn.yi;
   }

   @Override
   public bwi e(bxq $$0) {
      return super.e($$0).a((float)this.gp());
   }

   static class a extends cea {
      private final com a;
      private int b;

      public a(com $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cea.a.b));
      }

      @Override
      public boolean b() {
         bxe $$0 = this.a.f();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.L() instanceof com.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         bxe $$0 = this.a.f();
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
         bxe $$0 = this.a.f();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.L() instanceof com.d $$1) {
            $$1.a(this.a.dL(), this.a.t());
         }
      }
   }

   static class b extends cea {
      private final com a;

      public b(com $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cea.a.c, cea.a.a));
         $$0.O().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bj() || this.a.bw()) && this.a.L() instanceof com.d;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.dY().i() < 0.8F) {
            this.a.N().a();
         }

         if (this.a.L() instanceof com.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends cea {
      private final com a;

      public c(com $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cea.a.c, cea.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bZ();
      }

      @Override
      public void a() {
         if (this.a.L() instanceof com.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends cdd {
      private float l;
      private int m;
      private final com n;
      private boolean o;

      public d(com $$0) {
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
         this.k = cdd.a.b;
      }

      @Override
      public void a() {
         this.d.w(this.b(this.d.dL(), this.l, 90.0F));
         this.d.aX = this.d.dL();
         this.d.aV = this.d.dL();
         if (this.k != cdd.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = cdd.a.a;
            if (this.d.aJ()) {
               this.d.B((float)(this.h * this.d.h(byk.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.n();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.N().a();
                  if (this.n.gr()) {
                     this.n.a(this.n.go(), this.n.fe(), this.n.j());
                  }
               } else {
                  this.n.bg = 0.0F;
                  this.n.bi = 0.0F;
                  this.d.B(0.0F);
               }
            } else {
               this.d.B((float)(this.h * this.d.h(byk.v)));
            }
         }
      }
   }

   static class e extends cea {
      private final com a;
      private float b;
      private int c;

      public e(com $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cea.a.b));
      }

      @Override
      public boolean b() {
         return this.a.f() == null && (this.a.aJ() || this.a.bj() || this.a.bw() || this.a.b(bvl.y)) && this.a.L() instanceof com.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dY().a(60));
            this.b = (float)this.a.dY().a(360);
         }

         if (this.a.L() instanceof com.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
