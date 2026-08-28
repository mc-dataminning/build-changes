import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class esj extends etf {
   public static final MapCodec<esj> a = dym.a.xmap(dyl.a::b, dku::m).listOf().fieldOf("blocks").xmap(esj::new, $$0 -> $$0.e);
   public static final esj b = new esj(ImmutableList.of(dkw.pC));
   public static final esj c = new esj(ImmutableList.of(dkw.a));
   public static final esj d = new esj(ImmutableList.of(dkw.a, dkw.pC));
   private final ImmutableList<dku> e;

   public esj(List<dku> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public eti.d a(dhs $$0, jj $$1, jj $$2, eti.d $$3, eti.d $$4, ete $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected eth<?> a() {
      return eth.e;
   }
}
