import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class egu implements egj {
   public static final Codec<egu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekv.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), ekv.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, egu::new)
   );
   public final jp<ekv> b;
   public final jp<ekv> c;

   public egu(jp<ekv> $$0, jp<ekv> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<edr<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
