import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class edn implements edc {
   public static final Codec<edn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eho.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eho.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, edn::new)
   );
   public final ji<eho> b;
   public final ji<eho> c;

   public edn(ji<eho> $$0, ji<eho> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eal<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
