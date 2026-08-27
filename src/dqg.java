import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dqg implements dpu {
   public static final Codec<dqg> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dqg::new, dpk.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), dug.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dpk> b;
   public final he<dug> c;

   public dqg(List<dpk> $$0, he<dug> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dnd<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
