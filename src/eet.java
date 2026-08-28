import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eet implements eeh {
   public static final Codec<eet> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(eet::new, edx.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eit.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<edx> b;
   public final jm<eit> c;

   public eet(List<edx> $$0, jm<eit> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ebq<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
