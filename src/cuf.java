import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cuf extends cut implements cxk {
   protected cuf(dgv.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cuf> a();

   @Override
   public day b_(dgw $$0) {
      return day.a;
   }

   @Override
   public boolean a(dgw $$0, crs $$1, ht $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      der $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   public bit b(dgw $$0, crs $$1, ht $$2) {
      der $$3 = $$1.c_($$2);
      return $$3 instanceof bit ? (bit)$$3 : null;
   }

   @Nullable
   protected static <E extends der, A extends der> des<A> a(det<A> $$0, det<E> $$1, des<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
