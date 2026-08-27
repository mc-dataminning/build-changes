import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eew implements eek {
   public static final Codec<eew> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(eew::new, eea.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eix.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<eea> b;
   public final ja<eix> c;

   public eew(List<eea> $$0, ja<eix> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ebm<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
