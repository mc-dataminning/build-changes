import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dls implements dlq {
   protected final List<dlq> e;

   protected dls(List<dlq> $$0) {
      this.e = $$0;
   }

   public static <T extends dls> Codec<T> a(Function<List<dlq>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dlq.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
