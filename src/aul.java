import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class aul {
   public static final Codec<aul> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajt.a.fieldOf("sound_id").forGetter(aul::a), Codec.FLOAT.optionalFieldOf("range").forGetter(aul::b)).apply($$0, aul::a)
   );
   public static final Codec<il<aul>> b = ajp.a(ks.af, a);
   public static final ye<ByteBuf, aul> c = ye.a(ajt.b, aul::a, yc.h.a(yc::a), aul::b, aul::a);
   public static final ye<vr, il<aul>> d = yc.a(ks.af, c);
   private static final float e = 16.0F;
   private final ajt f;
   private final float g;
   private final boolean h;

   private static aul a(ajt $$0, Optional<Float> $$1) {
      return $$1.<aul>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static aul a(ajt $$0) {
      return new aul($$0, 16.0F, false);
   }

   public static aul a(ajt $$0, float $$1) {
      return new aul($$0, $$1, true);
   }

   private aul(ajt $$0, float $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public ajt a() {
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
