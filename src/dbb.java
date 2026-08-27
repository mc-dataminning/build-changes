import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dbb<E extends dmo> extends dbt {
   protected final Supplier<dmq<? extends E>> a;

   protected dbb(dph.d $$0, Supplier<dmq<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dbb<E>> a();

   public abstract deo.c<? extends dmv> a(dpi var1, czg var2, id var3, boolean var4);
}
