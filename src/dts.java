import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dts implements dtg {
   public static final Codec<dts> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dts::new, dsw.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), dxs.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dsw> b;
   public final ie<dxs> c;

   public dts(List<dsw> $$0, ie<dxs> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dqp<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
