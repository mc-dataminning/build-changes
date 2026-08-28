import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eet implements eei {
   public static final Codec<eet> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eiv.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eiv.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, eet::new)
   );
   public final jm<eiv> b;
   public final jm<eiv> c;

   public eet(jm<eiv> $$0, jm<eiv> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ebq<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
