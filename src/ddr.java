import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class ddr<E extends dpf> extends dej {
   protected final Supplier<dph<? extends E>> a;

   protected ddr(drz.d $$0, Supplier<dph<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends ddr<E>> a();

   public abstract dhe.c<? extends dpm> a(dsa var1, dbw var2, iz var3, boolean var4);
}
