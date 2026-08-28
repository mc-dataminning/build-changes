import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ejk implements eiz {
   public static final Codec<ejk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(enn.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), enn.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, ejk::new)
   );
   public final jq<enn> b;
   public final jq<enn> c;

   public ejk(jq<enn> $$0, jq<enn> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<egh<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
