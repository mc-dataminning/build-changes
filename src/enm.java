import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class enm implements enb {
   public static final Codec<enm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(err.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), err.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, enm::new)
   );
   public final jg<err> b;
   public final jg<err> c;

   public enm(jg<err> $$0, jg<err> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ekh<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
