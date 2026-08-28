import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class djf<E extends duw> extends djx {
   protected final Supplier<duy<? extends E>> a;

   protected djf(dxt.d $$0, Supplier<duy<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends djf<E>> a();

   public abstract dmu.c<? extends dvd> a(dxu var1, dhh var2, jh var3, boolean var4);
}
