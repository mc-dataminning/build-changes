import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dec<E extends dpq> extends deu {
   protected final Supplier<dps<? extends E>> a;

   protected dec(dsk.d $$0, Supplier<dps<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dec<E>> a();

   public abstract dhp.c<? extends dpx> a(dsl var1, dcg var2, ja var3, boolean var4);
}
