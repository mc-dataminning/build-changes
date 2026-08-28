import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cly extends buw implements clo {
   public static final float a = 7.448451F;
   public static final int b = ayy.f(24.166098F);
   private static final ajx<Integer> c = akb.a(cly.class, ajz.b);
   fay d = fay.c;
   ji bX = ji.c;
   cly.a bY = cly.a.a;

   public cly(buq<? extends cly> $$0, dgg $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new cly.g(this);
      this.bO = new cly.f(this);
   }

   @Override
   public boolean ba() {
      return (this.p() + this.af) % b == 0;
   }

   @Override
   protected cbb G() {
      return new cly.d(this);
   }

   @Override
   protected void B() {
      this.bS.a(1, new cly.c());
      this.bS.a(2, new cly.i());
      this.bS.a(3, new cly.e());
      this.bT.a(1, new cly.b());
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   public void b(int $$0) {
      this.al.a(c, ayy.a($$0, 0, 64));
   }

   private void t() {
      this.m_();
      this.g(bwn.c).a((double)(6 + this.m()));
   }

   public int m() {
      return this.al.a(c);
   }

   @Override
   public void a(ajx<?> $$0) {
      if (c.equals($$0)) {
         this.t();
      }

      super.a($$0);
   }

   public int p() {
      return this.ar() * 3;
   }

   @Override
   protected boolean Y() {
      return true;
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C) {
         float $$0 = ayy.b((float)(this.p() + this.af) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = ayy.b((float)(this.p() + this.af + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dW().a(this.dB(), this.dD(), this.dH(), avz.tX, this.dn(), 0.95F + this.ae.i() * 0.05F, 0.95F + this.ae.i() * 0.05F, false);
         }

         float $$2 = this.dr() * 1.48F;
         float $$3 = ayy.b(this.dM() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = ayy.a(this.dM() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.ds() * 2.5F;
         this.dW().a(lt.ab, this.dB() + (double)$$3, this.dD() + (double)$$5, this.dH() + (double)$$4, 0.0, 0.0, 0.0);
         this.dW().a(lt.ab, this.dB() - (double)$$3, this.dD() + (double)$$5, this.dH() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void d_() {
      if (this.bL() && this.gh()) {
         this.d(8.0F);
      }

      super.d_();
   }

   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      this.bX = this.dw().b(5);
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
   public awa dn() {
      return awa.f;
   }

   @Override
   protected avy u() {
      return avz.tU;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.tY;
   }

   @Override
   protected avy o_() {
      return avz.tW;
   }

   @Override
   protected float fg() {
      return 1.0F;
   }

   @Override
   public boolean a(buq<?> $$0) {
      return true;
   }

   @Override
   public bum e(bvr $$0) {
      int $$1 = this.m();
      bum $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   boolean a(arc $$0, bvf $$1, cfw $$2) {
      return $$2.a($$0, this, $$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends ccd {
      private final cfw b = cfw.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            arc $$0 = a(cly.this.dW());
            List<cov> $$1 = $$0.a(this.b, cly.this, cly.this.cR().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
               $$1.sort(Comparator.comparing(buj::dD).reversed());

               for (cov $$2 : $$1) {
                  if (cly.this.a($$0, $$2, cfw.a)) {
                     cly.this.h($$2);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bvf $$0 = cly.this.O_();
         return $$0 != null ? cly.this.a(a(cly.this.dW()), $$0, cfw.a) : false;
      }
   }

   class c extends ccd {
      private int b;

      @Override
      public boolean b() {
         bvf $$0 = cly.this.O_();
         return $$0 != null ? cly.this.a(a(cly.this.dW()), $$0, cfw.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         cly.this.bY = cly.a.a;
         this.h();
      }

      @Override
      public void e() {
         cly.this.bX = cly.this.dW().a(ecq.a.e, cly.this.bX).b(10 + cly.this.ae.a(20));
      }

      @Override
      public void a() {
         if (cly.this.bY == cly.a.a) {
            this.b--;
            if (this.b <= 0) {
               cly.this.bY = cly.a.b;
               this.h();
               this.b = this.a((8 + cly.this.ae.a(4)) * 20);
               cly.this.a(avz.tZ, 10.0F, 0.95F + cly.this.ae.i() * 0.1F);
            }
         }
      }

      private void h() {
         cly.this.bX = cly.this.O_().dw().b(20 + cly.this.ae.a(20));
         if (cly.this.bX.v() < cly.this.dW().P()) {
            cly.this.bX = new ji(cly.this.bX.u(), cly.this.dW().P() + 1, cly.this.bX.w());
         }
      }
   }

   class d extends cbb {
      public d(final bvh $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cly.this.aZ = cly.this.aX;
         cly.this.aX = cly.this.dM();
      }
   }

   class e extends cly.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return cly.this.O_() == null || cly.this.bY == cly.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + cly.this.ae.i() * 10.0F;
         this.e = -4.0F + cly.this.ae.i() * 9.0F;
         this.f = cly.this.ae.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (cly.this.ae.a(this.a(350)) == 0) {
            this.e = -4.0F + cly.this.ae.i() * 9.0F;
         }

         if (cly.this.ae.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cly.this.ae.a(this.a(450)) == 0) {
            this.c = cly.this.ae.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cly.this.d.e < cly.this.dD() && !cly.this.dW().u(cly.this.dw().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cly.this.d.e > cly.this.dD() && !cly.this.dW().u(cly.this.dw().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (ji.c.equals(cly.this.bX)) {
            cly.this.bX = cly.this.dw();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cly.this.d = fay.a(cly.this.bX).b((double)(this.d * ayy.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ayy.a(this.c)));
      }
   }

   static class f extends cbf {
      public f(bvh $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends cbg {
      private float m = 0.1F;

      public g(final bvh $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cly.this.P) {
            cly.this.v(cly.this.dM() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cly.this.d.d - cly.this.dB();
         double $$1 = cly.this.d.e - cly.this.dD();
         double $$2 = cly.this.d.f - cly.this.dH();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cly.this.dM();
            float $$7 = (float)ayy.d($$2, $$0);
            float $$8 = ayy.h(cly.this.dM() + 90.0F);
            float $$9 = ayy.h($$7 * (180.0F / (float)Math.PI));
            cly.this.v(ayy.e($$8, $$9, 4.0F) - 90.0F);
            cly.this.aX = cly.this.dM();
            if (ayy.d($$6, cly.this.dM()) < 3.0F) {
               this.m = ayy.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ayy.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ayy.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cly.this.w($$10);
            float $$11 = cly.this.dM() + 90.0F;
            double $$12 = (double)(this.m * ayy.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ayy.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ayy.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            fay $$15 = cly.this.dz();
            cly.this.h($$15.e(new fay($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends ccd {
      public h() {
         this.a(EnumSet.of(ccd.a.a));
      }

      protected boolean h() {
         return cly.this.d.c(cly.this.dB(), cly.this.dD(), cly.this.dH()) < 4.0;
      }
   }

   class i extends cly.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return cly.this.O_() != null && cly.this.bY == cly.a.b;
      }

      @Override
      public boolean c() {
         bvf $$0 = cly.this.O_();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bL()) {
            return false;
         } else {
            if ($$0 instanceof cov $$1 && ($$0.Z_() || $$1.b())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (cly.this.af > this.e) {
                  this.e = cly.this.af + 20;
                  List<cgz> $$2 = cly.this.dW().a(cgz.class, cly.this.cR().g(16.0), buo.a);

                  for (cgz $$3 : $$2) {
                     $$3.gE();
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
         cly.this.h(null);
         cly.this.bY = cly.a.a;
      }

      @Override
      public void a() {
         bvf $$0 = cly.this.O_();
         if ($$0 != null) {
            cly.this.d = new fay($$0.dB(), $$0.e(0.5), $$0.dH());
            if (cly.this.cR().g(0.2F).c($$0.cR())) {
               cly.this.c(a(cly.this.dW()), $$0);
               cly.this.bY = cly.a.a;
               if (!cly.this.bb()) {
                  cly.this.dW().c(1039, cly.this.dw(), 0);
               }
            } else if (cly.this.P || cly.this.aN > 0) {
               cly.this.bY = cly.a.a;
            }
         }
      }
   }
}
