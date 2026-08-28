import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class coq extends bwx implements cof {
   public static final float a = 7.448451F;
   public static final int b = azm.f(24.166098F);
   private static final akj<Integer> c = akn.a(coq.class, akl.b);
   ffc d = ffc.c;
   @Nullable
   iv bF;
   coq.a bG = coq.a.a;

   public coq(bwr<? extends coq> $$0, djm $$1) {
      super($$0, $$1);
      this.by = 5;
      this.bA = new coq.g(this);
      this.bz = new coq.f(this);
   }

   @Override
   public boolean aY() {
      return (this.m() + this.af) % b == 0;
   }

   @Override
   protected cdd I() {
      return new coq.d(this);
   }

   @Override
   protected void D() {
      this.bD.a(1, new coq.c());
      this.bD.a(2, new coq.i());
      this.bD.a(3, new coq.e());
      this.bE.a(1, new coq.b());
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   public void b(int $$0) {
      this.al.a(c, azm.a($$0, 0, 64));
   }

   private void n() {
      this.i_();
      this.g(byp.c).a((double)(6 + this.j()));
   }

   public int j() {
      return this.al.a(c);
   }

   @Override
   public void a(akj<?> $$0) {
      if (c.equals($$0)) {
         this.n();
      }

      super.a($$0);
   }

   public int m() {
      return this.ao() * 3;
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   public void h() {
      super.h();
      if (this.dU().C) {
         float $$0 = azm.b((float)(this.m() + this.af) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = azm.b((float)(this.m() + this.af + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dU().a(this.dz(), this.dB(), this.dF(), awn.ul, this.dl(), 0.95F + this.ae.i() * 0.05F, 0.95F + this.ae.i() * 0.05F, false);
         }

         float $$2 = this.dp() * 1.48F;
         float $$3 = azm.b(this.dK() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = azm.a(this.dK() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dq() * 2.5F;
         this.dU().a(ly.ac, this.dz() + (double)$$3, this.dB() + (double)$$5, this.dF() + (double)$$4, 0.0, 0.0, 0.0);
         this.dU().a(ly.ac, this.dz() - (double)$$3, this.dB() + (double)$$5, this.dF() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void k_() {
      if (this.bI() && this.gn()) {
         this.e(8.0F);
      }

      super.k_();
   }

   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      this.bF = this.du().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bF = $$0.<iv>a("anchor_pos", iv.a).orElse(null);
      this.b($$0.f("size"));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.b("anchor_pos", iv.a, this.bF);
      $$0.a("size", this.j());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public awo dl() {
      return awo.f;
   }

   @Override
   protected awm u() {
      return awn.ui;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.um;
   }

   @Override
   protected awm l_() {
      return awn.uk;
   }

   @Override
   protected float fd() {
      return 1.0F;
   }

   @Override
   public boolean a(bwr<?> $$0) {
      return true;
   }

   @Override
   public bwl e(bxv $$0) {
      int $$1 = this.j();
      bwl $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   boolean a(arq $$0, bxj $$1, chy $$2) {
      return $$2.a($$0, this, $$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cef {
      private final chy b = chy.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            arq $$0 = a(coq.this.dU());
            List<crm> $$1 = $$0.a(this.b, coq.this, coq.this.cQ().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
               $$1.sort(Comparator.comparing(bwi::dB).reversed());

               for (crm $$2 : $$1) {
                  if (coq.this.a($$0, $$2, chy.a)) {
                     coq.this.g($$2);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bxj $$0 = coq.this.f();
         return $$0 != null ? coq.this.a(a(coq.this.dU()), $$0, chy.a) : false;
      }
   }

   class c extends cef {
      private int b;

      @Override
      public boolean b() {
         bxj $$0 = coq.this.f();
         return $$0 != null ? coq.this.a(a(coq.this.dU()), $$0, chy.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         coq.this.bG = coq.a.a;
         this.h();
      }

      @Override
      public void e() {
         if (coq.this.bF != null) {
            coq.this.bF = coq.this.dU().a(egs.a.e, coq.this.bF).b(10 + coq.this.ae.a(20));
         }
      }

      @Override
      public void a() {
         if (coq.this.bG == coq.a.a) {
            this.b--;
            if (this.b <= 0) {
               coq.this.bG = coq.a.b;
               this.h();
               this.b = this.a((8 + coq.this.ae.a(4)) * 20);
               coq.this.a(awn.un, 10.0F, 0.95F + coq.this.ae.i() * 0.1F);
            }
         }
      }

      private void h() {
         if (coq.this.bF != null) {
            coq.this.bF = coq.this.f().du().b(20 + coq.this.ae.a(20));
            if (coq.this.bF.v() < coq.this.dU().P()) {
               coq.this.bF = new iv(coq.this.bF.u(), coq.this.dU().P() + 1, coq.this.bF.w());
            }
         }
      }
   }

   class d extends cdd {
      public d(final bxl $$0) {
         super($$0);
      }

      @Override
      public void a() {
         coq.this.aX = coq.this.aV;
         coq.this.aV = coq.this.dK();
      }
   }

   class e extends coq.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return coq.this.f() == null || coq.this.bG == coq.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + coq.this.ae.i() * 10.0F;
         this.e = -4.0F + coq.this.ae.i() * 9.0F;
         this.f = coq.this.ae.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (coq.this.ae.a(this.a(350)) == 0) {
            this.e = -4.0F + coq.this.ae.i() * 9.0F;
         }

         if (coq.this.ae.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (coq.this.ae.a(this.a(450)) == 0) {
            this.c = coq.this.ae.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (coq.this.d.e < coq.this.dB() && !coq.this.dU().v(coq.this.du().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (coq.this.d.e > coq.this.dB() && !coq.this.dU().v(coq.this.du().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (coq.this.bF == null) {
            coq.this.bF = coq.this.du();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         coq.this.d = ffc.a(coq.this.bF).b((double)(this.d * azm.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * azm.a(this.c)));
      }
   }

   static class f extends cdh {
      public f(bxl $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends cdi {
      private float m = 0.1F;

      public g(final bxl $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (coq.this.P) {
            coq.this.w(coq.this.dK() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = coq.this.d.d - coq.this.dz();
         double $$1 = coq.this.d.e - coq.this.dB();
         double $$2 = coq.this.d.f - coq.this.dF();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = coq.this.dK();
            float $$7 = (float)azm.d($$2, $$0);
            float $$8 = azm.h(coq.this.dK() + 90.0F);
            float $$9 = azm.h($$7 * (180.0F / (float)Math.PI));
            coq.this.w(azm.e($$8, $$9, 4.0F) - 90.0F);
            coq.this.aV = coq.this.dK();
            if (azm.d($$6, coq.this.dK()) < 3.0F) {
               this.m = azm.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = azm.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(azm.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            coq.this.x($$10);
            float $$11 = coq.this.dK() + 90.0F;
            double $$12 = (double)(this.m * azm.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * azm.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * azm.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ffc $$15 = coq.this.dx();
            coq.this.i($$15.e(new ffc($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends cef {
      public h() {
         this.a(EnumSet.of(cef.a.a));
      }

      protected boolean h() {
         return coq.this.d.c(coq.this.dz(), coq.this.dB(), coq.this.dF()) < 4.0;
      }
   }

   class i extends coq.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return coq.this.f() != null && coq.this.bG == coq.a.b;
      }

      @Override
      public boolean c() {
         bxj $$0 = coq.this.f();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bI()) {
            return false;
         } else {
            if ($$0 instanceof crm $$1 && ($$0.V_() || $$1.b())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (coq.this.af > this.e) {
                  this.e = coq.this.af + 20;
                  List<cjc> $$2 = coq.this.dU().a(cjc.class, coq.this.cQ().g(16.0), bwp.a);

                  for (cjc $$3 : $$2) {
                     $$3.gI();
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
         coq.this.g(null);
         coq.this.bG = coq.a.a;
      }

      @Override
      public void a() {
         bxj $$0 = coq.this.f();
         if ($$0 != null) {
            coq.this.d = new ffc($$0.dz(), $$0.e(0.5), $$0.dF());
            if (coq.this.cQ().g(0.2F).c($$0.cQ())) {
               coq.this.c(a(coq.this.dU()), $$0);
               coq.this.bG = coq.a.a;
               if (!coq.this.aZ()) {
                  coq.this.dU().c(1039, coq.this.du(), 0);
               }
            } else if (coq.this.P || coq.this.aN > 0) {
               coq.this.bG = coq.a.a;
            }
         }
      }
   }
}
