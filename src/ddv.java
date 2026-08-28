import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class ddv<E extends dpj> extends den {
   protected final Supplier<dpl<? extends E>> a;

   protected ddv(dsd.d $$0, Supplier<dpl<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends ddv<E>> a();

   public abstract dhi.c<? extends dpq> a(dse var1, dca var2, iz var3, boolean var4);
}
