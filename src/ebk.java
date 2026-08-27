import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class ebk implements eay {
   public static final Codec<ebk> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(ebk::new, eao.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), efk.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<eao> b;
   public final iv<efk> c;

   public ebk(List<eao> $$0, iv<efk> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dyh<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
