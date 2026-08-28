import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dlw<E extends dyc> extends dmo {
   protected final Supplier<dye<? extends E>> a;

   protected dlw(ebd.d $$0, Supplier<dye<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dlw<E>> a();

   public abstract dpk.c<? extends dyk> a(ebe var1, djx var2, iv var3, boolean var4);
}
