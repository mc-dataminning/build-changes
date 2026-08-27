import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dne implements dms {
   public static final Codec<dne> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dne::new, dmi.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), dre.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dmi> b;
   public final he<dre> c;

   public dne(List<dmi> $$0, he<dre> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dkb<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
