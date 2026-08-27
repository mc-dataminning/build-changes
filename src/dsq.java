import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dsq implements dse {
   public static final Codec<dsq> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dsq::new, dru.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), dwq.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dru> b;
   public final ig<dwq> c;

   public dsq(List<dru> $$0, ig<dwq> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dpn<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
