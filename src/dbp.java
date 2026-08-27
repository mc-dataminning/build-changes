import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dbp<E extends dnd> extends dch {
   protected final Supplier<dnf<? extends E>> a;

   protected dbp(dpx.d $$0, Supplier<dnf<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dbp<E>> a();

   public abstract dfc.c<? extends dnk> a(dpy var1, czu var2, im var3, boolean var4);
}
