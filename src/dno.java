import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dno implements dnm {
   protected final List<dnm> e;

   protected dno(List<dnm> $$0) {
      this.e = $$0;
   }

   public static <T extends dno> Codec<T> a(Function<List<dnm>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dnm.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
