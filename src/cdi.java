import javax.annotation.Nullable;

public class cdi extends cct {
   private final djn g;
   private final bvk h;
   private int i;
   private static final int j = 20;

   public cdi(djn $$0, bvq $$1, double $$2, int $$3) {
      super($$1, $$2, 24, $$3);
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public boolean b() {
      if (!a(this.h).O().b(dgf.c)) {
         return false;
      } else if (this.c > 0) {
         this.c--;
         return false;
      } else if (this.n()) {
         this.c = b(20);
         return true;
      } else {
         this.c = this.a(this.a);
         return false;
      }
   }

   @Override
   public void e() {
      super.e();
      this.h.Z = 1.0F;
   }

   @Override
   public void d() {
      super.d();
      this.i = 0;
   }

   public void a(dgk $$0, ji $$1) {
   }

   public void a(dgj $$0, ji $$1) {
   }

   @Override
   public void a() {
      super.a();
      dgj $$0 = this.h.dV();
      ji $$1 = this.h.dv();
      ji $$2 = this.a($$1, $$0);
      azh $$3 = this.h.dY();
      if (this.m() && $$2 != null) {
         if (this.i > 0) {
            fbb $$4 = this.h.dy();
            this.h.n($$4.d, 0.3, $$4.f);
            if (!$$0.C) {
               double $$5 = 0.08;
               ((ard)$$0)
                  .a(
                     new lp(lt.T, new cwq(cwu.ry)),
                     (double)$$2.u() + 0.5,
                     (double)$$2.v() + 0.7,
                     (double)$$2.w() + 0.5,
                     3,
                     ((double)$$3.i() - 0.5) * 0.08,
                     ((double)$$3.i() - 0.5) * 0.08,
                     ((double)$$3.i() - 0.5) * 0.08,
                     0.15F
                  );
            }
         }

         if (this.i % 2 == 0) {
            fbb $$6 = this.h.dy();
            this.h.n($$6.d, -0.3, $$6.f);
            if (this.i % 6 == 0) {
               this.a((dgk)$$0, this.e);
            }
         }

         if (this.i > 60) {
            $$0.a($$2, false);
            if (!$$0.C) {
               for (int $$7 = 0; $$7 < 20; $$7++) {
                  double $$8 = $$3.k() * 0.02;
                  double $$9 = $$3.k() * 0.02;
                  double $$10 = $$3.k() * 0.02;
                  ((ard)$$0).a(lt.ad, (double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 1, $$8, $$9, $$10, 0.15F);
               }

               this.a($$0, $$2);
            }
         }

         this.i++;
      }
   }

   @Nullable
   private ji a(ji $$0, dfo $$1) {
      if ($$1.a_($$0).a(this.g)) {
         return $$0;
      } else {
         ji[] $$2 = new ji[]{$$0.e(), $$0.h(), $$0.i(), $$0.f(), $$0.g(), $$0.e().e()};

         for (ji $$3 : $$2) {
            if ($$1.a_($$3).a(this.g)) {
               return $$3;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean a(dgm $$0, ji $$1) {
      dyt $$2 = $$0.a(kk.a($$1.u()), kk.a($$1.w()), dzu.n, false);
      return $$2 == null ? false : $$2.a_($$1).a(this.g) && $$2.a_($$1.d()).l() && $$2.a_($$1.b(2)).l();
   }
}
