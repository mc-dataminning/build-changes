import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class apf {
   public static final Codec<apf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aez.a.fieldOf("sound_id").forGetter(apf::a), Codec.FLOAT.optionalFieldOf("range").forGetter(apf::b)).apply($$0, apf::a)
   );
   public static final Codec<he<apf>> b = aev.a(jc.ae, a);
   private static final float c = 16.0F;
   private final aez d;
   private final float e;
   private final boolean f;

   private static apf a(aez $$0, Optional<Float> $$1) {
      return $$1.<apf>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static apf a(aez $$0) {
      return new apf($$0, 16.0F, false);
   }

   public static apf a(aez $$0, float $$1) {
      return new apf($$0, $$1, true);
   }

   private apf(aez $$0, float $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public aez a() {
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

   public void a(so $$0) {
      $$0.a(this.d);
      $$0.a(this.b(), so::a);
   }

   public static apf b(so $$0) {
      aez $$1 = $$0.t();
      Optional<Float> $$2 = $$0.b(so::readFloat);
      return a($$1, $$2);
   }
}
