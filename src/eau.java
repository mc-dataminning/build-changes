import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eau implements eai {
   public static final Codec<eau> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(eau::new, dzy.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eeu.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dzy> b;
   public final in<eeu> c;

   public eau(List<dzy> $$0, in<eeu> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dxr<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
