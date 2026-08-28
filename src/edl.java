import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class edl implements eda {
   public static final Codec<edl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehm.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), ehm.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, edl::new)
   );
   public final ji<ehm> b;
   public final ji<ehm> c;

   public edl(ji<ehm> $$0, ji<ehm> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eaj<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
