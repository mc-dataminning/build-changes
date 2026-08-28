import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djq extends dke implements dmx {
   protected djq(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djq> a();

   @Override
   protected boolean a(dxq $$0, dgz $$1, ji $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dus $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bta b(dxq $$0, dgz $$1, ji $$2) {
      dus $$3 = $$1.c_($$2);
      return $$3 instanceof bta ? (bta)$$3 : null;
   }

   @Nullable
   protected static <E extends dus, A extends dus> dut<A> a(duu<A> $$0, duu<E> $$1, dut<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
