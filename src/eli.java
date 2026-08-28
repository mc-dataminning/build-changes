import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eli implements ekx {
   public static final Codec<eli> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(epm.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), epm.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, eli::new)
   );
   public final je<epm> b;
   public final je<epm> c;

   public eli(je<epm> $$0, je<epm> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eif<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
