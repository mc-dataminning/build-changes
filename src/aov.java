import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class aov {
   public static final Codec<aov> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aer.a.fieldOf("sound_id").forGetter(aov::a), Codec.FLOAT.optionalFieldOf("range").forGetter(aov::b)).apply($$0, aov::a)
   );
   public static final Codec<he<aov>> b = aen.a(jc.ad, a);
   private static final float c = 16.0F;
   private final aer d;
   private final float e;
   private final boolean f;

   private static aov a(aer $$0, Optional<Float> $$1) {
      return $$1.<aov>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static aov a(aer $$0) {
      return new aov($$0, 16.0F, false);
   }

   public static aov a(aer $$0, float $$1) {
      return new aov($$0, $$1, true);
   }

   private aov(aer $$0, float $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public aer a() {
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

   public void a(si $$0) {
      $$0.a(this.d);
      $$0.a(this.b(), si::a);
   }

   public static aov b(si $$0) {
      aer $$1 = $$0.s();
      Optional<Float> $$2 = $$0.b(si::readFloat);
      return a($$1, $$2);
   }
}
