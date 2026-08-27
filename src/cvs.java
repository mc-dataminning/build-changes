import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class cvs<E extends dhd> extends cwk {
   protected final Supplier<dhf<? extends E>> a;

   protected cvs(djo.d $$0, Supplier<dhf<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cvs<E>> a();

   public abstract czf.c<? extends dhk> a(djp var1, ctx var2, hx var3, boolean var4);
}
