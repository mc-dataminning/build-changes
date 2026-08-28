import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class djg<E extends dux> extends djy {
   protected final Supplier<duz<? extends E>> a;

   protected djg(dxu.d $$0, Supplier<duz<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends djg<E>> a();

   public abstract dmv.c<? extends dve> a(dxv var1, dhi var2, jh var3, boolean var4);
}
