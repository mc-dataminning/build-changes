import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dkd extends dlf {
   public static final dvm<duz> L = dve.U;

   protected dkd(dun.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkd> a();

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dej $$0, je $$1, jj $$2) {
      je $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      for (jj $$1 : $$0.f()) {
         duo $$2;
         if ($$1.o() == jj.a.b) {
            $$2 = this.o().b(L, $$1 == jj.b ? duz.c : duz.a).b(aF, $$0.g());
         } else {
            $$2 = this.o().b(L, duz.b).b(aF, $$1.g());
         }

         if ($$2.a((dej)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return n($$0).g() == $$1 && !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static jj n(duo $$0) {
      switch ((duz)$$0.c(L)) {
         case c:
            return jj.a;
         case a:
            return jj.b;
         default:
            return $$0.c(aF);
      }
   }
}
