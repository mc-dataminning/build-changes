import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eeq implements eee {
   public static final Codec<eeq> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(eeq::new, edu.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eiq.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<edu> b;
   public final jm<eiq> c;

   public eeq(List<edu> $$0, jm<eiq> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ebn<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
