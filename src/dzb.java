import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dzb implements dyz {
   protected final List<dyz> e;

   protected dzb(List<dyz> $$0) {
      this.e = $$0;
   }

   public static <T extends dzb> MapCodec<T> a(Function<List<dyz>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(dyz.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
