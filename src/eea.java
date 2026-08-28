import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eea implements edp {
   public static final Codec<eea> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eib.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eib.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, eea::new)
   );
   public final jj<eib> b;
   public final jj<eib> c;

   public eea(jj<eib> $$0, jj<eib> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eay<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
