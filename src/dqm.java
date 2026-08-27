import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dqm implements dqa {
   public static final Codec<dqm> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dqm::new, dpq.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), dum.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dpq> b;
   public final he<dum> c;

   public dqm(List<dpq> $$0, he<dum> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dnj<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
