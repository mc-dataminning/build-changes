import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class awn {
   public static final Codec<awn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(all.a.fieldOf("sound_id").forGetter(awn::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(awn::b)).apply($$0, awn::a)
   );
   public static final Codec<jq<awn>> b = alh.a(ma.al, a);
   public static final zj<ByteBuf, awn> c = zj.a(all.b, awn::a, zh.j.a(zh::a), awn::b, awn::a);
   public static final zj<ww, jq<awn>> d = zh.a(ma.al, c);
   private static final float e = 16.0F;
   private final all f;
   private final float g;
   private final boolean h;

   private static awn a(all $$0, Optional<Float> $$1) {
      return $$1.<awn>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static awn a(all $$0) {
      return new awn($$0, 16.0F, false);
   }

   public static awn a(all $$0, float $$1) {
      return new awn($$0, $$1, true);
   }

   private awn(all $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public all a() {
      return this.f;
   }

   public float a(float $$0) {
      if (this.h) {
         return this.g;
      } else {
         return $$0 > 1.0F ? 16.0F * $$0 : 16.0F;
      }
   }

   private Optional<Float> b() {
      return this.h ? Optional.of(this.g) : Optional.empty();
   }
}
