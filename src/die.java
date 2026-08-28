import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class die<E extends dtx> extends diw {
   protected final Supplier<dtz<? extends E>> a;

   protected die(dwu.d $$0, Supplier<dtz<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends die<E>> a();

   public abstract dls.c<? extends due> a(dwv var1, dgg var2, ji var3, boolean var4);
}
