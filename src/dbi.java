import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dbi extends dcj {
   public static final dmd<dlq> K = dlv.U;

   protected dbi(dle.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dbi> a();

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(cvq $$0, hz $$1, ie $$2) {
      hz $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      for (ie $$1 : $$0.f()) {
         dlf $$2;
         if ($$1.o() == ie.a.b) {
            $$2 = this.o().a(K, $$1 == ie.b ? dlq.c : dlq.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dlq.b).a(aE, $$1.g());
         }

         if ($$2.a((cvq)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ie m(dlf $$0) {
      switch ((dlq)$$0.c(K)) {
         case c:
            return ie.a;
         case a:
            return ie.b;
         default:
            return $$0.c(aE);
      }
   }
}
