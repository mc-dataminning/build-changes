import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class ecn implements ecb {
   public static final Codec<ecn> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(ecn::new, ebr.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), egn.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<ebr> b;
   public final ix<egn> c;

   public ecn(List<ebr> $$0, ix<egn> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dzk<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
