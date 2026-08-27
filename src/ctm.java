import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class ctm<E extends der> extends cuf {
   protected final Supplier<det<? extends E>> a;

   protected ctm(dgv.d $$0, Supplier<det<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends ctm<E>> a();

   public abstract cwz.c<? extends dey> a(dgw var1, crs var2, ht var3, boolean var4);
}
