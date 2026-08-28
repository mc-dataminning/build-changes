import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cob extends cnw implements cnm {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<btn> c = $$0 -> $$0.fl() || $$0.bR();

   public cob(bsx<? extends cob> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cob(dcw $$0, btn $$1) {
      super(bsx.aE, $$1, $$0);
   }

   public cob(dcw $$0, double $$1, double $$2, double $$3) {
      super(bsx.aE, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cul t() {
      return cut.vo;
   }

   @Override
   protected double aZ() {
      return 0.05;
   }

   @Override
   protected void a(ewy $$0) {
      super.a($$0);
      if (!this.dO().B) {
         cuq $$1 = this.p();
         ji $$2 = $$0.b();
         jd $$3 = $$0.a();
         jd $$4 = $$3.a($$2);
         cwu $$5 = $$1.a(kq.G, cwu.a);
         if ($$5.a(cwv.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (ji $$6 : ji.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(exa $$0) {
      super.a($$0);
      if (!this.dO().B) {
         cuq $$1 = this.p();
         cwu $$2 = $$1.a(kq.G, cwu.a);
         if ($$2.a(cwv.a)) {
            this.v();
         } else if ($$2.c()) {
            if (this.w()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.c() == exa.a.c ? ((ewz)$$0).a() : null);
            }
         }

         int $$3 = $$2.e().isPresent() && $$2.e().get().a().b() ? 2007 : 2002;
         this.dO().c($$3, this.do(), $$2.b());
         this.aq();
      }
   }

   private void v() {
      ewx $$0 = this.cK().c(4.0, 2.0, 4.0);

      for (btn $$2 : this.dO().a(btn.class, $$0, c)) {
         double $$3 = this.g($$2);
         if ($$3 < 16.0) {
            if ($$2.fl()) {
               $$2.a(this.dP().c(this, this.s()), 1.0F);
            }

            if ($$2.bR() && $$2.bE()) {
               $$2.aI();
            }
         }
      }

      for (cgq $$5 : this.dO().a(cgq.class, $$0)) {
         $$5.s();
      }
   }

   private void a(Iterable<brz> $$0, @Nullable bsr $$1) {
      ewx $$2 = this.cK().c(4.0, 2.0, 4.0);
      List<btn> $$3 = this.dO().a(btn.class, $$2);
      if (!$$3.isEmpty()) {
         bsr $$4 = this.H();

         for (btn $$5 : $$3) {
            if ($$5.fC()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (brz $$9 : $$0) {
                     jm<brx> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.s(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        brz $$12 = new brz($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cwu $$0) {
      bsn $$1 = new bsn(this.dO(), this.dt(), this.dv(), this.dz());
      if (this.s() instanceof btn $$2) {
         $$1.a($$2);
      }

      $$1.a(3.0F);
      $$1.b(-0.5F);
      $$1.c(10);
      $$1.c(-$$1.g() / (float)$$1.j());
      $$1.a($$0);
      this.dO().b($$1);
   }

   private boolean w() {
      return this.p().a(cut.vr);
   }

   private void a(jd $$0) {
      dtc $$1 = this.dO().a_($$0);
      if ($$1.a(awe.aL)) {
         this.dO().a($$0, false, this);
      } else if (deq.c($$1)) {
         deq.a(null, $$1, this.dO(), $$0);
      } else if (dgm.g($$1)) {
         this.dO().a(null, 1009, $$0, 0);
         dgm.a(this.s(), this.dO(), $$0, $$1);
         this.dO().b($$0, $$1.a(dgm.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(btn $$0, brk $$1) {
      double $$2 = $$0.dm().c - this.dm().c;
      double $$3 = $$0.dm().e - this.dm().e;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
