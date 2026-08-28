import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ena implements emp {
   public static final Codec<ena> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(erf.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), erf.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, ena::new)
   );
   public final jf<erf> b;
   public final jf<erf> c;

   public ena(jf<erf> $$0, jf<erf> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ejv<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
