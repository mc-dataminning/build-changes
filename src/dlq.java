import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dlq implements dlo {
   protected final List<dlo> e;

   protected dlq(List<dlo> $$0) {
      this.e = $$0;
   }

   public static <T extends dlq> Codec<T> a(Function<List<dlo>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dlo.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
