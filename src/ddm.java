import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddm extends dea implements dgs {
   protected ddm(drc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends ddm> a();

   @Override
   protected dkg a_(drd $$0) {
      return dkg.a;
   }

   @Override
   protected boolean a(drd $$0, daz $$1, io $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      doi $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bqa b(drd $$0, daz $$1, io $$2) {
      doi $$3 = $$1.c_($$2);
      return $$3 instanceof bqa ? (bqa)$$3 : null;
   }

   @Nullable
   protected static <E extends doi, A extends doi> doj<A> a(dok<A> $$0, dok<E> $$1, doj<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
