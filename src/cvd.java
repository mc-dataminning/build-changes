import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class cvd<E extends dgo> extends cvv {
   protected final Supplier<dgq<? extends E>> a;

   protected cvd(diz.d $$0, Supplier<dgq<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cvd<E>> a();

   public abstract cyq.c<? extends dgv> a(dja var1, cti var2, hx var3, boolean var4);
}
