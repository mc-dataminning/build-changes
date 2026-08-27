import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ape {
   public static final Codec<ape> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aey.a.fieldOf("sound_id").forGetter(ape::a), Codec.FLOAT.optionalFieldOf("range").forGetter(ape::b)).apply($$0, ape::a)
   );
   public static final Codec<hg<ape>> b = aeu.a(je.ad, a);
   private static final float c = 16.0F;
   private final aey d;
   private final float e;
   private final boolean f;

   private static ape a(aey $$0, Optional<Float> $$1) {
      return $$1.<ape>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static ape a(aey $$0) {
      return new ape($$0, 16.0F, false);
   }

   public static ape a(aey $$0, float $$1) {
      return new ape($$0, $$1, true);
   }

   private ape(aey $$0, float $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public aey a() {
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

   public void a(sq $$0) {
      $$0.a(this.d);
      $$0.a(this.b(), sq::a);
   }

   public static ape b(sq $$0) {
      aey $$1 = $$0.s();
      Optional<Float> $$2 = $$0.b(sq::readFloat);
      return a($$1, $$2);
   }
}
