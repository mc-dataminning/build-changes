import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eeb implements edp {
   public static final Codec<eeb> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(eeb::new, edf.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eib.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<edf> b;
   public final jj<eib> c;

   public eeb(List<edf> $$0, jj<eib> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eay<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
