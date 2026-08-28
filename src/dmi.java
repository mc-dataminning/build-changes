import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dmi<E extends dyo> extends dna {
   protected final Supplier<dyq<? extends E>> a;

   protected dmi(ebp.d $$0, Supplier<dyq<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dmi<E>> a();

   public abstract dpw.c<? extends dyw> a(ebq var1, dkj var2, iw var3, boolean var4);
}
