import java.util.EnumSet;
import javax.annotation.Nullable;

public class cnx extends cnj implements bxp {
   public static final float a = 45.836624F;
   public static final int b = azk.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akg<Byte> c = akk.a(cnx.class, aki.a);
   private static final int d = 1;
   @Nullable
   bwt bE;
   @Nullable
   private jj bF;
   private boolean bG;
   private int bH;

   public cnx(bwb<? extends cnx> $$0, dhp $$1) {
      super($$0, $$1);
      this.by = new cnx.c(this);
      this.bw = 3;
   }

   @Override
   public boolean ba() {
      return this.af % b == 0;
   }

   @Override
   protected boolean aL() {
      return !this.dQ();
   }

   @Override
   public void h() {
      this.ad = true;
      super.h();
      this.ad = false;
      this.f(true);
      if (this.bG && --this.bH <= 0) {
         this.bH = 20;
         this.a(this.dW().j(), 1.0F);
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bB.a(0, new cdh(this));
      this.bB.a(4, new cnx.a());
      this.bB.a(8, new cnx.d());
      this.bB.a(9, new cdv(this, cqi.class, 3.0F, 1.0F));
      this.bB.a(10, new cdv(this, bwt.class, 8.0F));
      this.bC.a(1, new cff(this, crw.class).a());
      this.bC.a(2, new cnx.b(this));
      this.bC.a(3, new cfg<>(this, cqi.class, true));
   }

   public static bxw.a j() {
      return cnj.gt().a(bxx.s, 14.0).a(bxx.c, 4.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bF = new jj($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void x(bvs $$0) {
      super.x($$0);
      if ($$0 instanceof cnx $$1) {
         this.bE = $$1.m();
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      if (this.bF != null) {
         $$0.a("BoundX", this.bF.u());
         $$0.a("BoundY", this.bF.v());
         $$0.a("BoundZ", this.bF.w());
      }

      if (this.bG) {
         $$0.a("LifeTicks", this.bH);
      }
   }

   @Nullable
   public bwt m() {
      return this.bE;
   }

   @Nullable
   public jj n() {
      return this.bF;
   }

   public void i(@Nullable jj $$0) {
      this.bF = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.al.a(c);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.al.a(c);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.al.a(c, (byte)($$2 & 0xFF));
   }

   public boolean t() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bwt $$0) {
      this.bE = $$0;
   }

   public void b(int $$0) {
      this.bG = true;
      this.bH = $$0;
   }

   @Override
   protected awj u() {
      return awk.BM;
   }

   @Override
   protected awj l_() {
      return awk.BO;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.BP;
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      azs $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azs $$0, bto $$1) {
      this.a(bwc.a, new cxy(cyc.pK));
      this.a(bwc.a, 0.0F);
   }

   class a extends cdn {
      public a() {
         this.a(EnumSet.of(cdn.a.a));
      }

      @Override
      public boolean b() {
         bwr $$0 = cnx.this.f();
         return $$0 != null && $$0.bK() && !cnx.this.L().b() && cnx.this.ae.a(b(7)) == 0 ? cnx.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cnx.this.L().b() && cnx.this.t() && cnx.this.f() != null && cnx.this.f().bK();
      }

      @Override
      public void d() {
         bwr $$0 = cnx.this.f();
         if ($$0 != null) {
            fcu $$1 = $$0.bE();
            cnx.this.by.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cnx.this.w(true);
         cnx.this.a(awk.BN, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cnx.this.w(false);
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         bwr $$0 = cnx.this.f();
         if ($$0 != null) {
            if (cnx.this.cR().c($$0.cR())) {
               cnx.this.c(a(cnx.this.dV()), $$0);
               cnx.this.w(false);
            } else {
               double $$1 = cnx.this.g($$0);
               if ($$1 < 9.0) {
                  fcu $$2 = $$0.bE();
                  cnx.this.by.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cfn {
      private final chg b = chg.b().d().e();

      public b(final bwz $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return cnx.this.bE != null && cnx.this.bE.f() != null && this.a(cnx.this.bE.f(), this.b);
      }

      @Override
      public void d() {
         cnx.this.h(cnx.this.bE.f());
         super.d();
      }
   }

   class c extends ccq {
      public c(final cnx $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == ccq.a.b) {
            fcu $$0 = new fcu(this.e - cnx.this.dA(), this.f - cnx.this.dC(), this.g - cnx.this.dG());
            double $$1 = $$0.g();
            if ($$1 < cnx.this.cR().a()) {
               this.k = ccq.a.a;
               cnx.this.i(cnx.this.dy().c(0.5));
            } else {
               cnx.this.i(cnx.this.dy().e($$0.c(this.h * 0.05 / $$1)));
               if (cnx.this.f() == null) {
                  fcu $$2 = cnx.this.dy();
                  cnx.this.w(-((float)azk.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cnx.this.aU = cnx.this.dL();
               } else {
                  double $$3 = cnx.this.f().dA() - cnx.this.dA();
                  double $$4 = cnx.this.f().dG() - cnx.this.dG();
                  cnx.this.w(-((float)azk.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cnx.this.aU = cnx.this.dL();
               }
            }
         }
      }
   }

   class d extends cdn {
      public d() {
         this.a(EnumSet.of(cdn.a.a));
      }

      @Override
      public boolean b() {
         return !cnx.this.L().b() && cnx.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         jj $$0 = cnx.this.n();
         if ($$0 == null) {
            $$0 = cnx.this.dv();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            jj $$2 = $$0.b(cnx.this.ae.a(15) - 7, cnx.this.ae.a(11) - 5, cnx.this.ae.a(15) - 7);
            if (cnx.this.dV().u($$2)) {
               cnx.this.by.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cnx.this.f() == null) {
                  cnx.this.J().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
