import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dby<E extends dnm> extends dcq {
   protected final Supplier<dno<? extends E>> a;

   protected dby(dqg.d $$0, Supplier<dno<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dby<E>> a();

   public abstract dfl.c<? extends dnt> a(dqh var1, dad var2, in var3, boolean var4);
}
