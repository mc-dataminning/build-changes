import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class enc implements emr {
   public static final Codec<enc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(erh.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), erh.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, enc::new)
   );
   public final jg<erh> b;
   public final jg<erh> c;

   public enc(jg<erh> $$0, jg<erh> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<ejx<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
