import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class drz implements drn {
   public static final Codec<drz> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(drz::new, drd.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), dvz.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<drd> b;
   public final ib<dvz> c;

   public drz(List<drd> $$0, ib<dvz> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dow<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
