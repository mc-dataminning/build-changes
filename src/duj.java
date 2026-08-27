import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class duj implements dty {
   public static final Codec<duj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyk.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), dyk.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, duj::new)
   );
   public final ih<dyk> b;
   public final ih<dyk> c;

   public duj(ih<dyk> $$0, ih<dyk> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<drh<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
