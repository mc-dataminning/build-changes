import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dqd implements dpr {
   public static final Codec<dqd> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dqd::new, dph.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), dud.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dph> b;
   public final he<dud> c;

   public dqd(List<dph> $$0, he<dud> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dna<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
