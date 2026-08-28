import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dig<E extends dtz> extends diy {
   protected final Supplier<dub<? extends E>> a;

   protected dig(dww.d $$0, Supplier<dub<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dig<E>> a();

   public abstract dlu.c<? extends dug> a(dwx var1, dgi var2, ji var3, boolean var4);
}
