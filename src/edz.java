import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class edz implements edo {
   public static final Codec<edz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eia.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eia.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, edz::new)
   );
   public final jj<eia> b;
   public final jj<eia> c;

   public edz(jj<eia> $$0, jj<eia> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eax<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
