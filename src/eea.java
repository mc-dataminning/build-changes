import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eea implements edo {
   public static final Codec<eea> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(eea::new, ede.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eia.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<ede> b;
   public final jj<eia> c;

   public eea(List<ede> $$0, jj<eia> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eax<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
