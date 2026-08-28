import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class egv implements egj {
   public static final Codec<egv> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(egv::new, efz.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), ekv.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<efz> b;
   public final jp<ekv> c;

   public egv(List<efz> $$0, jp<ekv> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<edr<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
