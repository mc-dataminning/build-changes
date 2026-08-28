import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class eez implements eex {
   protected final List<eex> e;

   protected eez(List<eex> $$0) {
      this.e = $$0;
   }

   public static <T extends eez> MapCodec<T> a(Function<List<eex>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(eex.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
