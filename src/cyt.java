import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cyt extends czu {
   public static final djn<dja> K = djf.U;

   protected cyt(dio.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cyt> a();

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(ctb $$0, hv $$1, ia $$2) {
      hv $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      for (ia $$1 : $$0.f()) {
         dip $$2;
         if ($$1.o() == ia.a.b) {
            $$2 = this.o().a(K, $$1 == ia.b ? dja.c : dja.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dja.b).a(aE, $$1.g());
         }

         if ($$2.a((ctb)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ia h(dip $$0) {
      switch ((dja)$$0.c(K)) {
         case c:
            return ia.a;
         case a:
            return ia.b;
         default:
            return $$0.c(aE);
      }
   }
}
