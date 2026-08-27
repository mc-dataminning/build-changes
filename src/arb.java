import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class arb {
   public static final Codec<arb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agt.a.fieldOf("sound_id").forGetter(arb::a), Codec.FLOAT.optionalFieldOf("range").forGetter(arb::b)).apply($$0, arb::a)
   );
   public static final Codec<ie<arb>> b = agp.a(kc.af, a);
   private static final float c = 16.0F;
   private final agt d;
   private final float e;
   private final boolean f;

   private static arb a(agt $$0, Optional<Float> $$1) {
      return $$1.<arb>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static arb a(agt $$0) {
      return new arb($$0, 16.0F, false);
   }

   public static arb a(agt $$0, float $$1) {
      return new arb($$0, $$1, true);
   }

   private arb(agt $$0, float $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public agt a() {
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

   public void a(ue $$0) {
      $$0.a(this.d);
      $$0.a(this.b(), ue::a);
   }

   public static arb b(ue $$0) {
      agt $$1 = $$0.t();
      Optional<Float> $$2 = $$0.b(ue::readFloat);
      return a($$1, $$2);
   }
}
