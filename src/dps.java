import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dps implements dpq {
   protected final List<dpq> e;

   protected dps(List<dpq> $$0) {
      this.e = $$0;
   }

   public static <T extends dps> Codec<T> a(Function<List<dpq>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dpq.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
