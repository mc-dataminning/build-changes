import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class crv<E extends dcz> extends cso {
   protected final Supplier<ddb<? extends E>> a;

   protected crv(dfc.d $$0, Supplier<ddb<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends crv<E>> a();

   public abstract cvh.c<? extends ddg> a(dfd var1, cqb var2, gw var3, boolean var4);
}
