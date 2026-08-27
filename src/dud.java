import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dud implements dtr {
   public static final Codec<dud> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dud::new, dth.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), dyd.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dth> b;
   public final ih<dyd> c;

   public dud(List<dth> $$0, ih<dyd> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dra<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
