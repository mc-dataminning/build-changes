import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record awo(ali e, Optional<Float> f) {
   public static final Codec<awo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ali.a.fieldOf("sound_id").forGetter(awo::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(awo::b)).apply($$0, awo::a)
   );
   public static final Codec<jf<awo>> b = ale.a(mh.ap, a);
   public static final yy<ByteBuf, awo> c = yy.a(ali.b, awo::a, yw.l.a(yw::a), awo::b, awo::a);
   public static final yy<wl, jf<awo>> d = yw.a(mh.ap, c);

   private static awo a(ali $$0, Optional<Float> $$1) {
      return $$1.<awo>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static awo a(ali $$0) {
      return new awo($$0, Optional.empty());
   }

   public static awo a(ali $$0, float $$1) {
      return new awo($$0, Optional.of($$1));
   }

   public float a(float $$0) {
      return this.f.orElse($$0 > 1.0F ? 16.0F * $$0 : 16.0F);
   }

   public ali a() {
      return this.e;
   }

   public Optional<Float> b() {
      return this.f;
   }
}
