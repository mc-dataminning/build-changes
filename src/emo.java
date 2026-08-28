import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class emo implements emc {
   public static final Codec<emo> a = RecordCodecBuilder.create(
      $$0 -> $$0.apply2(emo::new, els.a.listOf().fieldOf("features").forGetter($$0x -> $$0x.b), eqr.b.fieldOf("default").forGetter($$0x -> $$0x.c))
   );
   public final List<els> b;
   public final jf<eqr> c;

   public emo(List<els> $$0, jf<eqr> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ejk<?, ?>> e() {
      return Stream.concat(this.b.stream().flatMap($$0 -> $$0.b.a().a()), this.c.a().a());
   }
}
