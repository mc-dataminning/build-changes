import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhk extends dhy implements dkq {
   protected dhk(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhk> a();

   @Override
   protected doe a_(dvd $$0) {
      return doe.a;
   }

   @Override
   protected boolean a(dvd $$0, dev $$1, jg $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dsg $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bsa b(dvd $$0, dev $$1, jg $$2) {
      dsg $$3 = $$1.c_($$2);
      return $$3 instanceof bsa ? (bsa)$$3 : null;
   }

   @Nullable
   protected static <E extends dsg, A extends dsg> dsh<A> a(dsi<A> $$0, dsi<E> $$1, dsh<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
