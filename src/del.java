import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class del extends dez implements dhr {
   protected del(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends del> a();

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.a;
   }

   @Override
   protected boolean a(dsc $$0, dby $$1, iz $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dph $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bqy b(dsc $$0, dby $$1, iz $$2) {
      dph $$3 = $$1.c_($$2);
      return $$3 instanceof bqy ? (bqy)$$3 : null;
   }

   @Nullable
   protected static <E extends dph, A extends dph> dpi<A> a(dpj<A> $$0, dpj<E> $$1, dpi<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
