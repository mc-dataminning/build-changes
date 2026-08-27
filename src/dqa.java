import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dqa implements dpp {
   public static final Codec<dqa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dub.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), dub.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dqa::new)
   );
   public final hf<dub> b;
   public final hf<dub> c;

   public dqa(hf<dub> $$0, hf<dub> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dmy<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
