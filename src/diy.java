import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class diy extends djm implements dmf {
   protected diy(dww.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends diy> a();

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.a;
   }

   @Override
   protected boolean a(dwx $$0, dgi $$1, ji $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dtz $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bsl b(dwx $$0, dgi $$1, ji $$2) {
      dtz $$3 = $$1.c_($$2);
      return $$3 instanceof bsl ? (bsl)$$3 : null;
   }

   @Nullable
   protected static <E extends dtz, A extends dtz> dua<A> a(dub<A> $$0, dub<E> $$1, dua<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
