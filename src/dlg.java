import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dlg<E extends dxm> extends dly {
   protected final Supplier<dxo<? extends E>> a;

   protected dlg(ean.d $$0, Supplier<dxo<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dlg<E>> a();

   public abstract dou.c<? extends dxu> a(eao var1, djh var2, iv var3, boolean var4);
}
