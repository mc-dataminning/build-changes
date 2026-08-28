import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class edu implements edi {
   public static final Codec<edu> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(edu::new, ecy.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), ehu.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<ecy> b;
   public final jj<ehu> c;

   public edu(List<ecy> $$0, jj<ehu> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ear<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
