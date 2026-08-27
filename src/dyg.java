import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dyg implements dxu {
   public static final Codec<dyg> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dyg::new, dxk.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), ecg.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dxk> b;
   public final il<ecg> c;

   public dyg(List<dxk> $$0, il<ecg> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dvd<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
