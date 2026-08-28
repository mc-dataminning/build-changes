import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dhk<E extends dsy> extends dic {
   protected final Supplier<dta<? extends E>> a;

   protected dhk(dvu.d $$0, Supplier<dta<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dhk<E>> a();

   public abstract dkx.c<? extends dtf> a(dvv var1, dfm var2, jh var3, boolean var4);
}
