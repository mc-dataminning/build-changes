import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dht extends div {
   public static final dta<dsn> K = dss.U;

   protected dht(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dht> a();

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(dcb $$0, iz $$1, je $$2) {
      iz $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      for (je $$1 : $$0.f()) {
         dsc $$2;
         if ($$1.o() == je.a.b) {
            $$2 = this.o().a(K, $$1 == je.b ? dsn.c : dsn.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dsn.b).a(aE, $$1.g());
         }

         if ($$2.a((dcb)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static je m(dsc $$0) {
      switch ((dsn)$$0.c(K)) {
         case c:
            return je.a;
         case a:
            return je.b;
         default:
            return $$0.c(aE);
      }
   }
}
