import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cne extends cmz implements cmo {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bso> c = $$0 -> $$0.fy() || $$0.bV();

   public cne(bsb<? extends cne> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cne(dca $$0, bso $$1) {
      super(bsb.aG, $$1, $$0);
   }

   public cne(dca $$0, double $$1, double $$2, double $$3) {
      super(bsb.aG, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cuc r() {
      return cuk.wZ;
   }

   @Override
   protected double bc() {
      return 0.05;
   }

   @Override
   protected void a(ewq $$0) {
      super.a($$0);
      if (!this.dU().C) {
         cuh $$1 = this.p();
         iw $$2 = $$0.b();
         ir $$3 = $$0.a();
         ir $$4 = $$3.a($$2);
         cwr $$5 = $$1.a(ke.E, cwr.a);
         if ($$5.a(cws.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (iw $$6 : iw.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(ews $$0) {
      super.a($$0);
      if (!this.dU().C) {
         cuh $$1 = this.p();
         cwr $$2 = $$1.a(ke.E, cwr.a);
         if ($$2.a(cws.a)) {
            this.u();
         } else if ($$2.d()) {
            if (this.w()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.c() == ews.a.c ? ((ewr)$$0).a() : null);
            }
         }

         int $$3 = $$2.f().isPresent() && $$2.f().get().a().b() ? 2007 : 2002;
         this.dU().c($$3, this.du(), $$2.b());
         this.ao();
      }
   }

   private void u() {
      ewp $$0 = this.cP().c(4.0, 2.0, 4.0);

      for (bso $$2 : this.dU().a(bso.class, $$0, c)) {
         double $$3 = this.g($$2);
         if ($$3 < 16.0) {
            if ($$2.fy()) {
               $$2.a(this.dX().c(this, this.t()), 1.0F);
            }

            if ($$2.bV() && $$2.bI()) {
               $$2.aK();
            }
         }
      }

      for (cfq $$5 : this.dU().a(cfq.class, $$0)) {
         $$5.r();
      }
   }

   private void a(Iterable<brh> $$0, @Nullable brv $$1) {
      ewp $$2 = this.cP().c(4.0, 2.0, 4.0);
      List<bso> $$3 = this.dU().a(bso.class, $$2);
      if (!$$3.isEmpty()) {
         brv $$4 = this.I();

         for (bso $$5 : $$3) {
            if ($$5.fP()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (brh $$9 : $$0) {
                     ja<brf> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.t(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        brh $$12 = new brh($$10, $$11, $$9.e(), $$9.f(), $$9.g());
                        if (!$$12.a(20)) {
                           $$5.b($$12, $$4);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void a(cwr $$0) {
      brr $$1 = new brr(this.dU(), this.dz(), this.dB(), this.dF());
      if (this.t() instanceof bso $$2) {
         $$1.a($$2);
      }

      $$1.a(3.0F);
      $$1.b(-0.5F);
      $$1.c(10);
      $$1.c(-$$1.g() / (float)$$1.k());
      $$1.a($$0);
      this.dU().b($$1);
   }

   private boolean w() {
      return this.p().a(cuk.xc);
   }

   private void a(ir $$0) {
      dtc $$1 = this.dU().a_($$0);
      if ($$1.a(awe.aM)) {
         this.dU().a($$0, false, this);
      } else if (ddt.c($$1)) {
         ddt.a(null, $$1, this.dU(), $$0);
      } else if (dfq.g($$1)) {
         this.dU().a(null, 1009, $$0, 0);
         dfq.a(this.t(), this.dU(), $$0, $$1);
         this.dU().b($$0, $$1.a(dfq.d, Boolean.valueOf(false)));
      }
   }
}
