import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class crt extends csl {
   public static final double a = 4.0;
   protected static final double b = 16.0;
   public static final Predicate<bxj> c = $$0 -> $$0.fq() || $$0.bW();

   public crt(bwr<? extends crt> $$0, djh $$1) {
      super($$0, $$1);
   }

   public crt(bwr<? extends crt> $$0, djh $$1, bxj $$2, czk $$3) {
      super($$0, $$2, $$1, $$3);
   }

   public crt(bwr<? extends crt> $$0, djh $$1, double $$2, double $$3, double $$4, czk $$5) {
      super($$0, $$2, $$3, $$4, $$1, $$5);
   }

   @Override
   protected double bb() {
      return 0.05;
   }

   @Override
   protected void a(fet $$0) {
      super.a($$0);
      if (!this.dU().C) {
         czk $$1 = this.f();
         jb $$2 = $$0.c();
         iv $$3 = $$0.b();
         iv $$4 = $$3.a($$2);
         dbg $$5 = $$1.a(kk.R, dbg.a);
         if ($$5.a(dbh.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jb $$6 : jb.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(fev $$0) {
      super.a($$0);
      if (this.dU() instanceof arq $$1) {
         czk $$3 = this.f();
         dbg $$4 = $$3.a(kk.R, dbg.a);
         if ($$4.a(dbh.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            this.a($$1, $$3, $$0.d() == fev.a.c ? ((feu)$$0).a() : null);
         }

         int $$5 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$5, this.du(), $$4.b());
         this.aq();
      }
   }

   private void b(arq $$0) {
      fes $$1 = this.cQ().c(4.0, 2.0, 4.0);

      for (bxj $$3 : this.dU().a(bxj.class, $$1, c)) {
         double $$4 = this.g($$3);
         if ($$4 < 16.0) {
            if ($$3.fq()) {
               $$3.a($$0, this.dV().c(this, this.q()), 1.0F);
            }

            if ($$3.bW() && $$3.bI()) {
               $$3.aL();
            }
         }
      }

      for (ckr $$6 : this.dU().a(ckr.class, $$1)) {
         $$6.q();
      }
   }

   protected abstract void a(arq var1, czk var2, @Nullable bwi var3);

   private void a(iv $$0) {
      eao $$1 = this.dU().a_($$0);
      if ($$1.a(axc.aN)) {
         this.dU().a($$0, false, this);
      } else if (dle.c($$1)) {
         dle.a(null, $$1, this.dU(), $$0);
      } else if (dnc.h($$1)) {
         this.dU().a(null, 1009, $$0, 0);
         dnc.a(this.q(), this.dU(), $$0, $$1);
         this.dU().b($$0, $$1.b(dnc.b, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bxj $$0, bux $$1) {
      double $$2 = $$0.ds().d - this.ds().d;
      double $$3 = $$0.ds().f - this.ds().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
