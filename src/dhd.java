import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dhd<E extends dsr> extends dhv {
   protected final Supplier<dst<? extends E>> a;

   protected dhd(dvn.d $$0, Supplier<dst<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dhd<E>> a();

   public abstract dkq.c<? extends dsy> a(dvo var1, dff var2, jh var3, boolean var4);
}
