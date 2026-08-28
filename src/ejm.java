import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class ejm implements eja {
   public static final Codec<ejm> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(ejm::new, eiq.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eno.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<eiq> b;
   public final jq<eno> c;

   public ejm(List<eiq> $$0, jq<eno> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<egi<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
