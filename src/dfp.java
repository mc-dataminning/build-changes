import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dfp<E extends dre> extends dgh {
   protected final Supplier<drg<? extends E>> a;

   protected dfp(dtz.d $$0, Supplier<drg<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dfp<E>> a();

   public abstract djc.c<? extends drl> a(dua var1, dds var2, je var3, boolean var4);
}
