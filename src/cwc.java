import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cwc extends cwq implements czi {
   protected cwc(djg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cwc> a();

   @Override
   public dcv b_(djh $$0) {
      return dcv.a;
   }

   @Override
   public boolean a(djh $$0, ctp $$1, hx $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dgv $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   public bke b(djh $$0, ctp $$1, hx $$2) {
      dgv $$3 = $$1.c_($$2);
      return $$3 instanceof bke ? (bke)$$3 : null;
   }

   @Nullable
   protected static <E extends dgv, A extends dgv> dgw<A> a(dgx<A> $$0, dgx<E> $$1, dgw<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
