import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record axe(alz e, Optional<Float> f) {
   public static final Codec<axe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alz.a.fieldOf("sound_id").forGetter(axe::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(axe::b)).apply($$0, axe::a)
   );
   public static final Codec<jq<axe>> b = alv.a(mb.al, a);
   public static final zt<ByteBuf, axe> c = zt.a(alz.b, axe::a, zr.l.a(zr::a), axe::b, axe::a);
   public static final zt<xg, jq<axe>> d = zr.a(mb.al, c);

   private static axe a(alz $$0, Optional<Float> $$1) {
      return $$1.<axe>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static axe a(alz $$0) {
      return new axe($$0, Optional.empty());
   }

   public static axe a(alz $$0, float $$1) {
      return new axe($$0, Optional.of($$1));
   }

   public float a(float $$0) {
      return this.f.orElse($$0 > 1.0F ? 16.0F * $$0 : 16.0F);
   }

   public alz a() {
      return this.e;
   }

   public Optional<Float> b() {
      return this.f;
   }
}
