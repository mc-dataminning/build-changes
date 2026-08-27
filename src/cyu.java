import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class cyu<E extends dkg> extends czm {
   protected final Supplier<dki<? extends E>> a;

   protected cyu(dmy.d $$0, Supplier<dki<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cyu<E>> a();

   public abstract dch.c<? extends dkn> a(dmz var1, cwz var2, ib var3, boolean var4);
}
