import javax.annotation.Nullable;

public class ccm extends cbx {
   private final dhm g;
   private final bup h;
   private int i;
   private static final int j = 20;

   public ccm(dhm $$0, buv $$1, double $$2, int $$3) {
      super($$1, $$2, 24, $$3);
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public boolean b() {
      if (!this.h.dS().ac().b(def.c)) {
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

   public void a(dek $$0, jf $$1) {
   }

   public void a(dej $$0, jf $$1) {
   }

   @Override
   public void a() {
      super.a();
      dej $$0 = this.h.dS();
      jf $$1 = this.h.ds();
      jf $$2 = this.a($$1, $$0);
      azn $$3 = this.h.dV();
      if (this.m() && $$2 != null) {
         if (this.i > 0) {
            eyw $$4 = this.h.dv();
            this.h.n($$4.d, 0.3, $$4.f);
            if (!$$0.B) {
               double $$5 = 0.08;
               ((arj)$$0)
                  .a(
                     new lk(lo.S, new cvs(cvw.qS)),
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
            eyw $$6 = this.h.dv();
            this.h.n($$6.d, -0.3, $$6.f);
            if (this.i % 6 == 0) {
               this.a((dek)$$0, this.e);
            }
         }

         if (this.i > 60) {
            $$0.a($$2, false);
            if (!$$0.B) {
               for (int $$7 = 0; $$7 < 20; $$7++) {
                  double $$8 = $$3.k() * 0.02;
                  double $$9 = $$3.k() * 0.02;
                  double $$10 = $$3.k() * 0.02;
                  ((arj)$$0).a(lo.ab, (double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 1, $$8, $$9, $$10, 0.15F);
               }

               this.a($$0, $$2);
            }
         }

         this.i++;
      }
   }

   @Nullable
   private jf a(jf $$0, ddo $$1) {
      if ($$1.a_($$0).a(this.g)) {
         return $$0;
      } else {
         jf[] $$2 = new jf[]{$$0.e(), $$0.h(), $$0.i(), $$0.f(), $$0.g(), $$0.e().e()};

         for (jf $$3 : $$2) {
            if ($$1.a_($$3).a(this.g)) {
               return $$3;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean a(dem $$0, jf $$1) {
      dwo $$2 = $$0.a(kh.a($$1.u()), kh.a($$1.w()), dxp.n, false);
      return $$2 == null ? false : $$2.a_($$1).a(this.g) && $$2.a_($$1.d()).l() && $$2.a_($$1.b(2)).l();
   }
}
