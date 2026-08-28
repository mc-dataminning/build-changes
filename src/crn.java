import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class crn extends cri {
   public static final double a = 4.0;
   private static final double c = 16.0;
   public static final Predicate<bwr> b = $$0 -> $$0.fq() || $$0.bY();

   public crn(bwb<? extends crn> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public crn(dhp $$0, bwr $$1, cxy $$2) {
      super(bwb.aV, $$1, $$0, $$2);
   }

   public crn(dhp $$0, double $$1, double $$2, double $$3, cxy $$4) {
      super(bwb.aV, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cxu g() {
      return cyc.ws;
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   @Override
   protected void a(fcq $$0) {
      super.a($$0);
      if (!this.dV().C) {
         cxy $$1 = this.f();
         jo $$2 = $$0.c();
         jj $$3 = $$0.b();
         jj $$4 = $$3.a($$2);
         czu $$5 = $$1.a(kx.R, czu.a);
         if ($$5.a(czv.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jo $$6 : jo.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(fcs $$0) {
      super.a($$0);
      if (this.dV() instanceof arn $$1) {
         cxy $$3 = this.f();
         czu $$4 = $$3.a(kx.R, czu.a);
         if ($$4.a(czv.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            float $$5 = $$3.a(kx.S, 1.0F);
            if (this.j()) {
               this.a($$4, $$5);
            } else {
               this.a($$1, $$4.a(), $$5, $$0.d() == fcs.a.c ? ((fcr)$$0).a() : null);
            }
         }

         int $$6 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$6, this.dv(), $$4.b());
         this.at();
      }
   }

   private void b(arn $$0) {
      fcp $$1 = this.cR().c(4.0, 2.0, 4.0);

      for (bwr $$3 : this.dV().a(bwr.class, $$1, b)) {
         double $$4 = this.g($$3);
         if ($$4 < 16.0) {
            if ($$3.fq()) {
               $$3.a($$0, this.dW().c(this, this.q()), 1.0F);
            }

            if ($$3.bY() && $$3.bK()) {
               $$3.aN();
            }
         }
      }

      for (cjv $$6 : this.dV().a(cjv.class, $$1)) {
         $$6.q();
      }
   }

   private void a(arn $$0, Iterable<buw> $$1, float $$2, @Nullable bvs $$3) {
      fcp $$4 = this.cR().c(4.0, 2.0, 4.0);
      List<bwr> $$5 = $$0.a(bwr.class, $$4);
      if (!$$5.isEmpty()) {
         bvs $$6 = this.z();

         for (bwr $$7 : $$5) {
            if ($$7.fK()) {
               double $$8 = this.g($$7);
               if ($$8 < 16.0) {
                  double $$9;
                  if ($$7 == $$3) {
                     $$9 = 1.0;
                  } else {
                     $$9 = 1.0 - Math.sqrt($$8) / 4.0;
                  }

                  for (buw $$11 : $$1) {
                     js<buu> $$12 = $$11.c();
                     if ($$12.a().a()) {
                        $$12.a().a($$0, this, this.q(), $$7, $$11.e(), $$9);
                     } else {
                        int $$13 = $$11.a($$2x -> (int)((double)$$2 * $$9 * (double)$$2x + 0.5));
                        buw $$14 = new buw($$12, $$13, $$11.e(), $$11.f(), $$11.g());
                        if (!$$14.a(20)) {
                           $$7.b($$14, $$6);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void a(czu $$0, float $$1) {
      bvk $$2 = new bvk(this.dV(), this.dA(), this.dC(), this.dG());
      if (this.q() instanceof bwr $$3) {
         $$2.a($$3);
      }

      $$2.a(3.0F);
      $$2.c(-0.5F);
      $$2.c(10);
      $$2.d(-$$2.e() / (float)$$2.i());
      $$2.a($$0);
      $$2.b($$1);
      this.dV().b($$2);
   }

   private boolean j() {
      return this.f().a(cyc.wv);
   }

   private void a(jj $$0) {
      dym $$1 = this.dV().a_($$0);
      if ($$1.a(awz.aN)) {
         this.dV().a($$0, false, this);
      } else if (djm.c($$1)) {
         djm.a(null, $$1, this.dV(), $$0);
      } else if (dlj.h($$1)) {
         this.dV().a(null, 1009, $$0, 0);
         dlj.a(this.q(), this.dV(), $$0, $$1);
         this.dV().b($$0, $$1.b(dlj.b, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bwr $$0, buh $$1) {
      double $$2 = $$0.dt().d - this.dt().d;
      double $$3 = $$0.dt().f - this.dt().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
