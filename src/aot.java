import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class aot {
   public static final Codec<aot> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aep.a.fieldOf("sound_id").forGetter(aot::a), Codec.FLOAT.optionalFieldOf("range").forGetter(aot::b)).apply($$0, aot::a)
   );
   public static final Codec<hf<aot>> b = ael.a(jd.ad, a);
   private static final float c = 16.0F;
   private final aep d;
   private final float e;
   private final boolean f;

   private static aot a(aep $$0, Optional<Float> $$1) {
      return $$1.<aot>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static aot a(aep $$0) {
      return new aot($$0, 16.0F, false);
   }

   public static aot a(aep $$0, float $$1) {
      return new aot($$0, $$1, true);
   }

   private aot(aep $$0, float $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public aep a() {
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

   public void a(sh $$0) {
      $$0.a(this.d);
      $$0.a(this.b(), sh::a);
   }

   public static aot b(sh $$0) {
      aep $$1 = $$0.s();
      Optional<Float> $$2 = $$0.b(sh::readFloat);
      return a($$1, $$2);
   }
}
