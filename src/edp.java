import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class edp implements ede {
   public static final Codec<edp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehq.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), ehq.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, edp::new)
   );
   public final ji<ehq> b;
   public final ji<ehq> c;

   public edp(ji<ehq> $$0, ji<ehq> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ean<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
