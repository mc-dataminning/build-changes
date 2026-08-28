import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dqa extends drf {
   public static final ece<ebr> c = ebw.X;

   protected dqa(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqa> a();

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dkc $$0, iw $$1, jc $$2) {
      iw $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      for (jc $$1 : $$0.f()) {
         ebg $$2;
         if ($$1.o() == jc.a.b) {
            $$2 = this.m().b(c, $$1 == jc.b ? ebr.c : ebr.a).b(e, $$0.g());
         } else {
            $$2 = this.m().b(c, ebr.b).b(e, $$1.g());
         }

         if ($$2.a((dkc)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static jc n(ebg $$0) {
      switch ((ebr)$$0.c(c)) {
         case c:
            return jc.a;
         case a:
            return jc.b;
         default:
            return $$0.c(e);
      }
   }
}
