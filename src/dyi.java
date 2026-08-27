import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dyi implements dxw {
   public static final Codec<dyi> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dyi::new, dxm.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eci.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dxm> b;
   public final il<eci> c;

   public dyi(List<dxm> $$0, il<eci> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dvf<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
