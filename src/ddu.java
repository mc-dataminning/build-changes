import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class ddu<E extends dpi> extends dem {
   protected final Supplier<dpk<? extends E>> a;

   protected ddu(dsc.d $$0, Supplier<dpk<? extends E>> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected abstract MapCodec<? extends ddu<E>> a();

   public abstract dhh.c<? extends dpp> a(dsd var1, dbz var2, iz var3, boolean var4);
}
