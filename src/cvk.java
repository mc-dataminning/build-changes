import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class cvk<E extends dgv> extends cwc {
   protected final Supplier<dgx<? extends E>> a;

   protected cvk(djg.d $$0, Supplier<dgx<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cvk<E>> a();

   public abstract cyx.c<? extends dhc> a(djh var1, ctp var2, hx var3, boolean var4);
}
