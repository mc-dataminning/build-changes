import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dye implements dyc {
   protected final List<dyc> e;

   protected dye(List<dyc> $$0) {
      this.e = $$0;
   }

   public static <T extends dye> MapCodec<T> a(Function<List<dyc>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(dyc.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
