import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record awu(alp e, Optional<Float> f) {
   public static final Codec<awu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alp.a.fieldOf("sound_id").forGetter(awu::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(awu::b)).apply($$0, awu::a)
   );
   public static final Codec<jq<awu>> b = all.a(mb.al, a);
   public static final zi<ByteBuf, awu> c = zi.a(alp.b, awu::a, zg.l.a(zg::a), awu::b, awu::a);
   public static final zi<wv, jq<awu>> d = zg.a(mb.al, c);

   private static awu a(alp $$0, Optional<Float> $$1) {
      return $$1.<awu>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static awu a(alp $$0) {
      return new awu($$0, Optional.empty());
   }

   public static awu a(alp $$0, float $$1) {
      return new awu($$0, Optional.of($$1));
   }

   public float a(float $$0) {
      return this.f.orElse($$0 > 1.0F ? 16.0F * $$0 : 16.0F);
   }

   public alp a() {
      return this.e;
   }

   public Optional<Float> b() {
      return this.f;
   }
}
