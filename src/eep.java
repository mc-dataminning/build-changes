import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eep implements eee {
   public static final Codec<eep> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eiq.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eiq.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, eep::new)
   );
   public final jm<eiq> b;
   public final jm<eiq> c;

   public eep(jm<eiq> $$0, jm<eiq> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ebn<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
