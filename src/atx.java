import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class atx {
   public static final Codec<atx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajh.a.fieldOf("sound_id").forGetter(atx::a), Codec.FLOAT.optionalFieldOf("range").forGetter(atx::b)).apply($$0, atx::a)
   );
   public static final Codec<il<atx>> b = ajd.a(kj.af, a);
   public static final xs<ByteBuf, atx> c = xs.a(ajh.b, atx::a, xq.f.a(xq::a), atx::b, atx::a);
   public static final xs<vf, il<atx>> d = xq.a(kj.af, c);
   private static final float e = 16.0F;
   private final ajh f;
   private final float g;
   private final boolean h;

   private static atx a(ajh $$0, Optional<Float> $$1) {
      return $$1.<atx>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static atx a(ajh $$0) {
      return new atx($$0, 16.0F, false);
   }

   public static atx a(ajh $$0, float $$1) {
      return new atx($$0, $$1, true);
   }

   private atx(ajh $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public ajh a() {
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
