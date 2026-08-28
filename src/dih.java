import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dih<E extends dua> extends diz {
   protected final Supplier<duc<? extends E>> a;

   protected dih(dwx.d $$0, Supplier<duc<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dih<E>> a();

   public abstract dlv.c<? extends duh> a(dwy var1, dgj var2, ji var3, boolean var4);
}
