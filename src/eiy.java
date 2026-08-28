import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class eiy implements eiw {
   protected final List<eiw> e;

   protected eiy(List<eiw> $$0) {
      this.e = $$0;
   }

   public static <T extends eiy> MapCodec<T> a(Function<List<eiw>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(eiw.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
