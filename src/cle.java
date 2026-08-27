import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cle extends ckz implements ckp {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bqt> c = $$0 -> $$0.fm() || $$0.bN();

   public cle(bqg<? extends cle> $$0, czg $$1) {
      super($$0, $$1);
   }

   public cle(czg $$0, bqt $$1) {
      super(bqg.aD, $$1, $$0);
   }

   public cle(czg $$0, double $$1, double $$2, double $$3) {
      super(bqg.aD, $$1, $$2, $$3, $$0);
   }

   @Override
   protected crn r() {
      return crv.vm;
   }

   @Override
   protected double aW() {
      return 0.05;
   }

   @Override
   protected void a(esf $$0) {
      super.a($$0);
      if (!this.dM().B) {
         crs $$1 = this.p();
         ij $$2 = $$0.b();
         id $$3 = $$0.a();
         id $$4 = $$3.a($$2);
         ctq $$5 = $$1.a(jr.x, ctq.a);
         if ($$5.a(ctr.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (ij $$6 : ij.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(esh $$0) {
      super.a($$0);
      if (!this.dM().B) {
         crs $$1 = this.p();
         ctq $$2 = $$1.a(jr.x, ctq.a);
         if ($$2.a(ctr.a)) {
            this.v();
         } else if ($$2.d()) {
            if (this.w()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.c() == esh.a.c ? ((esg)$$0).a() : null);
            }
         }

         int $$3 = $$2.f().isPresent() && $$2.f().get().a().b() ? 2007 : 2002;
         this.dM().c($$3, this.dm(), $$2.b());
         this.am();
      }
   }

   private void v() {
      ese $$0 = this.cH().c(4.0, 2.0, 4.0);

      for (bqt $$2 : this.dM().a(bqt.class, $$0, c)) {
         double $$3 = this.g($$2);
         if ($$3 < 16.0) {
            if ($$2.fm()) {
               $$2.a(this.dN().c(this, this.u()), 1.0F);
            }

            if ($$2.bN() && $$2.bA()) {
               $$2.aF();
            }
         }
      }

      for (cdu $$5 : this.dM().a(cdu.class, $$0)) {
         $$5.r();
      }
   }

   private void a(Iterable<bpm> $$0, @Nullable bqa $$1) {
      ese $$2 = this.cH().c(4.0, 2.0, 4.0);
      List<bqt> $$3 = this.dM().a(bqt.class, $$2);
      if (!$$3.isEmpty()) {
         bqa $$4 = this.I();

         for (bqt $$5 : $$3) {
            if ($$5.fD()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bpm $$9 : $$0) {
                     in<bpk> $$10 = $$9.b();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.u(), $$5, $$9.d(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bpm $$12 = new bpm($$10, $$11, $$9.d(), $$9.e(), $$9.f());
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

   private void a(ctq $$0) {
      bpw $$1 = new bpw(this.dM(), this.dr(), this.dt(), this.dx());
      if (this.u() instanceof bqt $$2) {
         $$1.a($$2);
      }

      $$1.a(3.0F);
      $$1.b(-0.5F);
      $$1.c(10);
      $$1.c(-$$1.g() / (float)$$1.k());
      $$1.a($$0);
      this.dM().b($$1);
   }

   private boolean w() {
      return this.p().a(crv.vp);
   }

   private void a(id $$0) {
      dpi $$1 = this.dM().a_($$0);
      if ($$1.a(ave.aK)) {
         this.dM().a($$0, false, this);
      } else if (daz.c($$1)) {
         daz.a(null, $$1, this.dM(), $$0);
      } else if (dcv.g($$1)) {
         this.dM().a(null, 1009, $$0, 0);
         dcv.a(this.u(), this.dM(), $$0, $$1);
         this.dM().b($$0, $$1.a(dcv.c, Boolean.valueOf(false)));
      }
   }
}
