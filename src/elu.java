import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class elu implements eli {
   public static final Codec<elu> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(elu::new, eky.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), epx.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<eky> b;
   public final je<epx> c;

   public elu(List<eky> $$0, je<epx> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eiq<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
