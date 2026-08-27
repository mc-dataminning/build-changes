import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dwa implements dvy {
   protected final List<dvy> e;

   protected dwa(List<dvy> $$0) {
      this.e = $$0;
   }

   public static <T extends dwa> Codec<T> a(Function<List<dvy>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dvy.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
