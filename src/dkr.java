import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dkr extends dlt {
   public static final dwb<dvo> L = dvt.U;

   protected dkr(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkr> a();

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dey $$0, jg $$1, jl $$2) {
      jg $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      for (jl $$1 : $$0.f()) {
         dvd $$2;
         if ($$1.o() == jl.a.b) {
            $$2 = this.m().b(L, $$1 == jl.b ? dvo.c : dvo.a).b(aF, $$0.g());
         } else {
            $$2 = this.m().b(L, dvo.b).b(aF, $$1.g());
         }

         if ($$2.a((dey)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return n($$0).g() == $$1 && !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static jl n(dvd $$0) {
      switch ((dvo)$$0.c(L)) {
         case c:
            return jl.a;
         case a:
            return jl.b;
         default:
            return $$0.c(aF);
      }
   }
}
