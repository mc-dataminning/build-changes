import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dkz<E extends dxf> extends dlr {
   protected final Supplier<dxh<? extends E>> a;

   protected dkz(eag.d $$0, Supplier<dxh<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dkz<E>> a();

   public abstract don.c<? extends dxn> a(eah var1, dja var2, iu var3, boolean var4);
}
