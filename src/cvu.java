import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvu extends cww {
   public static final dgb<dfo> K = dft.U;

   protected cvu(dfc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cvu> a();

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(cqe $$0, gw $$1, ha $$2) {
      gw $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      for (ha $$1 : $$0.f()) {
         dfd $$2;
         if ($$1.o() == ha.a.b) {
            $$2 = this.o().a(K, $$1 == ha.b ? dfo.c : dfo.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dfo.b).a(aE, $$1.g());
         }

         if ($$2.a((cqe)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ha h(dfd $$0) {
      switch ((dfo)$$0.c(K)) {
         case c:
            return ha.a;
         case a:
            return ha.b;
         default:
            return $$0.c(aE);
      }
   }
}
