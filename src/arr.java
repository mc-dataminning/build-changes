import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class arr {
   public static final Codec<arr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahg.a.fieldOf("sound_id").forGetter(arr::a), Codec.FLOAT.optionalFieldOf("range").forGetter(arr::b)).apply($$0, arr::a)
   );
   public static final Codec<ih<arr>> b = ahc.a(ke.af, a);
   private static final float c = 16.0F;
   private final ahg d;
   private final float e;
   private final boolean f;

   private static arr a(ahg $$0, Optional<Float> $$1) {
      return $$1.<arr>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static arr a(ahg $$0) {
      return new arr($$0, 16.0F, false);
   }

   public static arr a(ahg $$0, float $$1) {
      return new arr($$0, $$1, true);
   }

   private arr(ahg $$0, float $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public ahg a() {
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

   public void a(ui $$0) {
      $$0.a(this.d);
      $$0.a(this.b(), ui::a);
   }

   public static arr b(ui $$0) {
      ahg $$1 = $$0.t();
      Optional<Float> $$2 = $$0.b(ui::readFloat);
      return a($$1, $$2);
   }
}
