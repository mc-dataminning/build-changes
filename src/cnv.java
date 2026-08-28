import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cnv extends bwp implements cnl {
   public static final float a = 7.448451F;
   public static final int b = azk.f(24.166098F);
   private static final akh<Integer> c = akl.a(cnv.class, akj.b);
   fdw d = fdw.c;
   iu bE = iu.c;
   cnv.a bF = cnv.a.a;

   public cnv(bwj<? extends cnv> $$0, dip $$1) {
      super($$0, $$1);
      this.bx = 5;
      this.bz = new cnv.g(this);
      this.by = new cnv.f(this);
   }

   @Override
   public boolean ba() {
      return (this.m() + this.af) % b == 0;
   }

   @Override
   protected cct I() {
      return new cnv.d(this);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cnv.c());
      this.bC.a(2, new cnv.i());
      this.bC.a(3, new cnv.e());
      this.bD.a(1, new cnv.b());
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   public void b(int $$0) {
      this.al.a(c, azk.a($$0, 0, 64));
   }

   private void n() {
      this.i_();
      this.g(byf.c).a((double)(6 + this.j()));
   }

   public int j() {
      return this.al.a(c);
   }

   @Override
   public void a(akh<?> $$0) {
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
      if (this.dV().C) {
         float $$0 = azk.b((float)(this.m() + this.af) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = azk.b((float)(this.m() + this.af + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awl.uh, this.dm(), 0.95F + this.ae.i() * 0.05F, 0.95F + this.ae.i() * 0.05F, false);
         }

         float $$2 = this.dq() * 1.48F;
         float $$3 = azk.b(this.dL() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = azk.a(this.dL() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dr() * 2.5F;
         this.dV().a(lx.ac, this.dA() + (double)$$3, this.dC() + (double)$$5, this.dG() + (double)$$4, 0.0, 0.0, 0.0);
         this.dV().a(lx.ac, this.dA() - (double)$$3, this.dC() + (double)$$5, this.dG() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void k_() {
      if (this.bK() && this.gk()) {
         this.e(8.0F);
      }

      super.k_();
   }

   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      this.bE = this.dv().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bE = new iu($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(tx $$0) {
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
   public awm dm() {
      return awm.f;
   }

   @Override
   protected awk u() {
      return awl.ue;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.ui;
   }

   @Override
   protected awk l_() {
      return awl.ug;
   }

   @Override
   protected float fd() {
      return 1.0F;
   }

   @Override
   public boolean a(bwj<?> $$0) {
      return true;
   }

   @Override
   public bwd e(bxl $$0) {
      int $$1 = this.j();
      bwd $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   boolean a(aro $$0, bwz $$1, cho $$2) {
      return $$2.a($$0, this, $$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cdv {
      private final cho b = cho.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            aro $$0 = a(cnv.this.dV());
            List<cqs> $$1 = $$0.a(this.b, cnv.this, cnv.this.cR().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
               $$1.sort(Comparator.comparing(bwa::dC).reversed());

               for (cqs $$2 : $$1) {
                  if (cnv.this.a($$0, $$2, cho.a)) {
                     cnv.this.g($$2);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bwz $$0 = cnv.this.f();
         return $$0 != null ? cnv.this.a(a(cnv.this.dV()), $$0, cho.a) : false;
      }
   }

   class c extends cdv {
      private int b;

      @Override
      public boolean b() {
         bwz $$0 = cnv.this.f();
         return $$0 != null ? cnv.this.a(a(cnv.this.dV()), $$0, cho.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         cnv.this.bF = cnv.a.a;
         this.h();
      }

      @Override
      public void e() {
         cnv.this.bE = cnv.this.dV().a(efn.a.e, cnv.this.bE).b(10 + cnv.this.ae.a(20));
      }

      @Override
      public void a() {
         if (cnv.this.bF == cnv.a.a) {
            this.b--;
            if (this.b <= 0) {
               cnv.this.bF = cnv.a.b;
               this.h();
               this.b = this.a((8 + cnv.this.ae.a(4)) * 20);
               cnv.this.a(awl.uj, 10.0F, 0.95F + cnv.this.ae.i() * 0.1F);
            }
         }
      }

      private void h() {
         cnv.this.bE = cnv.this.f().dv().b(20 + cnv.this.ae.a(20));
         if (cnv.this.bE.v() < cnv.this.dV().P()) {
            cnv.this.bE = new iu(cnv.this.bE.u(), cnv.this.dV().P() + 1, cnv.this.bE.w());
         }
      }
   }

   class d extends cct {
      public d(final bxb $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cnv.this.aX = cnv.this.aV;
         cnv.this.aV = cnv.this.dL();
      }
   }

   class e extends cnv.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return cnv.this.f() == null || cnv.this.bF == cnv.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + cnv.this.ae.i() * 10.0F;
         this.e = -4.0F + cnv.this.ae.i() * 9.0F;
         this.f = cnv.this.ae.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (cnv.this.ae.a(this.a(350)) == 0) {
            this.e = -4.0F + cnv.this.ae.i() * 9.0F;
         }

         if (cnv.this.ae.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cnv.this.ae.a(this.a(450)) == 0) {
            this.c = cnv.this.ae.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cnv.this.d.e < cnv.this.dC() && !cnv.this.dV().v(cnv.this.dv().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cnv.this.d.e > cnv.this.dC() && !cnv.this.dV().v(cnv.this.dv().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (iu.c.equals(cnv.this.bE)) {
            cnv.this.bE = cnv.this.dv();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cnv.this.d = fdw.a(cnv.this.bE).b((double)(this.d * azk.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * azk.a(this.c)));
      }
   }

   static class f extends ccx {
      public f(bxb $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends ccy {
      private float m = 0.1F;

      public g(final bxb $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cnv.this.P) {
            cnv.this.w(cnv.this.dL() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cnv.this.d.d - cnv.this.dA();
         double $$1 = cnv.this.d.e - cnv.this.dC();
         double $$2 = cnv.this.d.f - cnv.this.dG();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cnv.this.dL();
            float $$7 = (float)azk.d($$2, $$0);
            float $$8 = azk.h(cnv.this.dL() + 90.0F);
            float $$9 = azk.h($$7 * (180.0F / (float)Math.PI));
            cnv.this.w(azk.e($$8, $$9, 4.0F) - 90.0F);
            cnv.this.aV = cnv.this.dL();
            if (azk.d($$6, cnv.this.dL()) < 3.0F) {
               this.m = azk.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = azk.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(azk.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cnv.this.x($$10);
            float $$11 = cnv.this.dL() + 90.0F;
            double $$12 = (double)(this.m * azk.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * azk.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * azk.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            fdw $$15 = cnv.this.dy();
            cnv.this.i($$15.e(new fdw($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends cdv {
      public h() {
         this.a(EnumSet.of(cdv.a.a));
      }

      protected boolean h() {
         return cnv.this.d.c(cnv.this.dA(), cnv.this.dC(), cnv.this.dG()) < 4.0;
      }
   }

   class i extends cnv.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return cnv.this.f() != null && cnv.this.bF == cnv.a.b;
      }

      @Override
      public boolean c() {
         bwz $$0 = cnv.this.f();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bK()) {
            return false;
         } else {
            if ($$0 instanceof cqs $$1 && ($$0.U_() || $$1.b())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (cnv.this.af > this.e) {
                  this.e = cnv.this.af + 20;
                  List<cir> $$2 = cnv.this.dV().a(cir.class, cnv.this.cR().g(16.0), bwh.a);

                  for (cir $$3 : $$2) {
                     $$3.gF();
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
         cnv.this.g(null);
         cnv.this.bF = cnv.a.a;
      }

      @Override
      public void a() {
         bwz $$0 = cnv.this.f();
         if ($$0 != null) {
            cnv.this.d = new fdw($$0.dA(), $$0.e(0.5), $$0.dG());
            if (cnv.this.cR().g(0.2F).c($$0.cR())) {
               cnv.this.c(a(cnv.this.dV()), $$0);
               cnv.this.bF = cnv.a.a;
               if (!cnv.this.bb()) {
                  cnv.this.dV().c(1039, cnv.this.dv(), 0);
               }
            } else if (cnv.this.P || cnv.this.aN > 0) {
               cnv.this.bF = cnv.a.a;
            }
         }
      }
   }
}
