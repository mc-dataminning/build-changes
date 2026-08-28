import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class ddt<E extends dph> extends del {
   protected final Supplier<dpj<? extends E>> a;

   protected ddt(dsb.d $$0, Supplier<dpj<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends ddt<E>> a();

   public abstract dhg.c<? extends dpo> a(dsc var1, dby var2, iz var3, boolean var4);
}
