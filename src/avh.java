import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class avh {
   public static final Codec<avh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akn.a.fieldOf("sound_id").forGetter(avh::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(avh::b)).apply($$0, avh::a)
   );
   public static final Codec<ix<avh>> b = akj.a(lf.ag, a);
   public static final yv<ByteBuf, avh> c = yv.a(akn.b, avh::a, yt.h.a(yt::a), avh::b, avh::a);
   public static final yv<wi, ix<avh>> d = yt.a(lf.ag, c);
   private static final float e = 16.0F;
   private final akn f;
   private final float g;
   private final boolean h;

   private static avh a(akn $$0, Optional<Float> $$1) {
      return $$1.<avh>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static avh a(akn $$0) {
      return new avh($$0, 16.0F, false);
   }

   public static avh a(akn $$0, float $$1) {
      return new avh($$0, $$1, true);
   }

   private avh(akn $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public akn a() {
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
