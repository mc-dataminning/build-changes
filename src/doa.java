import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class doa implements dny {
   protected final List<dny> e;

   protected doa(List<dny> $$0) {
      this.e = $$0;
   }

   public static <T extends doa> Codec<T> a(Function<List<dny>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dny.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
