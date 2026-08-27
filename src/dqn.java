import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dqn implements dqc {
   public static final Codec<dqn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(duo.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), duo.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dqn::new)
   );
   public final hg<duo> b;
   public final hg<duo> c;

   public dqn(hg<duo> $$0, hg<duo> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dnl<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
