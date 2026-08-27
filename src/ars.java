import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ars {
   public static final Codec<ars> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahh.a.fieldOf("sound_id").forGetter(ars::a), Codec.FLOAT.optionalFieldOf("range").forGetter(ars::b)).apply($$0, ars::a)
   );
   public static final Codec<ih<ars>> b = ahd.a(ke.af, a);
   private static final float c = 16.0F;
   private final ahh d;
   private final float e;
   private final boolean f;

   private static ars a(ahh $$0, Optional<Float> $$1) {
      return $$1.<ars>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static ars a(ahh $$0) {
      return new ars($$0, 16.0F, false);
   }

   public static ars a(ahh $$0, float $$1) {
      return new ars($$0, $$1, true);
   }

   private ars(ahh $$0, float $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public ahh a() {
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

   public void a(uj $$0) {
      $$0.a(this.d);
      $$0.a(this.b(), uj::a);
   }

   public static ars b(uj $$0) {
      ahh $$1 = $$0.t();
      Optional<Float> $$2 = $$0.b(uj::readFloat);
      return a($$1, $$2);
   }
}
