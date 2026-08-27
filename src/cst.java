import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class cst<E extends ddx> extends ctm {
   protected final Supplier<ddz<? extends E>> a;

   protected cst(dga.d $$0, Supplier<ddz<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cst<E>> a();

   public abstract cwf.c<? extends dee> a(dgb var1, cqz var2, ht var3, boolean var4);
}
