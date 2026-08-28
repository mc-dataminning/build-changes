import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class ejf implements eit {
   public static final Codec<ejf> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(ejf::new, eij.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), enh.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<eij> b;
   public final jq<enh> c;

   public ejf(List<eij> $$0, jq<enh> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<egb<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
