import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dcu extends ddv {
   public static final dnx<dnk> K = dnp.U;

   protected dcu(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dcu> a();

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(cxc $$0, ib $$1, ih $$2) {
      ib $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      for (ih $$1 : $$0.f()) {
         dmz $$2;
         if ($$1.o() == ih.a.b) {
            $$2 = this.o().a(K, $$1 == ih.b ? dnk.c : dnk.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dnk.b).a(aE, $$1.g());
         }

         if ($$2.a((cxc)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ih m(dmz $$0) {
      switch ((dnk)$$0.c(K)) {
         case c:
            return ih.a;
         case a:
            return ih.b;
         default:
            return $$0.c(aE);
      }
   }
}
