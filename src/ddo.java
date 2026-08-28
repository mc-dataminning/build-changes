import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class ddo<E extends dpc> extends deg {
   protected final Supplier<dpe<? extends E>> a;

   protected ddo(drw.d $$0, Supplier<dpe<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends ddo<E>> a();

   public abstract dhb.c<? extends dpj> a(drx var1, dbt var2, iz var3, boolean var4);
}
