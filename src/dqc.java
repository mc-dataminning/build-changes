import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dqc implements dpr {
   public static final Codec<dqc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dud.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), dud.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dqc::new)
   );
   public final he<dud> b;
   public final he<dud> c;

   public dqc(he<dud> $$0, he<dud> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dna<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
