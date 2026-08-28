import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class edm implements eda {
   public static final Codec<edm> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(edm::new, ecq.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), ehm.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<ecq> b;
   public final ji<ehm> c;

   public edm(List<ecq> $$0, ji<ehm> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eaj<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
