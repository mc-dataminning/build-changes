import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddk extends ddy implements dgq {
   protected ddk(dra.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends ddk> a();

   @Override
   protected dke a_(drb $$0) {
      return dke.a;
   }

   @Override
   protected boolean a(drb $$0, dax $$1, io $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dog $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bpy b(drb $$0, dax $$1, io $$2) {
      dog $$3 = $$1.c_($$2);
      return $$3 instanceof bpy ? (bpy)$$3 : null;
   }

   @Nullable
   protected static <E extends dog, A extends dog> doh<A> a(doi<A> $$0, doi<E> $$1, doh<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
