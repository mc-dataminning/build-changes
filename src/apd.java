import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class apd {
   public static final Codec<apd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aex.a.fieldOf("sound_id").forGetter(apd::a), Codec.FLOAT.optionalFieldOf("range").forGetter(apd::b)).apply($$0, apd::a)
   );
   public static final Codec<hg<apd>> b = aet.a(je.ad, a);
   private static final float c = 16.0F;
   private final aex d;
   private final float e;
   private final boolean f;

   private static apd a(aex $$0, Optional<Float> $$1) {
      return $$1.<apd>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static apd a(aex $$0) {
      return new apd($$0, 16.0F, false);
   }

   public static apd a(aex $$0, float $$1) {
      return new apd($$0, $$1, true);
   }

   private apd(aex $$0, float $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public aex a() {
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

   public static apd b(so $$0) {
      aex $$1 = $$0.s();
      Optional<Float> $$2 = $$0.b(so::readFloat);
      return a($$1, $$2);
   }
}
