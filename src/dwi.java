import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class dwi implements dvw {
   public static final Codec<dwi> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(dwi::new, dvm.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eai.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<dvm> b;
   public final ij<eai> c;

   public dwi(List<dvm> $$0, ij<eai> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dtf<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
