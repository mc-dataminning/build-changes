import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class eec implements eea {
   protected final List<eea> e;

   protected eec(List<eea> $$0) {
      this.e = $$0;
   }

   public static <T extends eec> MapCodec<T> a(Function<List<eea>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(eea.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
