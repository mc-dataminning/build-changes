import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ecm implements ecb {
   public static final Codec<ecm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egn.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), egn.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, ecm::new)
   );
   public final ix<egn> b;
   public final ix<egn> c;

   public ecm(ix<egn> $$0, ix<egn> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dzk<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
