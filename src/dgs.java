import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dgs<E extends dsg> extends dhk {
   protected final Supplier<dsi<? extends E>> a;

   protected dgs(dvc.d $$0, Supplier<dsi<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dgs<E>> a();

   public abstract dkf.c<? extends dsn> a(dvd var1, dev var2, jg var3, boolean var4);
}
