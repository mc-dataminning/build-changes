import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class elj implements ekx {
   public static final Codec<elj> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(elj::new, ekn.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), epm.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<ekn> b;
   public final je<epm> c;

   public elj(List<ekn> $$0, je<epm> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eif<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
