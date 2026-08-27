import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class duc implements dtr {
   public static final Codec<duc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyd.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), dyd.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, duc::new)
   );
   public final ih<dyd> b;
   public final ih<dyd> c;

   public duc(ih<dyd> $$0, ih<dyd> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dra<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
