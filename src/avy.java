import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record avy(aku e, Optional<Float> f) {
   public static final Codec<avy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aku.a.fieldOf("sound_id").forGetter(avy::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(avy::b)).apply($$0, avy::a)
   );
   public static final Codec<jr<avy>> b = akq.a(mc.al, a);
   public static final ym<ByteBuf, avy> c = ym.a(aku.b, avy::a, yk.l.a(yk::a), avy::b, avy::a);
   public static final ym<vz, jr<avy>> d = yk.a(mc.al, c);

   private static avy a(aku $$0, Optional<Float> $$1) {
      return $$1.<avy>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static avy a(aku $$0) {
      return new avy($$0, Optional.empty());
   }

   public static avy a(aku $$0, float $$1) {
      return new avy($$0, Optional.of($$1));
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
