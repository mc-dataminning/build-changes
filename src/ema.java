import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ema extends emv {
   public static final MapCodec<ema> a = dsl.b.xmap(dsk.a::b, dfi::o).listOf().fieldOf("blocks").xmap(ema::new, $$0 -> $$0.e);
   public static final ema b = new ema(ImmutableList.of(dfk.pa));
   public static final ema c = new ema(ImmutableList.of(dfk.a));
   public static final ema d = new ema(ImmutableList.of(dfk.a, dfk.pa));
   private final ImmutableList<dfi> e;

   public ema(List<dfi> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public emy.c a(dcj $$0, ja $$1, ja $$2, emy.c $$3, emy.c $$4, emu $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected emx<?> a() {
      return emx.e;
   }
}
