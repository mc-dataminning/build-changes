import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dwz implements dwx {
   protected final List<dwx> e;

   protected dwz(List<dwx> $$0) {
      this.e = $$0;
   }

   public static <T extends dwz> Codec<T> a(Function<List<dwx>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dwx.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
