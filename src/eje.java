import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eje implements eis {
   public static final Codec<eje> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(eje::new, eii.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eng.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<eii> b;
   public final jq<eng> c;

   public eje(List<eii> $$0, jq<eng> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ega<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
