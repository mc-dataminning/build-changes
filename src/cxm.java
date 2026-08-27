import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class cxm<E extends dix> extends cye {
   protected final Supplier<diz<? extends E>> a;

   protected cxm(dli.d $$0, Supplier<diz<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cxm<E>> a();

   public abstract daz.c<? extends dje> a(dlj var1, cvr var2, hz var3, boolean var4);
}
