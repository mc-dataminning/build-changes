import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class deb<E extends dpp> extends det {
   protected final Supplier<dpr<? extends E>> a;

   protected deb(dsj.d $$0, Supplier<dpr<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends deb<E>> a();

   public abstract dho.c<? extends dpw> a(dsk var1, dcf var2, ja var3, boolean var4);
}
