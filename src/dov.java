import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dov extends dqa {
   public static final eax<eak> c = eap.X;

   protected dov(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dov> a();

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(diy $$0, iu $$1, ja $$2) {
      iu $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      for (ja $$1 : $$0.f()) {
         dzz $$2;
         if ($$1.o() == ja.a.b) {
            $$2 = this.m().b(c, $$1 == ja.b ? eak.c : eak.a).b(e, $$0.g());
         } else {
            $$2 = this.m().b(c, eak.b).b(e, $$1.g());
         }

         if ($$2.a((diy)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static ja n(dzz $$0) {
      switch ((eak)$$0.c(c)) {
         case c:
            return ja.a;
         case a:
            return ja.b;
         default:
            return $$0.c(e);
      }
   }
}
