import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class efr implements efg {
   public static final Codec<efr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejs.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), ejs.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, efr::new)
   );
   public final jn<ejs> b;
   public final jn<ejs> c;

   public efr(jn<ejs> $$0, jn<ejs> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<eco<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
