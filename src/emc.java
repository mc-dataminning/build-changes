import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class emc implements elq {
   public static final Codec<emc> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(emc::new, elg.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eqf.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<elg> b;
   public final je<eqf> c;

   public emc(List<elg> $$0, je<eqf> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eiy<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
