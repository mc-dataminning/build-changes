import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class aqm {
   public static final Codec<aqm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agg.a.fieldOf("sound_id").forGetter(aqm::a), Codec.FLOAT.optionalFieldOf("range").forGetter(aqm::b)).apply($$0, aqm::a)
   );
   public static final Codec<ib<aqm>> b = agc.a(jz.ae, a);
   private static final float c = 16.0F;
   private final agg d;
   private final float e;
   private final boolean f;

   private static aqm a(agg $$0, Optional<Float> $$1) {
      return $$1.<aqm>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static aqm a(agg $$0) {
      return new aqm($$0, 16.0F, false);
   }

   public static aqm a(agg $$0, float $$1) {
      return new aqm($$0, $$1, true);
   }

   private aqm(agg $$0, float $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public agg a() {
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

   public void a(tu $$0) {
      $$0.a(this.d);
      $$0.a(this.b(), tu::a);
   }

   public static aqm b(tu $$0) {
      agg $$1 = $$0.t();
      Optional<Float> $$2 = $$0.b(tu::readFloat);
      return a($$1, $$2);
   }
}
