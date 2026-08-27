import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class cxi<E extends dit> extends cya {
   protected final Supplier<div<? extends E>> a;

   protected cxi(dle.d $$0, Supplier<div<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cxi<E>> a();

   public abstract dav.c<? extends dja> a(dlf var1, cvn var2, hz var3, boolean var4);
}
