import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dqb implements dpp {
   public static final Codec<dqb> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dqb::new, dpf.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), dub.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dpf> b;
   public final hf<dub> c;

   public dqb(List<dpf> $$0, hf<dub> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dmy<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
