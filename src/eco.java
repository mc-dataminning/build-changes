import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eco implements ecd {
   public static final Codec<eco> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egp.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), egp.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, eco::new)
   );
   public final ix<egp> b;
   public final ix<egp> c;

   public eco(ix<egp> $$0, ix<egp> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dzm<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
