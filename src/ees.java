import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ees implements eeh {
   public static final Codec<ees> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eit.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eit.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, ees::new)
   );
   public final jm<eit> b;
   public final jm<eit> c;

   public ees(jm<eit> $$0, jm<eit> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ebq<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
