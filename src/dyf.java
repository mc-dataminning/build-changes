import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dyf implements dxu {
   public static final Codec<dyf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ecg.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), ecg.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, dyf::new)
   );
   public final il<ecg> b;
   public final il<ecg> c;

   public dyf(il<ecg> $$0, il<ecg> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dvd<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
