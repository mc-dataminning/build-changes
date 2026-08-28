import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ejd implements eis {
   public static final Codec<ejd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eng.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eng.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, ejd::new)
   );
   public final jq<eng> b;
   public final jq<eng> c;

   public ejd(jq<eng> $$0, jq<eng> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ega<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
