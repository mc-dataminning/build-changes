import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cob extends bws implements cnr {
   public static final float a = 7.448451F;
   public static final int b = azm.f(24.166098F);
   private static final akj<Integer> c = akn.a(cob.class, akl.b);
   fei d = fei.c;
   iu bE = iu.c;
   cob.a bF = cob.a.a;

   public cob(bwm<? extends cob> $$0, div $$1) {
      super($$0, $$1);
      this.bx = 5;
      this.bz = new cob.g(this);
      this.by = new cob.f(this);
   }

   @Override
   public boolean ba() {
      return (this.m() + this.af) % b == 0;
   }

   @Override
   protected ccw I() {
      return new cob.d(this);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cob.c());
      this.bC.a(2, new cob.i());
      this.bC.a(3, new cob.e());
      this.bD.a(1, new cob.b());
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
      this.g(byi.c).a((double)(6 + this.j()));
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
         float $$0 = azm.b((float)(this.m() + this.af) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = azm.b((float)(this.m() + this.af + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awn.ui, this.dm(), 0.95F + this.ae.i() * 0.05F, 0.95F + this.ae.i() * 0.05F, false);
         }

         float $$2 = this.dq() * 1.48F;
         float $$3 = azm.b(this.dL() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = azm.a(this.dL() * (float) (Math.PI / 180.0)) * $$2;
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
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      this.bE = this.dv().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bE = new iu($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(tz $$0) {
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
   public awo dm() {
      return awo.f;
   }

   @Override
   protected awm u() {
      return awn.uf;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.uj;
   }

   @Override
   protected awm l_() {
      return awn.uh;
   }

   @Override
   protected float fd() {
      return 1.0F;
   }

   @Override
   public boolean a(bwm<?> $$0) {
      return true;
   }

   @Override
   public bwg e(bxo $$0) {
      int $$1 = this.j();
      bwg $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   boolean a(arq $$0, bxc $$1, chr $$2) {
      return $$2.a($$0, this, $$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cdy {
      private final chr b = chr.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            arq $$0 = a(cob.this.dV());
            List<cqy> $$1 = $$0.a(this.b, cob.this, cob.this.cR().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
               $$1.sort(Comparator.comparing(bwd::dC).reversed());

               for (cqy $$2 : $$1) {
                  if (cob.this.a($$0, $$2, chr.a)) {
                     cob.this.g($$2);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bxc $$0 = cob.this.f();
         return $$0 != null ? cob.this.a(a(cob.this.dV()), $$0, chr.a) : false;
      }
   }

   class c extends cdy {
      private int b;

      @Override
      public boolean b() {
         bxc $$0 = cob.this.f();
         return $$0 != null ? cob.this.a(a(cob.this.dV()), $$0, chr.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         cob.this.bF = cob.a.a;
         this.h();
      }

      @Override
      public void e() {
         cob.this.bE = cob.this.dV().a(efy.a.e, cob.this.bE).b(10 + cob.this.ae.a(20));
      }

      @Override
      public void a() {
         if (cob.this.bF == cob.a.a) {
            this.b--;
            if (this.b <= 0) {
               cob.this.bF = cob.a.b;
               this.h();
               this.b = this.a((8 + cob.this.ae.a(4)) * 20);
               cob.this.a(awn.uk, 10.0F, 0.95F + cob.this.ae.i() * 0.1F);
            }
         }
      }

      private void h() {
         cob.this.bE = cob.this.f().dv().b(20 + cob.this.ae.a(20));
         if (cob.this.bE.v() < cob.this.dV().P()) {
            cob.this.bE = new iu(cob.this.bE.u(), cob.this.dV().P() + 1, cob.this.bE.w());
         }
      }
   }

   class d extends ccw {
      public d(final bxe $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cob.this.aX = cob.this.aV;
         cob.this.aV = cob.this.dL();
      }
   }

   class e extends cob.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return cob.this.f() == null || cob.this.bF == cob.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + cob.this.ae.i() * 10.0F;
         this.e = -4.0F + cob.this.ae.i() * 9.0F;
         this.f = cob.this.ae.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (cob.this.ae.a(this.a(350)) == 0) {
            this.e = -4.0F + cob.this.ae.i() * 9.0F;
         }

         if (cob.this.ae.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cob.this.ae.a(this.a(450)) == 0) {
            this.c = cob.this.ae.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cob.this.d.e < cob.this.dC() && !cob.this.dV().v(cob.this.dv().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cob.this.d.e > cob.this.dC() && !cob.this.dV().v(cob.this.dv().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (iu.c.equals(cob.this.bE)) {
            cob.this.bE = cob.this.dv();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cob.this.d = fei.a(cob.this.bE).b((double)(this.d * azm.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * azm.a(this.c)));
      }
   }

   static class f extends cda {
      public f(bxe $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends cdb {
      private float m = 0.1F;

      public g(final bxe $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cob.this.P) {
            cob.this.w(cob.this.dL() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cob.this.d.d - cob.this.dA();
         double $$1 = cob.this.d.e - cob.this.dC();
         double $$2 = cob.this.d.f - cob.this.dG();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cob.this.dL();
            float $$7 = (float)azm.d($$2, $$0);
            float $$8 = azm.h(cob.this.dL() + 90.0F);
            float $$9 = azm.h($$7 * (180.0F / (float)Math.PI));
            cob.this.w(azm.e($$8, $$9, 4.0F) - 90.0F);
            cob.this.aV = cob.this.dL();
            if (azm.d($$6, cob.this.dL()) < 3.0F) {
               this.m = azm.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = azm.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(azm.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cob.this.x($$10);
            float $$11 = cob.this.dL() + 90.0F;
            double $$12 = (double)(this.m * azm.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * azm.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * azm.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            fei $$15 = cob.this.dy();
            cob.this.i($$15.e(new fei($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends cdy {
      public h() {
         this.a(EnumSet.of(cdy.a.a));
      }

      protected boolean h() {
         return cob.this.d.c(cob.this.dA(), cob.this.dC(), cob.this.dG()) < 4.0;
      }
   }

   class i extends cob.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return cob.this.f() != null && cob.this.bF == cob.a.b;
      }

      @Override
      public boolean c() {
         bxc $$0 = cob.this.f();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bK()) {
            return false;
         } else {
            if ($$0 instanceof cqy $$1 && ($$0.U_() || $$1.b())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (cob.this.af > this.e) {
                  this.e = cob.this.af + 20;
                  List<civ> $$2 = cob.this.dV().a(civ.class, cob.this.cR().g(16.0), bwk.a);

                  for (civ $$3 : $$2) {
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
         cob.this.g(null);
         cob.this.bF = cob.a.a;
      }

      @Override
      public void a() {
         bxc $$0 = cob.this.f();
         if ($$0 != null) {
            cob.this.d = new fei($$0.dA(), $$0.e(0.5), $$0.dG());
            if (cob.this.cR().g(0.2F).c($$0.cR())) {
               cob.this.c(a(cob.this.dV()), $$0);
               cob.this.bF = cob.a.a;
               if (!cob.this.bb()) {
                  cob.this.dV().c(1039, cob.this.dv(), 0);
               }
            } else if (cob.this.P || cob.this.aN > 0) {
               cob.this.bF = cob.a.a;
            }
         }
      }
   }
}
