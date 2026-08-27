import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class ead implements eab {
   protected final List<eab> e;

   protected ead(List<eab> $$0) {
      this.e = $$0;
   }

   public static <T extends ead> Codec<T> a(Function<List<eab>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(eab.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
