import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eev implements eek {
   public static final Codec<eev> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eix.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eix.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, eev::new)
   );
   public final ja<eix> b;
   public final ja<eix> c;

   public eev(ja<eix> $$0, ja<eix> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ebm<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
