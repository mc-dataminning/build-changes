import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class eim implements eik {
   protected final List<eik> e;

   protected eim(List<eik> $$0) {
      this.e = $$0;
   }

   public static <T extends eim> MapCodec<T> a(Function<List<eik>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(eik.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
