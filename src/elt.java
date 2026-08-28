import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class elt implements eli {
   public static final Codec<elt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(epx.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), epx.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, elt::new)
   );
   public final je<epx> b;
   public final je<epx> c;

   public elt(je<epx> $$0, je<epx> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eiq<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
