import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class efs implements efg {
   public static final Codec<efs> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(efs::new, eew.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), ejs.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<eew> b;
   public final jn<ejs> c;

   public efs(List<eew> $$0, jn<ejs> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eco<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
