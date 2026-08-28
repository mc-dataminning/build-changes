import javax.annotation.Nullable;

public class cep extends cea {
   private final dku g;
   private final bwt h;
   private int i;
   private static final int j = 20;

   public cep(dku $$0, bwz $$1, double $$2, int $$3) {
      super($$1, $$2, 24, $$3);
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public boolean b() {
      if (!a(this.h).O().c(dhl.c)) {
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
      this.h.Z = 1.0;
   }

   @Override
   public void d() {
      super.d();
      this.i = 0;
   }

   public void a(dhq $$0, jj $$1) {
   }

   public void a(dhp $$0, jj $$1) {
   }

   @Override
   public void a() {
      super.a();
      dhp $$0 = this.h.dV();
      jj $$1 = this.h.dv();
      jj $$2 = this.a($$1, $$0);
      azs $$3 = this.h.dY();
      if (this.m() && $$2 != null) {
         if (this.i > 0) {
            fcu $$4 = this.h.dy();
            this.h.n($$4.d, 0.3, $$4.f);
            if (!$$0.C) {
               double $$5 = 0.08;
               ((arn)$$0)
                  .a(
                     new lr(lv.U, new cxy(cyc.rC)),
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
            fcu $$6 = this.h.dy();
            this.h.n($$6.d, -0.3, $$6.f);
            if (this.i % 6 == 0) {
               this.a((dhq)$$0, this.e);
            }
         }

         if (this.i > 60) {
            $$0.a($$2, false);
            if (!$$0.C) {
               for (int $$7 = 0; $$7 < 20; $$7++) {
                  double $$8 = $$3.k() * 0.02;
                  double $$9 = $$3.k() * 0.02;
                  double $$10 = $$3.k() * 0.02;
                  ((arn)$$0).a(lv.ae, (double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 1, $$8, $$9, $$10, 0.15F);
               }

               this.a($$0, $$2);
            }
         }

         this.i++;
      }
   }

   @Nullable
   private jj a(jj $$0, dgv $$1) {
      if ($$1.a_($$0).a(this.g)) {
         return $$0;
      } else {
         jj[] $$2 = new jj[]{$$0.e(), $$0.h(), $$0.i(), $$0.f(), $$0.g(), $$0.e().e()};

         for (jj $$3 : $$2) {
            if ($$1.a_($$3).a(this.g)) {
               return $$3;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean a(dhs $$0, jj $$1) {
      eaj $$2 = $$0.a(kl.a($$1.u()), kl.a($$1.w()), ebk.n, false);
      return $$2 == null ? false : $$2.a_($$1).a(this.g) && $$2.a_($$1.d()).l() && $$2.a_($$1.b(2)).l();
   }
}
