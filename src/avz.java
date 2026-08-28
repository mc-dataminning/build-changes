import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record avz(aku e, Optional<Float> f) {
   public static final Codec<avz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aku.a.fieldOf("sound_id").forGetter(avz::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(avz::b)).apply($$0, avz::a)
   );
   public static final Codec<jr<avz>> b = akq.a(mc.al, a);
   public static final yn<ByteBuf, avz> c = yn.a(aku.b, avz::a, yl.l.a(yl::a), avz::b, avz::a);
   public static final yn<wa, jr<avz>> d = yl.a(mc.al, c);

   private static avz a(aku $$0, Optional<Float> $$1) {
      return $$1.<avz>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static avz a(aku $$0) {
      return new avz($$0, Optional.empty());
   }

   public static avz a(aku $$0, float $$1) {
      return new avz($$0, Optional.of($$1));
   }

   public float a(float $$0) {
      return this.f.orElse($$0 > 1.0F ? 16.0F * $$0 : 16.0F);
   }

   public aku a() {
      return this.e;
   }

   public Optional<Float> b() {
      return this.f;
   }
}
