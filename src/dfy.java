import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dfy extends dha {
   public static final drf<dqs> K = dqx.U;

   protected dfy(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfy> a();

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(dag $$0, in $$1, is $$2) {
      in $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      for (is $$1 : $$0.f()) {
         dqh $$2;
         if ($$1.o() == is.a.b) {
            $$2 = this.n().a(K, $$1 == is.b ? dqs.c : dqs.a).a(aE, $$0.g());
         } else {
            $$2 = this.n().a(K, dqs.b).a(aE, $$1.g());
         }

         if ($$2.a((dag)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static is m(dqh $$0) {
      switch ((dqs)$$0.c(K)) {
         case c:
            return is.a;
         case a:
            return is.b;
         default:
            return $$0.c(aE);
      }
   }
}
