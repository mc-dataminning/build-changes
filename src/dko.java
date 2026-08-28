import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class dko<E extends dwn> extends dlg {
   protected final Supplier<dwp<? extends E>> a;

   protected dko(dzn.d $$0, Supplier<dwp<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dko<E>> a();

   public abstract doc.c<? extends dwv> a(dzo var1, dip var2, iu var3, boolean var4);
}
