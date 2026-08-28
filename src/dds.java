import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dds<E extends dpg> extends dek {
   protected final Supplier<dpi<? extends E>> a;

   protected dds(dsa.d $$0, Supplier<dpi<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dds<E>> a();

   public abstract dhf.c<? extends dpn> a(dsb var1, dbx var2, iz var3, boolean var4);
}
