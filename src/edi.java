import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class edi implements ecx {
   public static final Codec<edi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehj.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), ehj.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, edi::new)
   );
   public final ji<ehj> b;
   public final ji<ehj> c;

   public edi(ji<ehj> $$0, ji<ehj> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eag<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
