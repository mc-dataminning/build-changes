import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cnl extends bwh implements cnb {
   public static final float a = 7.448451F;
   public static final int b = azk.f(24.166098F);
   private static final akg<Integer> c = akk.a(cnl.class, aki.b);
   fcu d = fcu.c;
   jj bD = jj.c;
   cnl.a bE = cnl.a.a;

   public cnl(bwb<? extends cnl> $$0, dhp $$1) {
      super($$0, $$1);
      this.bw = 5;
      this.by = new cnl.g(this);
      this.bx = new cnl.f(this);
   }

   @Override
   public boolean ba() {
      return (this.m() + this.af) % b == 0;
   }

   @Override
   protected ccl I() {
      return new cnl.d(this);
   }

   @Override
   protected void D() {
      this.bB.a(1, new cnl.c());
      this.bB.a(2, new cnl.i());
      this.bB.a(3, new cnl.e());
      this.bC.a(1, new cnl.b());
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   public void b(int $$0) {
      this.al.a(c, azk.a($$0, 0, 64));
   }

   private void n() {
      this.i_();
      this.g(bxx.c).a((double)(6 + this.j()));
   }

   public int j() {
      return this.al.a(c);
   }

   @Override
   public void a(akg<?> $$0) {
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
            this.dV().a(this.dA(), this.dC(), this.dG(), awk.uh, this.dm(), 0.95F + this.ae.i() * 0.05F, 0.95F + this.ae.i() * 0.05F, false);
         }

         float $$2 = this.dq() * 1.48F;
         float $$3 = azk.b(this.dL() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = azk.a(this.dL() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dr() * 2.5F;
         this.dV().a(lv.ac, this.dA() + (double)$$3, this.dC() + (double)$$5, this.dG() + (double)$$4, 0.0, 0.0, 0.0);
         this.dV().a(lv.ac, this.dA() - (double)$$3, this.dC() + (double)$$5, this.dG() - (double)$$4, 0.0, 0.0, 0.0);
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
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      this.bD = this.dv().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bD = new jj($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("AX", this.bD.u());
      $$0.a("AY", this.bD.v());
      $$0.a("AZ", this.bD.w());
      $$0.a("Size", this.j());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public awl dm() {
      return awl.f;
   }

   @Override
   protected awj u() {
      return awk.ue;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.ui;
   }

   @Override
   protected awj l_() {
      return awk.ug;
   }

   @Override
   protected float fd() {
      return 1.0F;
   }

   @Override
   public boolean a(bwb<?> $$0) {
      return true;
   }

   @Override
   public bvv e(bxd $$0) {
      int $$1 = this.j();
      bvv $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   boolean a(arn $$0, bwr $$1, chg $$2) {
      return $$2.a($$0, this, $$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cdn {
      private final chg b = chg.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            arn $$0 = a(cnl.this.dV());
            List<cqi> $$1 = $$0.a(this.b, cnl.this, cnl.this.cR().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
               $$1.sort(Comparator.comparing(bvs::dC).reversed());

               for (cqi $$2 : $$1) {
                  if (cnl.this.a($$0, $$2, chg.a)) {
                     cnl.this.h($$2);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bwr $$0 = cnl.this.f();
         return $$0 != null ? cnl.this.a(a(cnl.this.dV()), $$0, chg.a) : false;
      }
   }

   class c extends cdn {
      private int b;

      @Override
      public boolean b() {
         bwr $$0 = cnl.this.f();
         return $$0 != null ? cnl.this.a(a(cnl.this.dV()), $$0, chg.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         cnl.this.bE = cnl.a.a;
         this.h();
      }

      @Override
      public void e() {
         cnl.this.bD = cnl.this.dV().a(eel.a.e, cnl.this.bD).b(10 + cnl.this.ae.a(20));
      }

      @Override
      public void a() {
         if (cnl.this.bE == cnl.a.a) {
            this.b--;
            if (this.b <= 0) {
               cnl.this.bE = cnl.a.b;
               this.h();
               this.b = this.a((8 + cnl.this.ae.a(4)) * 20);
               cnl.this.a(awk.uj, 10.0F, 0.95F + cnl.this.ae.i() * 0.1F);
            }
         }
      }

      private void h() {
         cnl.this.bD = cnl.this.f().dv().b(20 + cnl.this.ae.a(20));
         if (cnl.this.bD.v() < cnl.this.dV().P()) {
            cnl.this.bD = new jj(cnl.this.bD.u(), cnl.this.dV().P() + 1, cnl.this.bD.w());
         }
      }
   }

   class d extends ccl {
      public d(final bwt $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cnl.this.aW = cnl.this.aU;
         cnl.this.aU = cnl.this.dL();
      }
   }

   class e extends cnl.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return cnl.this.f() == null || cnl.this.bE == cnl.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + cnl.this.ae.i() * 10.0F;
         this.e = -4.0F + cnl.this.ae.i() * 9.0F;
         this.f = cnl.this.ae.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (cnl.this.ae.a(this.a(350)) == 0) {
            this.e = -4.0F + cnl.this.ae.i() * 9.0F;
         }

         if (cnl.this.ae.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cnl.this.ae.a(this.a(450)) == 0) {
            this.c = cnl.this.ae.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cnl.this.d.e < cnl.this.dC() && !cnl.this.dV().u(cnl.this.dv().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cnl.this.d.e > cnl.this.dC() && !cnl.this.dV().u(cnl.this.dv().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (jj.c.equals(cnl.this.bD)) {
            cnl.this.bD = cnl.this.dv();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cnl.this.d = fcu.a(cnl.this.bD).b((double)(this.d * azk.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * azk.a(this.c)));
      }
   }

   static class f extends ccp {
      public f(bwt $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends ccq {
      private float m = 0.1F;

      public g(final bwt $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cnl.this.P) {
            cnl.this.w(cnl.this.dL() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cnl.this.d.d - cnl.this.dA();
         double $$1 = cnl.this.d.e - cnl.this.dC();
         double $$2 = cnl.this.d.f - cnl.this.dG();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cnl.this.dL();
            float $$7 = (float)azk.d($$2, $$0);
            float $$8 = azk.h(cnl.this.dL() + 90.0F);
            float $$9 = azk.h($$7 * (180.0F / (float)Math.PI));
            cnl.this.w(azk.e($$8, $$9, 4.0F) - 90.0F);
            cnl.this.aU = cnl.this.dL();
            if (azk.d($$6, cnl.this.dL()) < 3.0F) {
               this.m = azk.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = azk.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(azk.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cnl.this.x($$10);
            float $$11 = cnl.this.dL() + 90.0F;
            double $$12 = (double)(this.m * azk.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * azk.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * azk.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            fcu $$15 = cnl.this.dy();
            cnl.this.i($$15.e(new fcu($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends cdn {
      public h() {
         this.a(EnumSet.of(cdn.a.a));
      }

      protected boolean h() {
         return cnl.this.d.c(cnl.this.dA(), cnl.this.dC(), cnl.this.dG()) < 4.0;
      }
   }

   class i extends cnl.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return cnl.this.f() != null && cnl.this.bE == cnl.a.b;
      }

      @Override
      public boolean c() {
         bwr $$0 = cnl.this.f();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bK()) {
            return false;
         } else {
            if ($$0 instanceof cqi $$1 && ($$0.U_() || $$1.b())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (cnl.this.af > this.e) {
                  this.e = cnl.this.af + 20;
                  List<cij> $$2 = cnl.this.dV().a(cij.class, cnl.this.cR().g(16.0), bvz.a);

                  for (cij $$3 : $$2) {
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
         cnl.this.h(null);
         cnl.this.bE = cnl.a.a;
      }

      @Override
      public void a() {
         bwr $$0 = cnl.this.f();
         if ($$0 != null) {
            cnl.this.d = new fcu($$0.dA(), $$0.e(0.5), $$0.dG());
            if (cnl.this.cR().g(0.2F).c($$0.cR())) {
               cnl.this.c(a(cnl.this.dV()), $$0);
               cnl.this.bE = cnl.a.a;
               if (!cnl.this.bb()) {
                  cnl.this.dV().c(1039, cnl.this.dv(), 0);
               }
            } else if (cnl.this.P || cnl.this.aM > 0) {
               cnl.this.bE = cnl.a.a;
            }
         }
      }
   }
}
