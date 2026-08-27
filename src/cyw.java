import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class cyw<E extends dki> extends czo {
   protected final Supplier<dkk<? extends E>> a;

   protected cyw(dna.d $$0, Supplier<dkk<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cyw<E>> a();

   public abstract dcj.c<? extends dkp> a(dnb var1, cxb var2, ib var3, boolean var4);
}
