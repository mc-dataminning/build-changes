import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eje implements eit {
   public static final Codec<eje> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(enh.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), enh.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, eje::new)
   );
   public final jq<enh> b;
   public final jq<enh> c;

   public eje(jq<enh> $$0, jq<enh> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<egb<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
