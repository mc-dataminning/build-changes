import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dll<E extends dxr> extends dmd {
   protected final Supplier<dxt<? extends E>> a;

   protected dll(eas.d $$0, Supplier<dxt<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dll<E>> a();

   public abstract doz.c<? extends dxz> a(eat var1, djm var2, iv var3, boolean var4);
}
