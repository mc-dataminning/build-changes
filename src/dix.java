import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dix<E extends duq> extends djp {
   protected final Supplier<dus<? extends E>> a;

   protected dix(dxn.d $$0, Supplier<dus<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dix<E>> a();

   public abstract dml.c<? extends dux> a(dxo var1, dgz var2, jh var3, boolean var4);
}
