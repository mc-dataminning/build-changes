import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class amg {
   public static final Codec<amg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(acq.a.fieldOf("sound_id").forGetter(amg::a), Codec.FLOAT.optionalFieldOf("range").forGetter(amg::b)).apply($$0, amg::a)
   );
   public static final Codec<he<amg>> b = acm.a(jc.ad, a);
   private static final float c = 16.0F;
   private final acq d;
   private final float e;
   private final boolean f;

   private static amg a(acq $$0, Optional<Float> $$1) {
      return $$1.<amg>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static amg a(acq $$0) {
      return new amg($$0, 16.0F, false);
   }

   public static amg a(acq $$0, float $$1) {
      return new amg($$0, $$1, true);
   }

   private amg(acq $$0, float $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public acq a() {
      return this.d;
   }

   public float a(float $$0) {
      if (this.f) {
         return this.e;
      } else {
         return $$0 > 1.0F ? 16.0F * $$0 : 16.0F;
      }
   }

   private Optional<Float> b() {
      return this.f ? Optional.of(this.e) : Optional.empty();
   }

   public void a(sf $$0) {
      $$0.a(this.d);
      $$0.a(this.b(), sf::writeFloat);
   }

   public static amg b(sf $$0) {
      acq $$1 = $$0.t();
      Optional<Float> $$2 = $$0.b(sf::readFloat);
      return a($$1, $$2);
   }
}
