import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhv extends dix {
   public static final dtc<dsp> K = dsu.U;

   protected dhv(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhv> a();

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(dcd $$0, iz $$1, je $$2) {
      iz $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      for (je $$1 : $$0.f()) {
         dse $$2;
         if ($$1.o() == je.a.b) {
            $$2 = this.o().a(K, $$1 == je.b ? dsp.c : dsp.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dsp.b).a(aE, $$1.g());
         }

         if ($$2.a((dcd)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static je m(dse $$0) {
      switch ((dsp)$$0.c(K)) {
         case c:
            return je.a;
         case a:
            return je.b;
         default:
            return $$0.c(aE);
      }
   }
}
