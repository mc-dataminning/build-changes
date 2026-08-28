import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhs extends diu {
   public static final dsz<dsm> K = dsr.U;

   protected dhs(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhs> a();

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(dca $$0, iz $$1, je $$2) {
      iz $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      for (je $$1 : $$0.f()) {
         dsb $$2;
         if ($$1.o() == je.a.b) {
            $$2 = this.o().a(K, $$1 == je.b ? dsm.c : dsm.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dsm.b).a(aE, $$1.g());
         }

         if ($$2.a((dca)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static je m(dsb $$0) {
      switch ((dsm)$$0.c(K)) {
         case c:
            return je.a;
         case a:
            return je.b;
         default:
            return $$0.c(aE);
      }
   }
}
