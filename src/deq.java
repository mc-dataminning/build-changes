import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class deq<E extends dqf> extends dfi {
   protected final Supplier<dqh<? extends E>> a;

   protected deq(dsz.d $$0, Supplier<dqh<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends deq<E>> a();

   public abstract did.c<? extends dqm> a(dta var1, dcu var2, jd var3, boolean var4);
}
