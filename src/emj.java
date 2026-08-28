import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class emj implements elx {
   public static final Codec<emj> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(emj::new, eln.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eqm.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<eln> b;
   public final jf<eqm> c;

   public emj(List<eln> $$0, jf<eqm> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ejf<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
