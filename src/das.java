import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class das<E extends dmf> extends dbk {
   protected final Supplier<dmh<? extends E>> a;

   protected das(doy.d $$0, Supplier<dmh<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends das<E>> a();

   public abstract def.c<? extends dmm> a(doz var1, cyx var2, ib var3, boolean var4);
}
