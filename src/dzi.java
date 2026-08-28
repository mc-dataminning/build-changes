import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dzi implements dzg {
   protected final List<dzg> e;

   protected dzi(List<dzg> $$0) {
      this.e = $$0;
   }

   public static <T extends dzi> MapCodec<T> a(Function<List<dzg>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(dzg.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
