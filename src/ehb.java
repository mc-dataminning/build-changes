import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class ehb implements egp {
   public static final Codec<ehb> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(ehb::new, egf.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), elb.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<egf> b;
   public final jq<elb> c;

   public ehb(List<egf> $$0, jq<elb> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<edx<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
