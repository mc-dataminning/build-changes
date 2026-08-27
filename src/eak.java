import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eak implements dzz {
   public static final Codec<eak> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eel.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eel.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, eak::new)
   );
   public final il<eel> b;
   public final il<eel> c;

   public eak(il<eel> $$0, il<eel> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dxi<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
