import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class edq implements ede {
   public static final Codec<edq> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(edq::new, ecu.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), ehq.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<ecu> b;
   public final ji<ehq> c;

   public edq(List<ecu> $$0, ji<ehq> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ean<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
