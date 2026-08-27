import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cwb extends cwp implements czh {
   protected cwb(djf.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cwb> a();

   @Override
   public dcu b_(djg $$0) {
      return dcu.a;
   }

   @Override
   public boolean a(djg $$0, cto $$1, hx $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dgu $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   public bkd b(djg $$0, cto $$1, hx $$2) {
      dgu $$3 = $$1.c_($$2);
      return $$3 instanceof bkd ? (bkd)$$3 : null;
   }

   @Nullable
   protected static <E extends dgu, A extends dgu> dgv<A> a(dgw<A> $$0, dgw<E> $$1, dgv<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
