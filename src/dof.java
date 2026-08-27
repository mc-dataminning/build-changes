import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dof implements dod {
   protected final List<dod> e;

   protected dof(List<dod> $$0) {
      this.e = $$0;
   }

   public static <T extends dof> Codec<T> a(Function<List<dod>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dod.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
