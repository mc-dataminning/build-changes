import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class enb implements emp {
   public static final Codec<enb> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(enb::new, eme.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), erf.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<eme> b;
   public final jf<erf> c;

   public enb(List<eme> $$0, jf<erf> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ejv<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
