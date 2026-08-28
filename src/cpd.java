import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cpd extends coy {
   public static final double b = 4.0;
   private static final double d = 16.0;
   public static final Predicate<bun> c = $$0 -> $$0.fo() || $$0.bV();

   public cpd(bty<? extends cpd> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cpd(dej $$0, bun $$1, cvs $$2) {
      super(bty.aE, $$1, $$0, $$2);
   }

   public cpd(dej $$0, double $$1, double $$2, double $$3, cvs $$4) {
      super(bty.aE, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cvn o() {
      return cvw.vq;
   }

   @Override
   protected double bc() {
      return 0.05;
   }

   @Override
   protected void a(eys $$0) {
      super.a($$0);
      if (!this.dS().B) {
         cvs $$1 = this.m();
         jk $$2 = $$0.c();
         jf $$3 = $$0.b();
         jf $$4 = $$3.a($$2);
         cxr $$5 = $$1.a(ks.L, cxr.a);
         if ($$5.a(cxs.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jk $$6 : jk.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(eyu $$0) {
      super.a($$0);
      if (!this.dS().B) {
         cvs $$1 = this.m();
         cxr $$2 = $$1.a(ks.L, cxr.a);
         if ($$2.a(cxs.a)) {
            this.q();
         } else if ($$2.c()) {
            if (this.t()) {
               this.a($$2);
            } else {
               this.a($$2.a(), $$0.d() == eyu.a.c ? ((eyt)$$0).a() : null);
            }
         }

         int $$3 = $$2.e().isPresent() && $$2.e().get().a().b() ? 2007 : 2002;
         this.dS().c($$3, this.ds(), $$2.b());
         this.as();
      }
   }

   private void q() {
      eyr $$0 = this.cO().c(4.0, 2.0, 4.0);

      for (bun $$2 : this.dS().a(bun.class, $$0, c)) {
         double $$3 = this.g($$2);
         if ($$3 < 16.0) {
            if ($$2.fo()) {
               $$2.a(this.dT().c(this, this.s()), 1.0F);
            }

            if ($$2.bV() && $$2.bI()) {
               $$2.aL();
            }
         }
      }

      for (chp $$5 : this.dS().a(chp.class, $$0)) {
         $$5.q();
      }
   }

   private void a(Iterable<bsy> $$0, @Nullable btr $$1) {
      eyr $$2 = this.cO().c(4.0, 2.0, 4.0);
      List<bun> $$3 = this.dS().a(bun.class, $$2);
      if (!$$3.isEmpty()) {
         btr $$4 = this.F();

         for (bun $$5 : $$3) {
            if ($$5.fH()) {
               double $$6 = this.g($$5);
               if ($$6 < 16.0) {
                  double $$7;
                  if ($$5 == $$1) {
                     $$7 = 1.0;
                  } else {
                     $$7 = 1.0 - Math.sqrt($$6) / 4.0;
                  }

                  for (bsy $$9 : $$0) {
                     jo<bsw> $$10 = $$9.c();
                     if ($$10.a().a()) {
                        $$10.a().a(this, this.s(), $$5, $$9.e(), $$7);
                     } else {
                        int $$11 = $$9.a($$1x -> (int)($$7 * (double)$$1x + 0.5));
                        bsy $$12 = new bsy($$10, $$11, $$9.e(), $$9.f(), $$9.g());
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

   private void a(cxr $$0) {
      btm $$1 = new btm(this.dS(), this.dx(), this.dz(), this.dD());
      if (this.s() instanceof bun $$2) {
         $$1.a($$2);
      }

      $$1.a(3.0F);
      $$1.b(-0.5F);
      $$1.c(10);
      $$1.c(-$$1.g() / (float)$$1.j());
      $$1.a($$0);
      this.dS().b($$1);
   }

   private boolean t() {
      return this.m().a(cvw.vt);
   }

   private void a(jf $$0) {
      dus $$1 = this.dS().a_($$0);
      if ($$1.a(awv.aL)) {
         this.dS().a($$0, false, this);
      } else if (dge.c($$1)) {
         dge.a(null, $$1, this.dS(), $$0);
      } else if (dia.h($$1)) {
         this.dS().a(null, 1009, $$0, 0);
         dia.a(this.s(), this.dS(), $$0, $$1);
         this.dS().b($$0, $$1.b(dia.c, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bun $$0, bsj $$1) {
      double $$2 = $$0.dq().d - this.dq().d;
      double $$3 = $$0.dq().f - this.dq().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
