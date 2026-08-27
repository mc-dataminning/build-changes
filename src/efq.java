import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efq(float b, float c) implements efk {
   public static final Codec<efq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(efq::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(efq::d)).apply($$0, efq::new)
   );

   @Override
   public efl b() {
      return efm.f;
   }

   @Override
   public Set<eet<?>> a() {
      return ImmutableSet.of(eew.d);
   }

   public boolean a(ecl $$0) {
      bil $$1 = $$0.c(eew.d);
      int $$2 = 0;
      if ($$1 instanceof bjb) {
         $$2 = cnl.h((bjb)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static efk.a a(float $$0, float $$1) {
      return () -> new efq($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
