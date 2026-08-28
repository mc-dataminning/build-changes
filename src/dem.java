import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dem extends dfa implements dhs {
   protected dem(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dem> a();

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.a;
   }

   @Override
   protected boolean a(dsd $$0, dbz $$1, iz $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dpi $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bqz b(dsd $$0, dbz $$1, iz $$2) {
      dpi $$3 = $$1.c_($$2);
      return $$3 instanceof bqz ? (bqz)$$3 : null;
   }

   @Nullable
   protected static <E extends dpi, A extends dpi> dpj<A> a(dpk<A> $$0, dpk<E> $$1, dpj<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
