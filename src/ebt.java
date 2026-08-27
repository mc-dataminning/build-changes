import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class ebt implements ebh {
   public static final Codec<ebt> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(ebt::new, eax.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eft.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<eax> b;
   public final iw<eft> c;

   public ebt(List<eax> $$0, iw<eft> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dyq<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
