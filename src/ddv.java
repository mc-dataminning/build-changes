import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class ddv<E extends dqc> extends den {
   protected final Supplier<dqe<? extends E>> a;

   protected ddv(dtb.d $$0, Supplier<dqe<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends ddv<E>> a();

   public abstract dhk.c<? extends dqj> a(dtc var1, dca var2, ir var3, boolean var4);
}
