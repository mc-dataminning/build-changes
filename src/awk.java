import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record awk(ale e, Optional<Float> f) {
   public static final Codec<awk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ale.a.fieldOf("sound_id").forGetter(awk::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(awk::b)).apply($$0, awk::a)
   );
   public static final Codec<je<awk>> b = ala.a(mg.ap, a);
   public static final yu<ByteBuf, awk> c = yu.a(ale.b, awk::a, ys.l.a(ys::a), awk::b, awk::a);
   public static final yu<wh, je<awk>> d = ys.a(mg.ap, c);

   private static awk a(ale $$0, Optional<Float> $$1) {
      return $$1.<awk>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static awk a(ale $$0) {
      return new awk($$0, Optional.empty());
   }

   public static awk a(ale $$0, float $$1) {
      return new awk($$0, Optional.of($$1));
   }

   public float a(float $$0) {
      return this.f.orElse($$0 > 1.0F ? 16.0F * $$0 : 16.0F);
   }

   public ale a() {
      return this.e;
   }

   public Optional<Float> b() {
      return this.f;
   }
}
