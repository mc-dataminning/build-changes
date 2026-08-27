import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dcu<E extends doi> extends ddm {
   protected final Supplier<dok<? extends E>> a;

   protected dcu(drc.d $$0, Supplier<dok<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dcu<E>> a();

   public abstract dgh.c<? extends dop> a(drd var1, daz var2, io var3, boolean var4);
}
