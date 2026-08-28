import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dho extends diq {
   public static final dsv<dsi> K = dsn.U;

   protected dho(drw.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dho> a();

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(dbw $$0, iz $$1, je $$2) {
      iz $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      for (je $$1 : $$0.f()) {
         drx $$2;
         if ($$1.o() == je.a.b) {
            $$2 = this.n().a(K, $$1 == je.b ? dsi.c : dsi.a).a(aE, $$0.g());
         } else {
            $$2 = this.n().a(K, dsi.b).a(aE, $$1.g());
         }

         if ($$2.a((dbw)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static je m(drx $$0) {
      switch ((dsi)$$0.c(K)) {
         case c:
            return je.a;
         case a:
            return je.b;
         default:
            return $$0.c(aE);
      }
   }
}
