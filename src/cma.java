import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cma extends buy implements clq {
   public static final float a = 7.448451F;
   public static final int b = ayz.f(24.166098F);
   private static final ajy<Integer> c = akc.a(cma.class, aka.b);
   fba d = fba.c;
   ji bX = ji.c;
   cma.a bY = cma.a.a;

   public cma(bus<? extends cma> $$0, dgi $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new cma.g(this);
      this.bO = new cma.f(this);
   }

   @Override
   public boolean ba() {
      return (this.p() + this.af) % b == 0;
   }

   @Override
   protected cbd J() {
      return new cma.d(this);
   }

   @Override
   protected void E() {
      this.bS.a(1, new cma.c());
      this.bS.a(2, new cma.i());
      this.bS.a(3, new cma.e());
      this.bT.a(1, new cma.b());
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   public void b(int $$0) {
      this.al.a(c, ayz.a($$0, 0, 64));
   }

   private void t() {
      this.m_();
      this.g(bwp.c).a((double)(6 + this.m()));
   }

   public int m() {
      return this.al.a(c);
   }

   @Override
   public void a(ajy<?> $$0) {
      if (c.equals($$0)) {
         this.t();
      }

      super.a($$0);
   }

   public int p() {
      return this.ar() * 3;
   }

   @Override
   protected boolean ab() {
      return true;
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         float $$0 = ayz.b((float)(this.p() + this.af) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = ayz.b((float)(this.p() + this.af + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awa.tX, this.dm(), 0.95F + this.ae.i() * 0.05F, 0.95F + this.ae.i() * 0.05F, false);
         }

         float $$2 = this.dq() * 1.48F;
         float $$3 = ayz.b(this.dL() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = ayz.a(this.dL() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dr() * 2.5F;
         this.dV().a(lt.ab, this.dA() + (double)$$3, this.dC() + (double)$$5, this.dG() + (double)$$4, 0.0, 0.0, 0.0);
         this.dV().a(lt.ab, this.dA() - (double)$$3, this.dC() + (double)$$5, this.dG() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void d_() {
      if (this.bL() && this.gk()) {
         this.d(8.0F);
      }

      super.d_();
   }

   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      this.bX = this.dv().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bX = new ji($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("AX", this.bX.u());
      $$0.a("AY", this.bX.v());
      $$0.a("AZ", this.bX.w());
      $$0.a("Size", this.m());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public awb dm() {
      return awb.f;
   }

   @Override
   protected avz u() {
      return awa.tU;
   }

   @Override
   protected avz e(btb $$0) {
      return awa.tY;
   }

   @Override
   protected avz o_() {
      return awa.tW;
   }

   @Override
   protected float fg() {
      return 1.0F;
   }

   @Override
   public boolean a(bus<?> $$0) {
      return true;
   }

   @Override
   public buo e(bvt $$0) {
      int $$1 = this.m();
      buo $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   boolean a(ard $$0, bvh $$1, cfy $$2) {
      return $$2.a($$0, this, $$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends ccf {
      private final cfy b = cfy.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            ard $$0 = a(cma.this.dV());
            List<cox> $$1 = $$0.a(this.b, cma.this, cma.this.cR().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
               $$1.sort(Comparator.comparing(bul::dC).reversed());

               for (cox $$2 : $$1) {
                  if (cma.this.a($$0, $$2, cfy.a)) {
                     cma.this.h($$2);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bvh $$0 = cma.this.O_();
         return $$0 != null ? cma.this.a(a(cma.this.dV()), $$0, cfy.a) : false;
      }
   }

   class c extends ccf {
      private int b;

      @Override
      public boolean b() {
         bvh $$0 = cma.this.O_();
         return $$0 != null ? cma.this.a(a(cma.this.dV()), $$0, cfy.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         cma.this.bY = cma.a.a;
         this.h();
      }

      @Override
      public void e() {
         cma.this.bX = cma.this.dV().a(ecs.a.e, cma.this.bX).b(10 + cma.this.ae.a(20));
      }

      @Override
      public void a() {
         if (cma.this.bY == cma.a.a) {
            this.b--;
            if (this.b <= 0) {
               cma.this.bY = cma.a.b;
               this.h();
               this.b = this.a((8 + cma.this.ae.a(4)) * 20);
               cma.this.a(awa.tZ, 10.0F, 0.95F + cma.this.ae.i() * 0.1F);
            }
         }
      }

      private void h() {
         cma.this.bX = cma.this.O_().dv().b(20 + cma.this.ae.a(20));
         if (cma.this.bX.v() < cma.this.dV().P()) {
            cma.this.bX = new ji(cma.this.bX.u(), cma.this.dV().P() + 1, cma.this.bX.w());
         }
      }
   }

   class d extends cbd {
      public d(final bvj $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cma.this.aZ = cma.this.aX;
         cma.this.aX = cma.this.dL();
      }
   }

   class e extends cma.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return cma.this.O_() == null || cma.this.bY == cma.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + cma.this.ae.i() * 10.0F;
         this.e = -4.0F + cma.this.ae.i() * 9.0F;
         this.f = cma.this.ae.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (cma.this.ae.a(this.a(350)) == 0) {
            this.e = -4.0F + cma.this.ae.i() * 9.0F;
         }

         if (cma.this.ae.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cma.this.ae.a(this.a(450)) == 0) {
            this.c = cma.this.ae.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cma.this.d.e < cma.this.dC() && !cma.this.dV().u(cma.this.dv().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cma.this.d.e > cma.this.dC() && !cma.this.dV().u(cma.this.dv().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (ji.c.equals(cma.this.bX)) {
            cma.this.bX = cma.this.dv();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cma.this.d = fba.a(cma.this.bX).b((double)(this.d * ayz.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ayz.a(this.c)));
      }
   }

   static class f extends cbh {
      public f(bvj $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends cbi {
      private float m = 0.1F;

      public g(final bvj $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cma.this.P) {
            cma.this.v(cma.this.dL() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cma.this.d.d - cma.this.dA();
         double $$1 = cma.this.d.e - cma.this.dC();
         double $$2 = cma.this.d.f - cma.this.dG();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cma.this.dL();
            float $$7 = (float)ayz.d($$2, $$0);
            float $$8 = ayz.h(cma.this.dL() + 90.0F);
            float $$9 = ayz.h($$7 * (180.0F / (float)Math.PI));
            cma.this.v(ayz.e($$8, $$9, 4.0F) - 90.0F);
            cma.this.aX = cma.this.dL();
            if (ayz.d($$6, cma.this.dL()) < 3.0F) {
               this.m = ayz.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ayz.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ayz.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cma.this.w($$10);
            float $$11 = cma.this.dL() + 90.0F;
            double $$12 = (double)(this.m * ayz.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ayz.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ayz.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            fba $$15 = cma.this.dy();
            cma.this.i($$15.e(new fba($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends ccf {
      public h() {
         this.a(EnumSet.of(ccf.a.a));
      }

      protected boolean h() {
         return cma.this.d.c(cma.this.dA(), cma.this.dC(), cma.this.dG()) < 4.0;
      }
   }

   class i extends cma.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return cma.this.O_() != null && cma.this.bY == cma.a.b;
      }

      @Override
      public boolean c() {
         bvh $$0 = cma.this.O_();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bL()) {
            return false;
         } else {
            if ($$0 instanceof cox $$1 && ($$0.Z_() || $$1.b())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (cma.this.af > this.e) {
                  this.e = cma.this.af + 20;
                  List<chb> $$2 = cma.this.dV().a(chb.class, cma.this.cR().g(16.0), buq.a);

                  for (chb $$3 : $$2) {
                     $$3.gH();
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
         cma.this.h(null);
         cma.this.bY = cma.a.a;
      }

      @Override
      public void a() {
         bvh $$0 = cma.this.O_();
         if ($$0 != null) {
            cma.this.d = new fba($$0.dA(), $$0.e(0.5), $$0.dG());
            if (cma.this.cR().g(0.2F).c($$0.cR())) {
               cma.this.c(a(cma.this.dV()), $$0);
               cma.this.bY = cma.a.a;
               if (!cma.this.bb()) {
                  cma.this.dV().c(1039, cma.this.dv(), 0);
               }
            } else if (cma.this.P || cma.this.aN > 0) {
               cma.this.bY = cma.a.a;
            }
         }
      }
   }
}
