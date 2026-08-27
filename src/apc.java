import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class apc {
   public static final Codec<apc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aew.a.fieldOf("sound_id").forGetter(apc::a), Codec.FLOAT.optionalFieldOf("range").forGetter(apc::b)).apply($$0, apc::a)
   );
   public static final Codec<he<apc>> b = aes.a(jc.ad, a);
   private static final float c = 16.0F;
   private final aew d;
   private final float e;
   private final boolean f;

   private static apc a(aew $$0, Optional<Float> $$1) {
      return $$1.<apc>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static apc a(aew $$0) {
      return new apc($$0, 16.0F, false);
   }

   public static apc a(aew $$0, float $$1) {
      return new apc($$0, $$1, true);
   }

   private apc(aew $$0, float $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public aew a() {
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

   public static apc b(so $$0) {
      aew $$1 = $$0.s();
      Optional<Float> $$2 = $$0.b(so::readFloat);
      return a($$1, $$2);
   }
}
