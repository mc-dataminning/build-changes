import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record awj(ald e, Optional<Float> f) {
   public static final Codec<awj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ald.a.fieldOf("sound_id").forGetter(awj::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(awj::b)).apply($$0, awj::a)
   );
   public static final Codec<js<awj>> b = akz.a(me.al, a);
   public static final yt<ByteBuf, awj> c = yt.a(ald.b, awj::a, yr.l.a(yr::a), awj::b, awj::a);
   public static final yt<wg, js<awj>> d = yr.a(me.al, c);

   private static awj a(ald $$0, Optional<Float> $$1) {
      return $$1.<awj>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static awj a(ald $$0) {
      return new awj($$0, Optional.empty());
   }

   public static awj a(ald $$0, float $$1) {
      return new awj($$0, Optional.of($$1));
   }

   public float a(float $$0) {
      return this.f.orElse($$0 > 1.0F ? 16.0F * $$0 : 16.0F);
   }

   public ald a() {
      return this.e;
   }

   public Optional<Float> b() {
      return this.f;
   }
}
