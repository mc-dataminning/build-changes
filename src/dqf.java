import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dqf implements dpu {
   public static final Codec<dqf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dug.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), dug.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dqf::new)
   );
   public final he<dug> b;
   public final he<dug> c;

   public dqf(he<dug> $$0, he<dug> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dnd<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
