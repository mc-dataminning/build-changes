import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dgg<E extends drv> extends dgy {
   protected final Supplier<drx<? extends E>> a;

   protected dgg(dur.d $$0, Supplier<drx<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dgg<E>> a();

   public abstract djt.c<? extends dsc> a(dus var1, dej var2, jf var3, boolean var4);
}
