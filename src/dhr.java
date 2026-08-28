import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhr extends dit {
   public static final dsy<dsl> K = dsq.U;

   protected dhr(drz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhr> a();

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(dbz $$0, iz $$1, je $$2) {
      iz $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      for (je $$1 : $$0.f()) {
         dsa $$2;
         if ($$1.o() == je.a.b) {
            $$2 = this.o().a(K, $$1 == je.b ? dsl.c : dsl.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dsl.b).a(aE, $$1.g());
         }

         if ($$2.a((dbz)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static je m(dsa $$0) {
      switch ((dsl)$$0.c(K)) {
         case c:
            return je.a;
         case a:
            return je.b;
         default:
            return $$0.c(aE);
      }
   }
}
