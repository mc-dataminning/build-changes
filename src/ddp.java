import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddp extends deg {
   public static final dsr a = diq.aE;
   public static final dso b = dsn.r;

   protected ddp(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ddp> a();

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.a;
      } else {
         this.a($$1, $$2, $$3);
         return bqp.c;
      }
   }

   protected abstract void a(dbt var1, iz var2, cms var3);

   @Override
   public drx a(cxv $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpc $$5 = $$1.c_($$2);
         if ($$5 instanceof doq) {
            if ($$1 instanceof arb) {
               bql.a($$1, $$2, (doq)$$5);
               ((doq)$$5).a((arb)$$1, evm.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      return cpp.a($$1.c_($$2));
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dpc> dpd<T> a(dbt $$0, dpe<T> $$1, dpe<? extends doq> $$2) {
      return $$0.B ? null : a($$1, $$2, doq::a);
   }
}
