import javax.annotation.Nullable;

public class bqu extends bqf {
   private final csk g;
   private final biy h;
   private int i;
   private static final int j = 20;

   public bqu(csk $$0, bjf $$1, double $$2, int $$3) {
      super($$1, $$2, 24, $$3);
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public boolean a() {
      if (!this.h.dK().X().b(cpg.c)) {
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
   public void d() {
      super.d();
      this.h.ab = 1.0F;
   }

   @Override
   public void c() {
      super.c();
      this.i = 0;
   }

   public void a(cpl $$0, gv $$1) {
   }

   public void a(cpk $$0, gv $$1) {
   }

   @Override
   public void e() {
      super.e();
      cpk $$0 = this.h.dK();
      gv $$1 = this.h.dk();
      gv $$2 = this.a($$1, $$0);
      art $$3 = this.h.ee();
      if (this.m() && $$2 != null) {
         if (this.i > 0) {
            ehf $$4 = this.h.dn();
            this.h.o($$4.c, 0.3, $$4.e);
            if (!$$0.B) {
               double $$5 = 0.08;
               ((aki)$$0)
                  .a(
                     new is(iw.O, new ciw(ciz.qd)),
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
            ehf $$6 = this.h.dn();
            this.h.o($$6.c, -0.3, $$6.e);
            if (this.i % 6 == 0) {
               this.a((cpl)$$0, this.e);
            }
         }

         if (this.i > 60) {
            $$0.a($$2, false);
            if (!$$0.B) {
               for (int $$7 = 0; $$7 < 20; $$7++) {
                  double $$8 = $$3.k() * 0.02;
                  double $$9 = $$3.k() * 0.02;
                  double $$10 = $$3.k() * 0.02;
                  ((aki)$$0).a(iw.W, (double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 1, $$8, $$9, $$10, 0.15F);
               }

               this.a($$0, $$2);
            }
         }

         this.i++;
      }
   }

   @Nullable
   private gv a(gv $$0, coq $$1) {
      if ($$1.a_($$0).a(this.g)) {
         return $$0;
      } else {
         gv[] $$2 = new gv[]{$$0.d(), $$0.g(), $$0.h(), $$0.e(), $$0.f(), $$0.d().d()};

         for (gv $$3 : $$2) {
            if ($$1.a_($$3).a(this.g)) {
               return $$3;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean a(cpn $$0, gv $$1) {
      dgu $$2 = $$0.a(hy.a($$1.u()), hy.a($$1.w()), dgz.n, false);
      return $$2 == null ? false : $$2.a_($$1).a(this.g) && $$2.a_($$1.c()).i() && $$2.a_($$1.b(2)).i();
   }
}
