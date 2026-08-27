import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dmb implements dlz {
   protected final List<dlz> e;

   protected dmb(List<dlz> $$0) {
      this.e = $$0;
   }

   public static <T extends dmb> Codec<T> a(Function<List<dlz>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dlz.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
