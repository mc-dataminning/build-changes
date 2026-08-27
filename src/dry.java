import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dry implements drn {
   public static final Codec<dry> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvz.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), dvz.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dry::new)
   );
   public final ib<dvz> b;
   public final ib<dvz> c;

   public dry(ib<dvz> $$0, ib<dvz> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dow<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
