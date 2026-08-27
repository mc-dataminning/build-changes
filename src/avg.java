import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class avg {
   public static final Codec<avg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akm.a.fieldOf("sound_id").forGetter(avg::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(avg::b)).apply($$0, avg::a)
   );
   public static final Codec<ix<avg>> b = aki.a(lf.ag, a);
   public static final yv<ByteBuf, avg> c = yv.a(akm.b, avg::a, yt.h.a(yt::a), avg::b, avg::a);
   public static final yv<wi, ix<avg>> d = yt.a(lf.ag, c);
   private static final float e = 16.0F;
   private final akm f;
   private final float g;
   private final boolean h;

   private static avg a(akm $$0, Optional<Float> $$1) {
      return $$1.<avg>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static avg a(akm $$0) {
      return new avg($$0, 16.0F, false);
   }

   public static avg a(akm $$0, float $$1) {
      return new avg($$0, $$1, true);
   }

   private avg(akm $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public akm a() {
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
