import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class edp implements edd {
   public static final Codec<edp> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(edp::new, ect.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), ehp.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<ect> b;
   public final ji<ehp> c;

   public edp(List<ect> $$0, ji<ehp> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eam<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
