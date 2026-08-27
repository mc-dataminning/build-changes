import javax.annotation.Nullable;

public class bud extends bto {
   private final cwj g;
   private final bmh h;
   private int i;
   private static final int j = 20;

   public bud(cwj $$0, bmo $$1, double $$2, int $$3) {
      super($$1, $$2, 24, $$3);
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public boolean a() {
      if (!this.h.dM().Z().b(cte.c)) {
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

   public void a(ctj $$0, hx $$1) {
   }

   public void a(cti $$0, hx $$1) {
   }

   @Override
   public void e() {
      super.e();
      cti $$0 = this.h.dM();
      hx $$1 = this.h.dm();
      hx $$2 = this.a($$1, $$0);
      aup $$3 = this.h.eg();
      if (this.m() && $$2 != null) {
         if (this.i > 0) {
            elm $$4 = this.h.dp();
            this.h.o($$4.c, 0.3, $$4.e);
            if (!$$0.B) {
               double $$5 = 0.08;
               ((amz)$$0)
                  .a(
                     new jt(jx.Q, new cmr(cmu.qO)),
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
            elm $$6 = this.h.dp();
            this.h.o($$6.c, -0.3, $$6.e);
            if (this.i % 6 == 0) {
               this.a((ctj)$$0, this.e);
            }
         }

         if (this.i > 60) {
            $$0.a($$2, false);
            if (!$$0.B) {
               for (int $$7 = 0; $$7 < 20; $$7++) {
                  double $$8 = $$3.k() * 0.02;
                  double $$9 = $$3.k() * 0.02;
                  double $$10 = $$3.k() * 0.02;
                  ((amz)$$0).a(jx.Y, (double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 1, $$8, $$9, $$10, 0.15F);
               }

               this.a($$0, $$2);
            }
         }

         this.i++;
      }
   }

   @Nullable
   private hx a(hx $$0, cso $$1) {
      if ($$1.a_($$0).a(this.g)) {
         return $$0;
      } else {
         hx[] $$2 = new hx[]{$$0.d(), $$0.g(), $$0.h(), $$0.e(), $$0.f(), $$0.d().d()};

         for (hx $$3 : $$2) {
            if ($$1.a_($$3).a(this.g)) {
               return $$3;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean a(ctl $$0, hx $$1) {
      dkw $$2 = $$0.a(iz.a($$1.u()), iz.a($$1.w()), dlb.n, false);
      return $$2 == null ? false : $$2.a_($$1).a(this.g) && $$2.a_($$1.c()).i() && $$2.a_($$1.b(2)).i();
   }
}
