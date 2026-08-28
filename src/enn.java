import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class enn implements enb {
   public static final Codec<enn> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(enn::new, emq.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), err.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<emq> b;
   public final jg<err> c;

   public enn(List<emq> $$0, jg<err> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ekh<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
