import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class djo<E extends dvl> extends dkg {
   protected final Supplier<dvn<? extends E>> a;

   protected djo(dyl.d $$0, Supplier<dvn<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends djo<E>> a();

   public abstract dnc.c<? extends dvt> a(dym var1, dhp var2, jj var3, boolean var4);
}
