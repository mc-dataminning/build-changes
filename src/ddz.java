import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class ddz<E extends dpn> extends der {
   protected final Supplier<dpp<? extends E>> a;

   protected ddz(dsg.d $$0, Supplier<dpp<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends ddz<E>> a();

   public abstract dhm.c<? extends dpu> a(dsh var1, dcd var2, ja var3, boolean var4);
}
