import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dgy<E extends dsm> extends dhq {
   protected final Supplier<dso<? extends E>> a;

   protected dgy(dvi.d $$0, Supplier<dso<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dgy<E>> a();

   public abstract dkl.c<? extends dst> a(dvj var1, dfb var2, jh var3, boolean var4);
}
