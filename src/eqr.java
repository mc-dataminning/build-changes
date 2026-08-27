import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eqr(float b, float c) implements eql {
   public static final Codec<eqr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(eqr::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(eqr::d)).apply($$0, eqr::new)
   );

   @Override
   public eqm b() {
      return eqn.f;
   }

   @Override
   public Set<epu<?>> a() {
      return ImmutableSet.of(epx.d);
   }

   public boolean a(enk $$0) {
      bqa $$1 = $$0.c(epx.d);
      int $$2 = 0;
      if ($$1 instanceof bqt) {
         $$2 = cxa.h((bqt)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static eql.a a(float $$0, float $$1) {
      return () -> new eqr($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
