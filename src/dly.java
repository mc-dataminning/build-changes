import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dly<E extends dye> extends dmq {
   protected final Supplier<dyg<? extends E>> a;

   protected dly(ebf.d $$0, Supplier<dyg<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dly<E>> a();

   public abstract dpm.c<? extends dym> a(ebg var1, djz var2, iw var3, boolean var4);
}
