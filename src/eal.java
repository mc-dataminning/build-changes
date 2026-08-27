import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eal implements dzz {
   public static final Codec<eal> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(eal::new, dzp.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eel.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dzp> b;
   public final il<eel> c;

   public eal(List<dzp> $$0, il<eel> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dxi<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
