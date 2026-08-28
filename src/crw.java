import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class crw extends cso {
   public static final double a = 4.0;
   protected static final double b = 16.0;
   public static final Predicate<bxj> c = $$0 -> $$0.fq() || $$0.bW();

   public crw(bwr<? extends crw> $$0, djm $$1) {
      super($$0, $$1);
   }

   public crw(bwr<? extends crw> $$0, djm $$1, bxj $$2, czn $$3) {
      super($$0, $$2, $$1, $$3);
   }

   public crw(bwr<? extends crw> $$0, djm $$1, double $$2, double $$3, double $$4, czn $$5) {
      super($$0, $$2, $$3, $$4, $$1, $$5);
   }

   @Override
   protected double bb() {
      return 0.05;
   }

   @Override
   protected void a(fey $$0) {
      super.a($$0);
      if (!this.dU().C) {
         czn $$1 = this.f();
         jb $$2 = $$0.c();
         iv $$3 = $$0.b();
         iv $$4 = $$3.a($$2);
         dbj $$5 = $$1.a(kk.R, dbj.a);
         if ($$5.a(dbk.a)) {
            this.a($$4);
            this.a($$4.a($$2.g()));

            for (jb $$6 : jb.c.a) {
               this.a($$4.a($$6));
            }
         }
      }
   }

   @Override
   protected void a(ffa $$0) {
      super.a($$0);
      if (this.dU() instanceof arq $$1) {
         czn $$3 = this.f();
         dbj $$4 = $$3.a(kk.R, dbj.a);
         if ($$4.a(dbk.a)) {
            this.b($$1);
         } else if ($$4.c()) {
            this.a($$1, $$3, $$0.d() == ffa.a.c ? ((fez)$$0).a() : null);
         }

         int $$5 = $$4.e().isPresent() && $$4.e().get().a().c() ? 2007 : 2002;
         $$1.c($$5, this.du(), $$4.b());
         this.aq();
      }
   }

   private void b(arq $$0) {
      fex $$1 = this.cQ().c(4.0, 2.0, 4.0);

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

      for (cko $$6 : this.dU().a(cko.class, $$1)) {
         $$6.q();
      }
   }

   protected abstract void a(arq var1, czn var2, @Nullable bwi var3);

   private void a(iv $$0) {
      eat $$1 = this.dU().a_($$0);
      if ($$1.a(axc.aN)) {
         this.dU().a($$0, false, this);
      } else if (dlj.c($$1)) {
         dlj.a(null, $$1, this.dU(), $$0);
      } else if (dnh.h($$1)) {
         this.dU().a(null, 1009, $$0, 0);
         dnh.a(this.q(), this.dU(), $$0, $$1);
         this.dU().b($$0, $$1.b(dnh.b, Boolean.valueOf(false)));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(bxj $$0, bux $$1) {
      double $$2 = $$0.ds().d - this.ds().d;
      double $$3 = $$0.ds().f - this.ds().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
