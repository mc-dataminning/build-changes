import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ehq(float b, float c) implements ehk {
   public static final Codec<ehq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(ehq::c), Codec.FLOAT.fieldOf("looting_multiplier").forGetter(ehq::d)).apply($$0, ehq::new)
   );

   @Override
   public ehl b() {
      return ehm.f;
   }

   @Override
   public Set<egt<?>> a() {
      return ImmutableSet.of(egw.d);
   }

   public boolean a(eel $$0) {
      bki $$1 = $$0.c(egw.d);
      int $$2 = 0;
      if ($$1 instanceof bky) {
         $$2 = cpo.h((bky)$$1);
      }

      return $$0.b().i() < this.b + (float)$$2 * this.c;
   }

   public static ehk.a a(float $$0, float $$1) {
      return () -> new ehq($$0, $$1);
   }

   public float c() {
      return this.b;
   }

   public float d() {
      return this.c;
   }
}
