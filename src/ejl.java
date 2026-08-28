import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class ejl implements eiz {
   public static final Codec<ejl> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(ejl::new, eip.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), enn.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<eip> b;
   public final jq<enn> c;

   public ejl(List<eip> $$0, jq<enn> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<egh<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
