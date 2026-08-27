import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dsp implements dse {
   public static final Codec<dsp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwq.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), dwq.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dsp::new)
   );
   public final ig<dwq> b;
   public final ig<dwq> c;

   public dsp(ig<dwq> $$0, ig<dwq> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dpn<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
