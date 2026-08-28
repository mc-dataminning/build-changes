import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dpb extends dqg {
   public static final ebf<eas> c = eax.X;

   protected dpb(eag.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dpb> a();

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(djd $$0, iu $$1, ja $$2) {
      iu $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      for (ja $$1 : $$0.f()) {
         eah $$2;
         if ($$1.o() == ja.a.b) {
            $$2 = this.m().b(c, $$1 == ja.b ? eas.c : eas.a).b(e, $$0.g());
         } else {
            $$2 = this.m().b(c, eas.b).b(e, $$1.g());
         }

         if ($$2.a((djd)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static ja n(eah $$0) {
      switch ((eas)$$0.c(c)) {
         case c:
            return ja.a;
         case a:
            return ja.b;
         default:
            return $$0.c(e);
      }
   }
}
