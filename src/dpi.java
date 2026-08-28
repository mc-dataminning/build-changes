import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dpi extends dqn {
   public static final ebm<eaz> c = ebe.X;

   protected dpi(ean.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dpi> a();

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(djk $$0, iv $$1, jb $$2) {
      iv $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      for (jb $$1 : $$0.f()) {
         eao $$2;
         if ($$1.o() == jb.a.b) {
            $$2 = this.m().b(c, $$1 == jb.b ? eaz.c : eaz.a).b(e, $$0.g());
         } else {
            $$2 = this.m().b(c, eaz.b).b(e, $$1.g());
         }

         if ($$2.a((djk)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static jb n(eao $$0) {
      switch ((eaz)$$0.c(c)) {
         case c:
            return jb.a;
         case a:
            return jb.b;
         default:
            return $$0.c(e);
      }
   }
}
