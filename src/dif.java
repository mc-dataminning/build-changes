import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dif<E extends dty> extends dix {
   protected final Supplier<dua<? extends E>> a;

   protected dif(dwv.d $$0, Supplier<dua<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dif<E>> a();

   public abstract dlt.c<? extends duf> a(dww var1, dgh var2, ji var3, boolean var4);
}
