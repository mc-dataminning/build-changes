import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dyy implements dyw {
   protected final List<dyw> e;

   protected dyy(List<dyw> $$0) {
      this.e = $$0;
   }

   public static <T extends dyy> MapCodec<T> a(Function<List<dyw>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(dyw.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
