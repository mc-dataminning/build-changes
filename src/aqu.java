import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class aqu {
   public static final Codec<aqu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agm.a.fieldOf("sound_id").forGetter(aqu::a), Codec.FLOAT.optionalFieldOf("range").forGetter(aqu::b)).apply($$0, aqu::a)
   );
   public static final Codec<ig<aqu>> b = agi.a(kd.ae, a);
   private static final float c = 16.0F;
   private final agm d;
   private final float e;
   private final boolean f;

   private static aqu a(agm $$0, Optional<Float> $$1) {
      return $$1.<aqu>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static aqu a(agm $$0) {
      return new aqu($$0, 16.0F, false);
   }

   public static aqu a(agm $$0, float $$1) {
      return new aqu($$0, $$1, true);
   }

   private aqu(agm $$0, float $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public agm a() {
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

   public void a(ty $$0) {
      $$0.a(this.d);
      $$0.a(this.b(), ty::a);
   }

   public static aqu b(ty $$0) {
      agm $$1 = $$0.t();
      Optional<Float> $$2 = $$0.b(ty::readFloat);
      return a($$1, $$2);
   }
}
