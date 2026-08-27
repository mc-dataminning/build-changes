import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class cvj<E extends dgu> extends cwb {
   protected final Supplier<dgw<? extends E>> a;

   protected cvj(djf.d $$0, Supplier<dgw<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cvj<E>> a();

   public abstract cyw.c<? extends dhb> a(djg var1, cto var2, hx var3, boolean var4);
}
