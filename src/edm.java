import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class edm implements edb {
   public static final Codec<edm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehn.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), ehn.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, edm::new)
   );
   public final ji<ehn> b;
   public final ji<ehn> c;

   public edm(ji<ehn> $$0, ji<ehn> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eak<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
