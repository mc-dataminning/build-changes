import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dyh implements dxw {
   public static final Codec<dyh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eci.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), eci.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dyh::new)
   );
   public final il<eci> b;
   public final il<eci> c;

   public dyh(il<eci> $$0, il<eci> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dvf<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
