import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dwj implements dwh {
   protected final List<dwh> e;

   protected dwj(List<dwh> $$0) {
      this.e = $$0;
   }

   public static <T extends dwj> Codec<T> a(Function<List<dwh>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dwh.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
