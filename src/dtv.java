import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dtv implements dtt {
   protected final List<dtt> e;

   protected dtv(List<dtt> $$0) {
      this.e = $$0;
   }

   public static <T extends dtv> Codec<T> a(Function<List<dtt>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dtt.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
