import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dcq extends dde implements dfw {
   protected dcq(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dcq> a();

   @Override
   protected djk a_(dqh $$0) {
      return djk.a;
   }

   @Override
   protected boolean a(dqh $$0, dad $$1, in $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dnm $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bpq b(dqh $$0, dad $$1, in $$2) {
      dnm $$3 = $$1.c_($$2);
      return $$3 instanceof bpq ? (bpq)$$3 : null;
   }

   @Nullable
   protected static <E extends dnm, A extends dnm> dnn<A> a(dno<A> $$0, dno<E> $$1, dnn<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
