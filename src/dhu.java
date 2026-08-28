import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhu extends diw {
   public static final dtb<dso> K = dst.U;

   protected dhu(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhu> a();

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(dcc $$0, iz $$1, je $$2) {
      iz $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      for (je $$1 : $$0.f()) {
         dsd $$2;
         if ($$1.o() == je.a.b) {
            $$2 = this.o().a(K, $$1 == je.b ? dso.c : dso.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dso.b).a(aE, $$1.g());
         }

         if ($$2.a((dcc)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static je m(dsd $$0) {
      switch ((dso)$$0.c(K)) {
         case c:
            return je.a;
         case a:
            return je.b;
         default:
            return $$0.c(aE);
      }
   }
}
