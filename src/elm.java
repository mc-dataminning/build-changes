import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class elm extends emh {
   public static final MapCodec<elm> a = dsc.b.xmap(dsb.a::b, dez::o).listOf().fieldOf("blocks").xmap(elm::new, $$0 -> $$0.e);
   public static final elm b = new elm(ImmutableList.of(dfb.pa));
   public static final elm c = new elm(ImmutableList.of(dfb.a));
   public static final elm d = new elm(ImmutableList.of(dfb.a, dfb.pa));
   private final ImmutableList<dez> e;

   public elm(List<dez> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public emk.c a(dcb $$0, iz $$1, iz $$2, emk.c $$3, emk.c $$4, emg $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected emj<?> a() {
      return emj.e;
   }
}
