import java.util.EnumSet;
import javax.annotation.Nullable;

public class cpy extends cpk implements bzd {
   public static final float a = 45.836624F;
   public static final int b = azz.f((float) (Math.PI * 5.0 / 4.0));
   protected static final aku<Byte> c = aky.a(cpy.class, akw.a);
   private static final int d = 1;
   @Nullable
   byh e;
   @Nullable
   private iw f;
   private boolean bI;
   private int bJ;

   public cpy(bxn<? extends cpy> $$0, dkj $$1) {
      super($$0, $$1);
      this.bC = new cpy.c(this);
      this.bA = 3;
   }

   @Override
   public boolean aZ() {
      return this.af % b == 0;
   }

   @Override
   protected boolean aK() {
      return !this.dQ();
   }

   @Override
   public void g() {
      this.ad = true;
      super.g();
      this.ad = false;
      this.f(true);
      if (this.bI && --this.bJ <= 0) {
         this.bJ = 20;
         this.a(this.dW().j(), 1.0F);
      }
   }

   @Override
   protected void C() {
      super.C();
      this.bF.a(0, new cev(this));
      this.bF.a(4, new cpy.a());
      this.bF.a(8, new cpy.d());
      this.bF.a(9, new cfj(this, csi.class, 3.0F, 1.0F));
      this.bF.a(10, new cfj(this, byh.class, 8.0F));
      this.bG.a(1, new cgt(this, ctz.class).a());
      this.bG.a(2, new cpy.b(this));
      this.bG.a(3, new cgu<>(this, csi.class, true));
   }

   public static bzk.a m() {
      return cpk.gA().a(bzl.s, 14.0).a(bzl.c, 4.0);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.f = $$0.<iw>a("bound_pos", iw.a).orElse(null);
      $$0.e("life_ticks").ifPresentOrElse(this::b, () -> this.bI = false);
   }

   @Override
   public void x(bxe $$0) {
      super.x($$0);
      if ($$0 instanceof cpy $$1) {
         this.e = $$1.u();
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.b("bound_pos", iw.a, this.f);
      if (this.bI) {
         $$0.a("life_ticks", this.bJ);
      }
   }

   @Nullable
   public byh u() {
      return this.e;
   }

   @Nullable
   public iw gu() {
      return this.f;
   }

   public void h(@Nullable iw $$0) {
      this.f = $$0;
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

   public boolean gv() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(byh $$0) {
      this.e = $$0;
   }

   public void b(int $$0) {
      this.bI = true;
      this.bJ = $$0;
   }

   @Override
   protected awx s() {
      return awy.BS;
   }

   @Override
   protected awx j_() {
      return awy.BU;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.BV;
   }

   @Override
   public float bw() {
      return 1.0F;
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      bai $$4 = $$0.G_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bai $$0, bva $$1) {
      this.a(bxo.a, new dak(dao.pP));
      this.a(bxo.a, 0.0F);
   }

   class a extends cfb {
      public a() {
         this.a(EnumSet.of(cfb.a.a));
      }

      @Override
      public boolean b() {
         byf $$0 = cpy.this.e();
         return $$0 != null && $$0.bJ() && !cpy.this.K().b() && cpy.this.ae.a(b(7)) == 0 ? cpy.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cpy.this.K().b() && cpy.this.gv() && cpy.this.e() != null && cpy.this.e().bJ();
      }

      @Override
      public void d() {
         byf $$0 = cpy.this.e();
         if ($$0 != null) {
            fgc $$1 = $$0.bD();
            cpy.this.bC.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cpy.this.w(true);
         cpy.this.a(awy.BT, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cpy.this.w(false);
      }

      @Override
      public boolean W_() {
         return true;
      }

      @Override
      public void a() {
         byf $$0 = cpy.this.e();
         if ($$0 != null) {
            if (cpy.this.cR().c($$0.cR())) {
               cpy.this.c(a(cpy.this.dV()), $$0);
               cpy.this.w(false);
            } else {
               double $$1 = cpy.this.g($$0);
               if ($$1 < 9.0) {
                  fgc $$2 = $$0.bD();
                  cpy.this.bC.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends chb {
      private final ciu b = ciu.b().d().e();

      public b(final byn $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return cpy.this.e != null && cpy.this.e.e() != null && this.a(cpy.this.e.e(), this.b);
      }

      @Override
      public void d() {
         cpy.this.g(cpy.this.e.e());
         super.d();
      }
   }

   class c extends cee {
      public c(final cpy $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cee.a.b) {
            fgc $$0 = new fgc(this.e - cpy.this.dA(), this.f - cpy.this.dC(), this.g - cpy.this.dG());
            double $$1 = $$0.g();
            if ($$1 < cpy.this.cR().a()) {
               this.k = cee.a.a;
               cpy.this.i(cpy.this.dy().c(0.5));
            } else {
               cpy.this.i(cpy.this.dy().e($$0.c(this.h * 0.05 / $$1)));
               if (cpy.this.e() == null) {
                  fgc $$2 = cpy.this.dy();
                  cpy.this.w(-((float)azz.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cpy.this.aV = cpy.this.dL();
               } else {
                  double $$3 = cpy.this.e().dA() - cpy.this.dA();
                  double $$4 = cpy.this.e().dG() - cpy.this.dG();
                  cpy.this.w(-((float)azz.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cpy.this.aV = cpy.this.dL();
               }
            }
         }
      }
   }

   class d extends cfb {
      public d() {
         this.a(EnumSet.of(cfb.a.a));
      }

      @Override
      public boolean b() {
         return !cpy.this.K().b() && cpy.this.ae.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         iw $$0 = cpy.this.gu();
         if ($$0 == null) {
            $$0 = cpy.this.dv();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            iw $$2 = $$0.b(cpy.this.ae.a(15) - 7, cpy.this.ae.a(11) - 5, cpy.this.ae.a(15) - 7);
            if (cpy.this.dV().v($$2)) {
               cpy.this.bC.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cpy.this.e() == null) {
                  cpy.this.I().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
