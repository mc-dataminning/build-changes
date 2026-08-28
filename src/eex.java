import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class eex implements eev {
   protected final List<eev> e;

   protected eex(List<eev> $$0) {
      this.e = $$0;
   }

   public static <T extends eex> MapCodec<T> a(Function<List<eev>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(eev.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
