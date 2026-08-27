import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dqo implements dqc {
   public static final Codec<dqo> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dqo::new, dps.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), duo.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dps> b;
   public final hg<duo> c;

   public dqo(List<dps> $$0, hg<duo> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dnl<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
