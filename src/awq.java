import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record awq(alk e, Optional<Float> f) {
   public static final Codec<awq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alk.a.fieldOf("sound_id").forGetter(awq::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(awq::b)).apply($$0, awq::a)
   );
   public static final Codec<jg<awq>> b = alg.a(mi.ap, a);
   public static final za<ByteBuf, awq> c = za.a(alk.b, awq::a, yy.l.a(yy::a), awq::b, awq::a);
   public static final za<wn, jg<awq>> d = yy.a(mi.ap, c);

   private static awq a(alk $$0, Optional<Float> $$1) {
      return $$1.<awq>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static awq a(alk $$0) {
      return new awq($$0, Optional.empty());
   }

   public static awq a(alk $$0, float $$1) {
      return new awq($$0, Optional.of($$1));
   }

   public float a(float $$0) {
      return this.f.orElse($$0 > 1.0F ? 16.0F * $$0 : 16.0F);
   }

   public alk a() {
      return this.e;
   }

   public Optional<Float> b() {
      return this.f;
   }
}
