import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dcw extends ddx {
   public static final dnz<dnm> K = dnr.U;

   protected dcw(dna.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dcw> a();

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(cxe $$0, ib $$1, ih $$2) {
      ib $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      for (ih $$1 : $$0.f()) {
         dnb $$2;
         if ($$1.o() == ih.a.b) {
            $$2 = this.o().a(K, $$1 == ih.b ? dnm.c : dnm.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dnm.b).a(aE, $$1.g());
         }

         if ($$2.a((cxe)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ih m(dnb $$0) {
      switch ((dnm)$$0.c(K)) {
         case c:
            return ih.a;
         case a:
            return ih.b;
         default:
            return $$0.c(aE);
      }
   }
}
