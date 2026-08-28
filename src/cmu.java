import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cmu extends bvo implements cmk {
   public static final float a = 7.448451F;
   public static final int b = ayz.f(24.166098F);
   private static final ajx<Integer> c = akb.a(cmu.class, ajz.b);
   fbx d = fbx.c;
   ji bE = ji.c;
   cmu.a bF = cmu.a.a;

   public cmu(bvi<? extends cmu> $$0, dgz $$1) {
      super($$0, $$1);
      this.bx = 5;
      this.bz = new cmu.g(this);
      this.by = new cmu.f(this);
   }

   @Override
   public boolean ba() {
      return (this.m() + this.af) % b == 0;
   }

   @Override
   protected cbu I() {
      return new cmu.d(this);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cmu.c());
      this.bC.a(2, new cmu.i());
      this.bC.a(3, new cmu.e());
      this.bD.a(1, new cmu.b());
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   public void b(int $$0) {
      this.al.a(c, ayz.a($$0, 0, 64));
   }

   private void n() {
      this.i_();
      this.g(bxg.c).a((double)(6 + this.j()));
   }

   public int j() {
      return this.al.a(c);
   }

   @Override
   public void a(ajx<?> $$0) {
      if (c.equals($$0)) {
         this.n();
      }

      super.a($$0);
   }

   public int m() {
      return this.ar() * 3;
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   public void h() {
      super.h();
      if (this.dU().C) {
         float $$0 = ayz.b((float)(this.m() + this.af) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = ayz.b((float)(this.m() + this.af + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dU().a(this.dz(), this.dB(), this.dF(), awa.uh, this.dl(), 0.95F + this.ae.i() * 0.05F, 0.95F + this.ae.i() * 0.05F, false);
         }

         float $$2 = this.dp() * 1.48F;
         float $$3 = ayz.b(this.dK() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = ayz.a(this.dK() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dq() * 2.5F;
         this.dU().a(lt.ac, this.dz() + (double)$$3, this.dB() + (double)$$5, this.dF() + (double)$$4, 0.0, 0.0, 0.0);
         this.dU().a(lt.ac, this.dz() - (double)$$3, this.dB() + (double)$$5, this.dF() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void k_() {
      if (this.bJ() && this.gm()) {
         this.e(8.0F);
      }

      super.k_();
   }

   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      this.bE = this.du().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bE = new ji($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("AX", this.bE.u());
      $$0.a("AY", this.bE.v());
      $$0.a("AZ", this.bE.w());
      $$0.a("Size", this.j());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public awb dl() {
      return awb.f;
   }

   @Override
   protected avz u() {
      return awa.ue;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.ui;
   }

   @Override
   protected avz l_() {
      return awa.ug;
   }

   @Override
   protected float fg() {
      return 1.0F;
   }

   @Override
   public boolean a(bvi<?> $$0) {
      return true;
   }

   @Override
   public bvd e(bwk $$0) {
      int $$1 = this.j();
      bvd $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   boolean a(ard $$0, bvy $$1, cgp $$2) {
      return $$2.a($$0, this, $$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends ccw {
      private final cgp b = cgp.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            ard $$0 = a(cmu.this.dU());
            List<cpr> $$1 = $$0.a(this.b, cmu.this, cmu.this.cQ().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
               $$1.sort(Comparator.comparing(bva::dB).reversed());

               for (cpr $$2 : $$1) {
                  if (cmu.this.a($$0, $$2, cgp.a)) {
                     cmu.this.h($$2);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bvy $$0 = cmu.this.f();
         return $$0 != null ? cmu.this.a(a(cmu.this.dU()), $$0, cgp.a) : false;
      }
   }

   class c extends ccw {
      private int b;

      @Override
      public boolean b() {
         bvy $$0 = cmu.this.f();
         return $$0 != null ? cmu.this.a(a(cmu.this.dU()), $$0, cgp.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         cmu.this.bF = cmu.a.a;
         this.h();
      }

      @Override
      public void e() {
         cmu.this.bE = cmu.this.dU().a(edo.a.e, cmu.this.bE).b(10 + cmu.this.ae.a(20));
      }

      @Override
      public void a() {
         if (cmu.this.bF == cmu.a.a) {
            this.b--;
            if (this.b <= 0) {
               cmu.this.bF = cmu.a.b;
               this.h();
               this.b = this.a((8 + cmu.this.ae.a(4)) * 20);
               cmu.this.a(awa.uj, 10.0F, 0.95F + cmu.this.ae.i() * 0.1F);
            }
         }
      }

      private void h() {
         cmu.this.bE = cmu.this.f().du().b(20 + cmu.this.ae.a(20));
         if (cmu.this.bE.v() < cmu.this.dU().P()) {
            cmu.this.bE = new ji(cmu.this.bE.u(), cmu.this.dU().P() + 1, cmu.this.bE.w());
         }
      }
   }

   class d extends cbu {
      public d(final bwa $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cmu.this.aX = cmu.this.aV;
         cmu.this.aV = cmu.this.dK();
      }
   }

   class e extends cmu.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return cmu.this.f() == null || cmu.this.bF == cmu.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + cmu.this.ae.i() * 10.0F;
         this.e = -4.0F + cmu.this.ae.i() * 9.0F;
         this.f = cmu.this.ae.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (cmu.this.ae.a(this.a(350)) == 0) {
            this.e = -4.0F + cmu.this.ae.i() * 9.0F;
         }

         if (cmu.this.ae.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cmu.this.ae.a(this.a(450)) == 0) {
            this.c = cmu.this.ae.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cmu.this.d.e < cmu.this.dB() && !cmu.this.dU().u(cmu.this.du().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cmu.this.d.e > cmu.this.dB() && !cmu.this.dU().u(cmu.this.du().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (ji.c.equals(cmu.this.bE)) {
            cmu.this.bE = cmu.this.du();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cmu.this.d = fbx.a(cmu.this.bE).b((double)(this.d * ayz.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ayz.a(this.c)));
      }
   }

   static class f extends cby {
      public f(bwa $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends cbz {
      private float m = 0.1F;

      public g(final bwa $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cmu.this.P) {
            cmu.this.w(cmu.this.dK() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cmu.this.d.d - cmu.this.dz();
         double $$1 = cmu.this.d.e - cmu.this.dB();
         double $$2 = cmu.this.d.f - cmu.this.dF();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cmu.this.dK();
            float $$7 = (float)ayz.d($$2, $$0);
            float $$8 = ayz.h(cmu.this.dK() + 90.0F);
            float $$9 = ayz.h($$7 * (180.0F / (float)Math.PI));
            cmu.this.w(ayz.e($$8, $$9, 4.0F) - 90.0F);
            cmu.this.aV = cmu.this.dK();
            if (ayz.d($$6, cmu.this.dK()) < 3.0F) {
               this.m = ayz.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ayz.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ayz.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cmu.this.x($$10);
            float $$11 = cmu.this.dK() + 90.0F;
            double $$12 = (double)(this.m * ayz.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ayz.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ayz.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            fbx $$15 = cmu.this.dx();
            cmu.this.i($$15.e(new fbx($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends ccw {
      public h() {
         this.a(EnumSet.of(ccw.a.a));
      }

      protected boolean h() {
         return cmu.this.d.c(cmu.this.dz(), cmu.this.dB(), cmu.this.dF()) < 4.0;
      }
   }

   class i extends cmu.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return cmu.this.f() != null && cmu.this.bF == cmu.a.b;
      }

      @Override
      public boolean c() {
         bvy $$0 = cmu.this.f();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bJ()) {
            return false;
         } else {
            if ($$0 instanceof cpr $$1 && ($$0.U_() || $$1.b())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (cmu.this.af > this.e) {
                  this.e = cmu.this.af + 20;
                  List<chs> $$2 = cmu.this.dU().a(chs.class, cmu.this.cQ().g(16.0), bvg.a);

                  for (chs $$3 : $$2) {
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
         cmu.this.h(null);
         cmu.this.bF = cmu.a.a;
      }

      @Override
      public void a() {
         bvy $$0 = cmu.this.f();
         if ($$0 != null) {
            cmu.this.d = new fbx($$0.dz(), $$0.e(0.5), $$0.dF());
            if (cmu.this.cQ().g(0.2F).c($$0.cQ())) {
               cmu.this.c(a(cmu.this.dU()), $$0);
               cmu.this.bF = cmu.a.a;
               if (!cmu.this.bb()) {
                  cmu.this.dU().c(1039, cmu.this.du(), 0);
               }
            } else if (cmu.this.P || cmu.this.aN > 0) {
               cmu.this.bF = cmu.a.a;
            }
         }
      }
   }
}
