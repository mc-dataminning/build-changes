import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class eio implements eim {
   protected final List<eim> e;

   protected eio(List<eim> $$0) {
      this.e = $$0;
   }

   public static <T extends eio> MapCodec<T> a(Function<List<eim>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(eim.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
