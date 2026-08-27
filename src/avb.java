import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class avb {
   public static final Codec<avb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akh.a.fieldOf("sound_id").forGetter(avb::a), Codec.FLOAT.optionalFieldOf("range").forGetter(avb::b)).apply($$0, avb::a)
   );
   public static final Codec<iw<avb>> b = akd.a(le.ag, a);
   public static final ys<ByteBuf, avb> c = ys.a(akh.b, avb::a, yq.h.a(yq::a), avb::b, avb::a);
   public static final ys<wf, iw<avb>> d = yq.a(le.ag, c);
   private static final float e = 16.0F;
   private final akh f;
   private final float g;
   private final boolean h;

   private static avb a(akh $$0, Optional<Float> $$1) {
      return $$1.<avb>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static avb a(akh $$0) {
      return new avb($$0, 16.0F, false);
   }

   public static avb a(akh $$0, float $$1) {
      return new avb($$0, $$1, true);
   }

   private avb(akh $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public akh a() {
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
