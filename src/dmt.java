import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dmt implements dmr {
   protected final List<dmr> e;

   protected dmt(List<dmr> $$0) {
      this.e = $$0;
   }

   public static <T extends dmt> Codec<T> a(Function<List<dmr>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dmr.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
