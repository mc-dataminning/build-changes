import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cpm extends bxt implements cpc {
   public static final float a = 7.448451F;
   public static final int b = azz.f(24.166098F);
   private static final aku<Integer> c = aky.a(cpm.class, akw.b);
   fgc d = fgc.c;
   @Nullable
   iw e;
   cpm.a f = cpm.a.a;

   public cpm(bxn<? extends cpm> $$0, dkj $$1) {
      super($$0, $$1);
      this.bA = 5;
      this.bC = new cpm.g(this);
      this.bB = new cpm.f(this);
   }

   @Override
   public boolean aZ() {
      return (this.p() + this.af) % b == 0;
   }

   @Override
   protected cdz H() {
      return new cpm.d(this);
   }

   @Override
   protected void C() {
      this.bF.a(1, new cpm.c());
      this.bF.a(2, new cpm.i());
      this.bF.a(3, new cpm.e());
      this.bG.a(1, new cpm.b());
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   public void b(int $$0) {
      this.al.a(c, azz.a($$0, 0, 64));
   }

   private void u() {
      this.h_();
      this.g(bzl.c).a((double)(6 + this.m()));
   }

   public int m() {
      return this.al.a(c);
   }

   @Override
   public void a(aku<?> $$0) {
      if (c.equals($$0)) {
         this.u();
      }

      super.a($$0);
   }

   public int p() {
      return this.ao() * 3;
   }

   @Override
   protected boolean Z() {
      return true;
   }

   @Override
   public void g() {
      super.g();
      if (this.dV().C) {
         float $$0 = azz.b((float)(this.p() + this.af) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = azz.b((float)(this.p() + this.af + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awy.ul, this.dm(), 0.95F + this.ae.i() * 0.05F, 0.95F + this.ae.i() * 0.05F, false);
         }

         float $$2 = this.dq() * 1.48F;
         float $$3 = azz.b(this.dL() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = azz.a(this.dL() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dr() * 2.5F;
         this.dV().a(lz.ac, this.dA() + (double)$$3, this.dC() + (double)$$5, this.dG() + (double)$$4, 0.0, 0.0, 0.0);
         this.dV().a(lz.ac, this.dA() - (double)$$3, this.dC() + (double)$$5, this.dG() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void d_() {
      if (this.bJ() && this.go()) {
         this.e(8.0F);
      }

      super.d_();
   }

   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      this.e = this.dv().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.e = $$0.<iw>a("anchor_pos", iw.a).orElse(null);
      this.b($$0.b("size", 0));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.b("anchor_pos", iw.a, this.e);
      $$0.a("size", this.m());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public awz dm() {
      return awz.f;
   }

   @Override
   protected awx s() {
      return awy.ui;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.um;
   }

   @Override
   protected awx j_() {
      return awy.uk;
   }

   @Override
   protected float fe() {
      return 1.0F;
   }

   @Override
   public boolean a(bxn<?> $$0) {
      return true;
   }

   @Override
   public bxh e(byr $$0) {
      int $$1 = this.m();
      bxh $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   boolean a(asb $$0, byf $$1, ciu $$2) {
      return $$2.a($$0, this, $$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cfb {
      private final ciu b = ciu.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            asb $$0 = a(cpm.this.dV());
            List<csi> $$1 = $$0.a(this.b, cpm.this, cpm.this.cR().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
               $$1.sort(Comparator.comparing(bxe::dC).reversed());

               for (csi $$2 : $$1) {
                  if (cpm.this.a($$0, $$2, ciu.a)) {
                     cpm.this.g($$2);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         byf $$0 = cpm.this.e();
         return $$0 != null ? cpm.this.a(a(cpm.this.dV()), $$0, ciu.a) : false;
      }
   }

   class c extends cfb {
      private int b;

      @Override
      public boolean b() {
         byf $$0 = cpm.this.e();
         return $$0 != null ? cpm.this.a(a(cpm.this.dV()), $$0, ciu.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         cpm.this.f = cpm.a.a;
         this.h();
      }

      @Override
      public void e() {
         if (cpm.this.e != null) {
            cpm.this.e = cpm.this.dV().a(ehp.a.e, cpm.this.e).b(10 + cpm.this.ae.a(20));
         }
      }

      @Override
      public void a() {
         if (cpm.this.f == cpm.a.a) {
            this.b--;
            if (this.b <= 0) {
               cpm.this.f = cpm.a.b;
               this.h();
               this.b = this.a((8 + cpm.this.ae.a(4)) * 20);
               cpm.this.a(awy.un, 10.0F, 0.95F + cpm.this.ae.i() * 0.1F);
            }
         }
      }

      private void h() {
         if (cpm.this.e != null) {
            cpm.this.e = cpm.this.e().dv().b(20 + cpm.this.ae.a(20));
            if (cpm.this.e.v() < cpm.this.dV().P()) {
               cpm.this.e = new iw(cpm.this.e.u(), cpm.this.dV().P() + 1, cpm.this.e.w());
            }
         }
      }
   }

   class d extends cdz {
      public d(final byh $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cpm.this.aX = cpm.this.aV;
         cpm.this.aV = cpm.this.dL();
      }
   }

   class e extends cpm.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return cpm.this.e() == null || cpm.this.f == cpm.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + cpm.this.ae.i() * 10.0F;
         this.e = -4.0F + cpm.this.ae.i() * 9.0F;
         this.f = cpm.this.ae.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (cpm.this.ae.a(this.a(350)) == 0) {
            this.e = -4.0F + cpm.this.ae.i() * 9.0F;
         }

         if (cpm.this.ae.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cpm.this.ae.a(this.a(450)) == 0) {
            this.c = cpm.this.ae.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cpm.this.d.e < cpm.this.dC() && !cpm.this.dV().v(cpm.this.dv().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cpm.this.d.e > cpm.this.dC() && !cpm.this.dV().v(cpm.this.dv().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (cpm.this.e == null) {
            cpm.this.e = cpm.this.dv();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cpm.this.d = fgc.a(cpm.this.e).b((double)(this.d * azz.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * azz.a(this.c)));
      }
   }

   static class f extends ced {
      public f(byh $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends cee {
      private float m = 0.1F;

      public g(final byh $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cpm.this.P) {
            cpm.this.w(cpm.this.dL() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cpm.this.d.d - cpm.this.dA();
         double $$1 = cpm.this.d.e - cpm.this.dC();
         double $$2 = cpm.this.d.f - cpm.this.dG();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cpm.this.dL();
            float $$7 = (float)azz.d($$2, $$0);
            float $$8 = azz.h(cpm.this.dL() + 90.0F);
            float $$9 = azz.h($$7 * (180.0F / (float)Math.PI));
            cpm.this.w(azz.e($$8, $$9, 4.0F) - 90.0F);
            cpm.this.aV = cpm.this.dL();
            if (azz.d($$6, cpm.this.dL()) < 3.0F) {
               this.m = azz.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = azz.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(azz.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cpm.this.x($$10);
            float $$11 = cpm.this.dL() + 90.0F;
            double $$12 = (double)(this.m * azz.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * azz.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * azz.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            fgc $$15 = cpm.this.dy();
            cpm.this.i($$15.e(new fgc($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends cfb {
      public h() {
         this.a(EnumSet.of(cfb.a.a));
      }

      protected boolean h() {
         return cpm.this.d.c(cpm.this.dA(), cpm.this.dC(), cpm.this.dG()) < 4.0;
      }
   }

   class i extends cpm.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return cpm.this.e() != null && cpm.this.f == cpm.a.b;
      }

      @Override
      public boolean c() {
         byf $$0 = cpm.this.e();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bJ()) {
            return false;
         } else {
            if ($$0 instanceof csi $$1 && ($$0.ak() || $$1.gz())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (cpm.this.af > this.e) {
                  this.e = cpm.this.af + 20;
                  List<cjy> $$2 = cpm.this.dV().a(cjy.class, cpm.this.cR().g(16.0), bxl.a);

                  for (cjy $$3 : $$2) {
                     $$3.gJ();
                  }

                  this.d = !$$2.isEmpty();
               }

               return !this.d;
            }
         }
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         cpm.this.g(null);
         cpm.this.f = cpm.a.a;
      }

      @Override
      public void a() {
         byf $$0 = cpm.this.e();
         if ($$0 != null) {
            cpm.this.d = new fgc($$0.dA(), $$0.e(0.5), $$0.dG());
            if (cpm.this.cR().g(0.2F).c($$0.cR())) {
               cpm.this.c(a(cpm.this.dV()), $$0);
               cpm.this.f = cpm.a.a;
               if (!cpm.this.ba()) {
                  cpm.this.dV().c(1039, cpm.this.dv(), 0);
               }
            } else if (cpm.this.P || cpm.this.aN > 0) {
               cpm.this.f = cpm.a.a;
            }
         }
      }
   }
}
