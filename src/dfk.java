import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dfk extends dfy implements diq {
   protected dfk(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfk> a();

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.a;
   }

   @Override
   protected boolean a(dtc $$0, dcw $$1, jd $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dqh $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bqv b(dtc $$0, dcw $$1, jd $$2) {
      dqh $$3 = $$1.c_($$2);
      return $$3 instanceof bqv ? (bqv)$$3 : null;
   }

   @Nullable
   protected static <E extends dqh, A extends dqh> dqi<A> a(dqj<A> $$0, dqj<E> $$1, dqi<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
