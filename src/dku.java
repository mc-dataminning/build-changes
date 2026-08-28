import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dku<E extends dwx> extends dlm {
   protected final Supplier<dwz<? extends E>> a;

   protected dku(dzy.d $$0, Supplier<dwz<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dku<E>> a();

   public abstract doi.c<? extends dxf> a(dzz var1, div var2, iu var3, boolean var4);
}
