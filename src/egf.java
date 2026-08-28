import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class egf implements efu {
   public static final Codec<egf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekg.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), ekg.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, egf::new)
   );
   public final jn<ekg> b;
   public final jn<ekg> c;

   public egf(jn<ekg> $$0, jn<ekg> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<edc<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
