import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class etw extends eus {
   public static final MapCodec<etw> a = dzz.a.xmap(dzy.a::b, dma::m).listOf().fieldOf("blocks").xmap(etw::new, $$0 -> $$0.e);
   public static final etw b = new etw(ImmutableList.of(dmc.pD));
   public static final etw c = new etw(ImmutableList.of(dmc.a));
   public static final etw d = new etw(ImmutableList.of(dmc.a, dmc.pD));
   private final ImmutableList<dma> e;

   public etw(List<dma> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public euv.d a(diy $$0, iu $$1, iu $$2, euv.d $$3, euv.d $$4, eur $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected euu<?> a() {
      return euu.e;
   }
}
