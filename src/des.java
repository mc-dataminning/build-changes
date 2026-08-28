import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class des<E extends dqh> extends dfk {
   protected final Supplier<dqj<? extends E>> a;

   protected des(dtb.d $$0, Supplier<dqj<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends des<E>> a();

   public abstract dif.c<? extends dqo> a(dtc var1, dcw var2, jd var3, boolean var4);
}
