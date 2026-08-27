import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dmd implements dmb {
   protected final List<dmb> e;

   protected dmd(List<dmb> $$0) {
      this.e = $$0;
   }

   public static <T extends dmd> Codec<T> a(Function<List<dmb>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dmb.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
