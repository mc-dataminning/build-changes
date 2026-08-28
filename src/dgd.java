import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dgd<E extends drs> extends dgv {
   protected final Supplier<dru<? extends E>> a;

   protected dgd(dun.d $$0, Supplier<dru<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dgd<E>> a();

   public abstract djq.c<? extends drz> a(duo var1, deg var2, je var3, boolean var4);
}
