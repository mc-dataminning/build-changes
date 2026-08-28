import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnp extends cnk implements cna {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<btc> c = $$0 -> $$0.fn() || $$0.bS();

   public cnp(bsn<? extends cnp> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cnp(dcg $$0, btc $$1) {
      super(bsn.aE, $$1, $$0);
   }

   public cnp(dcg $$0, double $$1, double $$2, double $$3) {
      super(bsn.aE, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cty t() {
      return cug.vo;
   }

   @Override
   protected double ba() {
      return 0.05;
   }

   @Override
   protected void a(ewd $$0) {
      super.a($$0);
      if (!this.dR().B) {
         cud $$1 = this.p();
         jf $$2 = $$0.b();
         ja $$3 = $$0.a();
         ja $$4 = $$3.a($$2);
         cwe $$5 = $$1.a(kn.G, cwe.a);
         if ($$5.a(cwf.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jf $$6 : jf.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(ewf $$0) {
      super.a($$0);
      if (!this.dR().B) {
         cud $$1 = this.p();
         cwe $$2 = $$1.a(kn.G, cwe.a);
         if ($$2.a(cwf.a)) {
            this.v();
         } else if ($$2.c()) {
            if (this.w()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.c() == ewf.a.c ? ((ewe)$$0).a() : null);
            }
         }

         int $$3 = $$2.e().isPresent() && $$2.e().get().a().b() ? 2007 : 2002;
         this.dR().c($$3, this.dr(), $$2.b());
         this.aq();
      }
   }

   private void v() {
      ewc $$0 = this.cM().c(4.0, 2.0, 4.0);

      for (btc $$2 : this.dR().a(btc.class, $$0, c)) {
         double $$3 = this.g($$2);
         if ($$3 < 16.0) {
            if ($$2.fn()) {
               $$2.a(this.dS().c(this, this.s()), 1.0F);
            }

            if ($$2.bS() && $$2.bF()) {
               $$2.aJ();
            }
         }
      }

      for (cge $$5 : this.dR().a(cge.class, $$0)) {
         $$5.s();
      }
   }

   private void a(Iterable<brp> $$0, @Nullable bsh $$1) {
      ewc $$2 = this.cM().c(4.0, 2.0, 4.0);
      List<btc> $$3 = this.dR().a(btc.class, $$2);
      if (!$$3.isEmpty()) {
         bsh $$4 = this.I();

         for (btc $$5 : $$3) {
            if ($$5.fE()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (brp $$9 : $$0) {
                     jj<brn> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.s(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        brp $$12 = new brp($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cwe $$0) {
      bsd $$1 = new bsd(this.dR(), this.dw(), this.dy(), this.dC());
      if (this.s() instanceof btc $$2) {
         $$1.a($$2);
      }

      $$1.a(3.0F);
      $$1.b(-0.5F);
      $$1.c(10);
      $$1.c(-$$1.g() / (float)$$1.j());
      $$1.a($$0);
      this.dR().b($$1);
   }

   private boolean w() {
      return this.p().a(cug.vr);
   }

   private void a(ja $$0) {
      dsl $$1 = this.dR().a_($$0);
      if ($$1.a(avw.aK)) {
         this.dR().a($$0, false, this);
      } else if (dea.c($$1)) {
         dea.a(null, $$1, this.dR(), $$0);
      } else if (dfw.g($$1)) {
         this.dR().a(null, 1009, $$0, 0);
         dfw.a(this.s(), this.dR(), $$0, $$1);
         this.dR().b($$0, $$1.a(dfw.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(btc $$0, bra $$1) {
      double $$2 = $$0.dp().c - this.dp().c;
      double $$3 = $$0.dp().e - this.dp().e;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
