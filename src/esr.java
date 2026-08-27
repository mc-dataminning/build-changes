import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record esr(float b, float c) implements esl {
   public static final MapCodec<esr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(esr::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(esr::d)).apply($$0, esr::new)
   );

   @Override
   public esm b() {
      return esn.g;
   }

   @Override
   public Set<eru<?>> a() {
      return ImmutableSet.of(erx.d);
   }

   public boolean a(epf $$0) {
      bru $$1 = $$0.c(erx.d);
      int $$2 = 0;
      if ($$1 instanceof bso) {
         $$2 = cza.h((bso)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static esl.a a(float $$0, float $$1) {
      return () -> new esr($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
