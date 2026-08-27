import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cwk extends cwy implements czq {
   protected cwk(djo.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cwk> a();

   @Override
   public ddd b_(djp $$0) {
      return ddd.a;
   }

   @Override
   public boolean a(djp $$0, ctx $$1, hx $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dhd $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   public bkg b(djp $$0, ctx $$1, hx $$2) {
      dhd $$3 = $$1.c_($$2);
      return $$3 instanceof bkg ? (bkg)$$3 : null;
   }

   @Nullable
   protected static <E extends dhd, A extends dhd> dhe<A> a(dhf<A> $$0, dhf<E> $$1, dhe<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
