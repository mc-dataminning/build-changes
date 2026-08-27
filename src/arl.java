import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class arl {
   public static final Codec<arl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahd.a.fieldOf("sound_id").forGetter(arl::a), Codec.FLOAT.optionalFieldOf("range").forGetter(arl::b)).apply($$0, arl::a)
   );
   public static final Codec<ih<arl>> b = agz.a(ke.af, a);
   private static final float c = 16.0F;
   private final ahd d;
   private final float e;
   private final boolean f;

   private static arl a(ahd $$0, Optional<Float> $$1) {
      return $$1.<arl>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static arl a(ahd $$0) {
      return new arl($$0, 16.0F, false);
   }

   public static arl a(ahd $$0, float $$1) {
      return new arl($$0, $$1, true);
   }

   private arl(ahd $$0, float $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public ahd a() {
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

   public void a(ug $$0) {
      $$0.a(this.d);
      $$0.a(this.b(), ug::a);
   }

   public static arl b(ug $$0) {
      ahd $$1 = $$0.t();
      Optional<Float> $$2 = $$0.b(ug::readFloat);
      return a($$1, $$2);
   }
}
