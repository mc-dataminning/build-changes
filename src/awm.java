import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record awm(alg e, Optional<Float> f) {
   public static final Codec<awm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alg.a.fieldOf("sound_id").forGetter(awm::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(awm::b)).apply($$0, awm::a)
   );
   public static final Codec<jf<awm>> b = alc.a(mh.ap, a);
   public static final yw<ByteBuf, awm> c = yw.a(alg.b, awm::a, yu.l.a(yu::a), awm::b, awm::a);
   public static final yw<wj, jf<awm>> d = yu.a(mh.ap, c);

   private static awm a(alg $$0, Optional<Float> $$1) {
      return $$1.<awm>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static awm a(alg $$0) {
      return new awm($$0, Optional.empty());
   }

   public static awm a(alg $$0, float $$1) {
      return new awm($$0, Optional.of($$1));
   }

   public float a(float $$0) {
      return this.f.orElse($$0 > 1.0F ? 16.0F * $$0 : 16.0F);
   }

   public alg a() {
      return this.e;
   }

   public Optional<Float> b() {
      return this.f;
   }
}
