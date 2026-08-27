import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dqh implements dqf {
   protected final List<dqf> e;

   protected dqh(List<dqf> $$0) {
      this.e = $$0;
   }

   public static <T extends dqh> Codec<T> a(Function<List<dqf>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dqf.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
