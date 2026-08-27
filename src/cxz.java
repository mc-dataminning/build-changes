import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class cxz<E extends djl> extends cyr {
   protected final Supplier<djn<? extends E>> a;

   protected cxz(dmd.d $$0, Supplier<djn<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cxz<E>> a();

   public abstract dbm.c<? extends djs> a(dme var1, cwe var2, ib var3, boolean var4);
}
