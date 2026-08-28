import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class edo implements edd {
   public static final Codec<edo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehp.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), ehp.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, edo::new)
   );
   public final ji<ehp> b;
   public final ji<ehp> c;

   public edo(ji<ehp> $$0, ji<ehp> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eam<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
