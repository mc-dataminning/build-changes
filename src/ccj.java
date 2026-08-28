import javax.annotation.Nullable;

public class ccj extends cbu {
   private final dhj g;
   private final bum h;
   private int i;
   private static final int j = 20;

   public ccj(dhj $$0, bus $$1, double $$2, int $$3) {
      super($$1, $$2, 24, $$3);
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public boolean b() {
      if (!this.h.dS().ac().b(dec.c)) {
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
      this.h.aa = 1.0F;
   }

   @Override
   public void d() {
      super.d();
      this.i = 0;
   }

   public void a(deh $$0, je $$1) {
   }

   public void a(deg $$0, je $$1) {
   }

   @Override
   public void a() {
      super.a();
      deg $$0 = this.h.dS();
      je $$1 = this.h.ds();
      je $$2 = this.a($$1, $$0);
      azl $$3 = this.h.dV();
      if (this.m() && $$2 != null) {
         if (this.i > 0) {
            eys $$4 = this.h.dv();
            this.h.n($$4.d, 0.3, $$4.f);
            if (!$$0.B) {
               double $$5 = 0.08;
               ((arh)$$0)
                  .a(
                     new lj(ln.S, new cvp(cvt.qS)),
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
            eys $$6 = this.h.dv();
            this.h.n($$6.d, -0.3, $$6.f);
            if (this.i % 6 == 0) {
               this.a((deh)$$0, this.e);
            }
         }

         if (this.i > 60) {
            $$0.a($$2, false);
            if (!$$0.B) {
               for (int $$7 = 0; $$7 < 20; $$7++) {
                  double $$8 = $$3.k() * 0.02;
                  double $$9 = $$3.k() * 0.02;
                  double $$10 = $$3.k() * 0.02;
                  ((arh)$$0).a(ln.ab, (double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 1, $$8, $$9, $$10, 0.15F);
               }

               this.a($$0, $$2);
            }
         }

         this.i++;
      }
   }

   @Nullable
   private je a(je $$0, ddl $$1) {
      if ($$1.a_($$0).a(this.g)) {
         return $$0;
      } else {
         je[] $$2 = new je[]{$$0.e(), $$0.h(), $$0.i(), $$0.f(), $$0.g(), $$0.e().e()};

         for (je $$3 : $$2) {
            if ($$1.a_($$3).a(this.g)) {
               return $$3;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean a(dej $$0, je $$1) {
      dwk $$2 = $$0.a(kg.a($$1.u()), kg.a($$1.w()), dxl.n, false);
      return $$2 == null ? false : $$2.a_($$1).a(this.g) && $$2.a_($$1.d()).l() && $$2.a_($$1.b(2)).l();
   }
}
