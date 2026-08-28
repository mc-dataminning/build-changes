import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class edo implements edc {
   public static final Codec<edo> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(edo::new, ecs.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eho.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<ecs> b;
   public final ji<eho> c;

   public edo(List<ecs> $$0, ji<eho> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eal<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
