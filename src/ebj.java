import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ebj implements eay {
   public static final Codec<ebj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efk.b.fieldOf("feature_true").forGetter($$0x -> $$0x.b), efk.b.fieldOf("feature_false").forGetter($$0x -> $$0x.c)).apply($$0, ebj::new)
   );
   public final iv<efk> b;
   public final iv<efk> c;

   public ebj(iv<efk> $$0, iv<efk> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public Stream<dyh<?, ?>> e() {
      return Stream.concat(this.b.a().a(), this.c.a().a());
   }
}
