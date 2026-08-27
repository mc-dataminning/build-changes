import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class avn {
   public static final Codec<avn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akt.a.fieldOf("sound_id").forGetter(avn::a), Codec.FLOAT.optionalFieldOf("range").forGetter(avn::b)).apply($$0, avn::a)
   );
   public static final Codec<ja<avn>> b = akp.a(li.ag, a);
   public static final zc<ByteBuf, avn> c = zc.a(akt.b, avn::a, za.i.a(za::a), avn::b, avn::a);
   public static final zc<wp, ja<avn>> d = za.a(li.ag, c);
   private static final float e = 16.0F;
   private final akt f;
   private final float g;
   private final boolean h;

   private static avn a(akt $$0, Optional<Float> $$1) {
      return $$1.<avn>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static avn a(akt $$0) {
      return new avn($$0, 16.0F, false);
   }

   public static avn a(akt $$0, float $$1) {
      return new avn($$0, $$1, true);
   }

   private avn(akt $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public akt a() {
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
