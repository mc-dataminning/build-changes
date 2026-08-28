import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class edj implements ecx {
   public static final Codec<edj> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(edj::new, ecn.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), ehj.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<ecn> b;
   public final ji<ehj> c;

   public edj(List<ecn> $$0, ji<ehj> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eag<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
