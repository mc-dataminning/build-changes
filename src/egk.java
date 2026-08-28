import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class egk implements efy {
   public static final Codec<egk> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(egk::new, efo.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), ekk.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<efo> b;
   public final jo<ekk> c;

   public egk(List<efo> $$0, jo<ekk> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<edg<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
