import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cpw extends cpr {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bve> c = $$0 -> $$0.fu() || $$0.ca();

   public cpw(bup<? extends cpw> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpw(dff $$0, bve $$1, cwf $$2) {
      super(bup.aE, $$1, $$0, $$2);
   }

   public cpw(dff $$0, double $$1, double $$2, double $$3, cwf $$4) {
      super(bup.aE, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cwb o() {
      return cwj.vG;
   }

   @Override
   protected double bf() {
      return 0.05;
   }

   @Override
   protected void a(ezn $$0) {
      super.a($$0);
      if (!this.dY().C) {
         cwf $$1 = this.m();
         jm $$2 = $$0.c();
         jh $$3 = $$0.b();
         jh $$4 = $$3.a($$2);
         cye $$5 = $$1.a(ku.Q, cye.a);
         if ($$5.a(cyf.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jm $$6 : jm.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(ezp $$0) {
      super.a($$0);
      if (!this.dY().C) {
         cwf $$1 = this.m();
         cye $$2 = $$1.a(ku.Q, cye.a);
         if ($$2.a(cyf.a)) {
            this.q();
         } else if ($$2.c()) {
            if (this.t()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.d() == ezp.a.c ? ((ezo)$$0).a() : null);
            }
         }

         int $$3 = $$2.e().isPresent() && $$2.e().get().a().c() ? 2007 : 2002;
         this.dY().c($$3, this.dy(), $$2.b());
         this.av();
      }
   }

   private void q() {
      ezm $$0 = this.cT().c(4.0, 2.0, 4.0);

      for (bve $$2 : this.dY().a(bve.class, $$0, c)) {
         double $$3 = this.g($$2);
         if ($$3 < 16.0) {
            if ($$2.fu()) {
               $$2.a(this.dZ().c(this, this.s()), 1.0F);
            }

            if ($$2.ca() && $$2.bN()) {
               $$2.aP();
            }
         }
      }

      for (cih $$5 : this.dY().a(cih.class, $$0)) {
         $$5.q();
      }
   }

   private void a(Iterable<btn> $$0, @Nullable bui $$1) {
      ezm $$2 = this.cT().c(4.0, 2.0, 4.0);
      List<bve> $$3 = this.dY().a(bve.class, $$2);
      if (!$$3.isEmpty()) {
         bui $$4 = this.E();

         for (bve $$5 : $$3) {
            if ($$5.fO()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (btn $$9 : $$0) {
                     jq<btl> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.s(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        btn $$12 = new btn($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cye $$0) {
      bub $$1 = new bub(this.dY(), this.dD(), this.dF(), this.dJ());
      if (this.s() instanceof bve $$2) {
         $$1.a($$2);
      }

      $$1.a(3.0F);
      $$1.b(-0.5F);
      $$1.c(10);
      $$1.c(-$$1.g() / (float)$$1.j());
      $$1.a($$0);
      this.dY().b($$1);
   }

   private boolean t() {
      return this.m().a(cwj.vJ);
   }

   private void a(jh $$0) {
      dvo $$1 = this.dY().a_($$0);
      if ($$1.a(axd.aM)) {
         this.dY().a($$0, false, this);
      } else if (dhb.c($$1)) {
         dhb.a(null, $$1, this.dY(), $$0);
      } else if (dix.h($$1)) {
         this.dY().a(null, 1009, $$0, 0);
         dix.a(this.s(), this.dY(), $$0, $$1);
         this.dY().b($$0, $$1.b(dix.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bve $$0, bsy $$1) {
      double $$2 = $$0.dw().d - this.dw().d;
      double $$3 = $$0.dw().f - this.dw().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
